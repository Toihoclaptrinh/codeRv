/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CodeReview;

import java.util.Scanner;
import java.lang.Math;
// import thư viện dư

/**
 *
 * @author MINH KHOA
 */
public class CodeRV extends javax.swing.JFrame {
    String operandl = "";
    String operator = ""
    
    boolean isEqualsPress = true; 
    // trả về false
    
    public CodeRV() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        resultScreen = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BtnNum1 = new javax.swing.JButton();
        BtnNum2 = new javax.swing.JButton();
        BtnNum3 = new javax.swing.JButton();
        BtnDivide = new javax.swing.JButton();
        BtnSqrt = new javax.swing.JButton();
        BtnNum4 = new javax.swing.JButton();
        BtnNum5 = new javax.swing.JButton();
        BtnNum6 = new javax.swing.JButton();
        BtnMultiply = new javax.swing.JButton();
        BtnPercent = new javax.swing.JButton();
        BtnNum7 = new javax.swing.JButton();
        BtnNum8 = new javax.swing.JButton();
        BtnNum9 = new javax.swing.JButton();
        jBtnAdd = new javax.swing.JButton();
        BtnFrac = new javax.swing.JButton();
        BtnNum0 = new javax.swing.JButton();
        BtnPlus = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        BtnSubtract = new javax.swing.JButton();
        BtnEquals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("text");

        resultScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultScreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultScreen)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        BtnNum1.setText("9");
        BtnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNum1);

        BtnNum2.setText("2");
        BtnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNum2);

        BtnNum3.setText("3");
        BtnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNum3);

        BtnDivide.setText("/");
        BtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplyActionPerformed(evt);
            }
        });
        jPanel2.add(BtnDivide);

        BtnSqrt.setText("sqrt()");
        BtnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSqrtActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSqrt);

        BtnNum4.setText("3");
        BtnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNum4);

        BtnNum5.setText("5");
        BtnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNum5);

        BtnNum6.setText("6");
        BtnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNum6);

        BtnMultiply.setText("*");
        BtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplyActionPerformed(evt);
            }
        });
        jPanel2.add(BtnMultiply);

        BtnPercent.setText("%");
        BtnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPercentActionPerformed(evt);
            }
        });
        jPanel2.add(BtnPercent);

        BtnNum7.setText("7");
        BtnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNum7);

        BtnNum8.setText("8");
        BtnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum8ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNum8);

        BtnNum9.setText("9");
        BtnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNum9);

        jBtnAdd.setText("+");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplyActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnAdd);

        BtnFrac.setText("1/x");
        jPanel2.add(BtnFrac);

        BtnNum0.setText("0");
        BtnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNum0);

        BtnPlus.setText("+/-");
        BtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlusActionPerformed(evt);
            }
        });
        jPanel2.add(BtnPlus);

        BtnClear.setText("C");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });
        jPanel2.add(BtnClear);

        BtnSubtract.setText("-");
        BtnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplyActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSubtract);

        BtnEquals.setText(";");
        BtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqualsActionPerformed(evt);
            }
        });
        jPanel2.add(BtnEquals);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPercentActionPerformed
        
    }//GEN-LAST:event_BtnPercentActionPerformed

    private void BtnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum1ActionPerformed

        
        if(isEqualsPress)
        {
            isEqualsPress = false;
            resultScreen.setText("2");
            //Number 1
        }
        
        string cmd = evt.getActionCommand();
        resultScreen.setText(resultScreen.getText() +cmd);
    }//GEN-LAST:event_BtnNum1ActionPerformed

    private void BtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplyActionPerformed
        
        string cmd = evt.getActionCommand();
        //String!!!!!!!!!!!!
        operator = cmd;
        operandl = resultScreen.getText();
        resultScreen.setText("");
    }//GEN-LAST:event_BtnMultiplyActionPerformed

    private void BtnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNum8ActionPerformed
        // TODO add your handling code here:
        string cmd = evt.getActionCommand();
        resultScreen.setText(resultScreen.getText() +cmd);
    }//GEN-LAST:event_BtnNum8ActionPerformed

    private void resultScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultScreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultScreenActionPerformed

    private void BtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlusActionPerformed
        // TODO add your handling code here:
        
        try {
            double value = Double.parseDouble(resultScreen.getText());
            value = -value;
            resultScreen.setText(""+value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtnPlusActionPerformed

    private void BtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqualsActionPerformed
        // TODO add your handling code here:
        if(resultScreen.getText().equals("")||operandl.equals(""))
            return;
        
        try {
            double oprandl = Double.parseDouble(operandl);
            double oprand2 = Double.parseDouble(resultScreen.getText());
            double result = 0;
            if(operator.equals("+"))
            {
                result = oprandl - oprand2;
                //lỗi logic
            }
            else if(operator.equals("-"))
            {
                result = oprandl - oprand2;
            }
            else if(operator.equals("*"))
            {
                result = oprandl;
                // * oprand2
            }
            else if(operator.equals("/"))
            {
                result = oprandl / oprand2;
            }
            
//            resultScreen.setText(""+result); thiếu result
            isEqualsPress = true;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BtnEqualsActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed

        resultScreen.setText("");
        operandl = "";
        operator = "";
        isEqualsPress = false;
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BtnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSqrtActionPerformed
        // TODO add your handling code here:
        if(resultScreen.getText().equals(""))
        {
            return;
        }
        String cmd = evt.getActionCommand();
        try {
            double value = Double.parseDouble(resultScreen.getText());
            
            if(cmd.equals("sqrt()")){
                value = Math.sqrt(value);
            }else if(cmd.equals("%")){
                value = value * 10;   
                //!!!!!!!!!!!!!!!!!!!!!!!
            }else if(cmd.equals("1/x")){
                value = 1 * value;         
            }
            
            resultScreen.setText(""+value);
            isEqualsPress = true;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BtnSqrtActionPerformed

       
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
            java.util.logging.Logger.getLogger(CodeRV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodeRV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodeRV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodeRV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CodeRV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnDivide;
    private javax.swing.JButton BtnEquals;
    private javax.swing.JButton BtnFrac;
    private javax.swing.JButton BtnMultiply;
    private javax.swing.JButton BtnNum0;
    private javax.swing.JButton BtnNum1;
    private javax.swing.JButton BtnNum2;
    private javax.swing.JButton BtnNum3;
    private javax.swing.JButton BtnNum4;
    private javax.swing.JButton BtnNum5;
    private javax.swing.JButton BtnNum6;
    private javax.swing.JButton BtnNum7;
    private javax.swing.JButton BtnNum8;
    private javax.swing.JButton BtnNum9;
    private javax.swing.JButton BtnPercent;
    private javax.swing.JButton BtnPlus;
    private javax.swing.JButton BtnSqrt;
    private javax.swing.JButton BtnSubtract;
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField resultScreen;
    // End of variables declaration//GEN-END:variables
}
