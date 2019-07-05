package com.uca.capas.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
//import java.sql.Date;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dto.ContribuyenteDTO;
import com.uca.capas.service.ContribuyenteService;
import com.uca.capas.service.ImportanciaService;

@Controller
public class MainController {

	@Autowired
	ImportanciaService IS;
	
	@Autowired
	ContribuyenteService CS;
	
	@RequestMapping(value = "/", method = {RequestMethod.GET})
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("importancias", IS.findAll());
		mav.addObject("contribuyenteDTO", new ContribuyenteDTO());
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value = "/guardar", method = {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView guardar(@Valid @ModelAttribute("contribuyenteDTO") ContribuyenteDTO contribuyenteDTO,
			BindingResult result) {
		ModelAndView mav = null;
		if(result.hasErrors()) {
			mav = new ModelAndView();
			mav.addObject("importancias", IS.findAll());
			mav.setViewName("main");
		}else {
			CS.guardarContribuyente(contribuyenteDTO);
			mav = new ModelAndView("redirect:/");
		}
		return mav;
	}
	
	@RequestMapping(value = "/ver", method = {RequestMethod.GET})
	public ModelAndView ver() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("contribuyentes", CS.findAll());
		mav.setViewName("all");
		return mav;
	}
}
