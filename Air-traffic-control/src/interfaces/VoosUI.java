package interfaces;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VoosUI extends javax.swing.JDialog {

    public VoosUI(java.awt.Frame parent, boolean modal) {
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
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Designers");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 225));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(219, 219, 225));
        jPanel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentShown(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel2.setText("Código do voo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel6.setText("Email:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 40, -1));

        jLabel10.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel10.setText("Nome:");
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 610, 40));

        jLabel12.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel12.setText("Complemento:");
        jLabel12.setToolTipText("");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel15.setText("Telefone:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 60, -1));

        jLabel24.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel24.setText("CEP:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jTabbedPane1.addTab("Consultar/ Excluir  ", jPanel2);

        jPanel4.setBackground(new java.awt.Color(219, 219, 225));
        jPanel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Número do voo:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jFormattedTextField1.setText("jFormattedTextField1");
        jFormattedTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 190, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Aeroporto de chegada:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Aeroporto de saída:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jFormattedTextField2.setText("jFormattedTextField2");
        jFormattedTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, 30));

        jFormattedTextField3.setText("jFormattedTextField3");
        jFormattedTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 190, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Companhia operadora:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        jLabel7.getAccessibleContext().setAccessibleName("Companhia Operadora:");

        jFormattedTextField4.setText("jFormattedTextField4");
        jFormattedTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(jFormattedTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, 30));

        jTabbedPane1.addTab("Cadastrar  ", jPanel4);

        jPanel1.setBackground(new java.awt.Color(219, 219, 225));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane1.addTab("Lista", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 610, 370));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Consultar/  Excluir  ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flights.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 0, 1070, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentShown

    }//GEN-LAST:event_jPanel2ComponentShown

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VoosUI dialog = new VoosUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables


    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
}
