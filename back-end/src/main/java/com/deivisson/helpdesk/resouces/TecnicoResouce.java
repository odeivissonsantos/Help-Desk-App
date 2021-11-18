package com.deivisson.helpdesk.resouces;

import com.deivisson.helpdesk.domains.Tecnico;
import com.deivisson.helpdesk.services.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResouce {

    @Autowired
    TecnicoService tecnicoService;

    @GetMapping(value = "/{id}")
    ResponseEntity<Tecnico> findById(@PathVariable Integer id) {
        Tecnico obj = this.tecnicoService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
