package classmates;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import funcional.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.Icon;

public class Estudiantes extends javax.swing.JFrame {
Funciones func=new Funciones();
    /**
     * Creates new form estudiantes
     */
    public Estudiantes() {
        initComponents();
        this.setSize(new Dimension(870, 710));
        setLocationRelativeTo(null);
        this.repaint();
        this.setSize(new Dimension(500,700)); 
        setLocationRelativeTo(null);
        
        
        cur.setText(func.cur1);
        String t1 =func.cur1;
        func.comparar(t1);
        e1.setText(func.et1);
        e2.setText(func.et2);
        e3.setText(func.et3);
        e4.setText(func.et4);
        e5.setText(func.et5);
        e6.setText(func.et6);
        e7.setText(func.et7);
        e8.setText(func.et8);
        e9.setText(func.et9);
        e10.setText(func.et10);
        
        
       }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        estudiante = new javax.swing.JLabel();
        cur = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        e8 = new javax.swing.JCheckBox();
        e9 = new javax.swing.JCheckBox();
        e10 = new javax.swing.JCheckBox();
        e7 = new javax.swing.JCheckBox();
        e6 = new javax.swing.JCheckBox();
        e5 = new javax.swing.JCheckBox();
        e4 = new javax.swing.JCheckBox();
        e3 = new javax.swing.JCheckBox();
        e1 = new javax.swing.JCheckBox();
        e2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        estudiante.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        estudiante.setText("Curso");
        getContentPane().add(estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        cur.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(cur, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 140, 40));

        enviar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 80, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(e8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel1.add(e9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        jPanel1.add(e10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        jPanel1.add(e7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        e6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e6ActionPerformed(evt);
            }
        });
        jPanel1.add(e6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(e5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel1.add(e4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel1.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        jPanel1.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel1.add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 410, 320));

        jLabel1.setText("Seleccione los estudiantes que no asistieron");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void e6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e6ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed

    }//GEN-LAST:event_e1ActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
       func.enviarAbase(e1.isSelected(),e2.isSelected(),e3.isSelected(),e4.isSelected(),e5.isSelected(),e6.isSelected(),e7.isSelected(),e8.isSelected(),e9.isSelected(),e10.isSelected(),e1.getText(),e2.getText(),e3.getText(),e4.getText(),e5.getText(),e6.getText(),e7.getText(),e8.getText(),e9.getText(),e10.getText());
       dispose();
    }//GEN-LAST:event_enviarActionPerformed

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
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cur;
    private javax.swing.JCheckBox e1;
    private javax.swing.JCheckBox e10;
    private javax.swing.JCheckBox e2;
    private javax.swing.JCheckBox e3;
    private javax.swing.JCheckBox e4;
    private javax.swing.JCheckBox e5;
    private javax.swing.JCheckBox e6;
    private javax.swing.JCheckBox e7;
    private javax.swing.JCheckBox e8;
    private javax.swing.JCheckBox e9;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel estudiante;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
