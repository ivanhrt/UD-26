package me.ivanherrero.ud26ex2.service;

import java.util.List;

import me.ivanherrero.ud26ex2.dto.Cientificos;

public interface ICientificosService {
	public List<Cientificos> listarCientificos();
	
	public Cientificos guardarCientifico(Cientificos cientificos);
	
	public Cientificos cientificoXDni(String dni);
	
	public Cientificos actualizarCientifico(Cientificos cientificos);
	
	public void eliminarCientificos(String dni);

	public List<Cientificos> listarClienteDni(String dni);
}
