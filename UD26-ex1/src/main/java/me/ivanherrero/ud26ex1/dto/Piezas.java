package me.ivanherrero.ud26ex1.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "piezas")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Piezas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter Long id;

	private @Getter @Setter String nombre;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pieza")
	private @Getter @Setter List<Suministra> suministra;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the suministra
	 */
	public List<Suministra> getSuministra() {
		return suministra;
	}

	/**
	 * @param suministra the suministra to set
	 */
	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}
}
