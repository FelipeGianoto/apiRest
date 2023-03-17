package com.br.api.apiRest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Anotacao {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Id
	private Long id;
	private String titulo;
	private String descricao;
	private Date data;
	
}
