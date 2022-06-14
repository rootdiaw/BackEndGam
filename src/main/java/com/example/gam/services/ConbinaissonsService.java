package com.example.gam.services;

import com.example.gam.entities.Conbinaissons;

import java.util.List;

public interface ConbinaissonsService {
    Conbinaissons addNewConbinaissons(Conbinaissons conbinaissons);
    Conbinaissons updateNewConbinaissons( Conbinaissons conbinaissons);
    List<Conbinaissons> getAllConbinaissons( );
    Conbinaissons getConbinaissonsParId( Long id);
    void deleteConbinaissonsParId(Long id);
    Conbinaissons getConbinaissonsNamefile(Long idnatureinfo, Long idrebondinfo, Long idsupportparution,
    Long idperceptionsupportparution);
    Conbinaissons getConbinaissonsAction(Long idnatureinfo, Long idrebondinfo, Long idsupportparution,
                                           Long idperceptionsupportparution);
}
