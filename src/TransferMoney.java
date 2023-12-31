
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author varun
 */
public class TransferMoney extends javax.swing.JFrame {
   String AccNo;
     boolean selfTransfer =false;
   /**
     * Creates new form TransferMoney
     */
    public TransferMoney() {
        this("12341234");
    
        initComponents();
       }

      public TransferMoney(String AccountNo){
        
          initComponents();
          getContentPane().setBackground(Color.WHITE);
          
          setTitle("Transfer Money");
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
        jLabel4 = new javax.swing.JLabel();
        InputAmount = new javax.swing.JTextField();
        AccountNo = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        jLabel1.setText("             Transfer Money");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Account No");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Account Type");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Amount ");

        InputAmount.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        InputAmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 111, 201), 2, true));
        InputAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputAmountActionPerformed(evt);
            }
        });

        AccountNo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AccountNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 111, 201), 2, true));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Current", "Saving", "Salary Account", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Transfer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addGap(275, 275, 275)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(InputAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
                                .addComponent(AccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(313, 313, 313))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(600, 600, 600))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(508, 508, 508)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton2)
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(AccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(InputAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(jButton1)
                .addGap(275, 275, 275))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void InputAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputAmountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        
                 ImageIcon ic= new ImageIcon("C:\\Users\\varun\\Downloads\\like.png");

        String toTransferAccno=AccountNo.getText();
   System.out.println(toTransferAccno);
     String tempAmount=InputAmount.getText();
      System.out.println(tempAmount);    
      System.out.println("Hi");    
      System.out.println("Hi");    
     
      float amount=Float.parseFloat(tempAmount);
    float balance=0; 
     System.out.println(amount);
    float mybalance=0; 
    float userBalance=0;
    String query="select * from userdetail where AccNo=?";
     MakeConnection conn2=new MakeConnection(query);
          
        try {
            conn2.ps.setString(1, AccNo);
       
            ResultSet rs=conn2.ps.executeQuery();
       if(rs.next()){
              mybalance=rs.getFloat("balance");
        System.out.println("Login User  balance is"+ mybalance);
         if(mybalance<amount)
         {
              JOptionPane.showMessageDialog(null,"Not Sufficient Balance ","Alert",JOptionPane.WARNING_MESSAGE);     
              conn2.ps.close();
                  return ;
      
         }
         else{
             //String queryy="select * from userdetail where AccNo"
            // conn2.ps.
         
            
      //      conn.s.ps.

          //if Sufficient Balance exists  
        conn2.ps.setString(1,toTransferAccno);
         ResultSet rs2=conn2.ps.executeQuery();
            System.out.println("got data  of Receiver Account");        
         if(rs2.next()){
             userBalance=rs2.getFloat("balance");
             System.out.println("Balance of receiver before"+userBalance);
             userBalance=amount+userBalance;
             String query1="update userdetail set balance ="+userBalance+" where AccNo='"+toTransferAccno+"';"; 
             
                System.out.println("At line 242");
               conn2.ps.close();  
             System.out.println("Balance of receiver After"+userBalance);
               
               
             conn2.s.executeUpdate(query1);
                System.out.println("Able to update data of receiver");
             if(AccNo == null ? toTransferAccno == null : AccNo.equals(toTransferAccno))
             {
                 mybalance=mybalance+amount;
             }
                 else 
             {
             mybalance=mybalance-amount;
             String query2="update userdetail set balance ="+mybalance+" where AccNo='"+AccNo+"';";
            
                System.out.println("At line 249");
            
             conn2.s.executeUpdate(query2);
             }
             System.out.println("Balance of sender After");
              System.out.println("Login user balance is "+mybalance);
             
             System.out.println("Able to save data of sender");
             JOptionPane.showMessageDialog(null,"Transaction Successful","Transaction Status", JOptionPane.WARNING_MESSAGE,ic);
    
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
                 conn.ps.setString(5,toTransferAccno);
                 
                 if(AccNo.equals(toTransferAccno))
                 {
                     selfTransfer=true;
                     conn.ps.setString(6,"SelfTransfer");
                 
                 }
                  
                 
                 
                //if(selfTransfer==false){   
                 else  
                conn.ps.setString(6,"Debit");
                
                  int v=conn.ps.executeUpdate();
                
// int p=conn.ps.executeUpdate();
                 
   //              if(p>0){
     //                         JOptionPane.showMessageDialog(null," Transaction Updated in Passbook","Success",JOptionPane.WARNING_MESSAGE);     
              
       //          }
         //        else {
           //             JOptionPane.showMessageDialog(null," Transaction  not updated in Passbook","Success",JOptionPane.WARNING_MESSAGE);     
                     
             //    }                   
                }
             
             
             
             
         }
         
         
          }
       
        }
        //catch()
        catch (SQLException ex) {
            Logger.getLogger(TransferMoney.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception e){
            System.out.println("Exception Occurs"+e.getMessage());
        }
       
       
       
     
      
    
      //int a= conn2.s.executeUpdate(query1);
     //  conn.close();

  //    JOptionPane.showMessageDialog(null,"Transaction Success ","Status",JOptionPane.WARNING_MESSAGE);     

     
   
        
       
       
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
   dispose();
   new SelectOption().setVisible(true);
  
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
            java.util.logging.Logger.getLogger(TransferMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               TransferMoney tm= new TransferMoney();
                 tm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountNo;
    private javax.swing.JTextField InputAmount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
