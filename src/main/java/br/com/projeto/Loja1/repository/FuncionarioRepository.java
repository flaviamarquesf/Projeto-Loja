package br.com.projeto.Loja1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.Loja1.domain.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
