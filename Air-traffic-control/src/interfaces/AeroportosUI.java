package interfaces;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AeroportosUI extends javax.swing.JDialog {

    public AeroportosUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
                this.setIconImage(new ImageIcon(getClass().getResource("/imagens/map.png")).getImage());
        /*jFormattedTextField2.setFormatterFactory(null);
        jFormattedTextField5.setFormatterFactory(null);
        jFormattedTextField8.setFormatterFactory(null);
        jFormattedTextField4.setFormatterFactory(null);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField11 = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jFormattedTextField8 = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField9 = new javax.swing.JFormattedTextField();
        jFormattedTextField10 = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField12 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField13 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Aeroportos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(219, 219, 225));
        jPanel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentShown(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("IATA:");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("País:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 40, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Nome:");
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 610, 20));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Cidade:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jFormattedTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 70, 40));

        jFormattedTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jFormattedTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 320, 30));

        jFormattedTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jFormattedTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 320, 30));

        jFormattedTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jFormattedTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 320, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier.png"))); // NOI18N
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ICAO:");
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jFormattedTextField11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField11ActionPerformed(evt);
            }
        });
        jPanel2.add(jFormattedTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 70, 40));

        jTabbedPane1.addTab("Consultar / Excluir  ", new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier.png")), jPanel2); // NOI18N

        jPanel4.setBackground(new java.awt.Color(219, 219, 225));
        jPanel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 610, 20));

        jFormattedTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField8ActionPerformed(evt);
            }
        });
        jPanel4.add(jFormattedTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 320, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Nome:");
        jLabel11.setToolTipText("");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("País:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 40, -1));

        jFormattedTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(jFormattedTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 320, 30));

        jFormattedTextField10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(jFormattedTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 320, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Cidade:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png"))); // NOI18N
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("IATA:");
        jLabel4.setToolTipText("");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jFormattedTextField12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField12ActionPerformed(evt);
            }
        });
        jPanel4.add(jFormattedTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 70, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("ICAO:");
        jLabel8.setToolTipText("");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jFormattedTextField13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField13ActionPerformed(evt);
            }
        });
        jPanel4.add(jFormattedTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 70, 40));

        jTabbedPane1.addTab("Cadastrar  ", new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png")), jPanel4); // NOI18N

        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane1.addTab("Lista  ", new javax.swing.ImageIcon(getClass().getResource("/imagens/application_view_list.png")), jPanel1); // NOI18N

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 490, 370));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Consultar/ Excluir  ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/airport.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -40, 880, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentShown

    }//GEN-LAST:event_jPanel2ComponentShown

    private void jFormattedTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField4ActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jFormattedTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField8ActionPerformed

    private void jFormattedTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField11ActionPerformed

    private void jFormattedTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField12ActionPerformed

    private void jFormattedTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField13ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AeroportosUI dialog = new AeroportosUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextField10;
    private javax.swing.JFormattedTextField jFormattedTextField11;
    private javax.swing.JFormattedTextField jFormattedTextField12;
    private javax.swing.JFormattedTextField jFormattedTextField13;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField8;
    private javax.swing.JFormattedTextField jFormattedTextField9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
}
