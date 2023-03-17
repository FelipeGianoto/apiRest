package com.br.api.apiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.api.apiRest.model.Lembrete;

public interface LembreteRepository extends JpaRepository<Lembrete, Long> {

}
