
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saqib khan
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        Add_Flight = new javax.swing.JButton();
        back_to_login = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        search_flight = new javax.swing.JButton();
        Ticket_Cancel = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Add_Flight.setBackground(new java.awt.Color(0, 0, 0,80));
        Add_Flight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add_Flight.setForeground(new java.awt.Color(255, 255, 255));
        Add_Flight.setText("Admin");
        Add_Flight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 102)));
        Add_Flight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_FlightActionPerformed(evt);
            }
        });
        jPanel2.add(Add_Flight, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 152, 340, 50));

        back_to_login.setBackground(new java.awt.Color(0, 0, 0,80));
        back_to_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_to_login.setForeground(new java.awt.Color(255, 255, 255));
        back_to_login.setText("Back to login page");
        back_to_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_loginActionPerformed(evt);
            }
        });
        jPanel2.add(back_to_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 340, 50));

        jButton5.setBackground(new java.awt.Color(0, 0, 0,80));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Book Ticket");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 340, 50));

        search_flight.setBackground(new java.awt.Color(0, 0, 0,80));
        search_flight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_flight.setForeground(new java.awt.Color(255, 255, 255));
        search_flight.setText("Search Flight Details");
        search_flight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_flightActionPerformed(evt);
            }
        });
        jPanel2.add(search_flight, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 340, 50));

        Ticket_Cancel.setBackground(new java.awt.Color(0, 0, 0,80));
        Ticket_Cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ticket_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Ticket_Cancel.setText("Ticket Cancel");
        Ticket_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ticket_CancelActionPerformed(evt);
            }
        });
        jPanel2.add(Ticket_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 340, 50));

        exit.setBackground(new java.awt.Color(0, 0, 0,80));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 340, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Click given below button where you want to go");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/12.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 407, 140, 510));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 770));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Airline ticket booking system");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, 39));
        kGradientPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));
        kGradientPanel1.add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/47.png"))); // NOI18N
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 0, 1920, 950));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","EXIT",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void Ticket_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ticket_CancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Cancel_Flight_Ticket ob=new Cancel_Flight_Ticket();
        ob.setVisible(true);
    }//GEN-LAST:event_Ticket_CancelActionPerformed

    private void search_flightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_flightActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Search_Flight_Details ob=new Search_Flight_Details();
        ob.setVisible(true);
    }//GEN-LAST:event_search_flightActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Search_Flight_Details ob=new Search_Flight_Details();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void back_to_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_loginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login ob=new Login();
        ob.setVisible(true);
    }//GEN-LAST:event_back_to_loginActionPerformed

    private void Add_FlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_FlightActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Add_Flight_Details ob=new Add_Flight_Details();
        ob.setVisible(true);
    }//GEN-LAST:event_Add_FlightActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Flight;
    private javax.swing.JButton Ticket_Cancel;
    private javax.swing.JButton back_to_login;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton search_flight;
    // End of variables declaration//GEN-END:variables
}
