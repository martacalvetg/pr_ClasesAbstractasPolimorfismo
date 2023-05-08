/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calvet.servicios;

import java.time.LocalDate;

/**
 *
 * @author Marta
 */
public class TrabajoPintura extends Servicio {
    
    protected double superficie;
    protected double precioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public TrabajoPintura() {
    }
    
    
    @Override
    public double costeMaterial() {
        return (superficie/7.8)*precioPintura;
    }

    @Override
    public double costeManoObra() {
        return (superficie/10.0)*9.5;
    }

    @Override
    public double costeTotal() {
        return costeMaterial() + costeManoObra() + costeAdicional();
    }
    
    private double costeAdicional(){
        if(superficie < 50){
            return ((costeMaterial() + costeManoObra()) * 0.15);
        } else {
            return 0;
        }
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }
    
    @Override
    public String detalleServicio(){
        String detalles = ""; 
        
        detalles += "TRABAJO PINTURA\n\n";
        detalles += "Cliente: " + cliente;
        detalles += "\nFecha de Inicio: " + fechaInicio;
        detalles += "\n---------------------------";
        detalles += "\nPintor: " + trabajador;
        detalles += "\nCoste Material: " + String.format("%.2f",costeMaterial())+ "€";
        detalles += "\nCoste mano de obra: " + String.format("%.2f",costeManoObra())+ "€";
        detalles += "\nCoste adicional: " + String.format("%.2f",costeAdicional()) + "€";
        detalles += "\nTOTAL: " + String.format("%.2f",costeTotal()) + "€";
        detalles += "\n---------------------------\n\n";
        
        return detalles;
    }
    
    
}
