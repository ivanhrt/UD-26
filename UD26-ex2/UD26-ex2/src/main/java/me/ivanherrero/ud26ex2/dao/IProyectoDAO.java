package me.ivanherrero.ud26ex2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivanherrero.ud26ex2.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, String> {

}
