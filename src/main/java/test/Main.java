/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.calvet.servicios.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Marta
 */
public class Main {
    public static void main(String[] args) {
        TrabajoPintura tp1 = new TrabajoPintura("Marta", LocalDate.of(2023, 9, 12), "Escuela", 20, 4);        
        TrabajoPintura tp2 = new TrabajoPintura("Maria", LocalDate.of(2023, 10, 30), "Hotel", 60, 7);
        TrabajoPintura tp3 = new TrabajoPintura("Roger", LocalDate.of(2023, 6, 10), "Tienda", 200, 2.5);

        RevisionAlarma ra1 = new RevisionAlarma(LocalDate.of(2023, 9, 12), "Escuela", 34);
        RevisionAlarma ra2 = new RevisionAlarma(LocalDate.of(2023, 3, 05), "Hotel", 70);        
        RevisionAlarma ra3 = new RevisionAlarma(LocalDate.of(2023, 7, 20), "Tienda", 3);
        
        ArrayList<Servicio> trabajos = new ArrayList<>();
        
        trabajos.add(tp1);
        trabajos.add(tp2);
        trabajos.add(tp3);
        trabajos.add(ra1);
        trabajos.add(ra2);
        trabajos.add(ra3);        
        
        double costeTotal = 0;
        double costeManoObra = 0;
        
        for(Servicio t: trabajos){
            costeTotal += t.costeTotal();
            costeManoObra += t.costeManoObra();
            
            System.out.println(t.detalleServicio()+"\n\n");
        }
        
        System.out.println("Coste Total: " + String.format("%.2f",costeTotal) + "€\nCoste mano de obra: " + String.format("%.2f",costeManoObra) + "€");
    }
}
