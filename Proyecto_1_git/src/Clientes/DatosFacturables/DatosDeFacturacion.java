/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes.DatosFacturables;

import java.util.ArrayList;
import login.datausers;


public class DatosDeFacturacion {
     private  static ArrayList<String> Direccion = new ArrayList<>();
     private  static ArrayList<String> NIT = new ArrayList<>();
     
     
     

    public static ArrayList<String> getDireccion() {
        return Direccion;
    }

    public static ArrayList<String> getNIT() {
        return NIT;
    }

    public static void setDireccion(String direccion) {
        DatosDeFacturacion.Direccion.add(direccion);
    }

    public static void setNIT(String rtu) {
        DatosDeFacturacion.NIT.add(rtu);
    }
     
     
     
}
