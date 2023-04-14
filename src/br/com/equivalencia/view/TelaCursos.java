
package br.com.equivalencia.view;

import java.sql.*;
import br.com.equivalencia.dao.ModuloConexao;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class TelaCursos extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void adicionar(){
        String sql = "insert into tb_area_tecnologica(nome_area) values(?)";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNome.getText());
            
            if (txtNome.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo de preenchimento obrigatorio não foi preenchido");
            } else {
                int adicionado = pst.executeUpdate();
                System.out.println(adicionado);
                if (adicionado > 0){
                    JOptionPane.showMessageDialog(null,"Área Tecnológica cadastrada com sucesso !");
                    txtNome.setText(null);
                    
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
    //Criando método de consulta Areas Tecnologicas no banco de dados.
         private void consultar() {
        String sql = "select id_area as Id, nome_area as Área from tb_area_tecnologica where nome_area like ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtConsultaArea.getText() + "%");
            rs = pst.executeQuery();
            tblAreaConsulta.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void setar_campos(){
        int setar = tblAreaConsulta.getSelectedRow();
        txtID.setText(tblAreaConsulta.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tblAreaConsulta.getModel().getValueAt(setar, 1).toString());
        btnAddArea.setEnabled(false);
        btnEditArea.setEnabled(true);
        btnExcluirArea.setEnabled(true);
       
    }
    
    public void alterar(){
        String sql = "update tb_area_tecnologica set nome_area = ? where id_area = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtID.getText());
            
            //Validação obrigatoria
            if ((txtID.getText().isEmpty()) || (txtNome.getText().isEmpty())){
               JOptionPane.showMessageDialog(null,"Campos de preenchimentos obrigatorios não preenchidos !");
                
            } else {
                int adicionado = pst.executeUpdate();
                
                if (adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Área Tecnologica alterada com sucesso !");
                    btnAddArea.setEnabled(true);
                    btnEditArea.setEnabled(false);
                    txtID.setText(null);
                    txtNome.setText(null);
                }
            }
                
        } catch (Exception e) {
        }
        
    }
    
    public void excluir(){
        
        
        
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir este registro ?","Atenção",JOptionPane.YES_NO_OPTION);
        
        if (confirma == JOptionPane.YES_NO_OPTION) {
            String sql = "delete from tb_area_tecnologica where id_area=?"; 
            
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtID.getText());
                int apagado = pst.executeUpdate();
                
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Área Tecnologica escluida com sucesso !");
                    txtID.setText(null);
                    txtNome.setText(null);
                    btnAddArea.setEnabled(true);
                    btnEditArea.setEnabled(false);
                    btnExcluirArea.setEnabled(false);
                }
                
            } catch (java.sql.SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel remover esta área.\nÉ necessario excluir o curso vinculado antes de remover esta área tecnológica !");
                System.out.println(e);
            }catch (Exception e1){
                JOptionPane.showMessageDialog(null, e1);
            }
            
        }
        
    }

    
    public TelaCursos() {
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        conexao = ModuloConexao.conector();
        tblAreaConsulta.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnAddArea = new javax.swing.JButton();
        btnEditArea = new javax.swing.JButton();
        btnSearchArea = new javax.swing.JButton();
        btnExcluirArea = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAreaConsulta = new javax.swing.JTable();
        txtConsultaArea = new javax.swing.JTextField();
        lblConsultaArea = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equivalencia - Área Tecnológica");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblID.setForeground(new java.awt.Color(255, 255, 153));
        lblID.setText("ID :");

        lblNome.setForeground(new java.awt.Color(255, 255, 153));
        lblNome.setText("Nome :");

        txtID.setBackground(new java.awt.Color(204, 204, 204));
        txtID.setEnabled(false);

        txtNome.setBackground(new java.awt.Color(204, 204, 204));

        btnAddArea.setBackground(new java.awt.Color(255, 204, 102));
        btnAddArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/add.png"))); // NOI18N
        btnAddArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAreaActionPerformed(evt);
            }
        });

        btnEditArea.setBackground(new java.awt.Color(255, 204, 102));
        btnEditArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/edit.png"))); // NOI18N
        btnEditArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAreaActionPerformed(evt);
            }
        });

        btnSearchArea.setBackground(new java.awt.Color(255, 204, 102));
        btnSearchArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/search.png"))); // NOI18N

        btnExcluirArea.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluirArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/delete.png"))); // NOI18N
        btnExcluirArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAreaActionPerformed(evt);
            }
        });

        tblAreaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID_Área", "Nome_Área"
            }
        ));
        tblAreaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAreaConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAreaConsulta);

        txtConsultaArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultaAreaMouseClicked(evt);
            }
        });
        txtConsultaArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultaAreaKeyReleased(evt);
            }
        });

        lblConsultaArea.setText("Pesquisar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddArea, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchArea, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnExcluirArea, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditArea, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblConsultaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtConsultaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConsultaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConsultaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void btnAddAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAreaActionPerformed
        adicionar();
        consultar();
    }//GEN-LAST:event_btnAddAreaActionPerformed

    private void txtConsultaAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaAreaKeyReleased
        consultar();
    }//GEN-LAST:event_txtConsultaAreaKeyReleased

    private void tblAreaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAreaConsultaMouseClicked
        setar_campos();
         
    }//GEN-LAST:event_tblAreaConsultaMouseClicked

    private void txtConsultaAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultaAreaMouseClicked
        tblAreaConsulta.setVisible(true);
        consultar();
    }//GEN-LAST:event_txtConsultaAreaMouseClicked

    private void btnEditAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAreaActionPerformed
        alterar();
        consultar();
    }//GEN-LAST:event_btnEditAreaActionPerformed

    private void btnExcluirAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAreaActionPerformed
        excluir();
        consultar();
    }//GEN-LAST:event_btnExcluirAreaActionPerformed

  
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
            java.util.logging.Logger.getLogger(TelaCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddArea;
    private javax.swing.JButton btnEditArea;
    private javax.swing.JButton btnExcluirArea;
    private javax.swing.JButton btnSearchArea;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultaArea;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblAreaConsulta;
    private javax.swing.JTextField txtConsultaArea;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
