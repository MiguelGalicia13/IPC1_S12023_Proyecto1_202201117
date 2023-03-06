/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import login.datausers;
import login.iu;
import Registro.ingreso;
import Registro.Registro;
import javax.swing.JOptionPane;
public class busqueda {
    private String nombre;
    private String apellido;    
    private String email;
    private String CUI;
    private String genero;
    private String rol;
    private String nacionalidad;
    private String usuario;
    private String celu;
    public int res;
        
    public void busqueda(){
        iu ui = new iu();
        datausers dta = new datausers();
        for(int i=0;i<=dta.tamanio()-1;i++){
            if(ui.mls.equals(dta.getCorreos().get(i))){
                res = i;
            }
        }
    setNombre(dta.getNm().get(res));
    setApellido(dta.getLstNm().get(res)) ;
    setEmail(dta.getCorreos().get(res));
    setCUI(dta.getDPIs().get(res));
    setGenero(dta.getgenero().get(res));
    setRol(dta.getrol().get(res));
    setNacionalidad(dta.getnacionalidad().get(res));
    setUsuario(dta.getusr().get(res));
    setCelu(dta.getcel().get(res));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCUI() {
        return CUI;
    }   

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCelu() {
        return celu;
    }

    public void setCelu(String celu) {
        this.celu = celu;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
    
}
