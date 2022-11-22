package me.ivanherrero.ud26ex2.service;

import java.util.List;

import me.ivanherrero.ud26ex2.dto.Proyecto;

public interface IProyectoService {
	
	public List<Proyecto> listarProyecto();
	
	public Proyecto guardarProyecto(Proyecto proyecto);
	
	public Proyecto proyectoXID(String id);
	
	public Proyecto actualizarProyecto(Proyecto proyecto);
	
	public void eliminarProyecto(String id);
}
