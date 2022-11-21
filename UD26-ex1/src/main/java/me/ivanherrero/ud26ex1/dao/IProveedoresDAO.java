package me.ivanherrero.ud26ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivanherrero.ud26ex1.dto.Proveedores;

public interface IProveedoresDAO extends JpaRepository<Proveedores, String> {

}
