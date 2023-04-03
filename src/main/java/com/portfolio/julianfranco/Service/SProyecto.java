/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.julianfranco.Service;

import com.portfolio.julianfranco.Entity.Proyecto;
import com.portfolio.julianfranco.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SProyecto {
    @Autowired
    RProyecto rproyecto;
    
     public List<Proyecto> list(){
        return rproyecto.findAll();
    }
    
    public Optional<Proyecto> getOne(int id){
        return rproyecto.findById(id);
    }
     
    
    public Optional<Proyecto> getByNombre(String nombre){
        return rproyecto.findByNombre(nombre);
    }
    
    public void save(Proyecto proy){
        rproyecto.save(proy);
    }
    
    public void delete(int id){
        rproyecto.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rproyecto.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rproyecto.existsByNombre(nombre);
    }
    
}
