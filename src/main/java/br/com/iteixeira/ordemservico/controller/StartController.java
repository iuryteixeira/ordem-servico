package br.com.iteixeira.ordemservico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {
	
	@GetMapping("/")
	public String iniciar() {
		return "start";
	}
	
	@GetMapping("/painel")
	public String painel() {
		return "painel";
	}

}
