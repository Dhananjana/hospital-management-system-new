package hms;

import com.sun.glass.events.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
//import java.sql.Date;
import javax.swing.JOptionPane;

public class patient_attendance extends javax.swing.JFrame {

    public int atndNo, id, cons, wno, rno;
    //private java.sql.Date sqlDate;
    public String dte, dname, disease;

    public patient_attendance() {
        initComponents();
    }

    public void getData() {

        dte = dateText.getText();

        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date textDate = null;
        try{
            textDate = sdf.parse(dte);
            sqlDate = java.sql.Date.valueOf(sdf.format(textDate));
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }*/
        String nic = IDTExt.getText();
        if (nic.length() == 9) {
            id = Integer.parseInt(nic);
        } else {
            JOptionPane.showMessageDialog(this, " patient NIC length error! ");
        }

        cons = Integer.parseInt(consText.getText());
        dname = nameTExt.getText();
        disease = disText.getText();
        wno = Integer.parseInt(wardnoText.getText());
        rno = Integer.parseInt(roomnoText.getText());
    }

    public void reset() {
        attendNoText.setText("");
        dateText.setText("");
        IDTExt.setText("");
        consText.setText("");
        nameTExt.setText("");
        disText.setText("");
        wardnoText.setText("");
        roomnoText.setText("");
    }

