package com.br.api.apiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.api.apiRest.model.Anotacao;

@Repository
public interface AnotacaoReposioty extends JpaRepository<Anotacao, Long> {

}
