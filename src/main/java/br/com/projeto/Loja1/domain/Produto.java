package br.com.projeto.Loja1.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Produto")


public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Codigo;
	
	@Column(name = "Tipo", nullable = false )
	private String Tipo;
	
	@Column(name = "Marca", nullable = false )
	private String Marca;
	
	@Column(name = "Tamanho", nullable = false )
	private String Tamanho;
}
