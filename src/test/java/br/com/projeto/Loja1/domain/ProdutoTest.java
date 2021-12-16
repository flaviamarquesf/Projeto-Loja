package br.com.projeto.Loja1.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.projeto.Loja1.domain.Produto;

@SpringBootTest
public class ProdutoTest {
	
	@Test
	public void criar( ) {
		Produto a = new Produto(Long.valueOf("123"),"camisa", "adidas", "pequeno");
		
		System.out.print(a);
		
	}
	
}
