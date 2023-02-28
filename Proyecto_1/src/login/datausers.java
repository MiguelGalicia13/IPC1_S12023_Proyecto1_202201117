/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;
import login.iu;
import java.util.ArrayList;
import Registro.ingreso;
public class datausers {
    private static ArrayList<String> correos = new ArrayList<>();
    private static ArrayList<String> contras = new ArrayList<>();
    private static ArrayList<String> Nm = new ArrayList<String>();
    private static ArrayList<String> LstNm = new ArrayList<String>();
    private static ArrayList<String> DPIs = new ArrayList<String>();
    private static ArrayList<String> rol = new ArrayList<String>();
    private static ArrayList<String> genero = new ArrayList<String>();
    private static ArrayList<String> usr = new ArrayList<String>();
    private static ArrayList<String> nacionalidad = new ArrayList<String>();
    private static ArrayList<String>cel = new ArrayList<String>();
    
    public ArrayList<String> getCorreos() {
        return correos;
    }
    public ArrayList<String> getContras() {
        return contras;
    }
    public static ArrayList<String> getNm() {
        return Nm;
    }
    public static ArrayList<String> getLstNm() {
        return LstNm;
    }
    public static ArrayList<String> getDPIs() {
        return DPIs;
    }
     public static ArrayList<String> getgenero() {
        return genero;
    }
     public static ArrayList<String> getcel() {
        return cel;
    }
     public static ArrayList<String> getrol() {
        return rol;
    }
     public static ArrayList<String> getnacionalidad() {
        return nacionalidad;
    }
     
public static ArrayList<String> getusr() {
        return usr;
    }
     public static void setNm(String name) {
        Nm.add(name);
    }
    public static void setLstNm(String LstName) {
        LstNm.add(LstName);
    }
    public static void setDPIs(String CUI) {
        DPIs.add(CUI);
    }
    public static void setrol(String RL) {
        rol.add(RL);
    }
    public static void setgenero(String gnr) {
        genero.add(gnr);
    }
    public static void setusr(String user) {
        usr.add(user);
    }
    public static void setnc(String pais) {
        nacionalidad.add(pais);
    }
    public static void setcelular(String celu) {
        cel.add(celu);
    }
    public void login() {
        setCorreos("ipc1_202201117@ipc1delivery.com");
        setNm("Miguel Ricardo");
        setContras("202201117");
        setLstNm("Galicia");
        setDPIs("3776080760101");
        setrol("Administrador");
        setgenero("M");
        setusr("MikeGa");
        setnc("Guatemalteco");
        setcelular("49783893");
        ingreso.RGSTR();
  
    }
    public void setCorreos(String correo) {
        correos.add(correo);
    }
    public void setContras(String pass) {
        contras.add(pass);
    }
    public int tamanio(){
        return correos.size();
    }
    
    public boolean validacion(){
    iu HUD = new iu();
    String usuarioinput = HUD.usrInput.getText();
    String contrainput = HUD.pswrdInput.getText();
    
    for(int i=0;i<=correos.size()-1;i++){
        if(usuarioinput.equals(correos.get(i))&&contrainput.equals(contras.get(i))){
            return true;
        }
    }
    return false;
    }
    
}
