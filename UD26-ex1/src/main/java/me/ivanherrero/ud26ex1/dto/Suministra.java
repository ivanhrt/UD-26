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

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the pieza
	 */
	public Piezas getPieza() {
		return pieza;
	}

	/**
	 * @param pieza the pieza to set
	 */
	public void setPieza(Piezas pieza) {
		this.pieza = pieza;
	}

	/**
	 * @return the proveedor
	 */
	public Proveedores getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}