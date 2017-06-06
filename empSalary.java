package hms;

import com.sun.glass.events.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

public class empSalary extends javax.swing.JFrame {

    private int empID, mon = 0;
    private int atend;
    private String day;
    private int amount;
    private java.sql.Date date;

    public empSalary() {
        initComponents();
    }

    public void setData() {
        

        atend = Integer.parseInt(atendText.getText());

        String dte = dateText.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date textDate = null;
        try {
            textDate = sdf.parse(dte);
            date = java.sql.Date.valueOf(sdf.format(textDate));
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        empID = Integer.parseInt(empidText.getText());

        Object ty = cbmonth.getSelectedItem();
        if (ty != null) {
            String b = ty.toString();
            mon = Integer.parseInt(b);
        }

    }

    public int getValue() {
        amount = 0;
        if (atend < 15) {
            amount = 15000;
        }
        if (atend < 20 && atend > 15) {
            amount = 20000;
        }
        if (atend > 20 && atend < 25) {
            amount = 25000;
        }
        if (atend > 25 && atend <= 31) {
            amount = 30000;
        }
        return amount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        atendText = new javax.swing.JTextField();
        dateText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        calBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbyear = new javax.swing.JComboBox<>();
        empidText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbmonth = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Salary"));

        atendText.setEditable(false);
        atendText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                atendTextKeyTyped(evt);
            }
        });

        jLabel2.setText("amount:");

        jLabel3.setText("Attendance:");

        calBtn.setText("Calculate amount");
        calBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Date:");

        amountText.setEditable(false);
        amountText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountTextKeyTyped(evt);
            }
        });

        jLabel8.setText("(yyyy-mm-dd)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(amountText, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(atendText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(calBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(atendText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(calBtn)
                .addGap(32, 32, 32))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("calculate Attendance"));

        jLabel6.setText("month:");

        jLabel7.setText("year:");

        jButton1.setText("Calculate Attedance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        cbyear.setSelectedIndex(-1);

        empidText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                empidTextFocusLost(evt);
            }
        });
        empidText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empidTextActionPerformed(evt);
            }
        });
        empidText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empidTextKeyTyped(evt);
            }
        });

        jLabel5.setText("employee ID:");

        cbmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbmonth.setSelectedIndex(-1);

        jButton3.setText("reset month details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empidText, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(empidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(cbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(621, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calBtnActionPerformed
        try {
            connection c = new connection();
            Connection cn = c.getConnect();
            Statement st = cn.createStatement();

            this.setData();

            
                ResultSet rs1 = st.executeQuery("select * from salary where empID='" + this.empID + "' ");
                if(rs1.next())
                {
                    int m = rs1.getInt("month");
                if (mon == m) {
                    JOptionPane.showMessageDialog(null, "employee already given payment");
                    String a = rs1.getString("amount");
                    amountText.setText(a);
                }
                else{
                    this.getValue();
                    st.executeUpdate("insert into salary( attendance, amount,empID, date, month) values('" + atend + "','" + amount + "', '" + empID + "','" + date + "','"+mon+"')");
                    String a = String.valueOf(amount);
                    amountText.setText(a);
                }
                }
             else {
                this.getValue();

                st.executeUpdate("insert into salary( attendance, amount, empID ,date, month) values('" + atend + "','" + amount + "','" + empID + "','" + date + "', '"+mon+"')");
                String a = String.valueOf(amount);
                amountText.setText(a);
            }

        } catch (SQLException w) {
            System.out.print(w.getMessage());
        }
    }//GEN-LAST:event_calBtnActionPerformed

    private void atendTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atendTextKeyTyped
        char vchar = evt.getKeyChar();
        if ((!(Character.isDigit(vchar))) || (vchar == KeyEvent.VK_BACKSPACE) || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
    }//GEN-LAST:event_atendTextKeyTyped

    private void amountTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountTextKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTextKeyTyped

    private void empidTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empidTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empidTextActionPerformed

    private void empidTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empidTextKeyTyped
        char vchar = evt.getKeyChar();
        if ((!(Character.isDigit(vchar))) || (vchar == KeyEvent.VK_BACKSPACE) || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
    }//GEN-LAST:event_empidTextKeyTyped

    private void empidTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empidTextFocusLost
        String ID = empidText.getText();
        int empID = 0;
        if (ID.length() > 0) {
            empID = Integer.parseInt(ID);
        }
        try {
            connection c = new connection();
            Connection cn = c.getConnect();
            Statement st = cn.createStatement();
            if (empID > 0) {
                ResultSet rs = st.executeQuery("select * from employee where empID ='" + empID + "'");
                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(this, "NO match result in Employee table!");
                    empidText.setText("");
                }
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_empidTextFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = empidText.getText();
        int empid = 0;
        int count = 0;
        if (id.length() > 0) {
            empid = Integer.parseInt(id);
        }
        int month = 0, year = 0;
        Object ty = cbmonth.getSelectedItem();
        if (ty != null) {
            String b = ty.toString();
            month = Integer.parseInt(b);
        }
        Object ty1 = cbyear.getSelectedItem();
        if (ty1 != null) {
            String c = ty1.toString();
            year = Integer.parseInt(c);
        }
        try {
            connection c = new connection();
            Connection cn = c.getConnect();
            Statement st = cn.createStatement();
            if (empid > 0) {
                ResultSet rs = st.executeQuery("select count(*) from getAttendance where empID='" + id + "' and month='" + month + "' and year='" + year + "' and attend='1'");
                if (rs.next()) {
                    count = rs.getInt(1);
                    atendText.setText(String.valueOf(count));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Empty employee id");
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Employee e = new Employee();
        e.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            connection c = new connection();
            Connection cn = c.getConnect();
            Statement st = cn.createStatement();

            st.executeUpdate("delete from getAttendance");
            JOptionPane.showMessageDialog(null, "successfully deleted!");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(empSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountText;
    private javax.swing.JTextField atendText;
    private javax.swing.JButton calBtn;
    private javax.swing.JComboBox<String> cbmonth;
    private javax.swing.JComboBox<String> cbyear;
    private javax.swing.JTextField dateText;
    private javax.swing.JTextField empidText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}