package me.ivanherrero.ud26ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.ivanherrero.ud26ex1.dao.IProveedoresDAO;
import me.ivanherrero.ud26ex1.dto.Proveedores;

@Service
public class ProveedoresServiceImpl implements IProveedoresService {

	@Autowired
	IProveedoresDAO iProveedoresDAO;

	@Override
	public List<Proveedores> listarProveedores() {
		return iProveedoresDAO.findAll();
	}

	@Override
	public Proveedores guardarProveedores(Proveedores proveedor) {
		return iProveedoresDAO.save(proveedor);
	}

	@Override
	public Proveedores proveedoresXID(String id) {
		return iProveedoresDAO.findById(id).get();
	}

	@Override
	public Proveedores actualizarProveedores(Proveedores proveedor) {
		return iProveedoresDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedores(String id) {
		iProveedoresDAO.deleteById(id);
	}

}
