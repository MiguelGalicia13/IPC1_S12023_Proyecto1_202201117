/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;
import login.iu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
public class datausers {
    private  static ArrayList<String> correos = new ArrayList<>(){{ add("ipc1_202201117@ipc1delivery.com");}};
    private  static ArrayList<String> contras = new ArrayList<>(){{add("202201117");}};
    private  static ArrayList<String> Nm = new ArrayList<String>(){{ add("Miguel");}};
    private  static ArrayList<String> LstNm = new ArrayList<String>(){{ add("Galicia");}};
    private  static ArrayList<String> DPIs = new ArrayList<String>(){{ add("3776080760101");}};
    private  static ArrayList<String> rol = new ArrayList<String>(){{ add("Usuario Empresarial");}};
    private  static ArrayList<String> genero = new ArrayList<String>(){{ add("M");}};
    private  static ArrayList<String> usr = new ArrayList<String>(){{ add("Mikega13");}};
    private  static ArrayList<String> nacionalidad = new ArrayList<String>(){{ add("Guatemalteco");}};
    private  static ArrayList<String>cel = new ArrayList<String>(){{ add("49783893");}};
    
    public ArrayList<String> getCorreos() {
        return correos;
    }
    public ArrayList<String> getContras() {
        return contras;
    }
    public  ArrayList<String> getNm() {
        return Nm;
    }
    public  ArrayList<String> getLstNm() {
        return LstNm;
    }
    public  ArrayList<String> getDPIs() {
        return DPIs;
    }
     public  ArrayList<String> getgenero() {
        return genero;
    }
     public  ArrayList<String> getcel() {
        return cel;
    }
     public  ArrayList<String> getrol() {
        return rol;
    }
     public  ArrayList<String> getnacionalidad() {
        return nacionalidad;
    }
     
public  ArrayList<String> getusr() {
        return usr;
    }
public void registrar(String mail,String contra,String nombre, String apellido,String gen, String DPI, String celular, String nacion, String usuario, String role){
    correos.add(mail);
    contras.add(contra);
    Nm.add(nombre);
    LstNm.add(apellido);
    DPIs.add(DPI);
    rol.add(role);
    genero.add(gen);
    usr.add(usuario);
    nacionalidad.add(nacion);
    cel.add(celular);
    
}
    

    
    public boolean validacion(String email, String contra){

    if(getCorreos().contains(email)&&getContras().contains(contra)){
        int emailIndex = getCorreos().indexOf(email);
        int contraIndex = getContras().indexOf(contra);
        if(emailIndex==contraIndex){
            
        }else{
            JOptionPane.showMessageDialog(null, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }else {
        JOptionPane.showMessageDialog(null, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    return true;
    }
    
}
