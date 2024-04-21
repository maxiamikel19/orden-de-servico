package com.amikelmaxi.apiordenservico.ressources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amikelmaxi.apiordenservico.domains.Tecnico;
import com.amikelmaxi.apiordenservico.services.impl.TecnicoServiceImpl;

@RestController
@RequestMapping("/tecnicos")
public class TecnicoRessource {
    
    @Autowired
    TecnicoServiceImpl tecnicoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Tecnico> fingById(@PathVariable Integer id){
        Tecnico opTecnico = tecnicoService.findById(id);
        return ResponseEntity.ok().body(opTecnico);
    }
}
