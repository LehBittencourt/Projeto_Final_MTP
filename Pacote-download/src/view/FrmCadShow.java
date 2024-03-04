
package view;

import controller.ControllerCategoria;
import controller.ControllerShow;
import java.util.List;
import javax.swing.JOptionPane;
import model.Show;

public class FrmCadShow extends javax.swing.JInternalFrame {
    int indice=0;
    
    
    ControllerShow controleShow = new ControllerShow(); 
    ControllerCategoria controleCategoria = new ControllerCategoria();
    List<Show> lista = controleShow.getUpdateShow();
    List<String> categoriaCombo = controleCategoria.carregaCombo();
    
    
    
    public FrmCadShow() {
        initComponents();
        
        txtID.setEnabled(false);
        
        System.out.println(categoriaCombo);
        System.out.println(indice);
        
        while(!categoriaCombo.isEmpty())
        {
            cbxCategoria.addItem(categoriaCombo.get(0));
            categoriaCombo.remove(0);
        }
        
        
        if(lista.isEmpty())
        {
            txtNome.setEnabled(false);
            txtValor.setEnabled(false);
            txtData.setEnabled(false);
            txtQtde_Ingresso.setEnabled(false);
            cbxCategoria.setEnabled(false);
            btnPrimeiro.setEnabled(false);
            btnUltimo.setEnabled(false);
            btnProximo.setEnabled(false);
            btnAnterior.setEnabled(false);
        }
        else
        {
            indice=0;
            mostrarTela();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblQtde_Ingresso = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtQtde_Ingresso = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        lblCategoria = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        btnPrimeiro = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(227, 210, 245));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Show");

        lblID.setForeground(new java.awt.Color(51, 0, 51));
        lblID.setText("Id:");

        lblNome.setForeground(new java.awt.Color(51, 0, 51));
        lblNome.setText("Nome:");

        lblQtde_Ingresso.setForeground(new java.awt.Color(51, 0, 51));
        lblQtde_Ingresso.setText("Quatidade de Ingressos:");

        lblValor.setForeground(new java.awt.Color(51, 0, 51));
        lblValor.setText("Valor:");

        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtNome.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));

        txtQtde_Ingresso.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));

        txtValor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        lblData.setForeground(new java.awt.Color(51, 0, 51));
        lblData.setText("Data:");

        cbxCategoria.setForeground(new java.awt.Color(51, 0, 51));
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecionar--" }));
        cbxCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));

        lblCategoria.setForeground(new java.awt.Color(51, 0, 51));
        lblCategoria.setText("Categoria:");

        txtData.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));
        txtData.setForeground(new java.awt.Color(51, 0, 51));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setSelectionColor(new java.awt.Color(204, 204, 204));

        btnPrimeiro.setBackground(new java.awt.Color(51, 0, 102));
        btnPrimeiro.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPrimeiro.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/anterior.png"))); // NOI18N
        btnPrimeiro.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnNovo.setBackground(new java.awt.Color(102, 0, 153));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Novo");
        btnNovo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(51, 0, 102));
        btnAnterior.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/seta-esquerda (1).png"))); // NOI18N
        btnAnterior.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setBackground(new java.awt.Color(51, 0, 102));
        btnProximo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnProximo.setForeground(new java.awt.Color(255, 255, 255));
        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/seta-direita (2).png"))); // NOI18N
        btnProximo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setBackground(new java.awt.Color(51, 0, 102));
        btnUltimo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnUltimo.setForeground(new java.awt.Color(255, 255, 255));
        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/avancar.png"))); // NOI18N
        btnUltimo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(102, 0, 153));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(102, 0, 153));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(102, 0, 153));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addGap(119, 119, 119))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblQtde_Ingresso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQtde_Ingresso))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblCategoria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtde_Ingresso)
                    .addComponent(txtQtde_Ingresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
      limparDados();
      
      txtNome.setEnabled(true);
      txtValor.setEnabled(true);
      txtData.setEnabled(true);
      txtQtde_Ingresso.setEnabled(true);
      cbxCategoria.setEnabled(true);
      btnPrimeiro.setEnabled(true);
      btnUltimo.setEnabled(true);
      btnProximo.setEnabled(true);
      btnAnterior.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      Show s = new Show();
      
      s.nome = txtNome.getText();
      s.valor = Double.parseDouble(txtValor.getText());
      s.qtd_ingresso = Integer.parseInt(txtQtde_Ingresso.getText());
      s.data = txtData.getText();
      s.id_categoria = controleCategoria.getCategoriaIdByNome(cbxCategoria.getSelectedItem().toString());
          
      controleShow.inserirShow(s);
       
      lista = controleShow.getUpdateShow();
      indice= lista.size()-1;
      mostrarTela();
        
      btnPrimeiro.setEnabled(true);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
      Show s = new Show();
        
      s.id = Integer.parseInt(txtID.getText());
      s.nome = txtNome.getText();
      s.valor = Double.parseDouble(txtValor.getText());
      s.qtd_ingresso = Integer.parseInt(txtQtde_Ingresso.getText());
      s.data = txtData.getText();
      s.id_categoria = controleCategoria.getCategoriaIdByNome(cbxCategoria.getSelectedItem().toString());
        
      controleShow.alterarShow(s);
       
      lista = controleShow.getUpdateShow();
      indice= lista.size()-1;
      mostrarTela();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        controleShow.excluirShow(Integer.parseInt(txtID.getText()));
        lista = controleShow.getUpdateShow();
        if (lista.size() == 0){
            limparDados();
        }
        
        indice= lista.size()-1;
        mostrarTela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        indice =0;
        mostrarTela();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if(indice>0)
        {
          indice--;
          mostrarTela();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Você já está no primeiro item","Atenção",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        if(indice<lista.size()-1){
          indice++;
          mostrarTela();
        }else
        {
            JOptionPane.showMessageDialog(this, "Você já está no último item","Atenção",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
       indice = lista.size()-1;
       mostrarTela();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQtde_Ingresso;
    private javax.swing.JLabel lblValor;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtde_Ingresso;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    public void mostrarTela(){
        txtID.setText("" + lista.get(indice).id);
        txtNome.setText(lista.get(indice).nome);
        txtValor.setText("" + lista.get(indice).valor);
        txtData.setText(lista.get(indice).data);
        txtQtde_Ingresso.setText("" + lista.get(indice).qtd_ingresso);
        cbxCategoria.setSelectedItem(controleCategoria.getNomeCategoriaById(lista.get(indice).id_categoria));
}

    public void limparDados(){
        txtNome.setText("");
      txtValor.setText("");
      txtData.setText("");
      txtQtde_Ingresso.setText("");
      cbxCategoria.setSelectedItem("--Selecionar--");
    }
}
