
package br.com.equivalencia.view;

import java.awt.Color;


public class TelaPrincipal extends javax.swing.JFrame {

   
    public TelaPrincipal() {
        initComponents();
         getContentPane().setBackground(Color.DARK_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        canvas1 = new java.awt.Canvas();
        btnArea = new javax.swing.JButton();
        btnCurso = new javax.swing.JButton();
        btnGrupo = new javax.swing.JButton();
        btnUnidade = new javax.swing.JButton();
        btnPpc = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        lblArea = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();
        lblPpc = new javax.swing.JLabel();
        lblUnidade = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblEquivalencia = new javax.swing.JLabel();
        canvas2 = new java.awt.Canvas();
        canvas3 = new java.awt.Canvas();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadArea = new javax.swing.JMenu();
        menCadCurso = new javax.swing.JMenu();
        menCadPpc = new javax.swing.JMenu();
        menCadGrupo = new javax.swing.JMenu();
        menCadUnidade = new javax.swing.JMenu();
        menCadUsuario = new javax.swing.JMenu();
        menEquivalencia = new javax.swing.JMenu();
        menOpcoes = new javax.swing.JMenu();
        menLogout = new javax.swing.JMenuItem();
        menSair = new javax.swing.JMenuItem();
        menAjuda = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equivalência - Tela Principal");

        btnArea.setBackground(new java.awt.Color(255, 204, 102));
        btnArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/IcoArea.png"))); // NOI18N

        btnCurso.setBackground(new java.awt.Color(255, 204, 102));
        btnCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/IconCurso.png"))); // NOI18N

        btnGrupo.setBackground(new java.awt.Color(255, 204, 102));
        btnGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/IconPpc.png"))); // NOI18N

        btnUnidade.setBackground(new java.awt.Color(255, 204, 102));
        btnUnidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/IconUnid.png"))); // NOI18N

        btnPpc.setBackground(new java.awt.Color(255, 204, 102));
        btnPpc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/IconEquival.png"))); // NOI18N

        btnUsuario.setBackground(new java.awt.Color(255, 204, 102));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagens/IconUser.png"))); // NOI18N

        lblArea.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 153));
        lblArea.setText("Á.Tecnológica");

        lblCurso.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        lblCurso.setForeground(new java.awt.Color(255, 255, 153));
        lblCurso.setText("Cursos");

        lblPpc.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        lblPpc.setForeground(new java.awt.Color(255, 255, 153));
        lblPpc.setText("PPC");

        lblUnidade.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        lblUnidade.setForeground(new java.awt.Color(255, 255, 153));
        lblUnidade.setText("UND.Curriculares");

        lblUsuario.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 153));
        lblUsuario.setText("Usuários");

        lblEquivalencia.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        lblEquivalencia.setForeground(new java.awt.Color(255, 255, 153));
        lblEquivalencia.setText("Equivalência");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menCad.setText("Cadastro");

        menCadArea.setText("Área Tecnológica");
        menCadArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadAreaActionPerformed(evt);
            }
        });
        menCad.add(menCadArea);

        menCadCurso.setText("Cursos");
        menCad.add(menCadCurso);

        menCadPpc.setText("PPC");
        menCad.add(menCadPpc);

        menCadGrupo.setText("Grupo de Equivalência");
        menCad.add(menCadGrupo);

        menCadUnidade.setText("Unidades Curriculares");
        menCad.add(menCadUnidade);

        menCadUsuario.setText("Usuários");
        menCad.add(menCadUsuario);

        jMenuBar1.add(menCad);

        menEquivalencia.setText("Equivalência");
        jMenuBar1.add(menEquivalencia);

        menOpcoes.setText("Opções");

        menLogout.setText("Logout");
        menLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menLogoutActionPerformed(evt);
            }
        });
        menOpcoes.add(menLogout);

        menSair.setText("Sair");
        menSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSairActionPerformed(evt);
            }
        });
        menOpcoes.add(menSair);

        jMenuBar1.add(menOpcoes);

        menAjuda.setText("Ajuda");
        jMenuBar1.add(menAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblUnidade)
                        .addGap(88, 88, 88)
                        .addComponent(lblUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblArea)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(lblPpc)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPpc, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(lblEquivalencia))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(lblCurso)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(canvas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(356, 356, 356))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(lblCurso))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPpc)
                            .addComponent(lblEquivalencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPpc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblUnidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jInternalFrame1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menLogoutActionPerformed
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menLogoutActionPerformed

    private void menSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_menSairActionPerformed

    private void menCadAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadAreaActionPerformed
        TelaArea area = new TelaArea();
        area.setVisible(true);
    }//GEN-LAST:event_menCadAreaActionPerformed


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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnCurso;
    private javax.swing.JButton btnGrupo;
    private javax.swing.JButton btnPpc;
    private javax.swing.JButton btnUnidade;
    private javax.swing.JButton btnUsuario;
    private java.awt.Canvas canvas1;
    private java.awt.Canvas canvas2;
    private java.awt.Canvas canvas3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblEquivalencia;
    private javax.swing.JLabel lblPpc;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menAjuda;
    public static javax.swing.JMenu menCad;
    private javax.swing.JMenu menCadArea;
    private javax.swing.JMenu menCadCurso;
    private javax.swing.JMenu menCadGrupo;
    private javax.swing.JMenu menCadPpc;
    private javax.swing.JMenu menCadUnidade;
    private javax.swing.JMenu menCadUsuario;
    private javax.swing.JMenu menEquivalencia;
    private javax.swing.JMenuItem menLogout;
    private javax.swing.JMenu menOpcoes;
    private javax.swing.JMenuItem menSair;
    // End of variables declaration//GEN-END:variables
}
