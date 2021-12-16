package br.com.projeto.Loja1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.Loja1.domain.Funcionario;
import br.com.projeto.Loja1.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionario")

public class FuncionarioController {
	@Autowired
	private FuncionarioRepository x;
	
	@GetMapping
	public List<Funcionario> listar() {
		
		List<Funcionario> funcionario = x.findAll();
		return funcionario;
	}
	
	@PostMapping
	public Funcionario inserir(@RequestBody Funcionario funcionario) {
		Funcionario funcionarioSalvo = x.save(funcionario);
		return funcionarioSalvo;
	}
	
	@DeleteMapping("/{id}")
	public Optional<Funcionario> remover(@PathVariable Long id) {
		Optional<Funcionario> cliente = x.findById(id);
		x.delete(cliente.get());
		return cliente;
	}
	
	@PutMapping
	public Funcionario editar (@RequestBody Funcionario funcionario) {
		Funcionario funcionarioEditado = x.save(funcionario);
		return funcionarioEditado;
	}

}
