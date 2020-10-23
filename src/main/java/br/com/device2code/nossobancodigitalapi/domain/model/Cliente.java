package br.com.device2code.nossobancodigitalapi.domain.model;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Data;

@Data
@Entity
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String sobrenome;
	
	@Email
	@NotEmpty
	private String email;

	@CPF
	@NotEmpty
	private String cpf;
	
	@Past
	@NotEmpty
	private OffsetDateTime nascimento;
	
}
