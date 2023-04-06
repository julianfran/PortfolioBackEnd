/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.julianfranco.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    private String logo;
    private String enlaceGit;
    private String enlaceWeb;

    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, String logo, String enlaceGit, String enlaceWeb) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.logo = logo;
        this.enlaceGit = enlaceGit;
        this.enlaceWeb = enlaceWeb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    public String getEnlaceGit() {
        return enlaceGit;
    }

    public void setEnlaceGit(String enlaceGit) {
        this.enlaceGit = enlaceGit;
    }

    public String getEnlaceWeb() {
        return enlaceWeb;
    }

    public void setEnlaceWeb(String enlaceWeb) {
        this.enlaceWeb = enlaceWeb;
    }
    
    
}
