package me.ivanherrero.ud26ex2.dto;

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
import lombok.ToString.Exclude;

@Entity
@Table(name="proyecto")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter String id;
	private @Getter @Setter String nombre;
	private @Getter @Setter int horas;
	
	@Exclude
	@OneToMany
	private @Setter List<Asignado_a> asignado_a;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado_a")
	public List<Asignado_a> getAsignado_a() {
		return asignado_a;
	}
}
