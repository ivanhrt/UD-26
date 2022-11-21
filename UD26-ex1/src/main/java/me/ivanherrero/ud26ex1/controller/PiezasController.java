package me.ivanherrero.ud26ex1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.ivanherrero.ud26ex1.dto.Piezas;
import me.ivanherrero.ud26ex1.service.PiezasServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezasController {

	@Autowired
	PiezasServiceImpl piezasServiceImpl;

	@GetMapping("/piezas")
	public List<Piezas> listarPiezas() {
		return piezasServiceImpl.listarPiezas();
	}

	@PostMapping("/piezas")
	public Piezas salvarPiezas(@RequestBody Piezas pieza) {
		return piezasServiceImpl.guardarPiezas(pieza);
	}

	@GetMapping("/piezas/{id}")
	public Piezas piezaXID(@PathVariable(name = "id") Long id) {
		Piezas piezas_xid = new Piezas();

		piezas_xid = piezasServiceImpl.piezasXID(id);

		return piezas_xid;
	}

	@PutMapping("/piezas/{id}")
	public Piezas actualizarPiezas(@PathVariable(name = "id") Long id, @RequestBody Piezas pieza) {
		Piezas pieza_seleccionado = new Piezas();
		Piezas pieza_actualizado = new Piezas();

		pieza_seleccionado = piezasServiceImpl.piezasXID(id);

		pieza_seleccionado.setId(pieza.getId());
		pieza_seleccionado.setNombre(pieza.getNombre());

		pieza_actualizado = piezasServiceImpl.actualizarPiezas(pieza_seleccionado);

		return pieza_actualizado;
	}

	@DeleteMapping("/piezas/{id}")
	public void eliminarPiezas(@PathVariable(name = "id") Long id) {
		piezasServiceImpl.eliminarPiezas(id);
	}
}
