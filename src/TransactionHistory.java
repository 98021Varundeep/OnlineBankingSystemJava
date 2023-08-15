/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;
  import java.sql.ResultSet;
  import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author varun
 */
public class TransactionHistory extends javax.swing.JFrame {

     public   DefaultTableModel df;
    private javax.swing.JTable jtab;
      String AccNo;
    /**
     * Creates new form TransactionHistory
     */
    public TransactionHistory() {
        this("12341234");
       getContentPane().setBackground(Color.WHITE);
        initComponents();
    }
  
     public TransactionHistory(String AccountNo){
          
         //transactionTable.setEditable(false);
         initComponents();
         setTitle("Passbook");
         AccNo=AccountNo;
              
         String query="select * from passbook where toAccount="+"'"+AccNo+"'"+"or fromAccount='"+AccNo+"' ;";
         MakeConnection conn=new MakeConnection(query,1);
          try {
              ResultSet  rs= conn.s.executeQuery(query);
              rs.last();
              String data[][] =null;
              //give dimensions to data 
             DefaultTableModel df1= (DefaultTableModel) transactionTable.getModel();  
               
             
              ResultSetMetaData rm=rs.getMetaData();
              int colCount=rm.getColumnCount();
              data=new String[rs.getRow()+1][colCount];

              ResultSet rs1=conn.s.executeQuery(query);              
              int i=0;
               while(rs1.next()){
                   
                      for(int j=1;j<=colCount;++j){
                          data[i][j-1]=rs1.getString(j);
                          
                      }
                  i++;
               df1.addRow(data[i]);
               }
              String headers[]={"Date","Time","Amount","fromAccount ","ToAccount","tType"};
            // transactionTable.setModel(data,headers);
          //          
// transactionTable.setModel(data,headers); 
          //  jTab=new JTable(data,column);
//            jtab.setBounds(30,40,200,300);
    //       /
//df.addRow(data);
         df=new DefaultTableModel(data,headers);    
        transactionTable.setModel(df);
        
          }
              
             
           catch (SQLException ex) {
              Logger.getLogger(TransactionHistory.class.getName()).log(Level.SEVERE, null, ex);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("               Passbook");

        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "FromAccount", "ToAccount", "Amount", "TransactionType"
            }
        ));
        jScrollPane2.setViewportView(transactionTable);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go-back-arrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     dispose();
   new SelectOption().setVisible(true);
  
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(TransactionHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable transactionTable;
    // End of variables declaration//GEN-END:variables
}