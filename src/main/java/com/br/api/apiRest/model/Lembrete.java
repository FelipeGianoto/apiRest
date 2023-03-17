package com.br.api.apiRest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.br.api.apiRest.enums.StatusTarefaEnum;

import lombok.Data;

@Entity
@Data
public class Lembrete {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Id
	private Long id;
	private String titulo;
	private String descricao;
	private Date data;
	@Enumerated(EnumType.STRING)
	private StatusTarefaEnum statusTarefa;

}
