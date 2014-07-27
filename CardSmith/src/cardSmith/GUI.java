package cardSmith;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 * @desc Gui class
 * @author Robert
 */
public class GUI extends javax.swing.JFrame {

    private CardSmith cs = null;
    DefaultListModel elementList, craft1, craft2, craft3, craft4, craft5, craft6, craft7, craft8, craft9;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        cs = new CardSmith();

        this.elementList = new DefaultListModel();
        this.craft1 = new DefaultListModel();
        this.craft2 = new DefaultListModel();
        this.craft3 = new DefaultListModel();
        this.craft4 = new DefaultListModel();
        this.craft5 = new DefaultListModel();
        this.craft6 = new DefaultListModel();
        this.craft7 = new DefaultListModel();
        this.craft8 = new DefaultListModel();
        this.craft9 = new DefaultListModel();

        this.jListElementTable.setModel(elementList);
        this.jListCraftTable1.setModel(craft1);
        this.jListCraftTable2.setModel(craft2);
        this.jListCraftTable3.setModel(craft3);
        this.jListCraftTable4.setModel(craft4);
        this.jListCraftTable5.setModel(craft5);
        this.jListCraftTable6.setModel(craft6);
        this.jListCraftTable7.setModel(craft7);
        this.jListCraftTable8.setModel(craft8);
        this.jListCraftTable9.setModel(craft9);

        ArrayList<Card> tmp = cs.getCardHolderCards();
        for (Card card : tmp) {
            this.elementList.addElement(card);
        }

