package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Importancia;
import com.uca.capas.repository.ImportanciaRepository;

@Service
public class ImportanciaServiceImpl implements ImportanciaService{
	
	@Autowired
	ImportanciaRepository IR;
	
	@Override
	public List<Importancia> findAll() {
		// TODO Auto-generated method stub
		return IR.findAll();
	}

}
