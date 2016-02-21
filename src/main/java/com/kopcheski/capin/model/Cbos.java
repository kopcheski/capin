package com.kopcheski.capin.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cbos {
    
    @Id
    private Integer id;
    
    private String descricao;
    
    @ManyToOne(targetEntity=Capin.class)
    private Capin2 capin2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Capin2 getCapin2() {
        return capin2;
    }

    public void setCapin2(Capin2 capin2) {
        this.capin2 = capin2;
    }

}
