package com.deivisson.helpdesk.repositories;

import com.deivisson.helpdesk.domains.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
}
