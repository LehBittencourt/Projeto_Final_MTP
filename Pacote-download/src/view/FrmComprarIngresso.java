package view;

import controller.ControllerItem;
import controller.ControllerShow;
import java.util.List;
import model.Item;
import model.Venda;
import controller.ControllerVenda;
import javax.swing.JOptionPane;

public class FrmComprarIngresso extends javax.swing.JInternalFrame {

    int idusu = 0;
    
    ControllerShow controleShow = new ControllerShow();
    ControllerVenda controleVenda = new ControllerVenda();
    ControllerItem controleItem = new ControllerItem();
    List<String> showCombo = controleShow.carregaComboBox();
    
    public FrmComprarIngresso() {
        initComponents();
        
        while(!showCombo.isEmpty())
        {
            cbxShow.addItem(showCombo.get(0));
            showCombo.remove(0);
        }
        
    }

    
    public FrmComprarIngresso(int idusu) {
        initComponents();
        this.idusu = idusu;
        txtID.setEnabled(false);
        pCompra.setVisible(false);
        List<String> myCombo = controleShow.carregaComboBox();
        while(!myCombo.isEmpty()){
            cbxShow.addItem(myCombo.get(0));
            myCombo.remove(0);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDescricao = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        btnCompra = new javax.swing.JButton();
        pCompra = new javax.swing.JPanel();
        cbxShow = new javax.swing.JComboBox<>();
        txtQtdeIngressos = new javax.swing.JTextField();
        lblEscolhaShow = new javax.swing.JLabel();
        lblQtdeIngresso = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnFecharCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(222, 202, 222));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Compra");

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(51, 0, 51));
        lblDescricao.setText("Descrição:");

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(51, 0, 51));
        lblID.setText("ID:");

        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtDescricao.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));

        btnCompra.setBackground(new java.awt.Color(51, 0, 102));
        btnCompra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnCompra.setText("Iniciar Compra");
        btnCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });

        pCompra.setBackground(new java.awt.Color(184, 69, 222));
        pCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(51, 0, 51)));

        cbxShow.setForeground(new java.awt.Color(51, 0, 51));
        cbxShow.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecionar--" }));
        cbxShow.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), null));

        txtQtdeIngressos.setForeground(new java.awt.Color(51, 0, 51));
        txtQtdeIngressos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), null));

        lblEscolhaShow.setBackground(new java.awt.Color(184, 69, 222));
        lblEscolhaShow.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblEscolhaShow.setForeground(new java.awt.Color(255, 255, 255));
        lblEscolhaShow.setText("Escolha o show:");

        lblQtdeIngresso.setBackground(new java.awt.Color(184, 69, 222));
        lblQtdeIngresso.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblQtdeIngresso.setForeground(new java.awt.Color(255, 255, 255));
        lblQtdeIngresso.setText("Digite a quantidade de ingressos:");

        btnAdd.setBackground(new java.awt.Color(51, 0, 102));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Adicionar");
        btnAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(51, 0, 51)));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCompraLayout = new javax.swing.GroupLayout(pCompra);
        pCompra.setLayout(pCompraLayout);
        pCompraLayout.setHorizontalGroup(
            pCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCompraLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQtdeIngresso)
                    .addComponent(lblEscolhaShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxShow, 0, 154, Short.MAX_VALUE)
                    .addComponent(txtQtdeIngressos))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCompraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        pCompraLayout.setVerticalGroup(
            pCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbxShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscolhaShow))
                .addGap(38, 38, 38)
                .addGroup(pCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblQtdeIngresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQtdeIngressos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(18, 18, 18))
        );

        btnFecharCompra.setBackground(new java.awt.Color(51, 0, 102));
        btnFecharCompra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFecharCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnFecharCompra.setText("Fechar Compra");
        btnFecharCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        btnFecharCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCompraActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/carrinho.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(pCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnFecharCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnCompra)
                .addGap(18, 18, 18)
                .addComponent(pCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFecharCompra)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        Venda v = new Venda();
        v.descricao = txtDescricao.getText();
        v.id_usuario = idusu;
        pCompra.setVisible(true); 
        controleVenda.inserirVenda(v);
        v = controleVenda.getLastData();
        txtID.setText(""+ v.id);
        
    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnFecharCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCompraActionPerformed
        pCompra.setVisible(false);
        txtID.setText("");
        txtDescricao.setText("");
        txtDescricao.setFocusable(true); //Piscando
    }//GEN-LAST:event_btnFecharCompraActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Item it = new Item();
        it.id_venda = Integer.parseInt(txtID.getText());
        it.qtde = Integer.parseInt(txtQtdeIngressos.getText());
        it.id_show =  controleShow.getIdShowByName(cbxShow.getSelectedItem().toString()); 
        
        int qtd_banco = controleShow.getQtdeShowByName(cbxShow.getSelectedItem().toString());
        
        if(it.qtde <= qtd_banco){
            int total = qtd_banco - it.qtde;
            controleShow.alterarQtdeShow(total, it.id_show);
            controleItem.inserirItem(it);
            //limpar os campos do painel
        } else {
            JOptionPane.showMessageDialog(this, "Não existe quantidade suficiente de ingressos");
            
        }
        
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnFecharCompra;
    private javax.swing.JComboBox<String> cbxShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEscolhaShow;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblQtdeIngresso;
    private javax.swing.JPanel pCompra;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtQtdeIngressos;
    // End of variables declaration//GEN-END:variables
}
