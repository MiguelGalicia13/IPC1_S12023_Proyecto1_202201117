package Regiones;

import java.util.ArrayList;
import javax.swing.JComboBox;
import admin.menuAdmin;
import java.util.Arrays;
public class Departamentos extends javax.swing.JFrame {
private String[] AreaMetropolitana={"Chimaltenango", "Guatemala", "Sacatepequez","Solola"};
private String[] AreaNorte={"Alta Verapaz", "Baja Verapaz", "Peten"};
private String[] AreaNOR={"Chiquimula","El Progreso","Izabal","Jalapa","Zacapa"};  
private String[] AreaNOC={"Huehuetanango","Quiche","San Marcos","Totonicapan"};
private String[] AreaSURO={"Escuintla","Jutiapa","Santa Rosa"};
private String[] AreaSUC={"Quetzaltenango","Retalhuleu","Suchitepequez"};

    
    private String[] AltaVerapaz = {"Cobán", "Chahal", "Fray Bartolomé de las Casas", "Lanquín", "Panzós", "Raxruhá", "San Cristóbal Verapaz", "San Juan Chamelco", "San Pedro Carchá", "Santa Cruz Verapaz", "Santa María Cahabón", "Senahú", "Tactic", "Tamahú", "Tucurú", "Panzós"};
    private String[] BajaVerapaz = {"Salamá", "Cubulco", "Granados", "Purulhá", "San Jerónimo", "San Miguel Chicaj", "Santa Cruz el Chol"}; 
    private String[] Chimaltenango = {"Chimaltenango", "Acatenango", "Comalapa", "El Tejar", "Parramos", "Patzicía", "Patzún", "Pochuta", "San Andrés Itzapa", "San José Poaquil", "San Juan Comalapa", "San Martín Jilotepeque", "Santa Apolonia", "Santa Cruz Balanyá", "Tecpán Guatemala", "Yepocapa", "Zaragoza"};
    private String[] Chiquimula = {"Chiquimula", "Camotán", "Concepción Las Minas", "Esquipulas", "Ipala", "Jocotán", "Olopa", "Quezaltepeque", "San Jacinto", "San José la Arada", "San Juan Ermita", "San Luis Jilotepeque", "San Manuel Chaparrón", "San Marcos", "San Juan Hermita", "San José Ojetenam", "San Juan Ostuncalco", "San Mateo Ixtatán", "San Miguel Ixtahuacán", "Sipacapa", "Tacaná", "Tejutla"};
    private String[] Peten = {"Flores", "Dolores", "La Libertad", "San Andrés", "San Benito", "San Francisco", "San José", "San Luis", "Santa Ana", "Sayaxché", "Melchor de Mencos", "Poptún"};
    private String[] ElProgreso = {"Guastatoya", "El Jícaro", "Sanarate", "Sansare", "San Agustín Acasaguastlán"};
    private String[] Escuintla = {"Escuintla", "Iztapa", "La Democracia", "La Gomera", "Masagua", "Nueva Concepción", "Palín", "San José", "San Vicente Pacaya", "Santa Lucía Cotzumalguapa", "Siquinalá", "Tiquisate"};
    private String[] Guatemala = {"Guatemala", "Santa Catarina Pinula", "San José Pinula", "San José del Golfo", "Palencia", "Chinautla", "San Pedro Ayampuc", "Mixco", "San Pedro Sacatepéquez", "San Juan Sacatepéquez", "San Raymundo", "Chuarrancho", "Fraijanes", "Amatitlán", "Villa Nueva", "Villa Canales", "Petapa"};
    private String[] Huehuetenango = {"Aguacatán", "Chiantla", "Colotenango", "Concepción Huista", "Cuilco", "Huehuetenango", "Jacaltenango", "La Democracia", "La Libertad", "Malacatancito", "Nentón", "Petatán", "San Antonio Huista", "San Gaspar Ixchil", "San Ildefonso Ixtahuacán", "San Juan Atitán", "San Juan Ixcoy", "San Mateo Ixtatán", "San Miguel Acatán", "San Pedro Necta", "San Rafael La Independencia", "San Rafael Petzal", "San Sebastián Coatán", "Santa Ana Huista", "Santa Bárbara", "Santa Cruz Barillas", "Santa Eulalia", "Santiago Chimaltenango", "Soloma", "Tectitán", "Todos Santos Cuchumatán"};
    private String[] Izabal = {"El Estor", "Livingston", "Los Amates", "Morales", "Puerto Barrios"};
    private String[] Jalapa = {"Jalapa", "Mataquescuintla", "Monjas", "San Carlos Alzatate", "San Luis Jilotepeque", "San Pedro Pinula", "San Manuel Chaparrón"};
    private String[] Jutiapa= {"Agua Blanca", "Asunción Mita", "Atescatempa", "Comapa", "Conguaco", "El Adelanto", "El Progreso", "Jalpatagua", "Jerez", "Jutiapa", "Moyuta", "Pasaco", "Quezada", "San José Acatempa", "Santa Catarina Mita", "Yupiltepeque", "Zapotitlán"};
    private String[] Quetzaltenango= {"Almolonga", "Cabricán", "Cajolá", "Cantel", "Coatepeque", "Colomba", "Concepción Chiquirichapa", "El Palmar", "Flores Costa Cuca", "Génova", "Huitán", "La Esperanza", "Olintepeque", "Ostuncalco", "Palestina de Los Altos", "Quetzaltenango", "Salcajá", "San Carlos Sija", "San Francisco La Unión", "San Juan Ostuncalco", "San Mateo", "San Miguel Sigüilá", "Sibilia", "Zunil"};
    private String[] Quiche = {"Santa Cruz del Quiché", "Chiché", "Chinique", "Chichicastenango", "Zacualpa", "San Antonio Ilotenango", "San Pedro Jocopilas", "Cunén", "San Juan Cotzal", "Joyabaj", "Nebaj", "San Andrés Sajcabajá", "Uspantán", "Sacapulas", "San Bartolomé Jocotenango"};
    private String[] Retalhuleu = {"Retalhuleu", "San Sebastián", "Santa Cruz Muluá", "San Martín Zapotitlán", "San Felipe", "San Andrés Villa Seca", "Champerico", "Nuevo San Carlos", "El Asintal"};
    private String[] Sacatepequez = {"La Antigua Guatemala", "Jocotenango", "Pastores", "Sumpango", "Santo Domingo Xenacoj", "Santiago Sacatepéquez", "San Bartolomé Milpas Altas", "San Lucas Sacatepéquez", "Santa Lucía Milpas Altas", "Magdalena Milpas Altas", "Santa María de Jesús", "Ciudad Vieja", "San Miguel Dueñas", "Alotenango", "San Antonio Aguas Calientes", "Santa Catarina Barahona"};
    private String[] SanMarcos = {"San Marcos", "San Pedro Sacatepéquez", "San Antonio Sacatepéquez", "Comitancillo", "San Miguel Ixtahuacán", "Concepción Tutuapa", "Tacaná", "Sibinal", "Tajumulco", "Tejutla", "San Rafael Pie de La Cuesta", "Nuevo Progreso", "El Tumbador", "El Rodeo", "Malacatán", "Catarina", "Ayutla", "Ocós", "Pajapita", "Ixchiguán"};
    private String[] SantaRosa = {"Cuilapa", "Barberena", "Santa Rosa de Lima", "Casillas", "San Rafael Las Flores", "Oratorio", "San Juan Tecuaco", "Chiquimulilla", "Taxisco", "Santa María Ixhuatán", "Guazacapán", "Santa Cruz Naranjo", "Pueblo Nuevo Viñas", "Nueva Santa Rosa"};
    private String[] Solola = {"Sololá", "San José Chacayá", "Santa María Visitación", "Santa Lucía Utatlán", "Nahualá", "Santa Catarina Ixtahuacán", "Santa Clara La Laguna", "Concepción", "San Andrés Semetabaj", "Panajachel", "Santa Catarina Palopó", "San Antonio Palopó", "San Lucas Tolimán", "Santa Cruz La Laguna", "San Pablo La Laguna", "San Juan La Laguna", "San Marcos La Laguna", "San Pedro La Laguna", "Santiago Atitlán"};
    private String[] Suchitepequez = {"Mazatenango", "Chicacao", "Cuyotenango", "Patulul", "Pueblo Nuevo", "Río Bravo", "Samayac", "San Antonio Suchitepéquez", "San Bernardino", "San Francisco Zapotitlán", "San Gabriel", "San José El Ídolo", "San Juan Bautista", "San Lorenzo", "San Miguel Panán", "San Pablo Jocopilas", "Santa Bárbara", "Santo Domingo Suchitepéquez", "Santo Tomás La Unión", "Zunilito"};
    private String[] Totonicapan = {"Totonicapán", "Momostenango", "San Andrés Xecul", "San Bartolo", "San Cristóbal Totonicapán", "San Francisco El Alto", "Santa Lucía La Reforma", "Santa María Chiquimula"};
    private String[] Zacapa = {"Zacapa", "Cabañas", "Estanzuela", "Gualán", "Huité", "La Unión", "Río Hondo", "San Diego", "Teculután", "Usumatlán"};
    
