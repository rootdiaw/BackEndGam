package com.example.gam.repository;

import com.example.gam.entities.Conbinaissons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConbinaissonsRepository extends JpaRepository<Conbinaissons, Long> {


    @Query(value="select * from Conbinaissons " +
            "where nature_info_idnatureinfo=?1 and rebond_info_idrebondinfo=?2" +
            " and support_parution_idsupportparution=?3 and perception_support_parution_idperceptionsupportparution=?4 "
            ,nativeQuery = true)
    Conbinaissons getConbinaissonNamefile(Long idnatureinfo, Long idrebondinfo, Long idsupportparution,
                                          Long idperceptionsupportparution);

    @Query(value="select * from Conbinaissons " +
            "where nature_info_idnatureinfo=?1 and rebond_info_idrebondinfo=?2" +
            " and support_parution_idsupportparution=?3 and perception_support_parution_idperceptionsupportparution=?4 "
            ,nativeQuery = true)
    Conbinaissons getConbinaissonCalltoAction(Long idnatureinfo, Long idrebondinfo, Long idsupportparution,
                                          Long idperceptionsupportparution);



}
