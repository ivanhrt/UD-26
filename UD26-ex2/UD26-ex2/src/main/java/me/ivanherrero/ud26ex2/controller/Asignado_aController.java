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

import me.ivanherrero.ud26ex2.dto.Asignado_a;
import me.ivanherrero.ud26ex2.service.Asignado_aServiceIMPL;

@RestController
@RequestMapping("/api")
public class Asignado_aController {
	@Autowired
	Asignado_aServiceIMPL asignado_aServiceIMPL;

	@GetMapping("/asignados")
	public List<Asignado_a> listarAsignado_a() {
		return asignado_aServiceIMPL.listarAsignados();
	}

	@PostMapping("/asignados")
	public Asignado_a guardAsignado_a(@RequestBody Asignado_a asignado_a) {
		return asignado_aServiceIMPL.guardarAsignado(asignado_a);
	}

	@GetMapping("/asignados/{id}")
	public Asignado_a protectoXID(@PathVariable(name = "id") int id) {
		Asignado_a xid = new Asignado_a();

		xid = asignado_aServiceIMPL.asignadoXID(id);

		System.out.println("Asignado_a: " + xid);

		return xid;
	}

	@PutMapping("/asignados/{id}")
	public Asignado_a actualizarAsignado_a(@PathVariable(name = "id") int id, @RequestBody Asignado_a asignado_a) {
		Asignado_a sel = new Asignado_a();
		Asignado_a act = new Asignado_a();

		sel = asignado_aServiceIMPL.asignadoXID(id);
		sel.setCientificos(asignado_a.getCientificos());
		sel.setProyecto(asignado_a.getProyecto());

		act = asignado_aServiceIMPL.actualizarAsignado(sel);

		System.out.println("Asignado_a actualizado: " + act);
		return act;
	}

	@DeleteMapping("/asignados/{id}")
	public void eliminarAsignado_a(@PathVariable(name = "id") int id) {
		asignado_aServiceIMPL.eliminarAsignado(id);
	}
}
