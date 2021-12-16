package br.com.projeto.Loja1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.Loja1.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	

}
