/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_client;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class managetrip extends javax.swing.JFrame {

    /**
     * Creates new form posttrip
     */
    public managetrip() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel1Posttrip = new javax.swing.JLabel();
        jTextField1POSTTRIPcate = new javax.swing.JTextField();
        jTextField2POSTTRIPloc = new javax.swing.JTextField();
        jTextField3POSTTRIPprice = new javax.swing.JTextField();
        jTextField4POSTTRIPReservno = new javax.swing.JTextField();
        jLabel1POSTTRIP = new javax.swing.JLabel();
        jLabel2POSTTRIP = new javax.swing.JLabel();
        jLabel4POSTTRIP = new javax.swing.JLabel();
        jLabel3POSTTRIP = new javax.swing.JLabel();
        jButton1OISTTRIPsubmit = new javax.swing.JButton();
        jLabel1POSTTRIPLABELSUCESS = new javax.swing.JLabel();
        jTextField1POSTTRIPID = new javax.swing.JTextField();
        jLabel1POSTTRIPID = new javax.swing.JLabel();
        jButton1EDITTRIPBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlabel1Posttrip.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlabel1Posttrip.setText("Trips Manager");

        jTextField1POSTTRIPcate.setText("Enter category");

        jTextField2POSTTRIPloc.setText("Enter location");

        jTextField3POSTTRIPprice.setText("Enter price");

        jTextField4POSTTRIPReservno.setText("Number of people can make reservation");

        jLabel1POSTTRIP.setText("Category");

        jLabel2POSTTRIP.setText("Location");

        jLabel4POSTTRIP.setText("Reservation number");

        jLabel3POSTTRIP.setText("Price");

        jButton1OISTTRIPsubmit.setText("Submit");
        jButton1OISTTRIPsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1OISTTRIPsubmitActionPerformed(evt);
            }
        });

        jTextField1POSTTRIPID.setText("Enter ID");
        jTextField1POSTTRIPID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1POSTTRIPIDActionPerformed(evt);
            }
        });

        jLabel1POSTTRIPID.setText("ID");

        jButton1EDITTRIPBTN.setText("Edite");
        jButton1EDITTRIPBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1EDITTRIPBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4POSTTRIP)
                    .addComponent(jLabel3POSTTRIP)
                    .addComponent(jLabel2POSTTRIP)
                    .addComponent(jLabel1POSTTRIP)
                    .addComponent(jLabel1POSTTRIPID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField2POSTTRIPloc)
                    .addComponent(jTextField3POSTTRIPprice)
                    .addComponent(jTextField4POSTTRIPReservno)
                    .addComponent(jTextField1POSTTRIPcate)
                    .addComponent(jTextField1POSTTRIPID, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel1Posttrip)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1OISTTRIPsubmit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1EDITTRIPBTN))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1POSTTRIPLABELSUCESS, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel1Posttrip)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1POSTTRIPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1POSTTRIPID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1POSTTRIPcate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1POSTTRIP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2POSTTRIPloc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2POSTTRIP))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3POSTTRIPprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3POSTTRIP))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4POSTTRIPReservno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4POSTTRIP))
                .addGap(45, 45, 45)
                .addComponent(jLabel1POSTTRIPLABELSUCESS, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1OISTTRIPsubmit)
                    .addComponent(jButton1EDITTRIPBTN))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1OISTTRIPsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1OISTTRIPsubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1OISTTRIPsubmitActionPerformed

    private void jTextField1POSTTRIPIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1POSTTRIPIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1POSTTRIPIDActionPerformed

    private void jButton1EDITTRIPBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1EDITTRIPBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1EDITTRIPBTNActionPerformed

    public JTextField getjTextField1POSTTRIPID() {
        return jTextField1POSTTRIPID;
    }
     public JTextField getjTextField1POSTTRIPcate() {
        return jTextField1POSTTRIPcate;
    }
 public JTextField getjTextField2POSTTRIPloc() {
        return jTextField2POSTTRIPloc;
    }
  public JTextField getjTextField3POSTTRIPprice() {
        return jTextField3POSTTRIPprice;
    }
   public JTextField getjTextField4POSTTRIPReservno() {
        return jTextField4POSTTRIPReservno;
    }
   public JButton getjButton1OISTTRIPsubmit() {
        return jButton1OISTTRIPsubmit;
    }
   
   public JButton getjButton1EDITTRIPBTN() {
        return jButton1EDITTRIPBTN;
    }
   public JLabel getjLabel1POSTTRIPLABELSUCESS(){
   
       return jLabel1POSTTRIPLABELSUCESS;
   
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1EDITTRIPBTN;
    private javax.swing.JButton jButton1OISTTRIPsubmit;
    private javax.swing.JLabel jLabel1POSTTRIP;
    private javax.swing.JLabel jLabel1POSTTRIPID;
    private javax.swing.JLabel jLabel1POSTTRIPLABELSUCESS;
    private javax.swing.JLabel jLabel2POSTTRIP;
    private javax.swing.JLabel jLabel3POSTTRIP;
    private javax.swing.JLabel jLabel4POSTTRIP;
    private javax.swing.JTextField jTextField1POSTTRIPID;
    private javax.swing.JTextField jTextField1POSTTRIPcate;
    private javax.swing.JTextField jTextField2POSTTRIPloc;
    private javax.swing.JTextField jTextField3POSTTRIPprice;
    private javax.swing.JTextField jTextField4POSTTRIPReservno;
    private javax.swing.JLabel jlabel1Posttrip;
    // End of variables declaration//GEN-END:variables
}
