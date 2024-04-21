package com.amikelmaxi.apiordenservico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amikelmaxi.apiordenservico.domains.Atendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer>{
    
}
