/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package visao;

import modelo.Pokemon;
import persistencia.Conexão;
import persistencia.JDBCPokemon;

/**
 *
 * @author Marquinhos e Dandan
 */
public class Inserir extends javax.swing.JInternalFrame {

    /**
     * Creates new form Inserir
     */
    public Inserir() {
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
        camponome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tipo1Box = new javax.swing.JComboBox<>();
        tipo2Box = new javax.swing.JComboBox<>();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tipo 1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tipo 2");

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tipo1Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Normal", "Fogo", "Água", "Grama", "Elétrico", "Pedra", "Gelo", "Lutador", "Veneno", "Terrestre", "Voador", "Psíquico", "Inseto", "Fantasma", "Noturno", "Dragão", "Metálico", "Fada" }));
        tipo1Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo1BoxActionPerformed(evt);
            }
        });

        tipo2Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Normal", "Fogo", "Água", "Grama", "Elétrico", "Pedra", "Gelo", "Lutador", "Veneno", "Terrestre", "Voador", "Psíquico", "Inseto", "Fantasma", "Noturno", "Dragão", "Metálico", "Fada" }));
        tipo2Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo2BoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipo1Box, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tipo2Box, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipo1Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tipo2Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addComponent(jButton1)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nome = camponome.getText();
        String tipo1 = tipo1Box.getSelectedItem().toString();
        String tipo2 = tipo2Box.getSelectedItem().toString();

        Pokemon p = new Pokemon(nome, tipo1, tipo2);
        //Persistindo
        Conexão fábrica = new Conexão();
        JDBCPokemon gerente = new JDBCPokemon(fábrica.abrirConexão());
        gerente.inserirPokemon(p);
        fábrica.fecharConexão();

        camponome.setText("");
        tipo1Box.setSelectedIndex(0);
        tipo2Box.setSelectedIndex(0);
        
                

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tipo1BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo1BoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo1BoxActionPerformed

    private void tipo2BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo2BoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo2BoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField camponome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> tipo1Box;
    private javax.swing.JComboBox<String> tipo2Box;
    // End of variables declaration//GEN-END:variables
}
