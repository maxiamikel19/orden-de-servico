package com.amikelmaxi.apiordenservico.domains;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tecnicos")
@Getter
@Setter
public class Tecnico extends Pessoa {

    @OneToMany(mappedBy = "tecnico")    
    private List<Atendimento> atendimentos = new ArrayList<>();

    public Tecnico() {
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
    }

    
}
