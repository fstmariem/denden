/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

import com.example.demo.entité.etudiants;
import com.example.deoa.etudianrepository;
import com.example.deoa.etudianrepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author ASUS
 */



@RestController
@RequestMapping({"/etudiant"})

public class controller {
@Autowired
etudianrepository se;
 
@GetMapping
    public List<etudiants> getalletudiants() {
        
 
        
  List<etudiants> list = se.findAll();
 System.out.print(list);
      return list ;
    
    }
    @PostMapping
    public  etudiants ajouter( @RequestBody etudiants e) {
        
       etudiants e1= se.save(e);
        return e1;
    }
   
    @DeleteMapping(path ={"/{id}"})
    public void delete(@PathVariable("id") int id) {
          se.deleteById(id);
    }
    
    
}
