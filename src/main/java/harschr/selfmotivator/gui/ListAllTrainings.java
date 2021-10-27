package harschr.selfmotivator.gui;

import harschr.selfmotivator.dao.impl.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import harschr.selfmotivator.model.Training;

public class ListAllTrainings extends javax.swing.JFrame {

    SelfMotivatorRepositoryJDBCimpl trDAO = new SelfMotivatorRepositoryJDBCimpl();

    public ListAllTrainings() {
        initComponents();
        setLocationRelativeTo(null);
        showAllTrainings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_trainings = new javax.swing.JTable();
        bt_start = new javax.swing.JButton();
        bt_nowy = new javax.swing.JButton();
        bt_edit = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SELFMOTIVATOR");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Zapisane treningi - wybierz i kliknij \"START\", żeby uruchomić:");

        tb_trainings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numer", "Nazwa", "Czynność 1", "Długość 1", "Czynność 2", "Długość 2", "Czynność 3", "Długość 3", "Czynność 4", "Długość 4", "Czynność 5", "Długość 5", "Przerwa", "Częstotliwość"
            }
        ));
        jScrollPane1.setViewportView(tb_trainings);
        if (tb_trainings.getColumnModel().getColumnCount() > 0) {
            tb_trainings.getColumnModel().getColumn(0).setPreferredWidth(5);
            tb_trainings.getColumnModel().getColumn(3).setPreferredWidth(10);
            tb_trainings.getColumnModel().getColumn(5).setPreferredWidth(10);
            tb_trainings.getColumnModel().getColumn(7).setPreferredWidth(10);
            tb_trainings.getColumnModel().getColumn(9).setPreferredWidth(10);
            tb_trainings.getColumnModel().getColumn(11).setPreferredWidth(10);
            tb_trainings.getColumnModel().getColumn(12).setPreferredWidth(10);
            tb_trainings.getColumnModel().getColumn(13).setPreferredWidth(10);
        }

        bt_start.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bt_start.setText("START");
        bt_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_startActionPerformed(evt);
            }
        });

        bt_nowy.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bt_nowy.setText("Zapisz nowy");
        bt_nowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nowyActionPerformed(evt);
            }
        });

        bt_edit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bt_edit.setText("Zapisz zmianę");
        bt_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editActionPerformed(evt);
            }
        });

        bt_exit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bt_exit.setText("Wyjść");
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });

        bt_delete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bt_delete.setText("Usuń");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_start)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(bt_nowy)
                        .addGap(18, 18, 18)
                        .addComponent(bt_edit)
                        .addGap(18, 18, 18)
                        .addComponent(bt_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_start)
                    .addComponent(bt_nowy)
                    .addComponent(bt_edit)
                    .addComponent(bt_exit)
                    .addComponent(bt_delete))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showAllTrainings() {
        ArrayList<String[]> trainings = trDAO.listAll();
        DefaultTableModel tableModel = (DefaultTableModel) tb_trainings.getModel();
        for (String[] training : trainings) {
            tableModel.addRow(training);
        }
    }

    private void bt_nowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nowyActionPerformed
        dispose();
        new NewTraining().setVisible(true);
    }//GEN-LAST:event_bt_nowyActionPerformed

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        dispose();
        new Start().setVisible(true);
    }//GEN-LAST:event_bt_exitActionPerformed

    private void bt_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_startActionPerformed
        if (tb_trainings.getSelectedRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, "Wybierz jeden trening żeby zacząć!", "Błąd :O", JOptionPane.WARNING_MESSAGE);
        } else {
            int kijelolt = tb_trainings.getSelectedRow();
            TableModel model = tb_trainings.getModel();
            String id = model.getValueAt(kijelolt, 0).toString();           
            Training tr = trDAO.findById(id);
           dispose();
            new Training_break(tr)
                    .setVisible(true);
        }
    }//GEN-LAST:event_bt_startActionPerformed

    private void bt_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editActionPerformed
        if (tb_trainings.getSelectedRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, "Musisz wybrać trening żeby zapisać!", "Błąd", JOptionPane.WARNING_MESSAGE);
        } else {
            int kijelolt = tb_trainings.getSelectedRow();
            TableModel model = tb_trainings.getModel();

            String id = model.getValueAt(kijelolt, 0).toString();
            String name = tb_trainings.getValueAt(kijelolt, 1).toString();
            String activity1 = tb_trainings.getValueAt(kijelolt, 2).toString();
            int length_training1 = Integer.parseInt(model.getValueAt(kijelolt, 3).toString());
            String activity2 = tb_trainings.getValueAt(kijelolt, 4).toString();
            int length_training2 = Integer.parseInt(model.getValueAt(kijelolt, 5).toString());
            String activity3 = tb_trainings.getValueAt(kijelolt, 6).toString();
            int length_training3 = Integer.parseInt(model.getValueAt(kijelolt, 7).toString());
            String activity4 = tb_trainings.getValueAt(kijelolt, 8).toString();
            int length_training4 = Integer.parseInt(model.getValueAt(kijelolt, 9).toString());
            String activity5 = tb_trainings.getValueAt(kijelolt, 10).toString();
            int length_training5 = Integer.parseInt(model.getValueAt(kijelolt, 11).toString());
            int length_break = Integer.parseInt(model.getValueAt(kijelolt, 12).toString());
            int recurrence = Integer.parseInt(model.getValueAt(kijelolt, 13).toString());

             Training tr = new Training(name, activity1, length_training1, activity2, length_training2, activity3, length_training3, activity4, length_training4, activity5, length_training5, length_break, recurrence);
            trDAO.update(tr, id);
            JOptionPane.showMessageDialog(this, "Trening został aktualizowany!");
        }
    }//GEN-LAST:event_bt_editActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        if (tb_trainings.getSelectedRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, "Musisz wybrać trening żeby usunąć!", "Błąd", JOptionPane.WARNING_MESSAGE);
        } else {
            int kijelolt = tb_trainings.getSelectedRow();
            TableModel model = tb_trainings.getModel();
            String id = model.getValueAt(kijelolt, 0).toString();
            int valasz = JOptionPane.showConfirmDialog(this, "Czy na pewno chcesz trening usunąć?", "Potwierdzenie", JOptionPane.YES_NO_OPTION);
            if (valasz == JOptionPane.YES_OPTION) {
                trDAO.delete(id);
                JOptionPane.showMessageDialog(this, "Trening został usunięty!");
                dispose();
                new ListAllTrainings().setVisible(true);
            }
        }
    }//GEN-LAST:event_bt_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(ListAllTrainings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListAllTrainings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListAllTrainings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListAllTrainings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListAllTrainings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_edit;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_nowy;
    private javax.swing.JButton bt_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_trainings;
    // End of variables declaration//GEN-END:variables
}
