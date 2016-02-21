package com.kopcheski.capin.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prestador {
    
    @Id
    private Integer id;
    
    private String nomeRazaoSocial;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }

}
