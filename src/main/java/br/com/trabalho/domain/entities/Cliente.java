package br.com.trabalho.domain.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	UUID id;
	@Column(name = "nome", nullable = false)
	String nome;
	@Column(name = "email", nullable = false, unique = true)
	String email;
	@Column(name = "cpf", nullable = false, unique = true, length = 11)
	String cpf;
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	List<Endereco> enderecos;
	
}	
