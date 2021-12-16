package br.com.projeto.Loja1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loja1")
public class LojaController {
	@RequestMapping("/loja2")
	public String mostrarMsg() {
		return "kkkkkkk";
	}

}
