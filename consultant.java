/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import com.sun.glass.events.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class consultant extends javax.swing.JFrame {

    /**
     * Creates new form consultant
     */
    public int no;
    public String spe;
    public int lcon;

    public void getData() {
        no = Integer.parseInt(idText.getText());
        spe = spText.getText();
        lcon = 0;
        if (yesRadio.isSelected()) {
            lcon = 1;
        }
        /*if(noRadio.isSelected())
        {
            lcon =0;
        }*/
    }

    public void reset() {
        idText.setText("");
        spText.setText("");
        buttonGroup1.clearSelection();
    }

    public consultant() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        backBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        noRadio = new javax.swing.JRadioButton();
        yesRadio = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        spText = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        deletbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultant Details"));

        buttonGroup1.add(noRadio);
        noRadio.setText("no");

        buttonGroup1.add(yesRadio);
        yesRadio.setText("yes");

        jLabel3.setText("leading consultant:");

        jLabel2.setText("Specific field:");

        jLabel1.setText("empID:");

        idText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idTextKeyTyped(evt);
            }
        });

        spText.setColumns(20);
        spText.setRows(5);
        jScrollPane1.setViewportView(spText);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(yesRadio)
                        .addGap(18, 18, 18)
                        .addComponent(noRadio)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yesRadio)
                    .addComponent(noRadio))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        deletbtn.setText("Delete");
        deletbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(searchbtn)
                .addGap(33, 33, 33)
                .addComponent(deletbtn)
                .addGap(29, 29, 29)
                .addComponent(resetBtn)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(searchbtn)
                    .addComponent(deletbtn)
                    .addComponent(resetBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            connection c = new connection();
            Connection cn = c.getConnect();
            Statement st = cn.createStatement();

            this.getData();
            int l1 = (int) Math.log10(no) + 1;
            int l2 = spe.length();
            if (l1 < 6 && l2 < 21) {

                ResultSet rs = st.executeQuery("select * from consultant where empID='" + no + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "empID already exist");
                } else {
                    String ty = "Consultant";
                    Statement st2 = cn.createStatement();
                    ResultSet rs2 = st2.executeQuery("select * from employee where empID='" + this.no + "' and empType='" + ty + "'");
                    if (rs2.next()) {
                        st.executeUpdate("insert into consultant(empID , specific_field, lcons) values('" + no + "','" + spe + "','" + lcon + "')");
                        this.reset();
                        JOptionPane.showMessageDialog(this, "successfully updated");
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid employee ID");
                        this.reset();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "input size error!");
            }
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextKeyTyped
        char vchar = evt.getKeyChar();
        if ((!(Character.isDigit(vchar))) || (vchar == KeyEvent.VK_BACKSPACE) || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
    }//GEN-LAST:event_idTextKeyTyped

    private void deletbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletbtnActionPerformed
        try {
            connection c = new connection();
            Connection cn = c.getConnect();
            Statement st = cn.createStatement();

            this.getData();
            ResultSet rs = st.executeQuery("select * from consultant where empId='" + no + "'");
            if (rs.next()) {

                //st.executeUpdate("delete from employee where empID='" + no + "'");
                st.executeUpdate("delete from consultant where empID='" + no + "'");
                JOptionPane.showMessageDialog(this, "successfully deleted from consultant table!");
                this.reset();
            } else {
                JOptionPane.showMessageDialog(this, "invalid empID");
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_deletbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        try {
            connection c = new connection();
            Connection cn = c.getConnect();
            Statement st = cn.createStatement();

            this.getData();

            ResultSet rs = st.executeQuery("select * from consultant where empID='" + no + "'");
            if (rs.next()) {
                spe = rs.getString("specific_field");
                lcon = Integer.parseInt(rs.getString("lcons"));
                spText.setText(spe);
                if (lcon == 1) {
                    yesRadio.setSelected(true);
                } else {
                    noRadio.setSelected(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "output is empty!");
            }

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        this.reset();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        employee e = new employee();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(consultant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deletbtn;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton noRadio;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextArea spText;
    private javax.swing.JRadioButton yesRadio;
    // End of variables declaration//GEN-END:variables
}
