package com.kopcheski.capin.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Capin2 {

    @Id
    private Integer id;
    
    private String nomeRazaoSocial;
    
    private String cnpjCpf;
    
    @ManyToOne(cascade=CascadeType.ALL)
    private TipoPessoa tipoPessoa;
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy="capin2", targetEntity=Cbos.class)
    private List<Cbos> cbos;
    
    private String cnes;

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

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCnes() {
        return cnes;
    }

    public void setCnes(String cnes) {
        this.cnes = cnes;
    }

    public List<Cbos> getCbos() {
        return cbos;
    }

    public void setCbos(List<Cbos> cbos) {
        this.cbos = cbos;
    }
    
}
