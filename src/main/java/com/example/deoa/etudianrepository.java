/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.deoa;


import com.example.demo.entité.etudiants;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface etudianrepository extends JpaRepository<etudiants, Integer>  {
  
}
