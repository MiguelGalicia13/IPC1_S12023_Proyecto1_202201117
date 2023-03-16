/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes.RegistroTarjetasDeCredito;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricar
 */
public class Tarjetas {
    private ArrayList<String> nombres;
    private ArrayList<String> numeros;
    private ArrayList<int[]> fechas;
    
     public Tarjetas(){
         this.nombres = new ArrayList<String>();
        this.numeros = new ArrayList<String>();
        this.fechas = new ArrayList<int[]>();
     }
     
     public void agregarTarjeta(String nombre, String numero, int dia, int anio) {
        nombres.add(nombre);
        numeros.add(numero);
        int[] fecha = {dia, anio};
        fechas.add(fecha);
    }
     public ArrayList<String> getNombres() {
        return nombres;
    }

    public ArrayList<String> getNumeros() {
        return numeros;
    }

    public ArrayList<int[]> getFechas() {
        return fechas;
    }
}
