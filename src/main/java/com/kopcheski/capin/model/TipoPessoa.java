package com.kopcheski.capin.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoPessoa {
    
    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
