package com.amikelmaxi.apiordenservico.domains.enums;

import lombok.Getter;

@Getter
public enum Status {
    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    FINALIZADO(2, "FINALIZADO");

    private Integer codigo;
    private String descricao;

    private Status(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static Status toEnum(Integer codigo){
        if(codigo == null){
            return null;
        }

        for(Status s : Status.values()){
            if(codigo.equals(s.getCodigo())){
                return s;
            }
        }
        throw new IllegalArgumentException("Status inválido");
    }
}
