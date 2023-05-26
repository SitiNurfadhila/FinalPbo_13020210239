package View;

import Controller.ControllerZakatFitrah;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FormZakat extends javax.swing.JFrame {
    
    ControllerZakatFitrah czf;
    
    public FormZakat() {
        initComponents();
        tf_idzakat.setEditable(false);
        tf_idzakat.setEnabled(false);
        tf_zakatfitrah.setText("Rp. 30000");
        tf_zakatfitrah.setEditable(false);
        tf_total.setEditable(false);
        czf = new ControllerZakatFitrah(this);
        czf.isiTable();
        czf.setLebarKolom();
        czf.setRataTengah();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_idzakat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_alamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_jmljiwa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_zakatfitrah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_total = new javax.swing.JTextField();
        btn_hitung = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_zakatfitrah = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        tf_carinama = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("FORM INPUT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ZAKAT FITRAH");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NO");

        tf_idzakat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NAMA");

        tf_nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("ALAMAT");

        tf_alamat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("JUMLAH JIWA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ZAKAT FITRAH");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("TOTAL");

        tf_total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btn_hitung.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_hitung.setText("HITUNG");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        tbl_zakatfitrah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_zakatfitrah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_zakatfitrahMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_zakatfitrah);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("DATA ZAKAT FITRAH");

        btn_submit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_submit.setText("SUBMIT");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_cari.setText("CARI");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        jButton1.setText("LAPORAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_hitung)
                            .addComponent(tf_idzakat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(tf_alamat)
                            .addComponent(tf_jmljiwa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_zakatfitrah)
                            .addComponent(tf_total)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reset)
                        .addGap(3, 3, 3)
                        .addComponent(btn_submit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_carinama, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cari))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_idzakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_carinama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_jmljiwa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_zakatfitrah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_hitung)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_submit)
                            .addComponent(btn_update)
                            .addComponent(btn_reset)
                            .addComponent(btn_delete)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        czf.reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        czf.insert();
        czf.isiTable();
        czf.setLebarKolom();
        czf.setRataTengah();
        czf.reset();
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        czf.delete();
        czf.isiTable();
        czf.setLebarKolom();
        czf.setRataTengah();
        czf.reset();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tbl_zakatfitrahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_zakatfitrahMouseClicked
        // TODO add your handling code here:
        czf.isiField(tbl_zakatfitrah.getSelectedRow());
    }//GEN-LAST:event_tbl_zakatfitrahMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        czf.update();
        czf.isiTable();
        czf.setLebarKolom();
        czf.setRataTengah();
        czf.reset();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        czf.cariNama();
        czf.setLebarKolom();
        czf.setRataTengah();
    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        // TODO add your handling code here:
        czf.hitungZakat();
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FormLaporan fr = new FormLaporan();
        this.setVisible(false);
        fr.setVisible(true);
        
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
            java.util.logging.Logger.getLogger(FormZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormZakat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_submit;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_zakatfitrah;
    private javax.swing.JTextField tf_alamat;
    private javax.swing.JTextField tf_carinama;
    private javax.swing.JTextField tf_idzakat;
    private javax.swing.JTextField tf_jmljiwa;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_total;
    private javax.swing.JTextField tf_zakatfitrah;
    // End of variables declaration//GEN-END:variables

    public JButton getBtn_delete() {
        return btn_delete;
    }

    public void setBtn_delete(JButton btn_delete) {
        this.btn_delete = btn_delete;
    }

    public JButton getBtn_hitung() {
        return btn_hitung;
    }

    public void setBtn_hitung(JButton btn_hitung) {
        this.btn_hitung = btn_hitung;
    }

    public JButton getBtn_reset() {
        return btn_reset;
    }

    public void setBtn_reset(JButton btn_reset) {
        this.btn_reset = btn_reset;
    }

    public JButton getBtn_submit() {
        return btn_submit;
    }

    public void setBtn_submit(JButton btn_submit) {
        this.btn_submit = btn_submit;
    }

    public JButton getBtn_update() {
        return btn_update;
    }

    public void setBtn_update(JButton btn_update) {
        this.btn_update = btn_update;
    }

    public JTable getTbl_zakatfitrah() {
        return tbl_zakatfitrah;
    }

    public void setTbl_zakatfitrah(JTable tbl_zakatfitrah) {
        this.tbl_zakatfitrah = tbl_zakatfitrah;
    }

    public JTextField getTf_alamat() {
        return tf_alamat;
    }

    public void setTf_alamat(JTextField tf_alamat) {
        this.tf_alamat = tf_alamat;
    }

    public JTextField getTf_idzakat() {
        return tf_idzakat;
    }

    public void setTf_idzakat(JTextField tf_idzakat) {
        this.tf_idzakat = tf_idzakat;
    }

    public JTextField getTf_jmljiwa() {
        return tf_jmljiwa;
    }

    public void setTf_jmljiwa(JTextField tf_jmljiwa) {
        this.tf_jmljiwa = tf_jmljiwa;
    }

    public JTextField getTf_nama() {
        return tf_nama;
    }

    public void setTf_nama(JTextField tf_nama) {
        this.tf_nama = tf_nama;
    }

    public JTextField getTf_total() {
        return tf_total;
    }

    public void setTf_total(JTextField tf_total) {
        this.tf_total = tf_total;
    }

    public JTextField getTf_zakatfitrah() {
        return tf_zakatfitrah;
    }

    public void setTf_zakatfitrah(JTextField tf_zakatfitrah) {
        this.tf_zakatfitrah = tf_zakatfitrah;
    }

    public JButton getBtn_cari() {
        return btn_cari;
    }

    public void setBtn_cari(JButton btn_cari) {
        this.btn_cari = btn_cari;
    }

    public JTextField getTf_carinama() {
        return tf_carinama;
    }

    public void setTf_carinama(JTextField tf_carinama) {
        this.tf_carinama = tf_carinama;
    }
    
    

}
