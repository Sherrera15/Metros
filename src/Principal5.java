
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herrera
 */
public class Principal5 extends javax.swing.JFrame {

    /**
     * Creates new form Principal5
     */
    public Principal5() {
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

        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        txtMetrosComprados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalACancelar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCuotaInicial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt12CuotasRestantes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jLabel1.setText("METROS CUADRADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 190, -1));

        txtMetrosComprados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetrosCompradosActionPerformed(evt);
            }
        });
        txtMetrosComprados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMetrosCompradosKeyTyped(evt);
            }
        });
        getContentPane().add(txtMetrosComprados, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, -1));

        jLabel2.setFont(new java.awt.Font("JasmineUPC", 2, 24)); // NOI18N
        jLabel2.setText("Números de Metroscuadrados Comprados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("JasmineUPC", 2, 24)); // NOI18N
        jLabel3.setText("Total a cancelar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        txtTotalACancelar.setEditable(false);
        txtTotalACancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalACancelarActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotalACancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 80, -1));

        jLabel4.setFont(new java.awt.Font("JasmineUPC", 2, 24)); // NOI18N
        jLabel4.setText("Cuota Inicial");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        txtCuotaInicial.setEditable(false);
        getContentPane().add(txtCuotaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 80, -1));

        jLabel5.setFont(new java.awt.Font("JasmineUPC", 2, 24)); // NOI18N
        jLabel5.setText("12 cuotas restantes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        txt12CuotasRestantes.setEditable(false);
        getContentPane().add(txt12CuotasRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 80, -1));

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jButton2.setText("BORRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalACancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalACancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalACancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String  num1, tota,cuota,tot,totals;
        double n1 = 1,resultado = 0, total,falt,falta;
       
        
        
        if (txtMetrosComprados.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Digite el la cantidas de Numeros de metros", "Error",JOptionPane.ERROR_MESSAGE);
        txtMetrosComprados.requestFocusInWindow();
        } 
        
        
        else {
        
        n1= Double.parseDouble(txtMetrosComprados.getText());
        
        }
        
        total = n1*80000;
         tota= String.valueOf(total);
         txtTotalACancelar.setText(tota); 
         
         resultado = total*0.35;
         cuota= String.valueOf(resultado);
         txtCuotaInicial.setText(cuota);
        
         falt = resultado-total;
         tot= String.valueOf(falt);
         txt12CuotasRestantes.setText(tot);
         
         falta = falt/12;
         totals= String.valueOf(falta);
         txt12CuotasRestantes.setText(totals);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMetrosCompradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetrosCompradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetrosCompradosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtMetrosComprados.setText("");
        txtTotalACancelar.setText("");
        txtCuotaInicial.setText("");
        txt12CuotasRestantes.setText("");
        
        txtMetrosComprados.requestFocusInWindow();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtMetrosCompradosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMetrosCompradosKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtMetrosCompradosKeyTyped

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
            java.util.logging.Logger.getLogger(Principal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private java.awt.Label label1;
    private javax.swing.JTextField txt12CuotasRestantes;
    private javax.swing.JTextField txtCuotaInicial;
    private javax.swing.JTextField txtMetrosComprados;
    private javax.swing.JTextField txtTotalACancelar;
    // End of variables declaration//GEN-END:variables
}
