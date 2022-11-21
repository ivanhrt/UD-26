package me.ivanherrero.ud26ex1.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "proveedores")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Proveedores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter String id;

	private @Getter @Setter String nombre;

	@JsonIgnore
	@OneToMany(mappedBy = "proveedor")
	private @Getter @Setter List<Suministra> suministra;
}
