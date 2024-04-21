package com.amikelmaxi.apiordenservico.services;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amikelmaxi.apiordenservico.domains.Atendimento;
import com.amikelmaxi.apiordenservico.domains.Cliente;
import com.amikelmaxi.apiordenservico.domains.Tecnico;
import com.amikelmaxi.apiordenservico.domains.enums.Prioridade;
import com.amikelmaxi.apiordenservico.domains.enums.Status;
import com.amikelmaxi.apiordenservico.repositories.AtendimentoRepository;
import com.amikelmaxi.apiordenservico.repositories.ClienteRepository;
import com.amikelmaxi.apiordenservico.repositories.TecnicoRepository;

@Configuration
public class DdInitializerService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private AtendimentoRepository atendimentoRepository;
    
    @Bean
    public String inicializarBd(){

        Tecnico tec1 = new Tecnico(null, "Amikel Maxi", "542.381.240-22", "amikel@email.com", "1234");
        Tecnico tec2 = new Tecnico(null, "Myrlande Louissaint Maxi", "495.967.530-61", "myrlande@email.com", "1234");

        Cliente cli1 = new Cliente(null, "Atalande Louissaint Raymond", "641.152.820-96", "atalande@email.com", "1234");

        Atendimento at1 = new Atendimento(null, LocalDate.now(), null, Prioridade.BAIXA, Status.ABERTO, "Atendimento 1 teste", "Observação do atendimento 1 teste", tec2, cli1);
        Atendimento at2 = new Atendimento(null, LocalDate.now(), null, Prioridade.BAIXA, Status.ANDAMENTO, "Atendimento 2 teste", "Observação do atendimento 2 teste", tec1, cli1);
        Atendimento at3 = new Atendimento(null, LocalDate.now(), null, Prioridade.ALTA, Status.FINALIZADO, "Atendimento 3 teste", "Observação do atendimento 3 teste", tec1, cli1);

        tecnicoRepository.saveAllAndFlush(Arrays.asList(tec1, tec2));
        clienteRepository.saveAllAndFlush(Arrays.asList(cli1));
        atendimentoRepository.saveAllAndFlush(Arrays.asList(at1, at2, at3));
        return "";
    }
    
}
