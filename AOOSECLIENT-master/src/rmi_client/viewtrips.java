/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_client;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author hp
 */
public class viewtrips extends javax.swing.JFrame {

    /**
     * Creates new form viewtrips
     */
    public viewtrips() {
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

        selecttripcategorylabel = new javax.swing.JLabel();
        religioustripsbutton = new javax.swing.JButton();
        boattripsbutton = new javax.swing.JButton();
        safaritripbutton = new javax.swing.JButton();
        culturetripsbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        selecttripstextarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selecttripcategorylabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        selecttripcategorylabel.setText("Select trips category to view");

        religioustripsbutton.setText("Religious Trips");

        boattripsbutton.setText("Boat Trips");

        safaritripbutton.setText("Safari Trips");
        safaritripbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                safaritripbuttonActionPerformed(evt);
            }
        });

        culturetripsbutton.setText("Culture Trips");

        selecttripstextarea.setColumns(20);
        selecttripstextarea.setRows(5);
        jScrollPane1.setViewportView(selecttripstextarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selecttripcategorylabel)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(safaritripbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(religioustripsbutton)
                        .addGap(38, 38, 38)
                        .addComponent(boattripsbutton)
                        .addGap(42, 42, 42)
                        .addComponent(culturetripsbutton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selecttripcategorylabel)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(safaritripbutton)
                    .addComponent(religioustripsbutton)
                    .addComponent(boattripsbutton)
                    .addComponent(culturetripsbutton))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void safaritripbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_safaritripbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_safaritripbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public JButton getsafaritripbutton() {
        return safaritripbutton;
    }
    public JButton getreligioustripsbutton() {
        return religioustripsbutton;
    }
     public JButton getboattripsbutton() {
        return boattripsbutton;
    }
    public JButton getculturetripsbutton() {
        return culturetripsbutton;
    }
     public JTextArea getselecttripstextarea() {
        return selecttripstextarea;
    }
  public JLabel getselecttripcategorylabel() {
        return selecttripcategorylabel;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boattripsbutton;
    private javax.swing.JButton culturetripsbutton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton religioustripsbutton;
    private javax.swing.JButton safaritripbutton;
    private javax.swing.JLabel selecttripcategorylabel;
    private javax.swing.JTextArea selecttripstextarea;
    // End of variables declaration//GEN-END:variables
}