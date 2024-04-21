package com.amikelmaxi.apiordenservico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amikelmaxi.apiordenservico.domains.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}
