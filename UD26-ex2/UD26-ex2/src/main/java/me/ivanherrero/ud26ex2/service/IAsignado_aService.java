package me.ivanherrero.ud26ex2.service;

import java.util.List;

import me.ivanherrero.ud26ex2.dto.Asignado_a;

public interface IAsignado_aService {
	
	public List<Asignado_a> listarAsignados();
	
	public Asignado_a guardarAsignado(Asignado_a asignado_a);
	
	public Asignado_a asignadoXID(int id);
	
	public Asignado_a actualizarAsignado(Asignado_a asignado_a);
	
	public void eliminarAsignado(int id);
}
