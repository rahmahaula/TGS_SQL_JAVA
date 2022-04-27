/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasSQLpakbagus;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;


/**
 *
 * @author Acer
 */
public class formStudent extends javax.swing.JFrame {

public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    
public void Title() {

    Object[] Title = {
        "NIS", "NAMA", "JURUSAN", "JENIS KELAMIN", "ALAMAT"
    };

        tabModel = new  DefaultTableModel(null, Title);
        TableStudent.setModel(tabModel);
}
   
public void dataDisplay(String where) {

    try{
        Connection cn = connection.getConnection();
        st = cn.createStatement();
        tabModel.getDataVector().removeAllElements();
        tabModel.fireTableDataChanged();
        rs = st.executeQuery("SELECT * FROM student " + where);
        
        while (rs.next()){
        
        Object[] Data =  {
        
            rs.getString("NIS"),
            rs.getString("NAMA"),
            rs.getString("JURUSAN"),
            rs.getString("JENIS KELAMIN"),
            rs.getString("ALAMAT"),
            };
        
            tabModel.addRow(Data);
        
        }
        
    }catch(Exception e){
    
        e.printStackTrace();
    }

}

public void reset() {
  iptUsername.setText("");
  iptName.setText("");
  cbMajor.setSelectedItem("");
  cbGender.setSelectedItem("");
  txtAddress.setText("");
}
    
    
    public formStudent() {
        initComponents();
        
        Title();
        dataDisplay("");
        
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iptUsername = new javax.swing.JTextField();
        iptName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        cbMajor = new javax.swing.JComboBox<>();
        cbGender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableStudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NIS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 37, 37, -1));

        jLabel2.setText("NAMA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 81, 37, -1));

        jLabel3.setText("JURUSAN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 121, 88, -1));

        jLabel4.setText("JENIS KELAMIN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 161, 90, -1));

        jLabel5.setText("ALAMAT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 198, 47, -1));
        getContentPane().add(iptUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 31, 182, -1));

        iptName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptNameActionPerformed(evt);
            }
        });
        getContentPane().add(iptName, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 78, 182, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        cbMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business Administration", "Computer Science", "Healthcare", "Marketing" }));
        cbMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMajorActionPerformed(evt);
            }
        });
        getContentPane().add(cbMajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 118, 182, -1));

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perempuan", "Laki-laki" }));
        getContentPane().add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 158, 181, -1));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 280, -1));

        TableStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableStudentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableStudent);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 450, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iptNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptNameActionPerformed

    private void cbMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMajorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMajorActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = connection.getConnection();
            st = cn.createStatement();
             st.executeUpdate("INSERT INTO student VALUES('" + iptUsername.getText() + "','"
        + iptName.getText() + "','"
        + cbMajor.getSelectedItem() + "','"
        + cbGender.getSelectedItem() + "','"
        + txtAddress.getText() + "')");
        dataDisplay("");
        JOptionPane.showMessageDialog(null, "Save Successful");
        iptUsername.setText("");
        iptName.setText("");
        cbMajor.setSelectedItem("");
        cbGender.setSelectedItem("");
        txtAddress.setText("");
        }catch(Exception e){
            e.printStackTrace();

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void TableStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableStudentMouseClicked
        // TODO add your handling code here:
        iptUsername.setText(TableStudent.getValueAt(TableStudent.getSelectedRow(), 0).toString());
        iptName.setText(TableStudent.getValueAt(TableStudent.getSelectedRow(), 1).toString());
        cbMajor.setSelectedItem(TableStudent.getValueAt(TableStudent.getSelectedRow(), 2).toString());
        cbGender.setSelectedItem(TableStudent.getValueAt(TableStudent.getSelectedRow(), 3).toString());
        txtAddress.setText(TableStudent.getValueAt(TableStudent.getSelectedRow(), 4).toString());
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_TableStudentMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = connection.getConnection();
            st = cn.createStatement();
            st.executeUpdate("UPDATE student set " 
                + "NIS='"       + iptUsername.getText() + "', "
                + "NAMA='"      + iptName.getText() + "', "
                + "JURUSAN='"   + cbMajor.getSelectedItem() + "', "
                + "JENIS KELAMIN='"        + cbGender.getSelectedItem() + "', "
                + "ALAMAT='"    + txtAddress.getText() + "'");
            dataDisplay("");
            JOptionPane.showMessageDialog(null, "Update Successful");
            reset();
            } catch (Exception e) {
                e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
    int jawab;
    
    if ((jawab = JOptionPane.showConfirmDialog(null, "Want to Delete the Data?", "Confirmation", JOptionPane.YES_NO_OPTION)) == 0) {
        Connection cn = connection.getConnection();
      st = cn.createStatement();
      st.executeUpdate("DELETE FROM student WHERE NIS='"
          + tabModel.getValueAt(TableStudent.getSelectedRow(), 0) + "'");
      dataDisplay("");
      reset();
    }
  } catch (Exception e) {
    e.printStackTrace();
  }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(formStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableStudent;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JComboBox<String> cbMajor;
    private javax.swing.JTextField iptName;
    private javax.swing.JTextField iptUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAddress;
    // End of variables declaration//GEN-END:variables
}
