package com.example.gam.repository;

import com.example.gam.entities.NatureInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NatureInfoRepository extends JpaRepository<NatureInfo , Long> {

        NatureInfo findByLibelle(String libelle);
}
