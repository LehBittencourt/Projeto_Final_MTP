package view;

import controller.ControllerCategoria;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Categoria;

public class FrmCadCategoria extends javax.swing.JInternalFrame {

    List<Categoria> lista = new ArrayList<Categoria>();
    int indice = 0;
    ControllerCategoria controle = new ControllerCategoria();
    
    public FrmCadCategoria() {
        initComponents();
        txtID.setEnabled(false);
        lista = controle.getUpdateCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(217, 194, 218));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblID.setForeground(new java.awt.Color(51, 0, 51));
        lblID.setText("ID:");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 0, 51));
        lblNome.setText("Categoria:");

        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));

        txtNome.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));

        btnPrimeiro.setBackground(new java.awt.Color(51, 0, 102));
        btnPrimeiro.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPrimeiro.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/anterior.png"))); // NOI18N
        btnPrimeiro.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(51, 0, 102));
        btnAnterior.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/seta-esquerda (1).png"))); // NOI18N
        btnAnterior.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setBackground(new java.awt.Color(51, 0, 102));
        btnProximo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnProximo.setForeground(new java.awt.Color(255, 255, 255));
        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/seta-direita (2).png"))); // NOI18N
        btnProximo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setBackground(new java.awt.Color(51, 0, 102));
        btnUltimo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnUltimo.setForeground(new java.awt.Color(255, 255, 255));
        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/avancar.png"))); // NOI18N
        btnUltimo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(51, 0, 51));
        btnNovo.setText("Novo");
        btnNovo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(51, 0, 51));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(51, 0, 51));
        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(51, 0, 51));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/adicionar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        indice = lista.size()-1;
        mostrarTela();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        indice = 0;
        mostrarTela();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if(indice > 0){
            indice--;
            mostrarTela();
        } else {
            JOptionPane.showMessageDialog(this, "Voce ja esta no primeiro registro");
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        if(indice < lista.size()-1){
            indice++;
            mostrarTela();
        } else {
            JOptionPane.showMessageDialog(this, "Voce ja esta no ultimo registro");
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtID.setText("");
        txtNome.setText("");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Categoria c = new Categoria();
        
        c.id = Integer.parseInt(txtID.getText());
        c.nome = txtNome.getText();
        
        controle.alterarCategoria(c);
       
        lista = controle.getUpdateCategorias();
        indice= lista.size()-1;
        mostrarTela();
        
        btnPrimeiro.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Categoria c = new Categoria();
        
        c.nome = txtNome.getText();
        
        controle.inserirCategoria(c);
       
        lista = controle.getUpdateCategorias();
        indice= lista.size()-1;
        mostrarTela();
        
        btnPrimeiro.setEnabled(true);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        controle.excluirCategoria(Integer.parseInt(txtID.getText()));
        lista = controle.getUpdateCategorias();
        indice= lista.size()-1;
        mostrarTela();
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    public void mostrarTela(){
        txtID.setText("" + lista.get(indice).id);
        txtNome.setText(lista.get(indice).nome);
    }

}
