package com.deivisson.helpdesk.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Prioridade {

    BAIXA(0,"BAIXA"), MEDIA(1,"MEDIA"), ALTA(2,"ALTA");

    private Integer codigo;
    private String descricao;

    public static Prioridade toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for(Prioridade x : Prioridade.values()) {
            if(cod.equals(x.getCodigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Prioridade inválido!");
    }
}
