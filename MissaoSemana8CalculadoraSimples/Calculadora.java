
package MissaoSemana8CalculadoraSimples;

/**
 * @author Gustavo F. Vetter 13/11/2021
 */
public class Calculadora extends javax.swing.JFrame {

    
    public Calculadora() {
        initComponents();
    }

    double valor1, valor2;
    String operacao;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextDisplay = new javax.swing.JTextField();
        BotaoNr8 = new javax.swing.JButton();
        BotaoNr9 = new javax.swing.JButton();
        BotaoNr7 = new javax.swing.JButton();
        BotaoAdicao = new javax.swing.JButton();
        BotaoCE = new javax.swing.JButton();
        BotaoNr5 = new javax.swing.JButton();
        BotaoNr6 = new javax.swing.JButton();
        BotaoNr3 = new javax.swing.JButton();
        BotaoNr1 = new javax.swing.JButton();
        BotaoNr2 = new javax.swing.JButton();
        Bot�oNr0 = new javax.swing.JButton();
        BotaoPonto = new javax.swing.JButton();
        BotaoC = new javax.swing.JButton();
        BotaoNr4 = new javax.swing.JButton();
        BotaoIgual = new javax.swing.JButton();
        BotaoDivisao = new javax.swing.JButton();
        BotaoMultiplic = new javax.swing.JButton();
        BotaoSubtracao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULADORA by Gustavo Vetter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        TextDisplay.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        TextDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        BotaoNr8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoNr8.setText("8");
        BotaoNr8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNr8ActionPerformed(evt);
            }
        });

        BotaoNr9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoNr9.setText("9");
        BotaoNr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNr9ActionPerformed(evt);
            }
        });

        BotaoNr7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoNr7.setText("7");
        BotaoNr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNr7ActionPerformed(evt);
            }
        });

        BotaoAdicao.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoAdicao.setText("+");
        BotaoAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicaoActionPerformed(evt);
            }
        });

        BotaoCE.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        BotaoCE.setText("CE");
        BotaoCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCEActionPerformed(evt);
            }
        });

        BotaoNr5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoNr5.setText("5");
        BotaoNr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNr5ActionPerformed(evt);
            }
        });

        BotaoNr6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoNr6.setText("6");
        BotaoNr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNr6ActionPerformed(evt);
            }
        });

        BotaoNr3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoNr3.setText("3");
        BotaoNr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNr3ActionPerformed(evt);
            }
        });

        BotaoNr1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoNr1.setText("1");
        BotaoNr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNr1ActionPerformed(evt);
            }
        });

        BotaoNr2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoNr2.setText("2");
        BotaoNr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNr2ActionPerformed(evt);
            }
        });

        Bot�oNr0.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Bot�oNr0.setText("0");
        Bot�oNr0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot�oNr0ActionPerformed(evt);
            }
        });

        BotaoPonto.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoPonto.setText(".");
        BotaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPontoActionPerformed(evt);
            }
        });

        BotaoC.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoC.setText("C");
        BotaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCActionPerformed(evt);
            }
        });

        BotaoNr4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoNr4.setText("4");
        BotaoNr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNr4ActionPerformed(evt);
            }
        });

        BotaoIgual.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoIgual.setText("=");
        BotaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIgualActionPerformed(evt);
            }
        });

        BotaoDivisao.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoDivisao.setText("/");
        BotaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDivisaoActionPerformed(evt);
            }
        });

        BotaoMultiplic.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoMultiplic.setText("*");
        BotaoMultiplic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMultiplicActionPerformed(evt);
            }
        });

        BotaoSubtracao.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoSubtracao.setText("-");
        BotaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSubtracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(TextDisplay, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BotaoNr4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BotaoNr1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BotaoNr7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BotaoNr5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotaoNr6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BotaoNr2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotaoNr3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BotaoNr8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotaoNr9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Bot�oNr0, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotaoMultiplic, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNr7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoNr8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoNr9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNr4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoNr5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoNr6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMultiplic, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BotaoNr1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoNr2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoNr3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Bot�oNr0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(BotaoIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void Bot�oNr0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot�oNr0ActionPerformed
        TextDisplay.setText(TextDisplay.getText() + "0");
    }//GEN-LAST:event_Bot�oNr0ActionPerformed

    private void BotaoNr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNr1ActionPerformed
        TextDisplay.setText(TextDisplay.getText() + "1");
    }//GEN-LAST:event_BotaoNr1ActionPerformed

    private void BotaoNr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNr2ActionPerformed
        TextDisplay.setText(TextDisplay.getText() + "2");
    }//GEN-LAST:event_BotaoNr2ActionPerformed

    private void BotaoNr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNr3ActionPerformed
        TextDisplay.setText(TextDisplay.getText() + "3");
    }//GEN-LAST:event_BotaoNr3ActionPerformed

    private void BotaoNr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNr4ActionPerformed
        TextDisplay.setText(TextDisplay.getText() + "4");
    }//GEN-LAST:event_BotaoNr4ActionPerformed

    private void BotaoNr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNr5ActionPerformed
        TextDisplay.setText(TextDisplay.getText() + "5");
    }//GEN-LAST:event_BotaoNr5ActionPerformed

    private void BotaoNr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNr6ActionPerformed
        TextDisplay.setText(TextDisplay.getText() + "6");
    }//GEN-LAST:event_BotaoNr6ActionPerformed

    private void BotaoNr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNr7ActionPerformed
        TextDisplay.setText(TextDisplay.getText() + "7");
    }//GEN-LAST:event_BotaoNr7ActionPerformed

    private void BotaoNr8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNr8ActionPerformed
        TextDisplay.setText(TextDisplay.getText() + "8");
    }//GEN-LAST:event_BotaoNr8ActionPerformed

    private void BotaoNr9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNr9ActionPerformed
        TextDisplay.setText(TextDisplay.getText() + "9");
    }//GEN-LAST:event_BotaoNr9ActionPerformed

    private void BotaoCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCEActionPerformed
        TextDisplay.setText("");
    }//GEN-LAST:event_BotaoCEActionPerformed

    private void BotaoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPontoActionPerformed
        TextDisplay.setText(TextDisplay.getText() + ".");
    }//GEN-LAST:event_BotaoPontoActionPerformed

    private void BotaoAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicaoActionPerformed
        valor1 = Double.parseDouble(TextDisplay.getText());
        TextDisplay.setText(""); //limpa o display
        operacao = "adicao";
    }//GEN-LAST:event_BotaoAdicaoActionPerformed

    private void BotaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIgualActionPerformed
        valor2 = Double.parseDouble(TextDisplay.getText());
        
        if (operacao == "adicao"){
            TextDisplay.setText(String.valueOf(valor1 + valor2)); 
            //Converte String em double e faz a opera��o
            valor1 = Double.parseDouble(TextDisplay.getText());
            //Transforma o resultado a opera��o anterior em valor1 para receber uma nova opera��o
        }
        if (operacao == "subtracao"){
            TextDisplay.setText(String.valueOf(valor1 - valor2));
            //Converte String em double e faz a opera��o
            valor1 = Double.parseDouble(TextDisplay.getText());
            //Transforma o resultado a opera��o anterior em valor1 para receber uma nova opera��o
        }
        if (operacao == "multiplic"){
            TextDisplay.setText(String.valueOf(valor1 * valor2));
            //Converte String em double e faz a opera��o
            valor1 = Double.parseDouble(TextDisplay.getText());
            //Transforma o resultado a opera��o anterior em valor1 para receber uma nova opera��o
        }
        if (operacao == "divisao"){
            TextDisplay.setText(String.valueOf(valor1 / valor2));
            //Converte String em double e faz a opera��o
            valor1 = Double.parseDouble(TextDisplay.getText());
            //Transforma o resultado a opera��o anterior em valor1 para receber uma nova opera��o
        }
    }//GEN-LAST:event_BotaoIgualActionPerformed

    private void BotaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSubtracaoActionPerformed
        valor1 = Double.parseDouble(TextDisplay.getText());
        TextDisplay.setText(""); //limpa o display
        operacao = "subtracao";
    }//GEN-LAST:event_BotaoSubtracaoActionPerformed

    private void BotaoMultiplicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMultiplicActionPerformed
        valor1 = Double.parseDouble(TextDisplay.getText());
        TextDisplay.setText(""); //limpa o display
        operacao = "multiplic";
    }//GEN-LAST:event_BotaoMultiplicActionPerformed

    private void BotaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDivisaoActionPerformed
        valor1 = Double.parseDouble(TextDisplay.getText());
        TextDisplay.setText(""); //limpa o display
        operacao = "divisao";
    }//GEN-LAST:event_BotaoDivisaoActionPerformed
     
    private void BotaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCActionPerformed
        valor1 = 0;
        valor2 = 0;
        TextDisplay.setText(""); //limpa o display
        
        
    }//GEN-LAST:event_BotaoCActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicao;
    private javax.swing.JButton BotaoC;
    private javax.swing.JButton BotaoCE;
    private javax.swing.JButton BotaoDivisao;
    private javax.swing.JButton BotaoIgual;
    private javax.swing.JButton BotaoMultiplic;
    private javax.swing.JButton BotaoNr1;
    private javax.swing.JButton BotaoNr2;
    private javax.swing.JButton BotaoNr3;
    private javax.swing.JButton BotaoNr4;
    private javax.swing.JButton BotaoNr5;
    private javax.swing.JButton BotaoNr6;
    private javax.swing.JButton BotaoNr7;
    private javax.swing.JButton BotaoNr8;
    private javax.swing.JButton BotaoNr9;
    private javax.swing.JButton BotaoPonto;
    private javax.swing.JButton BotaoSubtracao;
    private javax.swing.JButton Bot�oNr0;
    private javax.swing.JTextField TextDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
