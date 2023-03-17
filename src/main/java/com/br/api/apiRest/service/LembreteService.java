package com.br.api.apiRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.api.apiRest.model.Lembrete;
import com.br.api.apiRest.repository.LembreteRepository;

@Service
public class LembreteService {
	
	@Autowired
	private LembreteRepository lembreteRepository;
	
	public List<Lembrete> findAllLembrete(){
		return lembreteRepository.findAll();
	}
}
