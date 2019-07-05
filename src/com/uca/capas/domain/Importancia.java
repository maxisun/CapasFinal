package com.uca.capas.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public" , name = "importancia")
public class Importancia {

	@Id
	@GeneratedValue(generator = "importancia_c_importancia_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "importancia_c_importancia_seq", sequenceName = "public.importancia_c_importancia_seq", allocationSize = 1)
	@Column(name = "c_importancia")
	private Integer c_importancia;
	
	@Column(name = "s_importancia")
	private String s_importancia;
	
	@OneToMany(mappedBy = "importancia", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.PERSIST)
	private List<Contribuyente> contribuyentes;

	public Importancia() {
		super();
	}

	public Importancia(Integer c_importancia, String s_importancia, List<Contribuyente> contribuyentes) {
		super();
		this.c_importancia = c_importancia;
		this.s_importancia = s_importancia;
		this.contribuyentes = contribuyentes;
	}

	public Integer getC_importancia() {
		return c_importancia;
	}

	public void setC_importancia(Integer c_importancia) {
		this.c_importancia = c_importancia;
	}

	public String getS_importancia() {
		return s_importancia;
	}

	public void setS_importancia(String s_importancia) {
		this.s_importancia = s_importancia;
	}

	public List<Contribuyente> getContribuyentes() {
		return contribuyentes;
	}

	public void setContribuyentes(List<Contribuyente> contribuyentes) {
		this.contribuyentes = contribuyentes;
	}
	
}
