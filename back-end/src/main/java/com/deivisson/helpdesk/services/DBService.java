package com.deivisson.helpdesk.services;

import com.deivisson.helpdesk.domains.Chamado;
import com.deivisson.helpdesk.domains.Cliente;
import com.deivisson.helpdesk.domains.Tecnico;
import com.deivisson.helpdesk.enums.Perfil;
import com.deivisson.helpdesk.enums.Prioridade;
import com.deivisson.helpdesk.enums.Status;
import com.deivisson.helpdesk.repositories.ChamadoRepository;
import com.deivisson.helpdesk.repositories.ClienteRepository;
import com.deivisson.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public void instanciaDB() {
        Tecnico tec1 = new Tecnico(null, "Deivisson Santos", "42091550043", "deivisson@email.com", "123");
        tec1.addPerfil(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null, "Sandi Lima", "44995404023", "sandi@email.com", "123");

        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "primeiro chamado", tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));
    }
}
