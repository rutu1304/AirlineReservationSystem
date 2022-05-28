
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saqib khan
 */
public class Cancel_Flight_Ticket extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form Cancel_Flight_Ticket
     */
    public Cancel_Flight_Ticket() {
        initComponents();
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        conn=javaconnect.ConnectDb();
    }
    
    public void Delete(){
        String sql="delete from book_ticket where Ticket_No=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, tno.getText());
            pst.execute();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
            
    }
    public void Cancel_Ticket(){
        DateFormat da=new SimpleDateFormat("yyy-MM-dd");
        String date=da.format(cdate.getDate());
        DateFormat daa=new SimpleDateFormat("yyy-MM-dd");
        String date1=daa.format(cdate1.getDate());
        String sql="insert into cancel_ticket(Ticket_No,Flight_Id,Flight_Name,Source,Destination,Booking_Date,Arrival_Time,Departure_Time,Price,Seats,C_Name,Return_Date)values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, tno.getText());
            pst.setString(2, fid.getText());
            pst.setString(3, fname.getText());
            pst.setString(4, source.getText());
            pst.setString(5, dest.getText());
            pst.setString(6,date);
            pst.setString(7, arrival.getText());
            pst.setString(8, dept.getText());
            pst.setString(9, price.getText());
            pst.setString(10, seat.getText());
            pst.setString(11, cname.getText());
            pst.setString(12,date1);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Ticket Cancel");
            
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cdate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        dest = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        source = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        arrival = new javax.swing.JTextField();
        cdate1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        cname = new java.awt.TextArea();
        jLabel10 = new javax.swing.JLabel();
        seat = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dept = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        home.setBackground(new java.awt.Color(0, 0, 0));
        home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(0, 0, 0));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(0, 0, 0));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Ticket Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancel)
                .addGap(38, 38, 38)
                .addComponent(home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(Exit)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cancel Flight Ticket");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 260, 37));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Booking Date:");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 109, 37));

        cdate.setBackground(new java.awt.Color(0, 0, 0,80));
        cdate.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(cdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 200, 34));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Destination:");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 109, 34));

        dest.setBackground(new java.awt.Color(0, 0, 0,80));
        dest.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(dest, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 200, 34));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Source:");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 109, 34));

        source.setBackground(new java.awt.Color(0, 0, 0,80));
        source.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(source, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 200, 34));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Flight Name:");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 109, 34));

        fname.setBackground(new java.awt.Color(0, 0, 0,80));
        fname.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 200, 34));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Flight Id:");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 109, 34));

        fid.setBackground(new java.awt.Color(0, 0, 0,80));
        fid.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 200, 34));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ticket No:");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 109, 34));

        tno.setBackground(new java.awt.Color(0, 0, 0,80));
        tno.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(tno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 200, 34));

        arrival.setBackground(new java.awt.Color(0, 0, 0,80));
        arrival.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 200, 34));

        cdate1.setBackground(new java.awt.Color(0, 0, 0,80));
        cdate1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(cdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, 200, 34));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cancel date:");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 124, 34));

        cname.setBackground(new java.awt.Color(0, 0, 0,80));
        cname.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, 200, 37));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Customer Name:");
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 124, 34));

        seat.setBackground(new java.awt.Color(0, 0, 0,80));
        seat.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 200, 34));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Seats:");
        kGradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 124, 34));

        price.setBackground(new java.awt.Color(0, 0, 0,80));
        price.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 200, 34));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Price:");
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 124, 34));

        dept.setBackground(new java.awt.Color(0, 0, 0,80));
        dept.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 200, 34));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Departure Time:");
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 124, 34));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Arrival Time:");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 124, 34));

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        kGradientPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, 34));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 940));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        
        String sql="select * from book_ticket where Ticket_No=? ";
       try{
           pst=conn.prepareStatement(sql);
           pst.setString(1, tno.getText());
           rs=pst.executeQuery();
           if(rs.next()){
               String add1=rs.getString("Flight_Id");
               fid.setText(add1);
               String add2=rs.getString("Flight_Name");
               fname.setText(add2);
               String add3=rs.getString("Source");
               source.setText(add3);
               String add4=rs.getString("Destination");
               dest.setText(add4);
               String DATE=rs.getString("Date");
               java.util.Date date=new SimpleDateFormat("yyyy-MM-dd").parse(DATE);
               cdate.setDate(date);
               String add6=rs.getString("Arrival_Time");
               arrival.setText(add6);
               String add7=rs.getString("Departure_Time");
               dept.setText(add7);
               String add8=rs.getString("Total_Price");
               price.setText(add8);
               String add9=rs.getString("Seats");
               seat.setText(add9);
               String add10=rs.getString("C_Name");
               cname.setText(add10);
               
           }
            else{
                JOptionPane.showMessageDialog(null, "This id not registered");

            }
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_searchActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        Delete();
        Cancel_Ticket();
        
    }//GEN-LAST:event_cancelActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
       setVisible(false);
       Home ob=new Home();
       ob.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","EXIT",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Cancel_Flight_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cancel_Flight_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cancel_Flight_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cancel_Flight_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancel_Flight_Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JTextField arrival;
    private javax.swing.JButton cancel;
    private com.toedter.calendar.JDateChooser cdate;
    private com.toedter.calendar.JDateChooser cdate1;
    private java.awt.TextArea cname;
    private javax.swing.JTextField dept;
    private javax.swing.JTextField dest;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fname;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField price;
    private javax.swing.JButton search;
    private javax.swing.JTextField seat;
    private javax.swing.JTextField source;
    private javax.swing.JTextField tno;
    // End of variables declaration//GEN-END:variables
}
