package me.ivanherrero.ud26ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.ivanherrero.ud26ex1.dao.IPiezasDAO;
import me.ivanherrero.ud26ex1.dto.Piezas;

@Service
public class PiezasServiceImpl implements IPiezasService {

	@Autowired
	IPiezasDAO iPiezasDAO;

	@Override
	public List<Piezas> listarPiezas() {
		return iPiezasDAO.findAll();
	}

	@Override
	public Piezas guardarPiezas(Piezas pieza) {
		return iPiezasDAO.save(pieza);
	}

	@Override
	public Piezas piezasXID(Long id) {
		return iPiezasDAO.findById(id).get();
	}

	@Override
	public Piezas actualizarPiezas(Piezas pieza) {
		return iPiezasDAO.save(pieza);
	}

	@Override
	public void eliminarPiezas(Long id) {
		iPiezasDAO.deleteById(id);
	}

}
