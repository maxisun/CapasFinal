package com.uca.capas.domain;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema= "public", name = "contribuyente")
public class Contribuyente {

	@Id
	@GeneratedValue(generator = "contribuyente_c_contribuyente_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "contribuyente_c_contribuyente_seq", sequenceName = "public.contribuyente_c_contribuyente_seq", allocationSize = 1)
	@Column(name = "c_contribuyente")
	private Integer c_contribuyente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "c_importancia")
	private Importancia importancia;
	
	@Column(name = "s_nombre")
	private String s_nombre;
	
	@Column(name = "s_apellido")
	private String s_apellido;
	
	@Column(name = "s_nit")
	private String s_nit;
	
	@Column(name = "f_fecha_ingreso")
	private Date f_fecha_ingreso;

	public Contribuyente() {
		super();
	}

	public Contribuyente(Integer c_contribuyente, Importancia importancia, String s_nombre, String s_apellido,
			String s_nit, Date f_fecha_ingreso) {
		super();
		this.c_contribuyente = c_contribuyente;
		this.importancia = importancia;
		this.s_nombre = s_nombre;
		this.s_apellido = s_apellido;
		this.s_nit = s_nit;
		this.f_fecha_ingreso = f_fecha_ingreso;
	}

	public Integer getC_contribuyente() {
		return c_contribuyente;
	}

	public void setC_contribuyente(Integer c_contribuyente) {
		this.c_contribuyente = c_contribuyente;
	}

	public Importancia getImportancia() {
		return importancia;
	}

	public void setImportancia(Importancia importancia) {
		this.importancia = importancia;
	}

	public String getS_nombre() {
		return s_nombre;
	}

	public void setS_nombre(String s_nombre) {
		this.s_nombre = s_nombre;
	}

	public String getS_apellido() {
		return s_apellido;
	}

	public void setS_apellido(String s_apellido) {
		this.s_apellido = s_apellido;
	}

	public String getS_nit() {
		return s_nit;
	}

	public void setS_nit(String s_nit) {
		this.s_nit = s_nit;
	}

	public Date getF_fecha_ingreso() {
		return f_fecha_ingreso;
	}

	public void setF_fecha_ingreso(Date f_fecha_ingreso) {
		this.f_fecha_ingreso = f_fecha_ingreso;
	}
	
	public String getfechaDelegate() {
		String s = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		s = formatter.format(this.f_fecha_ingreso);
		return s;
	}
}
