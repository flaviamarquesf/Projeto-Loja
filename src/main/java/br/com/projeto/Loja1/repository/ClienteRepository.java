package br.com.projeto.Loja1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.Loja1.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
