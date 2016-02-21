package com.kopcheski.capin.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Capin {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    
    private String registroAnsOperadora;
    
    @ManyToOne(cascade=CascadeType.ALL)
    private Prestador prestador;
    
    @ManyToOne(cascade=CascadeType.ALL)
    private Banco banco;
    
    private String numeroAgencia;
    
    private String numeroContaCorrente;
    
    private Date inicioContratualizacao;
    
    private Boolean visivelGuiaMedico;
    
    private Boolean podeUrgenciaEmergencia;

    public String getRegistroAnsOperadora() {
        return registroAnsOperadora;
    }

    public void setRegistroAnsOperadora(String registroAnsOperadora) {
        this.registroAnsOperadora = registroAnsOperadora;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public Date getInicioContratualizacao() {
        return inicioContratualizacao;
    }

    public void setInicioContratualizacao(Date inicioContratualizacao) {
        this.inicioContratualizacao = inicioContratualizacao;
    }

    public Boolean getVisivelGuiaMedico() {
        return visivelGuiaMedico;
    }

    public void setVisivelGuiaMedico(Boolean visivelGuiaMedico) {
        this.visivelGuiaMedico = visivelGuiaMedico;
    }

    public Boolean getPodeUrgenciaEmergencia() {
        return podeUrgenciaEmergencia;
    }

    public void setPodeUrgenciaEmergencia(Boolean podeUrgenciaEmergencia) {
        this.podeUrgenciaEmergencia = podeUrgenciaEmergencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
