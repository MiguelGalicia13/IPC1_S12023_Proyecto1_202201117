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
    public int res;
    public void busqueda(){
        iu ui = new iu();
        datausers dta = new datausers();
        for(int i=0;i<=dta.tamanio()-1;i++){
            if(ui.mls.equals(dta.getCorreos().get(i))){
                res = i;
            }
        }
    String nombre = dta.getNm().get(res);
    String apellido = dta.getLstNm().get(res);
    String email = dta.getCorreos().get(res);
    String CUI = dta.getDPIs().get(res);
    String genero = dta.getgenero().get(res);
    String rol = dta.getrol().get(res);
    String necionalidad = dta.getnacionalidad().get(res);
    String usuario = dta.getusr().get(res);
    String celu = dta.getcel().get(res);
    
    }
    
}
