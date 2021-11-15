public class Istatistik extends javax.swing.JFrame {

   
    public Istatistik() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        faktoriyel_lbl = new javax.swing.JLabel();
        faktoriyel_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        eleman_lbl = new javax.swing.JLabel();
        secim_lbl = new javax.swing.JLabel();
        eleman_txt = new javax.swing.JTextField();
        secim_txt = new javax.swing.JTextField();
        permutasyon_btn = new javax.swing.JButton();
        kombinsayon_btn = new javax.swing.JButton();
        faktoriyel_btn = new javax.swing.JButton();

        jDialog1.setBounds(new java.awt.Rectangle(0, 0, 400, 300));

        faktoriyel_lbl.setText("Faktoriyel Sayisi");

        jButton1.setText("Hesapla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(faktoriyel_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(faktoriyel_txt))
                .addGap(54, 54, 54))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(faktoriyel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faktoriyel_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eleman_lbl.setText("Eleman Sayisi");

        secim_lbl.setText("Secim Sayisi");

        permutasyon_btn.setText("Permutasyon");
        permutasyon_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permutasyon_btnActionPerformed(evt);
            }
        });

        kombinsayon_btn.setText("Kombinsayon");
        kombinsayon_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kombinsayon_btnActionPerformed(evt);
            }
        });

        faktoriyel_btn.setText("Faktoriyel");
        faktoriyel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faktoriyel_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(secim_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eleman_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eleman_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secim_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kombinsayon_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(permutasyon_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(faktoriyel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eleman_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(eleman_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secim_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secim_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kombinsayon_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(permutasyon_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faktoriyel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private long faktoriyel(int sayi)
    {
        long  carpim=1;
        for(int i=sayi;i>1;i--)
        {
            carpim*=i;
        }
        return carpim;
    }
    Object temp1,temp2;
    private void kombinsayon_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kombinsayon_btnActionPerformed

       int sayi1=Integer.parseInt(eleman_txt.getText()); 
       int sayi2=Integer.parseInt(secim_txt.getText());
      
       System.out.println(faktoriyel(sayi1)/(faktoriyel(sayi1-sayi2)*faktoriyel(sayi2)));
        
    }//GEN-LAST:event_kombinsayon_btnActionPerformed

    private void permutasyon_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permutasyon_btnActionPerformed
       int sayi1=Integer.parseInt(eleman_txt.getText()); 
       int sayi2=Integer.parseInt(secim_txt.getText());
       System.out.println(faktoriyel(sayi1)/faktoriyel(sayi1-sayi2));
    }//GEN-LAST:event_permutasyon_btnActionPerformed

    private void faktoriyel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faktoriyel_btnActionPerformed
        jDialog1.setVisible(true);      
    }//GEN-LAST:event_faktoriyel_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int sayi=Integer.parseInt(faktoriyel_txt.getText());
        System.out.println(faktoriyel(sayi));
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

 
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Istatistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Istatistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Istatistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Istatistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Istatistik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eleman_lbl;
    private javax.swing.JTextField eleman_txt;
    private javax.swing.JButton faktoriyel_btn;
    private javax.swing.JLabel faktoriyel_lbl;
    private javax.swing.JTextField faktoriyel_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JButton kombinsayon_btn;
    private javax.swing.JButton permutasyon_btn;
    private javax.swing.JLabel secim_lbl;
    private javax.swing.JTextField secim_txt;
    // End of variables declaration//GEN-END:variables
}
