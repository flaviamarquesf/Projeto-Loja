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

import br.com.projeto.Loja1.domain.Produto;
import br.com.projeto.Loja1.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {

	@Autowired
	private ProdutoRepository pr;
	
	@GetMapping
	public List<Produto> listar() {
		
		List<Produto> produtos = pr.findAll();
		return produtos;
	}
	
	@PostMapping
	public Produto inserir(@RequestBody Produto produto) {
		Produto produtoSalvo = pr.save(produto);
		return produtoSalvo;
	}
	
	@DeleteMapping("/{Codigo}")
	public Optional<Produto> remover(@PathVariable Long Codigo) {
		Optional<Produto> produto = pr.findById(Codigo);
		pr.delete(produto.get());
		return produto;
	}
	
	@PutMapping
	public Produto editar (@RequestBody Produto produto) {
		Produto produtoEditado = pr.save(produto);
		return produtoEditado;
}
}
