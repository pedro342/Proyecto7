/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author pedri
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    calculadora1 calc = new calculadora1();

    public menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        displaySinCalculos = new javax.swing.JLabel();
        displaySinResolver = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_dot = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(244, 253, 251));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Montserrat Alternates Light", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, -1));

        display.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        display.setForeground(new java.awt.Color(0, 0, 0));
        display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        display.setText("0");
        display.setToolTipText("");
        jPanel3.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 290, 50));

        displaySinCalculos.setForeground(new java.awt.Color(0, 0, 0));
        displaySinCalculos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(displaySinCalculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 40, 280, -1));

        displaySinResolver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        displaySinResolver.setForeground(new java.awt.Color(0, 0, 0));
        displaySinResolver.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        displaySinResolver.setText("0");
        jPanel3.add(displaySinResolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 280, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_dot.setBackground(new java.awt.Color(255, 255, 255));
        btn_dot.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_dot.setText(".");
        btn_dot.setFocusPainted(false);
        btn_dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dot.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        jPanel4.add(btn_dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setText("9");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setText("8");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setText("7");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 52, 50));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setText("4");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setText("5");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 52, 51));

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setText("6");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 52, 51));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setText("%");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 52, 51));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 52, 51));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 52, 51));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 52, 51));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("x");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 52, 51));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setText("/");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 52, 51));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setText("ce");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 51));

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setText("0");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 220, 51));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("+");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 52, 51));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 52, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        calc.setValorEscrito("1");
        display.setText(calc.valorEscrito);
        calc.setValorSinResolver("1");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        calc.setValorEscrito("2");
        display.setText(calc.valorEscrito);
        calc.setValorSinResolver("2");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        calc.setValorEscrito("3");
        display.setText(calc.valorEscrito);
        calc.setValorSinResolver("3");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        calc.setOperador("+");
        double valorActual = calc.evaluar();
        display.setText(Double.toString(valorActual));
        calc.setValorSinResolver("+");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        calc.setOperador("-");
        double valorActual = calc.evaluar();
        display.setText(Double.toString(valorActual));
        calc.setValorSinResolver("-");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        calc.setOperador("*");
        double valorActual = calc.evaluar();
        display.setText(Double.toString(valorActual));
        calc.setValorSinResolver("x");
        displaySinResolver.setText(calc.valorSinResolver);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        calc.setOperador("/");
        double valorActual = calc.evaluar();
        display.setText(Double.toString(valorActual));
        calc.setValorSinResolver("/");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        calc.setOperador("%");
        double valorActual = calc.evaluar();
        display.setText(Double.toString(valorActual));
        calc.setValorSinResolver("%");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        calc.setValorEscrito("4");
        display.setText(calc.valorEscrito);
        calc.setValorSinResolver("4");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        calc.setValorEscrito("5");
        display.setText(calc.valorEscrito);
        calc.setValorSinResolver("5");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        calc.setValorEscrito("6");
        display.setText(calc.valorEscrito);
        calc.setValorSinResolver("6");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        calc.setValorEscrito("7");
        display.setText(calc.valorEscrito);
        calc.setValorSinResolver("7");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        calc.setValorEscrito("8");
        display.setText(calc.valorEscrito);
        calc.setValorSinResolver("8");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        calc.setValorEscrito("9");
        display.setText(calc.valorEscrito);
        calc.setValorSinResolver("9");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        calc.setValorActual();
        display.setText("0");
        calc.setValorRes();
        displaySinResolver.setText("");

    }//GEN-LAST:event_jButton10ActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        calc.setValorEscrito(".");
        display.setText(calc.valorEscrito);
        calc.setValorSinResolver(".");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_btn_dotActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        calc.setValorEscrito("0");
        display.setText(calc.valorEscrito);
        calc.setValorSinResolver("0");
        displaySinResolver.setText(calc.valorSinResolver);
    }//GEN-LAST:event_jButton19ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dot;
    private javax.swing.JLabel display;
    private javax.swing.JLabel displaySinCalculos;
    private javax.swing.JLabel displaySinResolver;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txtOperacion;
    // End of variables declaration//GEN-END:variables
}
