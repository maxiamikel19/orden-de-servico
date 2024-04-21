package com.amikelmaxi.apiordenservico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amikelmaxi.apiordenservico.domains.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{
    
}
