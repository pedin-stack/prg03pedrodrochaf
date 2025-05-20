/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author Casa
 */
public class NewJFrame extends javax.swing.JFrame {
 private int etapacadastro =0;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        
         //ContaBanco conta = new ContaBanco(0.0,false);//na hora que a interface for gerada um objeto da classe conta é criado
    }
 
    ContaBanco conta = new ContaBanco(0.0,false);//na hora que a interface for gerada um objeto da classe conta é criado
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnadcionarConta = new javax.swing.JButton();
        btnfecharConta = new javax.swing.JButton();
        btnSaque = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnMensalidade = new javax.swing.JButton();
        btnareaCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taentradaeSaida = new javax.swing.JTextArea();
        lblnomedaInterface = new javax.swing.JLabel();
        lblQuestionario = new javax.swing.JLabel();
        btnAvançar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnadcionarConta.setText("Abrir Conta");
        btnadcionarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadcionarContaActionPerformed(evt);
            }
        });

        btnfecharConta.setText("Fechar conta");
        btnfecharConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfecharContaActionPerformed(evt);
            }
        });

        btnSaque.setText("Sacar");
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueActionPerformed(evt);
            }
        });

        btnDeposito.setText("Depositar");
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        btnMensalidade.setText("Mensalidade");
        btnMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensalidadeActionPerformed(evt);
            }
        });

        btnareaCliente.setText("Area do cliente");
        btnareaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnareaClienteActionPerformed(evt);
            }
        });

        taentradaeSaida.setColumns(20);
        taentradaeSaida.setRows(5);
        taentradaeSaida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taentradaeSaidaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(taentradaeSaida);

        lblnomedaInterface.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblnomedaInterface.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnomedaInterface.setText("ÁREA DO CLIENTE BANK+");

        lblQuestionario.setText("jLabel1");

        btnAvançar.setText("Avançar");
        btnAvançar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvançarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(lblnomedaInterface)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAvançar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnfecharConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSaque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnadcionarConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnareaCliente)
                            .addComponent(btnMensalidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuestionario))))
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnadcionarConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnfecharConta)
                            .addComponent(lblQuestionario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblnomedaInterface)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSaque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeposito))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMensalidade)
                    .addComponent(btnAvançar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnareaCliente)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 public void esperar2Segundos(){
        
            new javax.swing.Timer(2000, e -> {
            ((javax.swing.Timer)e.getSource()).stop();
        }).start(); //  funçao de timer para nao poluir o source do frame
        
        }  
 
 public void limpartextArea(){
 
     taentradaeSaida.setText("");
 
 }
 
 public void limparLabel(){
 
 lblQuestionario.setText("");
     
 }
    
    private void btnMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensalidadeActionPerformed
       
    }//GEN-LAST:event_btnMensalidadeActionPerformed

    private void btnadcionarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadcionarContaActionPerformed
       etapacadastro=0;
         //parametro para controle mensagens acerca do cadastro
                       
         if(conta.getStatus() == true){// se a conta ja criada encerrar a funçao
             lblQuestionario.setText("Conta já criada!");
             
             esperar2Segundos();
             
             limparLabel();
             
         return;
         
         } else {
             
             if(etapacadastro==0){
                 
        lblQuestionario.setText("Escreva seu nome\n");
             
        String dono = taentradaeSaida.getText();//pegar o que o usário digitou e armazenar
  
             } 
             
             else if(etapacadastro == 1){
             
        lblQuestionario.setText("Qual o tipo da conta? |Corrente = 'cc'|  |Poupança = 'cp'|\n ");
        
        String tipoConta = taentradaeSaida.getText();//pegar o que o usário digitou e armazenar
        
         
         etapacadastro++;//atualizar etapa
         
             }else if(etapacadastro == 2){
             
             conta.gerarNumconta();
            taentradaeSaida.setText(conta.getNumConta());
                 
             }
         }
        
    }//GEN-LAST:event_btnadcionarContaActionPerformed

    private void btnfecharContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfecharContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnfecharContaActionPerformed

    private void btnSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaqueActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnareaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnareaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnareaClienteActionPerformed

    private void taentradaeSaidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taentradaeSaidaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_taentradaeSaidaKeyPressed

    private void btnAvançarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvançarActionPerformed
       
        etapacadastro++;
       
        limpartextArea(); 
    }//GEN-LAST:event_btnAvançarActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvançar;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnMensalidade;
    private javax.swing.JButton btnSaque;
    private javax.swing.JButton btnadcionarConta;
    private javax.swing.JButton btnareaCliente;
    private javax.swing.JButton btnfecharConta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuestionario;
    private javax.swing.JLabel lblnomedaInterface;
    private javax.swing.JTextArea taentradaeSaida;
    // End of variables declaration//GEN-END:variables
}