    public static String sqlDateToString(java.sql.Date date) {
        if (date != null) {
            java.util.Date utilDate = new java.util.Date(date.getTime());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.format(utilDate);
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admitBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        wardnoText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        IDTExt = new javax.swing.JTextField();
        nameTExt = new javax.swing.JTextField();
        attendNoText = new javax.swing.JTextField();
        dateText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        consText = new javax.swing.JTextField();
        disText = new javax.swing.JTextField();
        roomnoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Attendance");

        admitBtn.setText("Admit");
        admitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admitBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Attendance"));

        jLabel6.setText("consultant no");

        jLabel2.setText("Admit date");

        wardnoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                wardnoTextFocusLost(evt);
            }
        });
        wardnoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wardnoTextKeyTyped(evt);
            }
        });

        jLabel10.setText("Room No");

        IDTExt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDTExtFocusLost(evt);
            }
        });
        IDTExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTExtActionPerformed(evt);
            }
        });
        IDTExt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDTExtKeyTyped(evt);
            }
        });

        attendNoText.setEditable(false);
        attendNoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                attendNoTextKeyTyped(evt);
            }
        });

        dateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextActionPerformed(evt);
            }
        });

        jLabel9.setText("Docname");

        jLabel7.setText("Ward No");

        jLabel1.setText("patient attendance no");

        jLabel8.setText("v");

        jLabel5.setText("patient_NIC");

        jLabel4.setText("Disease");

        consText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                consTextFocusLost(evt);
            }
        });
        consText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                consTextKeyTyped(evt);
            }
        });

        roomnoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                roomnoTextKeyTyped(evt);
            }
        });

        jLabel3.setText("yyyy-mm-dd");

        jButton2.setText("Add extern Physician details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(attendNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(IDTExt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(consText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTExt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wardnoText, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomnoText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(attendNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(IDTExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(consText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nameTExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(disText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(wardnoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(roomnoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(32, 32, 32)
                        .addComponent(resetBtn)
                        .addGap(39, 39, 39)
                        .addComponent(searchBtn)
                        .addGap(38, 38, 38)
                        .addComponent(admitBtn)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBtn)
                    .addComponent(searchBtn)
                    .addComponent(admitBtn)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextActionPerformed

    private void IDTExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTExtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTExtActionPerformed

    private void admitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admitBtnActionPerformed
        try {
            connection c = new connection();
            Connection cn = c.getConnect();
            Statement st = cn.createStatement();
            this.getData();

            int l1 = dte.length();
            int l2 = (int) Math.log10(this.id) + 1;
            int l3 = (int) Math.log10(this.cons) + 1;
            int l4 = this.dname.length();
            int l5 = this.disease.length();
            int l6 = (int) Math.log10(wno) + 1;
            int l7 = (int) Math.log10(rno) + 1;
            if (l1 < 21 && l2 == 9 && l3 < 6 && l4 < 21 && l5 < 21 && l6 < 4 & l7 < 4) {
                ResultSet rs = st.executeQuery("select * from p_attendance where  NIC='" + this.id + "'");
                if (rs.next()) {

                    int number = Integer.parseInt(rs.getString("PatndNo"));

                    ResultSet rs1 = st.executeQuery("select * from discharge where NIC ='" + this.id + "'");
                    if (rs1.next()) {
                        int adno = rs1.getInt("PatndNo");
                        if (adno == number) {
                            st.executeUpdate("delete from p_attendance where NIC='" + this.id + "'");
                            if (number == 0) {
                                this.atndNo = 1;
                            } else {
                                atndNo = number + 1;
                            }

                            st.executeUpdate("insert into p_attendance(PatndNo, date, empID, NIC, DocName, Disease, ward, room ) values('" + atndNo + "','" + dte + "','" + cons + "','" + id + "','" + dname + "','" + disease + "', '" + wno + "', '" + rno + "')");
                            JOptionPane.showMessageDialog(this, "successfully updated");
                            this.reset();
                        } 
                    }
                }
                else {

                            st.executeUpdate("insert into p_attendance(PatndNo, date, empID, NIC, DocName, Disease, ward, room) values('" + 1 + "','" + dte + "','" + cons + "','" + id + "','" + dname + "','" + disease + "', '" + wno + "', '" + rno + "')");
                            JOptionPane.showMessageDialog(this, "successfully updated");
                            this.reset();

                        }

            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

    }//GEN-LAST:event_admitBtnActionPerformed

    private void attendNoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_attendNoTextKeyTyped
        char vchar = evt.getKeyChar();
        if ((!(Character.isDigit(vchar))) || (vchar == KeyEvent.VK_BACKSPACE) || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
    }//GEN-LAST:event_attendNoTextKeyTyped

    private void IDTExtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTExtKeyTyped
        char vchar = evt.getKeyChar();
        if ((!(Character.isDigit(vchar))) || (vchar == KeyEvent.VK_BACKSPACE) || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
    }//GEN-LAST:event_IDTExtKeyTyped

    private void consTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consTextKeyTyped
        char vchar = evt.getKeyChar();
        if ((!(Character.isDigit(vchar))) || (vchar == KeyEvent.VK_BACKSPACE) || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
    }//GEN-LAST:event_consTextKeyTyped

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try {
            connection c = new connection();
            Connection cn = c.getConnect();
            Statement st = cn.createStatement();

            id = Integer.parseInt(IDTExt.getText());

            ResultSet rs = st.executeQuery("select * from p_attendance where NIC='" + this.id + "'");

            if (rs.next()) {
                attendNoText.setText(String.valueOf(rs.getString("PatndNo")));
                dateText.setText(rs.getString("date"));
                consText.setText(String.valueOf(rs.getString("empID")));
                nameTExt.setText(rs.getString("DocName"));
            } else {
                JOptionPane.showMessageDialog(this, "No patient result to delete!");
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        this.reset();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void consTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_consTextFocusLost
        String cid = consText.getText();
        int cd = 0;
        if (cid.length() > 0) {
            cd = Integer.parseInt(cid);
        }
        try {
            connection c = new connection();
            Connection cn = c.getConnect();
            Statement st = cn.createStatement();
            if (cd > 0) {
                ResultSet rs = st.executeQuery("select * from consultant where empID='" + cd + "'");
                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(this, "first add details in consultant form");
                    consText.setText("");
                }
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_consTextFocusLost

    private void IDTExtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDTExtFocusLost
        String patID = IDTExt.getText();
        int pd = 0;
        if (patID.length() > 0) {
            pd = Integer.parseInt(patID);
        }
        try {
            connection c = new connection();
            Connection cn = c.getConnect();
            Statement st = cn.createStatement();
            if (pd > 0) {
                ResultSet rs = st.executeQuery("select * from patient where NIC='" + pd + "'");
                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(this, "first add details in patient form");
                    IDTExt.setText("");
                }
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_IDTExtFocusLost

    private void wardnoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wardnoTextFocusLost
        String wrd = wardnoText.getText();
        int wd = 0;
        if (wrd.length() > 0) {
            wd = Integer.parseInt(wrd);
        }
        try {
            connection c = new connection();
            Connection cn = c.getConnect();
            Statement st = cn.createStatement();
            if (wd > 0) {
                ResultSet rs = st.executeQuery("select * from ward where wardNo='" + wd + "'");
                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(this, "invalid ward number");
                    wardnoText.setText("");
                }
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_wardnoTextFocusLost

    private void wardnoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wardnoTextKeyTyped
        char vchar = evt.getKeyChar();
        if ((!(Character.isDigit(vchar))) || (vchar == KeyEvent.VK_BACKSPACE) || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
    }//GEN-LAST:event_wardnoTextKeyTyped

    private void roomnoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roomnoTextKeyTyped
        char vchar = evt.getKeyChar();
        if ((!(Character.isDigit(vchar))) || (vchar == KeyEvent.VK_BACKSPACE) || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
    }//GEN-LAST:event_roomnoTextKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        patient p = new patient();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ext_physician n = new ext_physician();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(patient_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patient_attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDTExt;
    private javax.swing.JButton admitBtn;
    private javax.swing.JTextField attendNoText;
    private javax.swing.JTextField consText;
    private javax.swing.JTextField dateText;
    private javax.swing.JTextField disText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTExt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField roomnoText;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField wardnoText;
    // End of variables declaration//GEN-END:variables
}
