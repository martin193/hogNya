package hogW;

import oru.inf.InfDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martin
 */
public class Huvudfonster extends javax.swing.JFrame {

    /**
     * Creates new form Huvudfonster
     * @param idb
     */
    public Huvudfonster() {
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

        valjLarareAdmin = new javax.swing.JComboBox<>();
        anvNamnLabel = new javax.swing.JLabel();
        anvNamnTextField = new javax.swing.JTextField();
        losenLabel = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        loggaInButton = new javax.swing.JButton();
        elevLabel = new javax.swing.JLabel();
        elevKnappButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        valjLarareAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lärare", "Admin" }));
        valjLarareAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjLarareAdminActionPerformed(evt);
            }
        });

        anvNamnLabel.setText("Användarnamn");

        anvNamnTextField.setText("anvNamn");
        anvNamnTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anvNamnTextFieldActionPerformed(evt);
            }
        });

        losenLabel.setText("Lösenord");

        jPasswordField1.setText("losenord");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        loggaInButton.setText("Logga in");
        loggaInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaInButtonActionPerformed(evt);
            }
        });

        elevLabel.setText("Är du elev?");

        elevKnappButton.setText("Tryck här");
        elevKnappButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevKnappButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loggaInButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(valjLarareAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(anvNamnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(losenLabel))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1)
                            .addComponent(anvNamnTextField))))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(elevLabel)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(elevKnappButton)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(elevLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elevKnappButton)
                .addGap(18, 18, 18)
                .addComponent(valjLarareAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anvNamnLabel)
                    .addComponent(anvNamnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(losenLabel)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(loggaInButton)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valjLarareAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjLarareAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valjLarareAdminActionPerformed

    private void anvNamnTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anvNamnTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anvNamnTextFieldActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void loggaInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaInButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loggaInButtonActionPerformed

    private void elevKnappButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevKnappButtonActionPerformed
           this.dispose();
           new ElevStartsidaFrame().setVisible(true);// TODO add your handling code here: 
    }//GEN-LAST:event_elevKnappButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anvNamnLabel;
    private javax.swing.JTextField anvNamnTextField;
    private javax.swing.JButton elevKnappButton;
    private javax.swing.JLabel elevLabel;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton loggaInButton;
    private javax.swing.JLabel losenLabel;
    private javax.swing.JComboBox<String> valjLarareAdmin;
    // End of variables declaration//GEN-END:variables
}
