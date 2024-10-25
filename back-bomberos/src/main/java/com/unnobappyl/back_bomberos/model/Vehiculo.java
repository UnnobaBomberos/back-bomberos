package com.unnobappyl.model;

import java.util.Date;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Date anio;
    private GuiaRescate guiaRescate;
  
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Date getAnio() {
        return anio;
    }
    public void setAnio(Date anio) {
        this.anio = anio;
    }
      
    public GuiaRescate getGuiaRescate() {
        return guiaRescate;
    }
    public void setGuiaRescate(GuiaRescate guiaRescate) {
        this.guiaRescate = guiaRescate;
    }
}
