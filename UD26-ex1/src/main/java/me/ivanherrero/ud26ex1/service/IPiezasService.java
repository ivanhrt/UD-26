package me.ivanherrero.ud26ex1.service;

import java.util.List;

import me.ivanherrero.ud26ex1.dto.Piezas;

public interface IPiezasService {

	public List<Piezas> listarPiezas();

	public Piezas guardarPiezas(Piezas pieza);

	public Piezas piezasXID(Long id);

	public Piezas actualizarPiezas(Piezas pieza);

	public void eliminarPiezas(Long id);
}
