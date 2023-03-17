package com.br.api.apiRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.api.apiRest.model.Anotacao;
import com.br.api.apiRest.model.Lembrete;
import com.br.api.apiRest.model.Tarefa;
import com.br.api.apiRest.service.AnotacaoService;
import com.br.api.apiRest.service.LembreteService;
import com.br.api.apiRest.service.TarefaService;

@RestController
public class MainController {

	@Autowired
	private AnotacaoService anotacaoService;
	
	@Autowired
	private LembreteService lembreteService;
	
	@Autowired
	private TarefaService tarefaService;
	
	
	@GetMapping(value = "/tarefa")
	public ResponseEntity<List<Tarefa>> listTarefas(){
		
		List<Tarefa> findAllTarefa = tarefaService.findAllTarefa();
		
		return ResponseEntity.ok(findAllTarefa);
	}
	
	@GetMapping(value = "/anotacao")
	public ResponseEntity<List<Anotacao>> listAnotacao(){
		
		List<Anotacao> findAllAnotacao = anotacaoService.findAllAnotacao();
		
		return ResponseEntity.ok(findAllAnotacao);
	}
	
	@GetMapping(value = "/lembrete")
	public ResponseEntity<List<Lembrete>> listLembrete(){
		
		List<Lembrete> findAllLembrete = lembreteService.findAllLembrete();
		
		return ResponseEntity.ok(findAllLembrete);
	}
	
}
