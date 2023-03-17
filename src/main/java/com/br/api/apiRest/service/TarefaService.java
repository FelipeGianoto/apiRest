package com.br.api.apiRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.api.apiRest.model.Tarefa;
import com.br.api.apiRest.repository.TarefaRepository;

@Service
public class TarefaService {
	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	
	public List<Tarefa> findAllTarefa(){
		return tarefaRepository.findAll();	
	}
}
