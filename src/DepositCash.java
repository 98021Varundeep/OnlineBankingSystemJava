/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author varun
 */
   import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
   import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class DepositCash extends javax.swing.JFrame {
   String AccNo;
    /**
     * Creates new form DepositCash
     */
    public DepositCash() {
        initComponents();
    }
     public DepositCash(String Accno){
       initComponents();
      setTitle("Deposit Cash");
         AccNo=Accno;
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
        jLabel2 = new javax.swing.JLabel();
        EDepositMoney = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Enter Amount ");

        EDepositMoney.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 111, 201), 3, true));
        EDepositMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDepositMoneyActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Deposit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel3.setText(" Deposit Money");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("   Rs:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EDepositMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EDepositMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
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
                        .addGap(14, 14, 14)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EDepositMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDepositMoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EDepositMoneyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

          if("".equals(EDepositMoney.getText()) ||Float.parseFloat(EDepositMoney.getText() )<0 )
          {
//           JOptionPane.showMessageDialog(null, "Wrong Input",JOptionPane.ERROR_MESSAGE); 
           if("".equals(EDepositMoney.getText()))
              JOptionPane.showMessageDialog(null,"Kindly Enter Amount ","Alert",JOptionPane.WARNING_MESSAGE);     
           else 
                             JOptionPane.showMessageDialog(null,"Can not enter Negative Value","Alert",JOptionPane.WARNING_MESSAGE);    
              return ;
          }
                  try{
        
        
         String query="select balance from userdetail where AccNo =?";
                 
         
         float balance = 0 ;
         
         MakeConnection conn= new MakeConnection(query);
         conn.ps.setString(1,AccNo); 
         
         ResultSet rs=(ResultSet) conn.ps.executeQuery();
         
         if(rs.next()){
             balance =rs.getFloat(1);
         
          
         System.out.println("Balance is before transaction"+balance);
         
         float amount=balance+Float.parseFloat(EDepositMoney.getText());
         String query1="update userdetail set balance ="+amount+ "where AccNo='"+AccNo+"';";
         conn.ps.close();
         conn.s.executeUpdate(query1);
         
         System.out.println("Balance is after transaction"+amount);
         ImageIcon ic= new ImageIcon("C:\\Users\\varun\\Downloads\\like.png");
        ImageIcon ic1= new ImageIcon("C:\\Users\\varun\\Downloads\\networking.png");
        
         JOptionPane.showMessageDialog(null,"Transaction Success.","Status",JOptionPane.WARNING_MESSAGE,ic);     
 
           JOptionPane.showMessageDialog(null,"Current Balance is-RS: "+amount,"Balance",JOptionPane.WARNING_MESSAGE,ic1);     

                        String query111="insert into passbook values (?,?,?,?,?,?)";
                
            
                     long millis=System.currentTimeMillis();
              java.sql.Date date=new java.sql.Date(millis);    
             // System.out.println(date);
                

            long time = date.getTime();  
            
           
           // Time 
            java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(time);
            
                 MakeConnection conn3 =new MakeConnection(query111);
                  
                 conn3.ps.setDate(1, date);
                 conn3.ps.setString(2, currentTimestamp.toString());
                 //conn.ps.(2, currentTimesta`mp);
                 conn3.ps.setDouble(3, amount);
                 conn3.ps.setString(4,AccNo);
                 conn3.ps.setString(5, AccNo);
                 conn3.ps.setString(6,"Credit");
                 
                 int v=conn3.ps.executeUpdate();
                 
                // if(v>0){
                  //            JOptionPane.showMessageDialog(null," Transaction Updated in Passbook","Success",JOptionPane.WARNING_MESSAGE);     
              
             //    }
               //  else {
                 //       JOptionPane.showMessageDialog(null," Transaction  not updated in Passbook","Success",JOptionPane.WARNING_MESSAGE);     
                     
                 //}
           
//           java.sql.Date date = new java.sql.Date(javaDate.getTime());
                  }
                  else {
                                        JOptionPane.showMessageDialog(null,"Error ","Alert",JOptionPane.WARNING_MESSAGE);    
        // conn.close();
    }  
    }catch (SQLException ex) {
           Logger.getLogger(DepositCash.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
  dispose();
   new SelectOption().setVisible(true);
  
        //dispose();
   //new Login().setVisible(true);
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
            java.util.logging.Logger.getLogger(DepositCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              DepositCash ds=  new DepositCash();
                      ds.setVisible(true);
       //      ds.getContentPane().setBackground(new java.awt.Color(141,153,8));
     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EDepositMoney;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
