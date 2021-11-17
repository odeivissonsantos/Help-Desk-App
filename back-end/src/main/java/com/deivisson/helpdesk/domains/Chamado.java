package com.deivisson.helpdesk.domains;

import com.deivisson.helpdesk.enums.Prioridade;
import com.deivisson.helpdesk.enums.Status;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class Chamado {

    private Integer id;
    private LocalDate dataAbertura = LocalDate.now();
    private LocalDate dataFechamento = LocalDate.now();
    private Prioridade prioridade;
    private Status status;
    private String titulo;
    private String observacoes;

    private Tecnico tecnico;
    private Cliente cliente;
}