        //WindowListener saves Data to .txt files when window is closed
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                cs.save();
                e.getWindow().dispose();
            }
        });

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jListElementTable = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCraftTable1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        toMixTableButton = new javax.swing.JButton();
        fromMixTableButton = new javax.swing.JButton();
        nOETextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListCraftTable2 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListCraftTable3 = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListCraftTable4 = new javax.swing.JList();
        jScrollPane8 = new javax.swing.JScrollPane();
        jListCraftTable7 = new javax.swing.JList();
        jScrollPane9 = new javax.swing.JScrollPane();
        jListCraftTable5 = new javax.swing.JList();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListCraftTable6 = new javax.swing.JList();
        jScrollPane10 = new javax.swing.JScrollPane();
        jListCraftTable8 = new javax.swing.JList();
        jScrollPane11 = new javax.swing.JScrollPane();
        jListCraftTable9 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mTCTextfield = new javax.swing.JTextField();
        forgeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jListElementTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jListElementTable.setToolTipText("");
        jScrollPane1.setViewportView(jListElementTable);

        jListCraftTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jListCraftTable1.setMaximumSize(new java.awt.Dimension(90, 90));
        jListCraftTable1.setMinimumSize(new java.awt.Dimension(90, 90));
        jListCraftTable1.setPreferredSize(new java.awt.Dimension(90, 90));
        jScrollPane2.setViewportView(jListCraftTable1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("CardSmith");

        toMixTableButton.setText(">>");
        toMixTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toMixTableButtonActionPerformed(evt);
            }
        });

        fromMixTableButton.setText("<<");

        nOETextField.setMaximumSize(new java.awt.Dimension(55, 25));
        nOETextField.setMinimumSize(new java.awt.Dimension(55, 25));
        nOETextField.setPreferredSize(new java.awt.Dimension(55, 25));
        nOETextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nOETextFieldActionPerformed(evt);
            }
        });

        jListCraftTable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jListCraftTable2.setMaximumSize(new java.awt.Dimension(90, 90));
        jListCraftTable2.setMinimumSize(new java.awt.Dimension(90, 90));
        jListCraftTable2.setPreferredSize(new java.awt.Dimension(90, 90));
        jScrollPane3.setViewportView(jListCraftTable2);

        jListCraftTable3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jListCraftTable3.setMaximumSize(new java.awt.Dimension(90, 90));
        jListCraftTable3.setMinimumSize(new java.awt.Dimension(90, 90));
        jListCraftTable3.setPreferredSize(new java.awt.Dimension(90, 90));
        jScrollPane5.setViewportView(jListCraftTable3);

        jListCraftTable4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jListCraftTable4.setMaximumSize(new java.awt.Dimension(90, 90));
        jListCraftTable4.setMinimumSize(new java.awt.Dimension(90, 90));
        jListCraftTable4.setPreferredSize(new java.awt.Dimension(90, 90));
        jScrollPane6.setViewportView(jListCraftTable4);

        jListCraftTable7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jListCraftTable7.setMaximumSize(new java.awt.Dimension(90, 90));
        jListCraftTable7.setMinimumSize(new java.awt.Dimension(90, 90));
        jListCraftTable7.setPreferredSize(new java.awt.Dimension(90, 90));
        jScrollPane8.setViewportView(jListCraftTable7);

        jListCraftTable5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jListCraftTable5.setMaximumSize(new java.awt.Dimension(90, 90));
        jListCraftTable5.setMinimumSize(new java.awt.Dimension(90, 90));
        jListCraftTable5.setPreferredSize(new java.awt.Dimension(90, 90));
        jScrollPane9.setViewportView(jListCraftTable5);

        jListCraftTable6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jListCraftTable6.setMaximumSize(new java.awt.Dimension(90, 90));
        jListCraftTable6.setMinimumSize(new java.awt.Dimension(90, 90));
        jListCraftTable6.setPreferredSize(new java.awt.Dimension(90, 90));
        jScrollPane7.setViewportView(jListCraftTable6);

        jListCraftTable8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jListCraftTable8.setMaximumSize(new java.awt.Dimension(90, 90));
        jListCraftTable8.setMinimumSize(new java.awt.Dimension(90, 90));
        jListCraftTable8.setPreferredSize(new java.awt.Dimension(90, 90));
        jScrollPane10.setViewportView(jListCraftTable8);

        jListCraftTable9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane11.setViewportView(jListCraftTable9);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("#Elements");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Move to Cell");

        forgeButton.setText("Forge");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toMixTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fromMixTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nOETextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(mTCTextfield))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(forgeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(toMixTableButton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fromMixTableButton)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(nOETextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(mTCTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forgeButton)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** 
     * @desc moves nOE(number of elements) from Card c to DefaultListModel dl
     * @param dl
     * @param c
     * @param nOE 
     */
    private void moveElement(DefaultListModel dl, Card c, int nOE) {
        if (dl.isEmpty()) {
            dl.addElement(new Card(c.getName(), nOE));
            this.cs.useCard(c, nOE);
        } else if (((Card) dl.firstElement()).getName().equals(c.getName())) {
            ((Card) dl.firstElement()).addMore(nOE);
            this.cs.useCard(c, nOE);
        }
       
    }

    private void toMixTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toMixTableButtonActionPerformed

        // pulls selected Card object from jList
        Card tmpCard = (Card) this.elementList.getElementAt(this.jListElementTable.getSelectedIndex());
        
        // nOE represents how many cards wished to be moved
        int nOE = Integer.parseInt(this.nOETextField.getText());
        
        // checks if enough elements is owned to move them
        boolean isPos = tmpCard.getnOf() >= nOE;

        //if possible 
        if (isPos) {
            //switch over wich jList to move elemnts to
            switch (Integer.parseInt(this.mTCTextfield.getText())) {

                case 1:
                    this.moveElement(craft1, tmpCard, nOE);
                    break;
                case 2:
                    this.moveElement(craft2, tmpCard, nOE);
                    break;
                case 3:
                    this.moveElement(craft3, tmpCard, nOE);
                    break;
                case 4:
                    this.moveElement(craft4, tmpCard, nOE);
                    break;
                case 5:
                    this.moveElement(craft5, tmpCard, nOE);
                    break;
                case 6:
                    this.moveElement(craft6, tmpCard, nOE);
                    break;
                case 7:
                    this.moveElement(craft7, tmpCard, nOE);
                    break;
                case 8:
                    this.moveElement(craft8, tmpCard, nOE);
                    break;
                case 9:
                    this.moveElement(craft9, tmpCard, nOE);
                    break;

            }

            //update jListElementTable
            ArrayList<Card> tmp = cs.getCardHolderCards();
            this.elementList.clear();
            for (Card card : tmp) {
                this.elementList.addElement(card);
            }

        }

    }//GEN-LAST:event_toMixTableButtonActionPerformed

    private void nOETextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nOETextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nOETextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgeButton;
    private javax.swing.JButton fromMixTableButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jListCraftTable1;
    private javax.swing.JList jListCraftTable2;
    private javax.swing.JList jListCraftTable3;
    private javax.swing.JList jListCraftTable4;
    private javax.swing.JList jListCraftTable5;
    private javax.swing.JList jListCraftTable6;
    private javax.swing.JList jListCraftTable7;
    private javax.swing.JList jListCraftTable8;
    private javax.swing.JList jListCraftTable9;
    private javax.swing.JList jListElementTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField mTCTextfield;
    private javax.swing.JTextField nOETextField;
    private javax.swing.JButton toMixTableButton;
    // End of variables declaration//GEN-END:variables
}
