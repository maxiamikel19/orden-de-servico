package com.amikelmaxi.apiordenservico.domains.enums;

import lombok.Getter;

@Getter
public enum Perfil {
    ADMIN(0, "ROLE_ADMIN"),
    CLIENTE(1, "ROLE_CLIENTE"),
    TECNICO(2, "ROLE_TECNICO");

    private Integer codigo;
    private String descricao;

    private Perfil(Integer codogo, String descricao){
        this.codigo = codogo;
        this.descricao = descricao;
    }

    public static Perfil toEnum(Integer codigo){
        if(codigo == null){
            return null;
        }

        for(Perfil p : Perfil.values()){
            if(codigo.equals(p.codigo)){
                return p;
            }
        }
        throw new IllegalArgumentException("O perfil informado é inválido");
    }

}
