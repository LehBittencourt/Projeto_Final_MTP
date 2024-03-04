package view;

import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;
import controller.ControllerUsuario;
        
public class FrmCadUsuario extends javax.swing.JInternalFrame {
    
    int indice = 0;
    
    ControllerUsuario controleusu = new ControllerUsuario();
   
    
    List<Usuario> lista = controleusu.getUpdateUsuarios();
   
    int recStatus = 0;
    
    public FrmCadUsuario() {
        initComponents();
        txtID.setEnabled(false);
        
       
        
        
        if(lista.isEmpty())
        {
            txtID.setEnabled(false);
            txtNome.setEnabled(false);
            txtSenha.setEnabled(false);
            txtEmail.setEnabled(false);
            btnPrimeiro.setEnabled(false);
            btnUltimo.setEnabled(false);
            btnProximo.setEnabled(false);
            btnAnterior.setEnabled(false);
        }
        else
        {
            indice=0;
            mostrarDadosTela();
        }
    
        
    }
    
        public FrmCadUsuario(int s){
            
            initComponents();
            
            if(s == 1){
                grupoOpcao.clearSelection();
                rbComum.setSelected(true);
                rbComum.setEnabled(false);
                rbAdm.setEnabled(false);
                lista.clear();
                recStatus = s; // rec - recebe
                btnPrimeiro.setVisible(false);
                btnUltimo.setVisible(false);
                btnProximo.setVisible(false);
                btnAnterior.setVisible(false);
                btnAlterar.setVisible(false);
                btnExcluir.setVisible(false);
            }
        }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoOpcao = new javax.swing.ButtonGroup();
        lblNome = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        painelEscolha = new javax.swing.JPanel();
        lblOpcao = new javax.swing.JLabel();
        rbAdm = new javax.swing.JRadioButton();
        rbComum = new javax.swing.JRadioButton();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(231, 210, 243));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Usuário");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 0, 51));
        lblNome.setText("Nome");

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(51, 0, 51));
        lblSenha.setText("Senha");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 0, 51));
        lblEmail.setText("Email");

        painelEscolha.setBackground(new java.awt.Color(102, 0, 153));
        painelEscolha.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        lblOpcao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOpcao.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcao.setText("Escolha:");

        rbAdm.setBackground(new java.awt.Color(102, 0, 153));
        grupoOpcao.add(rbAdm);
        rbAdm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbAdm.setForeground(new java.awt.Color(255, 255, 255));
        rbAdm.setText("Adm");

        rbComum.setBackground(new java.awt.Color(102, 0, 153));
        grupoOpcao.add(rbComum);
        rbComum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbComum.setForeground(new java.awt.Color(255, 255, 255));
        rbComum.setText("Comum");
        rbComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbComumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEscolhaLayout = new javax.swing.GroupLayout(painelEscolha);
        painelEscolha.setLayout(painelEscolhaLayout);
        painelEscolhaLayout.setHorizontalGroup(
            painelEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEscolhaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblOpcao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAdm)
                .addGap(27, 27, 27)
                .addComponent(rbComum)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        painelEscolhaLayout.setVerticalGroup(
            painelEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEscolhaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOpcao)
                    .addComponent(rbAdm)
                    .addComponent(rbComum))
                .addGap(16, 16, 16))
        );

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblID.setForeground(new java.awt.Color(51, 0, 51));
        lblID.setText("id");

        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));

        txtNome.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));

        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));

        txtSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 204), null));

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
        btnNovo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 204)));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(51, 0, 51));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 204)));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 204)));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 204)));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cadastro.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(painelEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSenha)
                                .addComponent(txtNome)
                                .addComponent(txtID)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(painelEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtID.setText("");
        txtNome.setText("");
        txtSenha.setText("");
        txtEmail.setText("");
        grupoOpcao.clearSelection();

        txtID.setEnabled(true);
        txtNome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtEmail.setEnabled(true);
        btnPrimeiro.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnProximo.setEnabled(true);
        btnAnterior.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Usuario u = new Usuario();
        u.nome = txtNome.getText();
        u.senha = String.valueOf(txtSenha.getPassword());
        u.email = txtEmail.getText();
        
        if(rbAdm.isSelected())
            u.status = 1;
        
        if(rbComum.isSelected())
            u.status = 2;
        
        controleusu.inserirUsuario(u);
        
        if(recStatus == 1){
           FrmMoldeCadastroUsu molde = (FrmMoldeCadastroUsu) this.getDesktopPane().getTopLevelAncestor();
           molde.dispose();
        }
            
        
        lista = controleusu.getUpdateUsuarios();
        indice = lista.size()-1;
        mostrarDadosTela();
        
        btnPrimeiro.setEnabled(true);
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        Usuario u = new Usuario();
        
        u.id = Integer.parseInt(txtID.getText());
        u.nome = txtNome.getText();
        u.senha = String.valueOf(txtSenha.getPassword());
        u.email = txtEmail.getText();
        
        
        if(rbAdm.isSelected())
            u.status = 1;
        
        if(rbComum.isSelected())
            u.status = 2;
        
        controleusu.alterarUsuario(u);
        
        lista = controleusu.getUpdateUsuarios();
        indice = lista.size()-1;
        mostrarDadosTela();
        

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       
        controleusu.excluirUsuario(Integer.parseInt(txtID.getText()));
        
        lista = controleusu.getUpdateUsuarios();
        indice = lista.size()-1;
        mostrarDadosTela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        indice = 0;
        mostrarDadosTela(); 
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if(indice > 0){
            indice--;
            mostrarDadosTela();
        } else {
            JOptionPane.showMessageDialog(this, "Voce esta no primeiro registro", "Atencao", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
       if(indice < lista.size()-1){
            indice++;
            mostrarDadosTela();
        } else {
            JOptionPane.showMessageDialog(this, "Voce esta no ultimo registro", "Atencao", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        indice = lista.size()-1;
        mostrarDadosTela();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void rbComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbComumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbComumActionPerformed
                                     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.ButtonGroup grupoOpcao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOpcao;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel painelEscolha;
    private javax.swing.JRadioButton rbAdm;
    private javax.swing.JRadioButton rbComum;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
    
    public void mostrarDadosTela(){
        txtID.setText("" + lista.get(indice).id);
        txtNome.setText(lista.get(indice).nome);
        txtEmail.setText(lista.get(indice).email);
        txtSenha.setText(lista.get(indice).senha);
        
        if(lista.get(indice).status == 1){
            rbAdm.setSelected(true);
        } else {
            rbComum.setSelected(true);
        }
    }
    
}
