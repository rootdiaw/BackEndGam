package com.example.gam.repository;

import com.example.gam.entities.SupportParution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupportParutionRepository extends JpaRepository<SupportParution, Long> {

    SupportParution findByLibelle(String  libelle);
}
