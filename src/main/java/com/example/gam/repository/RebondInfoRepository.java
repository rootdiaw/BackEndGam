package com.example.gam.repository;

import com.example.gam.entities.RebondInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RebondInfoRepository extends JpaRepository<RebondInfo , Long> {

    RebondInfo findByLibelle(String libelle);
}
