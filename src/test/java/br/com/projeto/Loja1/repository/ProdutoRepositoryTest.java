package br.com.projeto.Loja1.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.projeto.Loja1.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTest {
	@Autowired
	private ProdutoRepository pr;
	@Test
	public void inserir() {
		Produto a1 = new Produto(Long.valueOf("111"),"blusa", "adidas", "medio");
		Produto a2 = new Produto(Long.valueOf("122"),"calça", "nike", "grande");
		
		pr.save(a1);
		pr.save(a2);
	}
}
