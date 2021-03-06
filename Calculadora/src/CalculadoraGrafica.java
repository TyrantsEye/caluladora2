/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class CalculadoraGrafica extends javax.swing.JFrame {

    CalculadoraTrigonometrica cal1 = new CalculadoraTrigonometrica();
    CalculadoraAritmetica cal2 = new CalculadoraAritmetica();
    int aux = 0;

    private void activacion() {
        if (Aritmetica.isSelected()) {

            Sumar.setEnabled(true);
            Restar.setEnabled(true);
            Multiplicar.setEnabled(true);
            Dividir.setEnabled(true);
            Igual.setEnabled(true);
        } else {
            Sumar.setEnabled(false);
            Restar.setEnabled(false);
            Multiplicar.setEnabled(false);
            Dividir.setEnabled(false);
            Igual.setEnabled(false);
        }
        if (Temperatura.isSelected()) {
            T1.setEnabled(true);
            T2.setEnabled(true);
            temp1.setEnabled(true);
            temp2.setEnabled(true);
            Convertir.setEnabled(true);
        } else {
            T1.setEnabled(false);
            T2.setEnabled(false);
            temp1.setEnabled(false);
            temp2.setEnabled(false);
            Convertir.setEnabled(false);
        }
        if (Trigonometrica.isSelected()) {
            Seno.setEnabled(true);
            Coseno.setEnabled(true);
            Tangente.setEnabled(true);

        } else {
            Seno.setEnabled(false);
            Coseno.setEnabled(false);
            Tangente.setEnabled(false);
        }
    }

    private void operacion(int a) {
        if (a == 0) {
            cal2.x = (int) Double.parseDouble(res.getText());
        }
        if (a == 1) {
            cal2.y = (int) Double.parseDouble(res.getText());
            cal2.x = cal2.sumar();
        }
        if (a == 2) {
            cal2.y = (int) Double.parseDouble(res.getText());
            cal2.x = cal2.restar();
        }
        if (a == 3) {
            cal2.y = (int) Double.parseDouble(res.getText());
            cal2.x = cal2.multiplicar();

        }
        if (a == 4) {
            cal2.y = (int) Double.parseDouble(res.getText());
            cal2.x = cal2.dividir();
        }
    }

    public CalculadoraGrafica() {
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

        jButton1 = new javax.swing.JButton();
        res = new javax.swing.JTextField();
        Sumar = new javax.swing.JButton();
        Restar = new javax.swing.JButton();
        Multiplicar = new javax.swing.JButton();
        Dividir = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        Temperatura = new javax.swing.JRadioButton();
        temp1 = new javax.swing.JComboBox<>();
        Aritmetica = new javax.swing.JRadioButton();
        temp2 = new javax.swing.JComboBox<>();
        T1 = new javax.swing.JLabel();
        T2 = new javax.swing.JLabel();
        Convertir = new javax.swing.JButton();
        Trigonometrica = new javax.swing.JRadioButton();
        Seno = new javax.swing.JButton();
        Coseno = new javax.swing.JButton();
        Tangente = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        res.setText("0");

        Sumar.setText("+");
        Sumar.setEnabled(false);
        Sumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumarMouseClicked(evt);
            }
        });

        Restar.setText("-");
        Restar.setEnabled(false);
        Restar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestarMouseClicked(evt);
            }
        });

        Multiplicar.setText("*");
        Multiplicar.setEnabled(false);
        Multiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MultiplicarMouseClicked(evt);
            }
        });

        Dividir.setText("/");
        Dividir.setEnabled(false);
        Dividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DividirMouseClicked(evt);
            }
        });

        Igual.setText("=");
        Igual.setEnabled(false);
        Igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IgualMouseClicked(evt);
            }
        });

        Temperatura.setText("Temperatura");
        Temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemperaturaActionPerformed(evt);
            }
        });

        temp1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Farenheit" }));
        temp1.setEnabled(false);

        Aritmetica.setSelected(true);
        Aritmetica.setText("Aritmetica");
        Aritmetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AritmeticaActionPerformed(evt);
            }
        });

        temp2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Farenheit" }));
        temp2.setEnabled(false);

        T1.setText("De:");
        T1.setEnabled(false);

        T2.setText("A:");
        T2.setEnabled(false);

        Convertir.setText("Convertir");
        Convertir.setEnabled(false);
        Convertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConvertirMouseClicked(evt);
            }
        });

        Trigonometrica.setText("Trigonometrica");
        Trigonometrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrigonometricaActionPerformed(evt);
            }
        });

        Seno.setText("Sen");
        Seno.setEnabled(false);
        Seno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SenoMouseClicked(evt);
            }
        });
        Seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenoActionPerformed(evt);
            }
        });

        Coseno.setText("Cos");
        Coseno.setEnabled(false);
        Coseno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CosenoMouseClicked(evt);
            }
        });

        Tangente.setText("Tan");
        Tangente.setEnabled(false);
        Tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TangenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(temp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(temp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(T1)
                                            .addGap(203, 203, 203)
                                            .addComponent(T2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(101, 101, 101)
                                            .addComponent(Convertir)))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Aritmetica)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Sumar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Restar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Multiplicar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dividir)
                                .addGap(18, 18, 18)
                                .addComponent(Igual))
                            .addComponent(Temperatura)
                            .addComponent(Trigonometrica)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Seno)
                                .addGap(18, 18, 18)
                                .addComponent(Coseno)
                                .addGap(18, 18, 18)
                                .addComponent(Tangente)))))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aritmetica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sumar)
                    .addComponent(Restar)
                    .addComponent(Multiplicar)
                    .addComponent(Dividir)
                    .addComponent(Igual))
                .addGap(18, 18, 18)
                .addComponent(Temperatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T1)
                    .addComponent(T2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Convertir))
                .addGap(18, 18, 18)
                .addComponent(Trigonometrica)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seno)
                    .addComponent(Coseno)
                    .addComponent(Tangente))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumarMouseClicked
        operacion(aux);
        res.setText(String.valueOf(cal2.x));
        aux = 1;
    }//GEN-LAST:event_SumarMouseClicked

    private void RestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestarMouseClicked
        operacion(aux);
        res.setText(String.valueOf(cal2.x));
        aux = 2;
    }//GEN-LAST:event_RestarMouseClicked

    private void MultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MultiplicarMouseClicked
        operacion(aux);
        res.setText(String.valueOf(cal2.x));
        aux = 3;
    }//GEN-LAST:event_MultiplicarMouseClicked

    private void DividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DividirMouseClicked
        operacion(aux);
        res.setText(String.valueOf(cal2.x));
        aux = 4;
    }//GEN-LAST:event_DividirMouseClicked

    private void IgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IgualMouseClicked
        operacion(aux);
        res.setText(String.valueOf(cal2.x));
        aux = 0;
    }//GEN-LAST:event_IgualMouseClicked

    private void TemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemperaturaActionPerformed
        Trigonometrica.setSelected(false);
        Aritmetica.setSelected(false);
        activacion();

    }//GEN-LAST:event_TemperaturaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        activacion();
    }//GEN-LAST:event_formWindowOpened

    private void AritmeticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AritmeticaActionPerformed
        Temperatura.setSelected(false);
        Trigonometrica.setSelected(false);
        activacion();
    }//GEN-LAST:event_AritmeticaActionPerformed

    private void ConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConvertirMouseClicked
        String s1 = (String) temp1.getSelectedItem();
        String s2 = (String) temp2.getSelectedItem();
        if (s1 == "Celcius" && s2 == "Kelvin") {
            cal2.t = Double.parseDouble(res.getText());
            res.setText(String.valueOf(cal2.t + 273));
        }
        if (s2 == "Celcius" && s1 == "Kelvin") {
            cal2.t = Double.parseDouble(res.getText());
            res.setText(String.valueOf(cal2.t - 273));
        }
        if (s1 == "Celcius" && s2 == "Farenheit") {
            cal2.t = Double.parseDouble(res.getText());
            res.setText(String.valueOf(cal2.t * 9 / 5 + 32));
        }
        if (s2 == "Celcius" && s1 == "Farenheit") {
            cal2.t = Double.parseDouble(res.getText());
            res.setText(String.valueOf((cal2.t - 32) * 5 / 9));
        }
        if (s1 == "Kelvin" && s2 == "Farenheit") {
            cal2.t = Double.parseDouble(res.getText());
            res.setText(String.valueOf((cal2.t - 273.15) * 1.8000 + 32));
        }
        if (s2 == "Kelvin" && s1 == "Farenheit") {
            cal2.t = Double.parseDouble(res.getText());
            res.setText(String.valueOf((cal2.t + 459.67) * 5 / 9));
        }
    }//GEN-LAST:event_ConvertirMouseClicked

    private void TrigonometricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrigonometricaActionPerformed
        Aritmetica.setSelected(false);
        Temperatura.setSelected(false);
        activacion();
    }//GEN-LAST:event_TrigonometricaActionPerformed

    private void SenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenoActionPerformed

    private void SenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SenoMouseClicked
            cal1.x=Double.parseDouble(res.getText());
            cal1.radianes(cal1.x);
            cal1.x=cal1.seno();
            res.setText(String.valueOf(cal1.x));
    }//GEN-LAST:event_SenoMouseClicked

    private void CosenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CosenoMouseClicked
            cal1.x=Double.parseDouble(res.getText());
            cal1.radianes(cal1.x);
            cal1.x=cal1.coseno();
            res.setText(String.valueOf(cal1.x));
    }//GEN-LAST:event_CosenoMouseClicked

    private void TangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TangenteActionPerformed
            cal1.x=Double.parseDouble(res.getText());
            cal1.radianes(cal1.x);
            cal1.x=cal1.tangente();
            res.setText(String.valueOf(cal1.x));
    }//GEN-LAST:event_TangenteActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Aritmetica;
    private javax.swing.JButton Convertir;
    private javax.swing.JButton Coseno;
    private javax.swing.JButton Dividir;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Multiplicar;
    private javax.swing.JButton Restar;
    private javax.swing.JButton Seno;
    private javax.swing.JButton Sumar;
    private javax.swing.JLabel T1;
    private javax.swing.JLabel T2;
    private javax.swing.JButton Tangente;
    private javax.swing.JRadioButton Temperatura;
    private javax.swing.JRadioButton Trigonometrica;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField res;
    private javax.swing.JComboBox<String> temp1;
    private javax.swing.JComboBox<String> temp2;
    // End of variables declaration//GEN-END:variables
}
