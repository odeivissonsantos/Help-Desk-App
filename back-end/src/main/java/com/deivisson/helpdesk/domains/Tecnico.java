package com.deivisson.helpdesk.domains;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Tecnico extends Pessoa {

    private List<Chamado> chamados = new ArrayList<>();
}
