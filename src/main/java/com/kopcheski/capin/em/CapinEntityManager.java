package com.kopcheski.capin.em;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CapinEntityManager {
    
    private static EntityManager em = null;
    private static CapinEntityManager cem = null;
    
    private CapinEntityManager() {
        
    }

    public EntityManager getEm() {
        if (em == null) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("capin");
            em = factory.createEntityManager();
        }
        
        return em;
    }

    public static CapinEntityManager getInstance() {
        if (cem == null) {
            cem = new CapinEntityManager();
        }
        return cem;
    }
    
}
