
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author varun
 */
public class WithdrawCash extends javax.swing.JFrame {
 
     String AccNo;
     double amount;
    /**
     * Creates new form WithdrawCash
     */
    public WithdrawCash() {
        initComponents();
    }
   
     public WithdrawCash(String AccountNo){
        initComponents();
        setTitle("Withdraw Cash");     
         AccNo=AccountNo;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jamount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jLabel1.setText("Cash Withdrawl");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Enter Amount");

        jamount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 111, 201), 2, true));
        jamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jamountActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Withdraw");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jamount, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(359, 359, 359))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(380, 380, 380))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jamount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(124, 124, 124))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go-back-arrow.png"))); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jButton2)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamountActionPerformed
   
        // TODO add your handling code here:
    }//GEN-LAST:event_jamountActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//  

 dispose();
   new SelectOption().setVisible(true);
  
//dispose();
  //
  //new Login().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
         String  samount= jamount.getText();
         
         amount=Float.parseFloat(samount);
          String query= "select balance from userdetail where AccNo=?";
          
       MakeConnection mc =new MakeConnection (query);
         try {
             mc.ps.setString(1, AccNo);
         } catch (SQLException ex) {
             Logger.getLogger(WithdrawCash.class.getName()).log(Level.SEVERE, null, ex);
         }
       
         try {
             ResultSet rs=mc.ps.executeQuery();
             
             if(rs.next())
             {   
             double balance =rs.getDouble(1);
             
             balance =balance-amount;
             if(balance <0){
                              JOptionPane.showMessageDialog(null,"Not Sufficient Balance ","Alert",JOptionPane.WARNING_MESSAGE);     
                      return ;
             }
             else {
                 String query1="update userdetail set balance ="+ balance+"where AccNo= '"+AccNo+"';";
                  
                 int a=mc.s.executeUpdate(query1);
                 if(a>0){
                  
                 String query2="select balance from userdetail where AccNo= '"+AccNo+"'";
                 
                 ResultSet rs2= mc.s.executeQuery(query2);
                      if(rs2.next())
                      {    
                 double bal =rs2.getDouble(1);
                 
                              JOptionPane.showMessageDialog(null,"New Balance = "+bal,"Success",JOptionPane.WARNING_MESSAGE);
                 }
                // mc.close();
                String query111="insert into passbook values (?,?,?,?,?,?)";
                
            
                     long millis=System.currentTimeMillis();
              java.sql.Date date=new java.sql.Date(millis);    
             // System.out.println(date);
                

            long time = date.getTime();  
            
           
           // Time 
            java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(time);
            
                 MakeConnection conn =new MakeConnection(query111);
                  
                 conn.ps.setDate(1, date);
                 conn.ps.setString(2, currentTimestamp.toString());
                 //conn.ps.(2, currentTimesta`mp);
                 conn.ps.setDouble(3, amount);
                 conn.ps.setString(4,AccNo);
                 conn.ps.setString(5, AccNo);
                 conn.ps.setString(6,"Debit");
                 
                 int v=conn.ps.executeUpdate();
                 
                 //if(v>0){
                   //           JOptionPane.showMessageDialog(null," Transaction Updated in Passbook","Success",JOptionPane.WARNING_MESSAGE);     
              
                 //}
                 //else {
                   //     JOptionPane.showMessageDialog(null," Transaction  not updated in Passbook","Success",JOptionPane.WARNING_MESSAGE);     
                     
                 //}
               // System.out.println(currentTimestamp);
                 //java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(time);
               // String query111=INSERT INTO passbook  VALUES (CURDATE(), CURTIME(), 100.50);

                 
                 
                 }
                 else {
                              JOptionPane.showMessageDialog(null," Some Technical Errr","Error",JOptionPane.WARNING_MESSAGE);     
     
             } 
                 
                     
                     
                 }
                 
             
             }
             else {
                          JOptionPane.showMessageDialog(null," ","Some Technical Error",JOptionPane.WARNING_MESSAGE);     
                               
             }
// TODO add your handling code here:
         } catch (SQLException ex) {
             Logger.getLogger(WithdrawCash.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(WithdrawCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithdrawCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithdrawCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithdrawCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                WithdrawCash wc=new WithdrawCash();
                        wc.setVisible(true);
                        wc.getContentPane().setBackground(new java.awt.Color(241, 237, 230));
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jamount;
    // End of variables declaration//GEN-END:variables
}
