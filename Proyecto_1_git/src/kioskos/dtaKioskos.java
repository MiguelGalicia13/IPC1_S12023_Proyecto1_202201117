/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kioskos;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class dtaKioskos {
    private static int index;
    private static ArrayList<Integer> codeK = new ArrayList<>();
    private static ArrayList<String> nameKiosko = new ArrayList<>();
    private static ArrayList<String> regKiosko = new ArrayList<>();   
    
    
    public int indice(){
        return index;
    }
  public void registrar(String nKiosko, String regKiosko){
      
      setNameKiosko(nKiosko);
      setRegKiosko(regKiosko);
      setCodeK(index);      
  }

    public void setCodeK(int indice) {
        this.codeK.add(indice);
        index++;
    }

    public ArrayList<Integer> getCodeK() {
        return codeK;
    }

    public ArrayList<String> getNameKiosko() {
        return nameKiosko;
    }

    public void setNameKiosko(String nameKi) {
        this.nameKiosko.add(nameKi);
    }

    public ArrayList<String> getRegKiosko() {
        return regKiosko;
    }

    public void setRegKiosko(String regK) {
        this.regKiosko.add(regK);
    }

    

   
    
}
