package me.ivanherrero.ud26ex1.dto;

import javax.persistence.*;

import lombok.*;
import lombok.ToString.Exclude;

@Entity
@Table(name = "suministra")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Suministra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter int id;

	@Exclude
	@ManyToOne
	@JoinColumn(name = "codigo_pieza")
	private @Getter @Setter Piezas pieza;

	@Exclude
	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	private @Getter @Setter Proveedores proveedor;

	private @Getter @Setter int precio;
}