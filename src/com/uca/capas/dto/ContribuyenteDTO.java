package com.uca.capas.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
public class ContribuyenteDTO {

	public Integer importancia;
	
	@NotEmpty(message = "Favor ingrese su nombre")
	@Size(message = "la longitud maxima es de 30 caracteres", min = 0, max = 30)
	public String nombre;

	@NotEmpty(message = "Favor ingrese su apellido")
	@Size(message = "la longitud maxima es de 30 caracteres", min = 0, max = 30)
	public String apellido;
	
	@NotEmpty(message = "Favor ingrese su nit")
	@Size(message = "la longitud maxima es de 14 caracteres", min = 0, max = 14)
	public String nit;

	public ContribuyenteDTO() {
		super();
	}

	public ContribuyenteDTO(Integer importancia,
			@NotEmpty(message = "Favor ingrese su nombre") @Size(message = "la longitud maxima es de 30 caracteres", min = 0, max = 30) String nombre,
			@NotEmpty(message = "Favor ingrese su apellido") @Size(message = "la longitud maxima es de 30 caracteres", min = 0, max = 30) String apellido,
			@NotEmpty(message = "Favor ingrese su nit") @Size(message = "la longitud maxima es de 14 caracteres", min = 0, max = 14) String nit) {
		super();
		this.importancia = importancia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nit = nit;
	}

	public Integer getImportancia() {
		return importancia;
	}

	public void setImportancia(Integer importancia) {
		this.importancia = importancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}
	
}
