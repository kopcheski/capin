package com.kopcheski.capin.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Banco {
    
    @Id
    private String id;
    
    private String descricao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
