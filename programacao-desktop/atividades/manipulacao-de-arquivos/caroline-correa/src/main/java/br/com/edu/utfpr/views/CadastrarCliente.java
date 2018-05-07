/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.utfpr.views;

import br.com.edu.utfpr.convert.ClienteJson;
import br.com.edu.utfpr.convert.ClienteText;
import br.com.edu.utfpr.domain.Cliente;
import br.com.edu.utfpr.services.ClienteBinDAO;
import br.com.edu.utfpr.services.ClienteDAO;
import br.com.edu.utfpr.services.ClienteJsonDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Caroline
 */
public class CadastrarCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cxNomeCliente = new javax.swing.JTextField();
        cxCpfCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cxEndCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cxTelefoneCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cxEmailCliente = new javax.swing.JTextField();
        RecBin = new javax.swing.JButton();
        btnSalvarTxt = new javax.swing.JButton();
        btnSalvarJson = new javax.swing.JButton();
        btnSalvarBinario = new javax.swing.JButton();
        RecTxt = new javax.swing.JButton();
        RecJson = new javax.swing.JButton();
        cxId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastrar Cliente");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF :");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("E-mail:");

        RecBin.setText("Recuperar arquivo binário");
        RecBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecBinActionPerformed(evt);
            }
        });

        btnSalvarTxt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Caroline\\Desktop\\SistemaBancario\\resources\\notes.png")); // NOI18N
        btnSalvarTxt.setText("Salvar arquivo texto");
        btnSalvarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTxtActionPerformed(evt);
            }
        });

        btnSalvarJson.setText("Salvar arquivo JSON");
        btnSalvarJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarJsonActionPerformed(evt);
            }
        });

        btnSalvarBinario.setText("Salvar arquivo binário");
        btnSalvarBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarBinarioActionPerformed(evt);
            }
        });

        RecTxt.setText("Recuperar arquivo texto");
        RecTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecTxtActionPerformed(evt);
            }
        });

        RecJson.setText("Recuperar arquivo JSON");
        RecJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecJsonActionPerformed(evt);
            }
        });

        jLabel7.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RecTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalvarJson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RecJson))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalvarBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RecBin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(267, 267, 267))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(7, 7, 7))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cxCpfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                        .addComponent(cxEndCliente)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cxTelefoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                        .addComponent(cxEmailCliente)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cxCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cxEndCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cxTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cxEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvarJson, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalvarBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RecBin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RecTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RecJson, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTxtActionPerformed
        Cliente cliente = this.criaCliente();
        if (cliente != null) {
            ClienteDAO dao = new ClienteDAO(new ClienteText());
            String retorno = dao.salvar(cliente);

            if (retorno.equals("NEW")) {
                JOptionPane.showMessageDialog(this, "Cliente INSERIDO com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Cliente ALTERADO com sucesso!");
            }
        }
        this.limpaCampos();
    }//GEN-LAST:event_btnSalvarTxtActionPerformed

    private void limpaCampos() {
        cxId.setText("");
        cxNomeCliente.setText("");
        cxCpfCliente.setText("");
        cxEndCliente.setText("");
        cxTelefoneCliente.setText("");
        cxEmailCliente.setText("");
    }

    private Cliente criaCliente() {
        Cliente cliente = null;
        if (this.validaCampos()) {
            cliente = new Cliente(
                    Integer.parseInt(cxId.getText()),
                    cxNomeCliente.getText(),
                    cxCpfCliente.getText(),
                    cxEndCliente.getText(),
                    cxTelefoneCliente.getText(),
                    cxEmailCliente.getText()
            );
        }

        return cliente;
    }

    private boolean validaCampos() {
        if (cxId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo ID");
            return false;
        }

        if (cxNomeCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome");
            return false;
        }

        if (cxCpfCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo CPF");
            return false;
        }

        if (cxEndCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Endereço");
            return false;
        }

        if (cxTelefoneCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Telefone!");
            return false;
        }

        if (cxEmailCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo E-mail!");
            return false;
        }
        return true;
    }

    private void RecTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecTxtActionPerformed
        ClienteDAO dao = new ClienteDAO(new ClienteText());
        if (this.cxId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insira o ID do cliente que será recuperado!");
            return;
        }
        Cliente cliente = dao.buscar(Integer.parseInt(this.cxId.getText()));

        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Não foi encontrado nenhum cliente com o ID informado!");
            return;
        }
        this.preencherCampos(cliente);
    }//GEN-LAST:event_RecTxtActionPerformed

    private void preencherCampos(Cliente cliente) {
        cxId.setText(String.valueOf(cliente.getId()));
        cxNomeCliente.setText(cliente.getNome());
        cxCpfCliente.setText(cliente.getCpf());
        cxEndCliente.setText(cliente.getEndereco());
        cxTelefoneCliente.setText(cliente.getTelefone());
        cxEmailCliente.setText(cliente.getEmail());
    }
    private void btnSalvarJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarJsonActionPerformed
        Cliente cliente = this.criaCliente();
        if (cliente != null) {
            ClienteDAO dao = new ClienteJsonDAO(new ClienteJson());
            String retorno = dao.salvar(cliente);

            if (retorno.equals("NEW")) {
                JOptionPane.showMessageDialog(this, "Cliente INSERIDO com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Cliente ALTERADO com sucesso!");
            }
        }
        this.limpaCampos();
    }//GEN-LAST:event_btnSalvarJsonActionPerformed

    private void RecJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecJsonActionPerformed
        ClienteDAO dao = new ClienteJsonDAO(new ClienteJson());
        if (this.cxId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insira o ID do cliente que será recuperado!");
            return;
        }
        Cliente cliente = dao.buscar(Integer.parseInt(this.cxId.getText()));

        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Não foi encontrado nenhum cliente com o ID informado!");
            return;
        }

        this.preencherCampos(cliente);
    }//GEN-LAST:event_RecJsonActionPerformed

    private void btnSalvarBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarBinarioActionPerformed
        Cliente cliente = this.criaCliente();
        if (cliente != null) {
            ClienteBinDAO dao = new ClienteBinDAO();
            String retorno = dao.salvar(cliente);

            if (retorno.equals("NEW")) {
                JOptionPane.showMessageDialog(this, "Cliente INSERIDO com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Cliente ALTERADO com sucesso!");
            }
        }
        this.limpaCampos();
    }//GEN-LAST:event_btnSalvarBinarioActionPerformed

    private void RecBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecBinActionPerformed
        ClienteBinDAO dao = new ClienteBinDAO();
        if (this.cxId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insira o ID do cliente que será recuperado!");
            return;
        }
        Cliente cliente = dao.buscar(Integer.parseInt(this.cxId.getText()));

        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Não foi encontrado nenhum cliente com o ID informado!");
            return;
        }

        this.preencherCampos(cliente);
    }//GEN-LAST:event_RecBinActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecBin;
    private javax.swing.JButton RecJson;
    private javax.swing.JButton RecTxt;
    private javax.swing.JButton btnSalvarBinario;
    private javax.swing.JButton btnSalvarJson;
    private javax.swing.JButton btnSalvarTxt;
    private javax.swing.JTextField cxCpfCliente;
    private javax.swing.JTextField cxEmailCliente;
    private javax.swing.JTextField cxEndCliente;
    private javax.swing.JTextField cxId;
    private javax.swing.JTextField cxNomeCliente;
    private javax.swing.JTextField cxTelefoneCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}