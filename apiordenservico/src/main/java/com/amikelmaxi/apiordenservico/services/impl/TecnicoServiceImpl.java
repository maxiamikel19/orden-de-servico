package com.amikelmaxi.apiordenservico.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amikelmaxi.apiordenservico.domains.Tecnico;
import com.amikelmaxi.apiordenservico.repositories.TecnicoRepository;
import com.amikelmaxi.apiordenservico.services.TecnicoService;

@Service
public class TecnicoServiceImpl implements TecnicoService{

    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Override
    public Tecnico findById(Integer id) {
        Optional<Tecnico> opTecnico = tecnicoRepository.findById(id);
        return opTecnico.orElseThrow(null);
    }
    
}
