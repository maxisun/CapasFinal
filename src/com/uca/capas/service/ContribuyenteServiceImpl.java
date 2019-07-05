package com.uca.capas.service;


import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.dto.ContribuyenteDTO;
import com.uca.capas.repository.ContribuyenteRepository;
import com.uca.capas.repository.ImportanciaRepository;

@Service
public class ContribuyenteServiceImpl implements ContribuyenteService{

	@Autowired
	ContribuyenteRepository CR;
	
	@Autowired
	ImportanciaRepository IR;
	
	@Override
	public List<Contribuyente> findAll() {
		// TODO Auto-generated method stub
		return CR.findAll();
	}

	@Override
	@Transactional
	public void guardarContribuyente(ContribuyenteDTO dto) {
		// TODO Auto-generated method stub
		Contribuyente c = new Contribuyente();
		c.setImportancia(IR.getOne(dto.getImportancia()));
		c.setS_nombre(dto.getNombre());
		c.setS_apellido(dto.getApellido());
		c.setS_nit(dto.getNit());
		Date date = new Date(); 
		c.setF_fecha_ingreso(new java.sql.Date(date.getTime()));
		CR.saveAndFlush(c);
	}
}
