/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.julianfranco.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String logo;
    @NotBlank
    private String enlaceGit;
    @NotBlank
    private String enlaceWeb;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, String descripcion, String logo, String enlaceGit, String enlaceWeb) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.logo = logo;
        this.enlaceGit = enlaceGit;
        this.enlaceWeb = enlaceWeb;
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
