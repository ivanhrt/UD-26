package me.ivanherrero.ud26ex2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;


@Entity
@Table(name="asignado_a")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Asignado_a {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter int id;
	
	@Exclude
	@ManyToOne
	@JoinColumn(name="cientifico_id")
	private @Getter @Setter Cientificos cientificos;
	
	@Exclude
	@ManyToOne
	@JoinColumn(name="proyecto_id")
	private @Getter @Setter Proyecto proyecto;
	
}
