package view;

public class FrmPrincipal extends javax.swing.JFrame {
    
    int idusu = 0;
    
    public FrmPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public FrmPrincipal(int status, int id) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
         idusu = id;
        if(status == 2){
            mCad.setVisible(false); //Acrescentar botao no formulario principal
            //variavel.setVisible(false)
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mCad = new javax.swing.JMenu();
        mIUsuario = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        imShow = new javax.swing.JMenuItem();
        mComprar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mRelatorio = new javax.swing.JMenu();
        miVendas = new javax.swing.JMenuItem();
        mSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pDesktop.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/holofotes.png"))); // NOI18N

        pDesktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pDesktopLayout = new javax.swing.GroupLayout(pDesktop);
        pDesktop.setLayout(pDesktopLayout);
        pDesktopLayout.setHorizontalGroup(
            pDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDesktopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pDesktopLayout.setVerticalGroup(
            pDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(242, 242, 242));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), null));
        jMenuBar1.setForeground(new java.awt.Color(51, 0, 51));

        mCad.setBackground(new java.awt.Color(51, 0, 51));
        mCad.setForeground(new java.awt.Color(51, 0, 51));
        mCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/new.png"))); // NOI18N
        mCad.setText("Cadastro    ");

        mIUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mIUsuario.setText("Usuario");
        mIUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIUsuarioActionPerformed(evt);
            }
        });
        mCad.add(mIUsuario);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("Categoria");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mCad.add(jMenuItem2);

        imShow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        imShow.setText("Show");
        imShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imShowActionPerformed(evt);
            }
        });
        mCad.add(imShow);

        jMenuBar1.add(mCad);

        mComprar.setBackground(new java.awt.Color(51, 0, 51));
        mComprar.setForeground(new java.awt.Color(51, 0, 51));
        mComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/bilhetes (1).png"))); // NOI18N
        mComprar.setText("Comprar    ");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Ingresso");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mComprar.add(jMenuItem1);

        jMenuBar1.add(mComprar);

        mRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/tabela-de-edicao.png"))); // NOI18N
        mRelatorio.setText("Relatório     ");

        miVendas.setText("Vendas");
        miVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendasActionPerformed(evt);
            }
        });
        mRelatorio.add(miVendas);

        jMenuBar1.add(mRelatorio);

        mSair.setForeground(new java.awt.Color(51, 0, 51));
        mSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/desligar.png"))); // NOI18N
        mSair.setText("Sair    ");
        jMenuBar1.add(mSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mIUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIUsuarioActionPerformed
        FrmCadUsuario cadU = new FrmCadUsuario();
        pDesktop.add(cadU);
        cadU.setVisible(true);
    }//GEN-LAST:event_mIUsuarioActionPerformed

    private void imShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imShowActionPerformed
        FrmCadShow cadS = new FrmCadShow();
        pDesktop.add(cadS);
        cadS.setVisible(true);
    }//GEN-LAST:event_imShowActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmComprarIngresso ingresso = new FrmComprarIngresso(idusu);
        pDesktop.add(ingresso);
        ingresso.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
           FrmCadCategoria cadS = new FrmCadCategoria();
        pDesktop.add(cadS);
        cadS.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void miVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendasActionPerformed
       FrmFormularioRelatorio relV = new FrmFormularioRelatorio();
       pDesktop.add(relV);
       relV.setVisible(true);
    }//GEN-LAST:event_miVendasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem imShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu mCad;
    private javax.swing.JMenu mComprar;
    private javax.swing.JMenuItem mIUsuario;
    private javax.swing.JMenu mRelatorio;
    private javax.swing.JMenu mSair;
    private javax.swing.JMenuItem miVendas;
    private javax.swing.JDesktopPane pDesktop;
    // End of variables declaration//GEN-END:variables
}
