package com.example.gam.repository;

import com.example.gam.entities.PerceptionSupportParution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerceptionSupParRepositry extends JpaRepository <PerceptionSupportParution, Long> {

    PerceptionSupportParution findByLibelle(String libelle);
}
