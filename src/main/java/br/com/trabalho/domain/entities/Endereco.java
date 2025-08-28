package br.com.trabalho.domain.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "enderecos")
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	UUID id;
	@Column(name = "logradouro", nullable = false)
	String logradouro;
	@Column(name = "complemento")
	String complemento;
	@Column(name = "numero", nullable = false)
	String numero;
	@Column(name = "bairro", nullable = false)
	String bairro;
	@Column(name = "cidade", nullable = false)
	String cidade;
	@Column(name = "uf", nullable = false, length = 2)
	String uf;
	@Column(name = "cep", nullable = false, length = 8)
	String cep;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	Cliente cliente;
}
