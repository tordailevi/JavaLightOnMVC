
package view;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LightOnView extends javax.swing.JFrame {

    public LightOnView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLekapcsLampakSzama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtEredmenyKiiras = new javax.swing.JTextField();
        btnUjJatek = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuMentes = new javax.swing.JMenuItem();
        mnuBetoltes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(255, 204, 0), new java.awt.Color(102, 102, 102), new java.awt.Color(255, 204, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(255, 204, 0), new java.awt.Color(102, 102, 102), new java.awt.Color(255, 204, 0))));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3, 5, 5));

        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jButton1);

        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jButton2);

        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton3.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton3.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jButton3);

        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton4.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton4.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jButton4);

        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton5.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton5.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton5.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jButton5);

        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton6.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton6.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton6.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jButton6);

        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton7.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton7.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton7.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jButton7);

        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton8.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton8.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton8.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jButton8);

        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton9.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton9.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton9.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jButton9);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setText("Lekapcsolt lámpák száma:");

        txtLekapcsLampakSzama.setEditable(false);
        txtLekapcsLampakSzama.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LightOn");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLekapcsLampakSzama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLekapcsLampakSzama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtEredmenyKiiras.setEditable(false);

        btnUjJatek.setText("Új játék");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEredmenyKiiras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUjJatek, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUjJatek, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(txtEredmenyKiiras))
                .addContainerGap())
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jMenu1.setText("Beállítások");

        jMenuItem1.setText("Kilépés");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mnuMentes.setText("Mentés");
        jMenu1.add(mnuMentes);

        mnuBetoltes.setText("Betöltés");
        jMenu1.add(mnuBetoltes);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kilepes();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        kilepes();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void kilepes() throws HeadlessException { 
        String msg = "Biztos kilépsz?"; 
        String cim = "KILÉPÉS"; 
        int msgTip = JOptionPane.QUESTION_MESSAGE; 
        int optTip = JOptionPane.YES_NO_OPTION;
        int gomb = JOptionPane.showConfirmDialog(rootPane, msg, cim, optTip);
        if (gomb == JOptionPane.YES_OPTION) {
            int hibaKod = 0; System.exit(hibaKod); 
        } 
    }

    public JButton[] getGombok() {
        return new JButton[]{jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9}; 
    } 
    
    public JButton getBtnUjJatek() {
        return btnUjJatek; 
    }
    
    public void setTxtEredmenyKiiras(JTextField txtEredmenyKiiras) {
        this.txtEredmenyKiiras = txtEredmenyKiiras; 
    }
    
    public void setTxtLekapcsLampakSzama(JTextField txtLekapcsLampakSzama) {
        this.txtLekapcsLampakSzama = txtLekapcsLampakSzama; 
    }
    
    public JTextField getTxtEredmenyKiiras() {
        return txtEredmenyKiiras; 
    }
    
    public JTextField getTxtLekapcsLampakSzama() {
        return txtLekapcsLampakSzama; 
    }

    public JMenuItem getMnuBetoltes() {
        return mnuBetoltes;
    }

    public JMenuItem getMnuMentes() {
        return mnuMentes;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUjJatek;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem mnuBetoltes;
    private javax.swing.JMenuItem mnuMentes;
    private javax.swing.JTextField txtEredmenyKiiras;
    private javax.swing.JTextField txtLekapcsLampakSzama;
    // End of variables declaration//GEN-END:variables
}
