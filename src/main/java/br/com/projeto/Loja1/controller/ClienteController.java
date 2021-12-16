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

import br.com.projeto.Loja1.domain.Cliente;
import br.com.projeto.Loja1.repository.ClienteRepository;
;

@RestController
@RequestMapping("/cliente")


public class ClienteController {

	@Autowired
	private ClienteRepository x;
	
	@GetMapping
	public List<Cliente> listar() {
		
		List<Cliente> cliente = x.findAll();
		return cliente;
	}
	
	@PostMapping
	public Cliente inserir(@RequestBody Cliente cliente) {
		Cliente clienteSalvo = x.save(cliente);
		return clienteSalvo;
	}
	
	@DeleteMapping("/{id}")
	public Optional<Cliente> remover(@PathVariable Long id) {
		Optional<Cliente> cliente = x.findById(id);
		x.delete(cliente.get());
		return cliente;
	}
	
	@PutMapping
	public Cliente editar (@RequestBody Cliente cliente) {
		Cliente clienteEditado = x.save(cliente);
		return clienteEditado;
	
	
}
}
