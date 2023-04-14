
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
        String sql = "insert into tb_cursos(nome_curso, id_area) values(?,?)";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNomeCurso.getText());
            pst.setString(2, txtIDArea.getText());
            
            if (txtNomeCurso.getText().isEmpty() || (txtIDArea.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Campo de preenchimento obrigatorio não foi preenchido");
                
            } else {
                int adicionado = pst.executeUpdate();
                
                if (adicionado > 0){
                    JOptionPane.showMessageDialog(null,"Curso cadastrado com sucesso !");
                    txtNomeCurso.setText(null);
                    txtIDArea.setText(null);
                    btnEditArea.setEnabled(false);
                    btnExcluirArea.setEnabled(false);
                    
                    
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
    //Criando método de consulta Areas Tecnologicas no banco de dados.
         private void consultar() {
        String sql = "select id_curso as Id, nome_curso as Curso, id_area as 'ID Área Tec.' from tb_cursos where nome_curso like ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtConsultaArea.getText() + "%");
            rs = pst.executeQuery();
            tblCursoConsulta.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void setar_campos(){
        int setar = tblCursoConsulta.getSelectedRow();
        txtIDCurso.setText(tblCursoConsulta.getModel().getValueAt(setar, 0).toString());
        txtNomeCurso.setText(tblCursoConsulta.getModel().getValueAt(setar, 1).toString());
        txtIDCurso.setText(tblCursoConsulta.getModel().getValueAt(setar, 2).toString());
        //txtArea.setText(tblAreaConsulta.getModel().getValueAt(setar, 1).toString());
       // btnAddArea.setEnabled(true);
       // btnEditArea.setEnabled(false);
       // btnExcluirArea.setEnabled(false);
           
    }
    
    public void alterar(){
        String sql = "update tb_area_tecnologica set nome_area = ? where id_area = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNomeCurso.getText());
            pst.setString(2, txtIDCurso.getText());
            
            //Validação obrigatoria
            if ((txtIDCurso.getText().isEmpty()) || (txtNomeCurso.getText().isEmpty())){
               JOptionPane.showMessageDialog(null,"Campos de preenchimentos obrigatorios não preenchidos !");
                
            } else {
                int adicionado = pst.executeUpdate();
                
                if (adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Área Tecnologica alterada com sucesso !");
                    btnAddArea.setEnabled(true);
                    btnEditArea.setEnabled(false);
                    txtIDCurso.setText(null);
                    txtNomeCurso.setText(null);
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
                pst.setString(1, txtIDCurso.getText());
                int apagado = pst.executeUpdate();
                
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Área Tecnologica escluida com sucesso !");
                    txtIDCurso.setText(null);
                    txtNomeCurso.setText(null);
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
        tblCursoConsulta.setVisible(false);
        btnEditArea.setEnabled(false);
        btnExcluirArea.setEnabled(false);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtIDCurso = new javax.swing.JTextField();
        txtNomeCurso = new javax.swing.JTextField();
        btnAddArea = new javax.swing.JButton();
        btnEditArea = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnExcluirArea = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCursoConsulta = new javax.swing.JTable();
        txtConsultaArea = new javax.swing.JTextField();
        lblConsultaArea = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDArea = new javax.swing.JTextField();
        lblIDArea = new javax.swing.JLabel();
        cboArea = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equivalencia - Área Tecnológica");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblID.setForeground(new java.awt.Color(255, 255, 153));
        lblID.setText("ID Curso");

        lblNome.setForeground(new java.awt.Color(255, 255, 153));
        lblNome.setText("Curso");

        txtIDCurso.setBackground(new java.awt.Color(204, 204, 204));
        txtIDCurso.setEnabled(false);

        txtNomeCurso.setBackground(new java.awt.Color(204, 204, 204));

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

        btnSair.setBackground(new java.awt.Color(255, 204, 102));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/search.png"))); // NOI18N

        btnExcluirArea.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluirArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/delete.png"))); // NOI18N
        btnExcluirArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAreaActionPerformed(evt);
            }
        });

        tblCursoConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Área", "Nome Área", "ID Área Tecnologica"
            }
        ));
        tblCursoConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCursoConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCursoConsulta);

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

        jLabel2.setText("Area");

        txtIDArea.setEnabled(false);

        lblIDArea.setText("ID Area");

        cboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIDCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIDArea, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(cboArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIDArea)
                                .addGap(44, 44, 44)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAddArea, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditArea, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirArea, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
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
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtConsultaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblConsultaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIDArea, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIDCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluirArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132))))
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

    private void tblCursoConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCursoConsultaMouseClicked
        setar_campos();
         
    }//GEN-LAST:event_tblCursoConsultaMouseClicked

    private void txtConsultaAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultaAreaMouseClicked
        tblCursoConsulta.setVisible(true);
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
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cboArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultaArea;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDArea;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblCursoConsulta;
    private javax.swing.JTextField txtConsultaArea;
    private javax.swing.JTextField txtIDArea;
    private javax.swing.JTextField txtIDCurso;
    private javax.swing.JTextField txtNomeCurso;
    // End of variables declaration//GEN-END:variables
}
