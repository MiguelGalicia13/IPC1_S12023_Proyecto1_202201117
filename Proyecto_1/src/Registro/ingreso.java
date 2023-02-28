/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro;
import login.datausers;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ingreso {

   
    
public static void RGSTR(){
    datausers u = new datausers();
    Registro r = new Registro();
    u.setCorreos(r.getNewEmail());
    u.setContras(r.getNewPass());
    u.setNm(r.getNewName());
    u.setLstNm(r.getNewApe());
    u.setDPIs(r.getNewDPI());
    u.setrol(r.getrol());
    u.setgenero(r.getGenero());
    u.setusr(r.getNewurs());
    u.setnc(r.getNewNacionalidad());
        
}
    

    
    
    
    
    
    
    
    
    
    
    
    


    
    
    
}
