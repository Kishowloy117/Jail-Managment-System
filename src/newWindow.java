
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class newWindow extends javax.swing.JFrame {
    
     Connection con = null;
     PreparedStatement pst = null;
     int id1 , deleteitem;

    /**
     * Creates new form newWindow
     */
      String st;
     public newWindow(String str) {
        
        st = str;
        initComponents();
        search_date.setVisible(false);
        srcbtn.setVisible(false);
        this.getContentPane().setBackground(new Color(44,62,80));
        try{
             
          con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=jailManagement" , "sa", "123456");
          
         // int row = jTable1.getSelectedRow();
         // String val =jTable1.getModel().getValueAt(row, 0).toString();   
   
            
          String query = "Select * from officer where officerId="+st;
          
          //String query = "Select officerId , fname ,lname , password , age , title , phoneNo,noOfPrisoners,dutyShift , dutyBuilding from officer ";
            
          
          pst = con.prepareStatement(query);
          
          ResultSet rs = pst.executeQuery();

          while(rs.next()){
             String officerId = rs.getString("officerId") ; 
             String fname = rs.getString("fname") ; 
             String lname = rs.getString("lname") ; 
             //String password = rs.getString("password") ;
            
             Name.setText(fname+lname);
             id.setText(officerId);
             
             

             
             
          }
          
         
        }
        catch(Exception ex){
          JOptionPane.showMessageDialog(null , ex);
        }
        
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }
      public newWindow() {
        
       
        initComponents();
         search_date.setVisible(false);
         srcbtn.setVisible(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
         this.getContentPane().setBackground(new Color(44,62,80));
      //  updateDb();
        
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backLogin = new javax.swing.JButton();
        add_p = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        result_table = new javax.swing.JTable();
        Name = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        search_date = new com.toedter.calendar.JDateChooser();
        option = new javax.swing.JComboBox<>();
        srcbtn = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        backLogin.setBackground(new java.awt.Color(153, 255, 204));
        backLogin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backLogin.setForeground(new java.awt.Color(44, 62, 80));
        backLogin.setText("BACK TO LOGIN");
        backLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backLoginActionPerformed(evt);
            }
        });

        add_p.setBackground(new java.awt.Color(153, 255, 204));
        add_p.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        add_p.setForeground(new java.awt.Color(44, 62, 80));
        add_p.setText("ADD PRISONER");
        add_p.setActionCommand("");
        add_p.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_pActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jScrollPane2.setForeground(new java.awt.Color(44, 62, 80));
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        result_table.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        result_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Id"
            }
        ));
        result_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                result_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(result_table);

        Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));

        Name1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Name1.setForeground(new java.awt.Color(255, 255, 255));
        Name1.setText("NAME:");

        id2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        id2.setForeground(new java.awt.Color(255, 255, 255));
        id2.setText("ID:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profileicon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search-iconhrje.jpg"))); // NOI18N
        jLabel1.setText("SEARCH");

        search_date.setForeground(new java.awt.Color(44, 62, 80));
        search_date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        option.setBackground(new java.awt.Color(153, 255, 204));
        option.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        option.setForeground(new java.awt.Color(44, 62, 80));
        option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Name or id", "Search by Date" }));
        option.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        option.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                optionItemStateChanged(evt);
            }
        });

        srcbtn.setBackground(new java.awt.Color(153, 255, 204));
        srcbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        srcbtn.setForeground(new java.awt.Color(44, 62, 80));
        srcbtn.setText("SEARCH");
        srcbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        srcbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcbtnActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 255, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton9.setForeground(new java.awt.Color(44, 62, 80));
        jButton9.setText("INFO");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(add_p, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(backLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(107, 107, 107)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search_date, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srcbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search_date, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(option, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(srcbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(backLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backLoginActionPerformed
        // TODO add your handling code here:
        
       login sf = new  login() ;
       sf.setVisible(true) ;
       this.dispose();
    }//GEN-LAST:event_backLoginActionPerformed

    private void add_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_pActionPerformed
        // TODO add your handling code here:
        
        prisoners_create p= new prisoners_create(st);
        p.setVisible(true);
        
        
    }//GEN-LAST:event_add_pActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void result_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_result_tableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel RecordTable = (DefaultTableModel)result_table.getModel();
        int SelectedRows = result_table.getSelectedRow();

        {

            String id= (RecordTable.getValueAt(SelectedRows, 2).toString());

            try{

                prisonerDetails p= new prisonerDetails(id);
                p.setVisible(true);

            }
            catch(Exception ex)
            {

            }
        }

        //System.out.print(evt.getClickCount());

    }//GEN-LAST:event_result_tableMouseClicked

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        
    }//GEN-LAST:event_searchKeyPressed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
         String sp=search.getText();
        try {
             // TODO add your handling code here:
            
             con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=jailManagement" , "sa", "123456");
             
            String sql = "select pFname as First_Name ,pLname as Last_Name ,pId as ID from prisoners where pId like '"+sp+"%' or pFname like '"+sp+"%'  or pLname like '"+sp+"%'";       
       
            pst = con.prepareStatement(sql);
          
            ResultSet rs = pst.executeQuery();
            
            result_table.setModel(DbUtils.resultSetToTableModel(rs));
         } catch (SQLException ex) {
             Logger.getLogger(newWindow.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  //      try{
             
//          con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=jailManagement" , "sa", "123456");
//          
//         // int row = jTable1.getSelectedRow();
//         // String val =jTable1.getModel().getValueAt(row, 0).toString();   
//   
//            
//          String query = "Select * from officer where officerId="+st;
//          
//          //String query = "Select officerId , fname ,lname , password , age , title , phoneNo,noOfPrisoners,dutyShift , dutyBuilding from officer ";
//            
//          
//          pst = con.prepareStatement(query);
//          
//          ResultSet rs = pst.executeQuery();
//
//          while(rs.next()){
//             String officerId = rs.getString("officerId") ; 
//             String fname = rs.getString("fname") ; 
//             String lname = rs.getString("lname") ; 
//             //String password = rs.getString("password") ;
//            
//             String age = rs.getString("age") ; 
//             String title = rs.getString("title") ;
//             String phoneNo = rs.getString("phoneNo") ;
//             String noOfPrisoners= rs.getString("noOfPrisoners") ;
//             String dutyShift = rs.getString("dutyShift");
//             String dutyBuilding = rs.getString("dutyBuilding");
//             
//             
//              JOptionPane.showMessageDialog(null, "ID:"+officerId+"\n"+"Name:"+fname+" "+lname+"\n"+"age: "+age+"\n"+"Phone no :"+phoneNo+"\n"+"shift: "+dutyShift+"\n"+"Duty Bilding: "+dutyBuilding);
//             
//             //DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
//             
//             
//             
//             
//          }
//          
//         
//        }
//        catch(Exception ex){
//          JOptionPane.showMessageDialog(null , ex);
//        }
        officerprofile op= new officerprofile(st);
        op.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void optionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optionItemStateChanged
        // TODO add your handling code here:
        if(option.getSelectedIndex()==0)
        {
            search.setVisible(true);
            search_date.setVisible(false);
            srcbtn.setVisible(false);
        }
        else
        {
            search.setVisible(false);
            search_date.setVisible(true);
            srcbtn.setVisible(true);
        }
        
    }//GEN-LAST:event_optionItemStateChanged

    private void srcbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcbtnActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
            
             con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=jailManagement" , "sa", "123456");
             SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy/MM/dd");
            String strDate1 = dateFormat.format(search_date.getDate());
             
            String sql = "select pFname as First_Name ,pLname as Last_Name ,pId as ID from prisoners where dateofIn='"+strDate1+"'";       
       
            pst = con.prepareStatement(sql);
          
            ResultSet rs = pst.executeQuery();
            
            result_table.setModel(DbUtils.resultSetToTableModel(rs));
         } catch (SQLException ex) {
             Logger.getLogger(newWindow.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_srcbtnActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        INFO in =new INFO();
        in.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(newWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JButton add_p;
    private javax.swing.JButton backLogin;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> option;
    private javax.swing.JTable result_table;
    private javax.swing.JTextField search;
    private com.toedter.calendar.JDateChooser search_date;
    private javax.swing.JButton srcbtn;
    // End of variables declaration//GEN-END:variables

    private void updateDb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
