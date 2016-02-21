package com.kopcheski.capin.rest;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@RequestMapping("/test")
public class ServidorRest {

    @RequestMapping(path = "/capin", produces="application/json", method=RequestMethod.GET)
    @ResponseBody
    String getCapin() {
        return getFileAsString("new4.txt");
    }

    @RequestMapping(path = "/capin2", produces="application/json", method=RequestMethod.GET)
    @ResponseBody
    String getCapin2() {
        return getFileAsString("new5.txt");
    }

    private String getFileAsString(String fileName) {
        try {
            URL resource = this.getClass().getClassLoader().getResource(fileName);
            return new String(Files.readAllBytes(Paths.get(resource.getPath())));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
