package com.br.api.apiRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.api.apiRest.model.Anotacao;
import com.br.api.apiRest.repository.AnotacaoReposioty;

@Service
public class AnotacaoService {
	
	@Autowired
	private AnotacaoReposioty anotacaoReposioty;
	
	public List<Anotacao> findAllAnotacao(){
		return anotacaoReposioty.findAll();
	}
}
