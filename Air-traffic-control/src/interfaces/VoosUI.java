package interfaces;

import classes.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class VoosUI extends javax.swing.JDialog 
{
    
    boolean isClickeable = false;
    HomeUI parent;
    
    public VoosUI(HomeUI parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/arrow_branch.png")).getImage());
        jTable2.getTableHeader().setResizingAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        
        int tamanho = parent.getListaAeroportos().toArrayList().size();
        String dados[] = new String[tamanho];
        
        for(int i = 0; i < tamanho; i++)
        {
            dados[i] = parent.getListaAeroportos().toArrayList().get(i).getCodigoIATA();
        }
          
        jComboBox3.setModel(new DefaultComboBoxModel(dados));
        jComboBox4.setModel(new DefaultComboBoxModel(dados));
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
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField8 = new javax.swing.JFormattedTextField();
        jFormattedTextField11 = new javax.swing.JFormattedTextField();
        jFormattedTextField12 = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField9 = new javax.swing.JFormattedTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jFormattedTextField10 = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Voos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 225));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(219, 219, 225));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código Aeroporto:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Aeroporto de destino:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Aeroporto de origem:");
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 80, 610, 20));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Companhia aérea:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jFormattedTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jFormattedTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, 40));

        jFormattedTextField8.setEditable(false);
        jFormattedTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jFormattedTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 220, 30));

        jFormattedTextField11.setEditable(false);
        jFormattedTextField11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jFormattedTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 220, 30));

        jFormattedTextField12.setEditable(false);
        jFormattedTextField12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jFormattedTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 220, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        jButton2.setEnabled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 40));

        jFormattedTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jFormattedTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Número do voo:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jTabbedPane1.addTab("Consultar / Excluir  ", new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier.png")), jPanel2); // NOI18N

        jPanel4.setBackground(new java.awt.Color(219, 219, 225));
        jPanel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 11)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Número do voo:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jFormattedTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(jFormattedTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, 40));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 80, 610, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Aeroporto de origem:");
        jLabel11.setToolTipText("");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jPanel4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 220, 30));

        jPanel4.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 220, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Aeroporto de destino:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Companhia aérea:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jFormattedTextField10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(jFormattedTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 220, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 40));

        jTabbedPane1.addTab("Cadastrar  ", new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png")), jPanel4); // NOI18N

        jPanel1.setBackground(new java.awt.Color(219, 219, 225));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setPreferredSize(new java.awt.Dimension(452, 300));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable2.setToolTipText("");
        jTable2.setAutoscrolls(false);
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 460, -1));

        jPanel5.setBackground(new java.awt.Color(171, 193, 217));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setMinimumSize(new java.awt.Dimension(12, 11));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel27.setText("Companhia aérea com mais voos:");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -2, -1, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel28.setText("Total de voos:");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -2, -1, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 490, 20));

        jTabbedPane1.addTab("Lista  ", new javax.swing.ImageIcon(getClass().getResource("/imagens/application_view_list.png")), jPanel1); // NOI18N

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 490, 370));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Consultar/  Excluir  ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flights.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 0, 1030, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
         try
        {
            
            jLabel28.setText("Total de voos: " + 90);
            jLabel27.setText("Companhia aérea com mais voos: " + "TAM");
            
            DefaultTableModel model = new DefaultTableModel()
            {
                @Override
                public boolean isCellEditable(int row, int column) 
                {
                    return false;
                }   
            };

            model.addColumn("Nº voo");
            model.addColumn("Aeroporto de origem");
            model.addColumn("Aeroporto de destino");
            model.addColumn("Companhia aérea");
            
            model.addRow(new Object[]{"ee",
                                      "ee",
                                      "ee",
                                      "ee",
                                      "ee"});
            
            jTable2.setModel(model);
            formatarColunasDaTabela(); 
        }
        catch (Exception erro)
        {}       
    }//GEN-LAST:event_jPanel1ComponentShown

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if (!isClickeable)
            return;
        
        try
        {
            Voo vooCad = new Voo(Integer.parseInt(jFormattedTextField9.getText()), jComboBox3.getSelectedItem().toString(), jComboBox4.getSelectedItem().toString(), jFormattedTextField10.getText());
            
            for(int i = 0; i < parent.getListaAeroportos().getQtd(); i++)
            {   
                    if(parent.getListaAeroportos().getPos(i).getCodigoIATA().toUpperCase().equals(jComboBox3.getSelectedItem().toString().toUpperCase()))
                    {
                        parent.getListaAeroportos().getPos(i).addVoo(vooCad);
                        JOptionPane.showMessageDialog(null, "Todos os dados devem ser preenchidos", " Cadastro de Voo Concluído", JOptionPane.INFORMATION_MESSAGE);
                    }
            }
        } 
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Todos os dados devem ser preenchidos", " Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try
        {
            Voo vooCad = new Voo(Integer.parseInt(jFormattedTextField9.getText()), jComboBox3.getSelectedItem().toString(), jComboBox4.getSelectedItem().toString(), jFormattedTextField10.getText());
            
            for(int i = 0; i < parent.getListaAeroportos().getQtd(); i++)
            {   
                    if(parent.getListaAeroportos().getPos(i).getCodigoIATA().toUpperCase().equals(jComboBox3.getSelectedItem().toString().toUpperCase()))
                    {
                        parent.getListaAeroportos().getPos(i).addVoo(vooCad);
                        JOptionPane.showMessageDialog(null, "Todos os dados devem ser preenchidos", " Cadastro de Voo Concluído", JOptionPane.INFORMATION_MESSAGE);
                    }
            }
        } 
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Todos os dados devem ser preenchidos", " Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
          
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try
        {   
            boolean existe = false;
            boolean existeVoo = false;
            for(int i = 0; i < parent.getListaAeroportos().getQtd(); i++)
            {   
                
                    if(parent.getListaAeroportos().getPos(i).getCodigoIATA().toUpperCase().equals(jFormattedTextField5.getText().toUpperCase()))
                    {
                        existe = true;
                        for(int a = 0; a < parent.getListaAeroportos().getPos(i).getVoos().getQtd(); a++)
                        {
                            existeVoo = false;
                            if(parent.getListaAeroportos().getPos(i).getVoos().getPos(a).getNumeroVoo() == Integer.parseInt(jFormattedTextField6.getText()))
                            {
                                Voo v = parent.getListaAeroportos().getPos(i).getVoos().getPos(a);
                                jFormattedTextField8.setText(v.getAeroOrigem());
                                jFormattedTextField11.setText(v.getAeroDestino());
                                jFormattedTextField12.setText(v.getCompanhiaOperadora());
                                existeVoo = true;
                            }
                                
                        }
                        
       
                    }
            }
            if(!existe)
            {
                JOptionPane.showMessageDialog(null, "Aeroporto não encontrado", " Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(!existeVoo)
            {
                JOptionPane.showMessageDialog(null, "Voo não encontrado", " Erro", JOptionPane.ERROR_MESSAGE);
                return;         
            }
        } 
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Algo deu errado", " Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VoosUI dialog = new VoosUI(new HomeUI(), true);
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
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JFormattedTextField jFormattedTextField10;
    private javax.swing.JFormattedTextField jFormattedTextField11;
    private javax.swing.JFormattedTextField jFormattedTextField12;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void formatarColunasDaTabela() 
    {
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(100);
        
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();

        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);

        jTable2.getColumnModel().getColumn(0).setCellRenderer(direita);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        jTable2.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        jTable2.getColumnModel().getColumn(3).setCellRenderer(esquerda);
        jTable2.getColumnModel().getColumn(4).setCellRenderer(centralizado);
    }
}
