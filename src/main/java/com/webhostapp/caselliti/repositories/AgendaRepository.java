package com.webhostapp.caselliti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webhostapp.caselliti.entities.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
