/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author 666
 */
public class GUIRecuperarConta extends javax.swing.JFrame {

    /**
     * Creates new form GUIRecuperarConta
     */
    public GUIRecuperarConta() {
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

        jpRecuperarConta = new javax.swing.JPanel();
        jlblTexto1RecConta = new javax.swing.JLabel();
        jlblTexto2RecConta = new javax.swing.JLabel();
        jlblEmailRecConta = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jbtnRecConta = new javax.swing.JButton();
        jbtnCancelarRecConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpRecuperarConta.setBackground(new java.awt.Color(7, 67, 152));

        jlblTexto1RecConta.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jlblTexto1RecConta.setForeground(new java.awt.Color(204, 204, 204));
        jlblTexto1RecConta.setText("Que pena! Não se preocupe, vamos te ajudar a recuperar sua conta! :D");

        jlblTexto2RecConta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlblTexto2RecConta.setForeground(new java.awt.Color(204, 204, 204));
        jlblTexto2RecConta.setText("Por gentileza, nos informe o seu email e enviaremos as intruções para recuperação de conta!");

        jlblEmailRecConta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlblEmailRecConta.setForeground(new java.awt.Color(204, 204, 204));
        jlblEmailRecConta.setText("Email:");

        jbtnRecConta.setText("Recuperar minha conta");

        jbtnCancelarRecConta.setText("Cancelar");

        javax.swing.GroupLayout jpRecuperarContaLayout = new javax.swing.GroupLayout(jpRecuperarConta);
        jpRecuperarConta.setLayout(jpRecuperarContaLayout);
        jpRecuperarContaLayout.setHorizontalGroup(
            jpRecuperarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRecuperarContaLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jpRecuperarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTexto1RecConta, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpRecuperarContaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jlblTexto2RecConta))
                    .addGroup(jpRecuperarContaLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jlblEmailRecConta)
                        .addGap(18, 18, 18)
                        .addGroup(jpRecuperarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpRecuperarContaLayout.createSequentialGroup()
                                .addComponent(jbtnRecConta, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnCancelarRecConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56))
        );
        jpRecuperarContaLayout.setVerticalGroup(
            jpRecuperarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecuperarContaLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jlblTexto1RecConta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jlblTexto2RecConta)
                .addGap(142, 142, 142)
                .addGroup(jpRecuperarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblEmailRecConta)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jpRecuperarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRecConta)
                    .addComponent(jbtnCancelarRecConta))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpRecuperarConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpRecuperarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUIRecuperarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRecuperarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRecuperarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRecuperarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRecuperarConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnCancelarRecConta;
    private javax.swing.JButton jbtnRecConta;
    private javax.swing.JLabel jlblEmailRecConta;
    private javax.swing.JLabel jlblTexto1RecConta;
    private javax.swing.JLabel jlblTexto2RecConta;
    private javax.swing.JPanel jpRecuperarConta;
    // End of variables declaration//GEN-END:variables
}