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

import me.ivanherrero.ud26ex2.dto.Cientificos;
import me.ivanherrero.ud26ex2.service.CientificosServiceIMPL;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificosServiceIMPL cientificosServiceImpl;

	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos() {
		return cientificosServiceImpl.listarCientificos();
	}
	
	@GetMapping("/cientificos/dni/{dni}")
	public List<Cientificos> listarClienteNombre(@PathVariable(name="dni") String dni) {
	    return cientificosServiceImpl.listarClienteDni(dni);
	}

	@PostMapping("/cientificos")
	public Cientificos guardCientificos(@RequestBody Cientificos cientificos) {
		return cientificosServiceImpl.guardarCientifico(cientificos);
	}

	@GetMapping("/cientificos/{id}")
	public Cientificos cientificoXID(@PathVariable(name = "id") String id) {
		Cientificos xid = new Cientificos();

		xid = cientificosServiceImpl.cientificoXDni(id);

		System.out.println("Cientificos: " + xid);

		return xid;
	}

	@PutMapping("/cientificos/{id}")
	public Cientificos actualizarCientifico(@PathVariable(name = "id") String id, @RequestBody Cientificos cientifico) {
		Cientificos sel = new Cientificos();
		Cientificos act = new Cientificos();

		sel = cientificosServiceImpl.cientificoXDni(id);
		sel.setDni(cientifico.getDni());
		sel.setNomApels(cientifico.getNomApels());

		act = cientificosServiceImpl.actualizarCientifico(sel);

		System.out.println("Cientifico actualizado: " + act);
		return act;
	}

	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientificos(@PathVariable(name = "id") String id) {
		cientificosServiceImpl.eliminarCientificos(id);
	}
}
