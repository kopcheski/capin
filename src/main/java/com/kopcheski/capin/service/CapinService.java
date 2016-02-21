package com.kopcheski.capin.service;

import java.util.List;

import javax.persistence.EntityManager;

import com.kopcheski.capin.em.CapinEntityManager;
import com.kopcheski.capin.model.Capin;
import com.kopcheski.capin.model.Capin2;
import com.kopcheski.capin.rest.ClienteRest;

public class CapinService {
    
    private CapinEntityManager em = CapinEntityManager.getInstance();
    
    public void importe() {
        List<Capin> capins = new ClienteRest().importeCapin();
        List<Capin2> capins2 = new ClienteRest().importeCapin2();
        
        EntityManager manager = em.getEm();

        manager.getTransaction().begin();    

        for (Capin capin : capins) {
            manager.merge(capin);
        }
        for (Capin2 capin2 : capins2) {
            manager.merge(capin2);
        }

        manager.getTransaction().commit();  
    }

}
