package com.example.tarea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientController {
	@Autowired
	private ClientService clients;
	
	
	@RequestMapping("/registrar")
	public String getRegistrar() {
		return "index";
	}

	@RequestMapping("/registrados")
	public String getRegistrados(Model model) {
		model.addAttribute("clients", clients.getClients());
		return "registrados";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/registrar")
	public String registrar(@ModelAttribute Client cliente, Model model) {
		clients.addClient(cliente);
		model.addAttribute("clients", clients.getClients());
		return "registrados";
	}
}
