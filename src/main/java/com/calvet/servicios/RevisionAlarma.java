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
public class RevisionAlarma extends Servicio {
    
    protected int numAlarmas;

    public RevisionAlarma(LocalDate fechaInicio, String cliente, int numAlarmas) {
        super("Revisior especialista contra incendios", fechaInicio, cliente);
        this.numAlarmas = numAlarmas;
    }

    public RevisionAlarma(int numAlarmas) {
        this.numAlarmas = numAlarmas;
    }

    public int getNumAlarmas() {
        return numAlarmas;
    }

    public void setNumAlarmas(int numAlarmas) {
        this.numAlarmas = numAlarmas;
    }
    
    
    

    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return (numAlarmas/3.0)*40;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {
        String detalles = "";
        
        detalles += "REVISION PERIODICA ALARMAS CONTRA INCENDIOS\n";
        detalles += "\nCliente: " + cliente;
        detalles += "\nFecha inicio: " + fechaInicio;
        detalles += "\n---------------------------";
        detalles += "\nTOTAL: " + String.format("%.2f",costeTotal()) + "€";
        detalles += "\n---------------------------\n\n";
        return detalles;
    }
    
}
