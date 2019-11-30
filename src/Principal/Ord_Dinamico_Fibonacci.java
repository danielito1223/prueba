/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author REINA GARCIA
 */
public class Ord_Dinamico_Fibonacci extends javax.swing.JFrame {

    /**
     * Creates new form Ord_Dinamico_Fibonacci
     */
    public Ord_Dinamico_Fibonacci() {
        initComponents();
        
    }
   public static int FibonacciRecursivo(int n){
       if(n==0){
           return 0;
        }else if (n==1){
            return 1;
        }else{
         return FibonacciRecursivo(n-1)+FibonacciRecursivo(n-2);  
       }
   }
    private static Map<Integer, Integer> memo = new HashMap<>();
    public static int fibonacciMejorado(int n){
//        return memo.computeIfAbsent(n1, n -> Math.addExact(fibonacciMejorado(n-1),
//        fibonacciMejorado(n-2)));

    if (n < 0) {
            throw new IllegalArgumentException(
                "Index was negative. No such thing as a negative index in a series.");
        // base cases
        } else if (n == 0 || n == 1) {
            return n;
        }
        // see if we've already calculated this
       if (memo.containsKey(n)) {
           // System.out.printf("grabbing memo[%d]\n", n);
          return memo.get(n);
       }
       // System.out.printf("computing fib(%d)\n", n);
        int result = fibonacciMejorado(n - 1) + fibonacciMejorado(n - 2);
        // memoize
        memo.put(n, result);
        return result;
        
    }
     public int fibonacciBottoUp(int n) {
        int fnMin2 = 0;
        int fnMin1 = 1;
        int sum = 0;
        for(int i = 2; i <= n; i++) {
            sum = fnMin1 + fnMin2;
            fnMin2 = fnMin1;
            fnMin1 = sum;
        }
        return sum;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtValorIngresado = new javax.swing.JTextField();
        BtnFibonacciNormal = new javax.swing.JButton();
        BtnFibonacciMejorado = new javax.swing.JButton();
        BtnFibonacciBott = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("FIBONACCI DINAMICO");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Igrese el valor");

        BtnFibonacciNormal.setText("Fibonacci Normal");
        BtnFibonacciNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFibonacciNormalActionPerformed(evt);
            }
        });

        BtnFibonacciMejorado.setText("Fibonacci Mejorado");
        BtnFibonacciMejorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFibonacciMejoradoActionPerformed(evt);
            }
        });

        BtnFibonacciBott.setText("Fibonacci Bott-UP");
        BtnFibonacciBott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFibonacciBottActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Resultado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnFibonacciNormal)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(BtnFibonacciMejorado)
                        .addGap(34, 34, 34)
                        .addComponent(BtnFibonacciBott))
                    .addComponent(txtValorIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValorIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnFibonacciNormal)
                    .addComponent(BtnFibonacciMejorado)
                    .addComponent(BtnFibonacciBott))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFibonacciMejoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFibonacciMejoradoActionPerformed
              int dato = Integer.parseInt(txtValorIngresado.getText());
       int Result = fibonacciMejorado(dato);
       txtResultado.setText(Integer.toString(Result));
    }//GEN-LAST:event_BtnFibonacciMejoradoActionPerformed

    private void BtnFibonacciNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFibonacciNormalActionPerformed
          int dato = Integer.parseInt(txtValorIngresado.getText());
       int Result = FibonacciRecursivo(dato);
       txtResultado.setText(Integer.toString(Result));
    }//GEN-LAST:event_BtnFibonacciNormalActionPerformed

    private void BtnFibonacciBottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFibonacciBottActionPerformed
        int dato = Integer.parseInt(txtValorIngresado.getText());
       int Result = fibonacciBottoUp(dato);
       txtResultado.setText(Integer.toString(Result));
    }//GEN-LAST:event_BtnFibonacciBottActionPerformed

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
            java.util.logging.Logger.getLogger(Ord_Dinamico_Fibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ord_Dinamico_Fibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ord_Dinamico_Fibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ord_Dinamico_Fibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ord_Dinamico_Fibonacci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFibonacciBott;
    private javax.swing.JButton BtnFibonacciMejorado;
    private javax.swing.JButton BtnFibonacciNormal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValorIngresado;
    // End of variables declaration//GEN-END:variables
}
