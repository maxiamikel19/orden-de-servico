package com.amikelmaxi.apiordenservico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amikelmaxi.apiordenservico.domains.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
    
}
