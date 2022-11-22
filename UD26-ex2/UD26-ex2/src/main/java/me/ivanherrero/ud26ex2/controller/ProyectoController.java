package me.ivanherrero.ud26ex2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ivanherrero.ud26ex2.dto.Proyecto;
import me.ivanherrero.ud26ex2.service.ProyectoServiceIMPL;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	@Autowired
	ProyectoServiceIMPL proyectoServiceIMPL;

	@GetMapping("/proyectos")
	public List<Proyecto> listarProyecto() {
		return proyectoServiceIMPL.listarProyecto();
	}

	@PostMapping("/proyectos")
	public Proyecto guardProyecto(@RequestBody Proyecto proyecto) {
		return proyectoServiceIMPL.guardarProyecto(proyecto);
	}

	@GetMapping("/proyectos/{id}")
	public Proyecto protectoXID(@PathVariable(name = "id") String id) {
		Proyecto xid = new Proyecto();

		xid = proyectoServiceIMPL.proyectoXID(id);

		System.out.println("Proyecto: " + xid);

		return xid;
	}

	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name = "id") String id, @RequestBody Proyecto proyecto) {
		Proyecto sel = new Proyecto();
		Proyecto act = new Proyecto();

		sel = proyectoServiceIMPL.proyectoXID(id);
		sel.setNombre(proyecto.getNombre());
		sel.setHoras(proyecto.getHoras());

		act = proyectoServiceIMPL.actualizarProyecto(sel);

		System.out.println("Proyecto actualizado: " + act);
		return act;
	}

	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto(@PathVariable(name = "id") String id) {
		proyectoServiceIMPL.eliminarProyecto(id);
	}
}
