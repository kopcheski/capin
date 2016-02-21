package com.kopcheski.capin.rest;

import javax.persistence.EntityManager;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.SpringApplication;

import com.kopcheski.capin.em.CapinEntityManager;
import com.kopcheski.capin.model.Banco;
import com.kopcheski.capin.model.Capin;
import com.kopcheski.capin.model.Capin2;
import com.kopcheski.capin.model.Cbos;
import com.kopcheski.capin.model.Prestador;
import com.kopcheski.capin.model.TipoPessoa;
import com.kopcheski.capin.service.CapinService;

public class ClienteRestTest {
    
    private static CapinService service = new CapinService();
    
    private static CapinEntityManager em = CapinEntityManager.getInstance();
    
    @BeforeClass
    public static void setUpClass() {
        SpringApplication.run(ServidorRest.class);
        service.importe();
    }
    
    @Test
    public void teste_quantidade_de_capins_importados() {
        int maxResults = getQuantidadeDeRegistrosDaEntidade(Capin.class);
        Assert.assertEquals(10, maxResults);
    }
    
    @Test
    public void teste_quantidade_de_prestadores_importados() {
        int maxResults = getQuantidadeDeRegistrosDaEntidade(Prestador.class);
        Assert.assertEquals(10, maxResults);
    }
    
    @Test
    public void teste_quantidade_de_bancos_importados() {
        int maxResults = getQuantidadeDeRegistrosDaEntidade(Banco.class);
        Assert.assertEquals(3, maxResults);
    }
    
    @Test
    public void teste_quantidade_de_capins2_importados() {
        int maxResults = getQuantidadeDeRegistrosDaEntidade(Capin2.class);
        Assert.assertEquals(10, maxResults);
    }
    
    @Test
    public void teste_quantidade_de_tipos_de_pessoa_importados() {
        int maxResults = getQuantidadeDeRegistrosDaEntidade(TipoPessoa.class);
        Assert.assertEquals(1, maxResults);
    }
    
    @Test
    public void teste_quantidade_de_cbos_importados() {
        int maxResults = getQuantidadeDeRegistrosDaEntidade(Cbos.class);
        Assert.assertEquals(1, maxResults);
    }
    
    private int getQuantidadeDeRegistrosDaEntidade(Class<?> entidade) {
        EntityManager manager = em.getEm();
        
        return manager.createQuery("from " + entidade.getSimpleName(), entidade).getResultList().size();
    }

}
