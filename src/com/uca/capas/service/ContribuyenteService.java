package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.dto.ContribuyenteDTO;

public interface ContribuyenteService {

	public List<Contribuyente> findAll();
	
	public void guardarContribuyente(ContribuyenteDTO dto);
}
