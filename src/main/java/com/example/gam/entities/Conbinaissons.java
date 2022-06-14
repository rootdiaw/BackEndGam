package com.example.gam.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Conbinaissons  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idconbinaissons;
    //private String namefile;

    @OneToOne
    private NatureInfo natureInfo;
    @OneToOne
    private RebondInfo rebondInfo;
    @OneToOne
    private SupportParution supportParution;
    @OneToOne
    private PerceptionSupportParution perceptionSupportParution;
    @OneToOne
    private Action action;

}