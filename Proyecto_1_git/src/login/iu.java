/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import login.datausers;
import admin.menuAdmin;
import Registro.Registro;

/**
 *
 * @author ricar
 */
public class iu extends javax.swing.JFrame {
public String mls;
    
    public iu() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LGIN = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pswrdInput = new javax.swing.JTextField();
        usrInput = new javax.swing.JTextField();
        LGN = new javax.swing.JButton();
        RGSRT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Correo");

        jLabel2.setText("Contraseña");

        pswrdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswrdInputActionPerformed(evt);
            }
        });

        usrInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrInputActionPerformed(evt);
            }
        });

        LGN.setText("Iniciar Sesión");
        LGN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LGNMouseClicked(evt);
            }
        });
        LGN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LGNActionPerformed(evt);
            }
        });

        RGSRT.setText("Registro");
        RGSRT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RGSRTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LGINLayout = new javax.swing.GroupLayout(LGIN);
        LGIN.setLayout(LGINLayout);
        LGINLayout.setHorizontalGroup(
            LGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LGINLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(RGSRT, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LGN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(LGINLayout.createSequentialGroup()
                .addGroup(LGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LGINLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2)
                        .addGap(211, 211, 211)
                        .addComponent(pswrdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LGINLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1)))
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(LGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LGINLayout.createSequentialGroup()
                    .addContainerGap(408, Short.MAX_VALUE)
                    .addComponent(usrInput, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(282, 282, 282)))
        );
        LGINLayout.setVerticalGroup(
            LGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LGINLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(LGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pswrdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(LGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LGN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RGSRT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(LGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LGINLayout.createSequentialGroup()
                    .addGap(157, 157, 157)
                    .addComponent(usrInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(237, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pswrdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswrdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswrdInputActionPerformed

    private void usrInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrInputActionPerformed

    private void LGNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LGNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LGNActionPerformed

    private void LGNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LGNMouseClicked
        // TODO add your handling code here:
        mls = getUsrInput();
        datausers u = new datausers();
        
        u.login();
        
        if(u.validacion() ==true){
            
            if(getUsrInput().contains("@ipc1delivery.com")){
                menuAdmin m = new menuAdmin();
                dispose();
                
            JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso");
            m.setVisible(true);
            
            }else{
                dispose();
                //agregar interfaz usuario
           
            JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso");
            }
            
            
        }else JOptionPane.showMessageDialog(null, "datos incorrectos");
    }//GEN-LAST:event_LGNMouseClicked

    private void RGSRTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RGSRTMouseClicked
        // TODO add your handling code here:
        dispose();
        Registro r = new Registro();
        r.setVisible(true);
        
    }//GEN-LAST:event_RGSRTMouseClicked
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(iu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new iu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel LGIN;
    private javax.swing.JButton LGN;
    private javax.swing.JButton RGSRT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField pswrdInput;
    public javax.swing.JTextField usrInput;
    // End of variables declaration//GEN-END:variables

    public JTextField getPswrdInput() {
        return pswrdInput;
    }

    public String getUsrInput() {
        return usrInput.getText();
    }

 
    
    
    
}