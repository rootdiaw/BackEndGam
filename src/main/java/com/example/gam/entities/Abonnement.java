package com.example.gam.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Abonnement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idabonnement;
    private  String achatdate;
    private  String expirationdate;

    @ManyToOne
    private Utilisateur utilisateur;
}
