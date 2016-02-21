package com.kopcheski.capin.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.kopcheski.capin.model.Capin;
import com.kopcheski.capin.model.Capin2;

public class ClienteRest {
    
    public List<Capin> importeCapin() {
        Capin[] forObject = new RestTemplate().getForObject("http://localhost:8080/test/capin", Capin[].class);
        return Arrays.asList(forObject);
    }
    
    public List<Capin2> importeCapin2() {
        Capin2[] forObject = new RestTemplate().getForObject("http://localhost:8080/test/capin2", Capin2[].class);
        return Arrays.asList(forObject);
    }

}