    public Departamentos() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codeRegion = new javax.swing.JLabel();
        region = new javax.swing.JLabel();
        BuscarDpto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Abuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        buscarDtpto = new javax.swing.JLabel();
        SearchMunicipio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        codeMunicipio = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Departamentos");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta Verapaz", "Baja Verapaz", "Chimaltenango", "Chiquimula", "El Progreso", "Escuintla", "Guatemala", "Huehuetenango", "Izabal", "Jalapa", "Jutiapa", "Petén", "Quetzaltenango", "Quiché", "Retalhuleu", "Sacatepéquez", "San Marcos", "Santa Rosa", "Sololá", "Suchitepéquez", "Totonicapán", "Zacapa" }));
        jComboBox1.setToolTipText("Departamento");

        jLabel2.setText("Region");

        jLabel3.setText("Codigo de la Region");

        BuscarDpto.setText("Buscar Departamento");
        BuscarDpto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarDptoMouseClicked(evt);
            }
        });

        jLabel4.setText("Municipio");

        jLabel5.setText("Departamento");

        SearchMunicipio.setText("Buscar Municipio");
        SearchMunicipio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMunicipioMouseClicked(evt);
            }
        });

        jLabel6.setText("Codigo de la region");

        jButton1.setText("Regresar al menu");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, 165, Short.MAX_VALUE)
                                    .addComponent(codeRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(region, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(BuscarDpto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Abuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(buscarDtpto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(SearchMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(codeMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Abuscar)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscarDtpto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(region, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codeRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BuscarDpto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codeMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(130, 130, 130)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarDptoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarDptoMouseClicked
        // TODO add your handling code here:
        BuscarDepartamento();
    }//GEN-LAST:event_BuscarDptoMouseClicked

    private void SearchMunicipioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMunicipioMouseClicked
        // TODO add your handling code here:
        Busquedamunicipios(Abuscar.getText());
    }//GEN-LAST:event_SearchMunicipioMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        dispose();
       menuAdmin n = new menuAdmin();
       n.setVisible(true);
        
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Departamentos().setVisible(true);
            }
        });
    }

    public void BuscarDepartamento(){
        if(contieneValor(getAreaNorte(),getjComboBox1())){
            region.setText("Norte");
            codeRegion.setText("NT");
        }
        else if(contieneValor(getAreaMetropolitana(),getjComboBox1())){
            region.setText("Metropolitana");
            codeRegion.setText("M");
        }
        else if(contieneValor(getAreaNOR(),getjComboBox1())){
            region.setText("Nororiente");
            codeRegion.setText("NO");
        }
        else if(contieneValor(getAreaNOC(),getjComboBox1())){
            region.setText("Noroccidente");
            codeRegion.setText("NOC");
        }
        else if(contieneValor(getAreaSURO(),getjComboBox1())){
            region.setText("Suroriente");
            codeRegion.setText("SO");
        }
        else if(contieneValor(getAreaSUC(),getjComboBox1())){
            region.setText("Suroccidente");
            codeRegion.setText("SOC");
        }
    }


    public boolean contieneValor(String[] array, String departamento) {
    for (String elemento : array) {
        if (elemento.equals(departamento)) {
            return true;
        }
    }
    return false;
}
    public int buscarMuni(String municipio, ArrayList<String[]> listado){
        int indiceArray = -1;
    for (int i = 0; i < listado.size(); i++) {
        String[] array = listado.get(i);
        if (Arrays.asList(array).contains(municipio)) {
            indiceArray = i;
            break;
        }
    }
    return indiceArray;
    }
    
    public void Busquedamunicipios(String muni){
        ArrayList<String[]> lista = new ArrayList<>();
        lista.add(getAltaVerapaz());
        lista.add(getBajaVerapaz());
        lista.add(getChimaltenango());
        lista.add(getChiquimula());
        lista.add(getPeten());
        lista.add(getElProgreso());
        lista.add(getEscuintla());
        lista.add(getGuatemala());
        lista.add(getHuehuetenango());
        lista.add(getIzabal());
        lista.add(getJalapa());
        lista.add(getJutiapa());
        lista.add(getQuetzaltenango());
        lista.add(getQuiche());
        lista.add(getRetalhuleu());
        lista.add(getSacatepequez());
        lista.add(getSanMarcos());
        lista.add(getSantaRosa());
        lista.add(getSolola());
        lista.add(getSuchitepequez());
        lista.add(getTotonicapan());
        lista.add(getZacapa());       
        String municipioBuscar = muni;
        int indiceDepartamento=buscarMuni(municipioBuscar,lista);
        switch(indiceDepartamento){
            case 0:
                buscarDtpto.setText("Alta Verapaz");
                codeMunicipio.setText("NT");
                break;
            case 1:
                buscarDtpto.setText("Baja Verapaz");
                codeMunicipio.setText("NT");
                break;
            case 2:
                buscarDtpto.setText("Chimaltenango");
                codeMunicipio.setText("M");
                break;
            case 3:
                buscarDtpto.setText("Chiquimula");
                codeMunicipio.setText("NO");
                break;
            case 4:
                buscarDtpto.setText("Peten");
                codeMunicipio.setText("NT");
                break;
            case 5:
                buscarDtpto.setText("El Progreso");
                codeMunicipio.setText("NO");
                break;
            case 6:
                buscarDtpto.setText("Escuintla");
                codeMunicipio.setText("SO");
                break;
            case 7:
                buscarDtpto.setText("Guatemala");
                codeMunicipio.setText("M");
                break;
            case 8:
                buscarDtpto.setText("Huehuetenango");
                codeMunicipio.setText("NOC");
                break;
            case 9:
                buscarDtpto.setText("Izabal");
                codeMunicipio.setText("NO");
                break;
            case 10:
                buscarDtpto.setText("Jalapa");
                codeMunicipio.setText("NO");
                break;
            case 11:
                buscarDtpto.setText("Jutiapa");
                codeMunicipio.setText("SO");
                break;
            case 12:
                buscarDtpto.setText("Quetzaltenango");
                codeMunicipio.setText("SOC");
                break;
            case 13:
                buscarDtpto.setText("Quiche");
                codeMunicipio.setText("NOC");
                break;
            case 14:
                buscarDtpto.setText("Retalhuleu");
                codeMunicipio.setText("SOC");
                break;
            case 15:
                buscarDtpto.setText("Sacatepequez");
                codeMunicipio.setText("M");
                break;
            case 16:
                buscarDtpto.setText("San Marcos");
                codeMunicipio.setText("NOC");
                break;
            case 17:
                buscarDtpto.setText("Santa Rosa");
                codeMunicipio.setText("SO");
                break;
            case 18:
                buscarDtpto.setText("Solola");
                codeMunicipio.setText("M");
                break;
            case 19:
                buscarDtpto.setText("Suchitepequez");
                codeMunicipio.setText("SOC");
                break;
            case 20:
                buscarDtpto.setText("Totonicapan");
                codeMunicipio.setText("NOC");
                break;
            case 21:
                buscarDtpto.setText("Zacapa");
                codeMunicipio.setText("NO");
                break;
            default:
                // código para cuando no se cumple ninguno de los casos anteriores
            break;
                
            
                
        }
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Abuscar;
    private javax.swing.JButton BuscarDpto;
    private javax.swing.JButton SearchMunicipio;
    private javax.swing.JLabel buscarDtpto;
    private javax.swing.JLabel codeMunicipio;
    private javax.swing.JLabel codeRegion;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel region;
    // End of variables declaration//GEN-END:variables
  public String[] getAreaMetropolitana() {
        return AreaMetropolitana;
    }

    public String[] getAreaNorte() {
        return AreaNorte;
    }

    public String[] getAreaNOR() {
        return AreaNOR;
    }

    public String[] getAreaNOC() {
        return AreaNOC;
    }

    public String[] getAreaSURO() {
        return AreaSURO;
    }

    public String[] getAreaSUC() {
        return AreaSUC;
    }

    public String getjComboBox1() {
        return (String)jComboBox1.getSelectedItem();
    }

    public String[] getAltaVerapaz() {
        return AltaVerapaz;
    }

    public String[] getBajaVerapaz() {
        return BajaVerapaz;
    }

    public String[] getChimaltenango() {
        return Chimaltenango;
    }

    public String[] getChiquimula() {
        return Chiquimula;
    }

    public String[] getPeten() {
        return Peten;
    }

    public String[] getElProgreso() {
        return ElProgreso;
    }

    public String[] getEscuintla() {
        return Escuintla;
    }

    public String[] getGuatemala() {
        return Guatemala;
    }

    public String[] getHuehuetenango() {
        return Huehuetenango;
    }

    public String[] getIzabal() {
        return Izabal;
    }

    public String[] getJalapa() {
        return Jalapa;
    }

    public String[] getJutiapa() {
        return Jutiapa;
    }

    public String[] getQuetzaltenango() {
        return Quetzaltenango;
    }

    public String[] getQuiche() {
        return Quiche;
    }

    public String[] getRetalhuleu() {
        return Retalhuleu;
    }

    public String[] getSacatepequez() {
        return Sacatepequez;
    }

    public String[] getSanMarcos() {
        return SanMarcos;
    }

    public String[] getSantaRosa() {
        return SantaRosa;
    }

    public String[] getSolola() {
        return Solola;
    }

    public String[] getSuchitepequez() {
        return Suchitepequez;
    }

    public String[] getTotonicapan() {
        return Totonicapan;
    }

    public String[] getZacapa() {
        return Zacapa;
    }

   
    
}
