
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bolt
 */
public class AddServices extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
PreparedStatement pst1;
String a1=booking.jTextField6.getText();
 String a2=booking.jTextField7.getText();
 String a3=booking.jTextField3.getText();
String a4=booking.jTextField5.getText();
String a5=booking.jTextField8.getText();
String a6=booking.jTextField11.getText();
    /**
     * Creates new form AddServices
     */
  
public AddServices( ){
     super("AddServices");
        initComponents();
        conn=connect.ConnectorDB();
    
        String a1=login.jPasswordField1.getText();
        delete();
}
public void add(String s){
     String sql="insert into ROOM_SERVICE VALUES (?,?)";
        String sql1="select S_ID from SERVICES where S_NAME='"+s+"' and H_id='"+a1+"'";
        try
        {
            
           
            pst1=conn.prepareStatement(sql1);
            rs=pst1.executeQuery();
            if(rs.next()){
             pst=conn.prepareStatement(sql);
            pst.setString(1,booking.jTextField7.getText());
            pst.setString(2,rs.getString(1));
            pst.executeUpdate();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}
public void delete(){
     String sql3="delete from room_service where room_no IN (select room_no from rooms r,booking b where b.book_id=r.b_id AND b.BOOKING_status='COMPLETED')";
     try{
         pst=conn.prepareStatement(sql3);
         pst.executeQuery();
         
         
     }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
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
        jLabel1 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Services");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 20, 190, 42);

        jCheckBox4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox4.setText("Laundary");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox4);
        jCheckBox4.setBounds(30, 80, 90, 25);

        jCheckBox5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox5.setText("Daily Newspaper");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox5);
        jCheckBox5.setBounds(30, 280, 140, 25);

        jCheckBox10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox10.setText("Sauna/Spa");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox10);
        jCheckBox10.setBounds(30, 160, 120, 25);

        jCheckBox11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox11.setText("Airport Transfer");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox11);
        jCheckBox11.setBounds(30, 200, 120, 25);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bolt\\Downloads\\iconfinder_plus_1282963.png")); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 330, 100, 31);

        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox1.setText("Child Care");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(30, 120, 90, 25);

        jCheckBox2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox2.setText("Conference Center");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(30, 240, 140, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\dbms\\background\\hotel.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-160, -180, 600, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
       // String a2=jCheckBox5.getText();
       //add(a2);
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              if(jCheckBox5.isSelected()){
                String a2=jCheckBox5.getText();
                add(a2);  
              }
              if(jCheckBox4.isSelected()){
                String a3=jCheckBox4.getText();
                add(a3);  
              }
              if(jCheckBox10.isSelected()){
                String a4=jCheckBox10.getText();
                add(a4);  
              }
              if(jCheckBox11.isSelected()){
                String a5=jCheckBox11.getText();
                add(a5);  
              }
              if(jCheckBox1.isSelected()){
                String a6=jCheckBox1.getText();
                add(a6);  
              }
              if(jCheckBox2.isSelected()){
                String a7=jCheckBox2.getText();
                add(a7);  
              }
                 setVisible(false);
                 booking ob2=new booking(a1,a2,a3,a4,a5,a6);
                 ob2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        
        //String a3=jCheckBox4.getText();
       //add(a3);
       
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
      //String a4=jCheckBox10.getText();
    //add(a4);
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        // TODO add your handling code here:
      //  String a5=jCheckBox11.getText();
       //add(a5);
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
         // String a11=jCheckBox1.getText();
       //add(a11);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
         // String a12=jCheckBox2.getText();
       //add(a12);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddServices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public static javax.swing.JCheckBox jCheckBox1;
    public static javax.swing.JCheckBox jCheckBox10;
    public static javax.swing.JCheckBox jCheckBox11;
    public static javax.swing.JCheckBox jCheckBox2;
    public static javax.swing.JCheckBox jCheckBox4;
    public static javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
