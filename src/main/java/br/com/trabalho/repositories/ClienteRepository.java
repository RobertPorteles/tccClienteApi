package br.com.trabalho.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trabalho.domain.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
	
	
}
