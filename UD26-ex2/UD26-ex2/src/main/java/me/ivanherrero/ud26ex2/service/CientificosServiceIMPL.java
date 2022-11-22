package me.ivanherrero.ud26ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.ivanherrero.ud26ex2.dao.ICientificosDAO;
import me.ivanherrero.ud26ex2.dto.Cientificos;
@Service
public class CientificosServiceIMPL implements ICientificosService {
	@Autowired
	ICientificosDAO iCientificosDAO;
	@Override
	public List<Cientificos> listarCientificos() {
		return iCientificosDAO.findAll();
	}

	@Override
	public Cientificos guardarCientifico(Cientificos cientificos) {
		return iCientificosDAO.save(cientificos);
	}

	@Override
	public Cientificos cientificoXDni(String dni) {
		return iCientificosDAO.findById(dni).get();
	}

	@Override
	public Cientificos actualizarCientifico(Cientificos cientificos) {
		return iCientificosDAO.save(cientificos);
	}

	@Override
	public void eliminarCientificos(String dni) {
		iCientificosDAO.deleteById(dni);
	}
	
	@Override
	public List<Cientificos> listarClienteDni(String dni) {
		
		return iCientificosDAO.findByDni(dni);
	}

}
