/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzylogictest;

/**
 *
 * @author macbookpro
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
                this.setLocation(600, 400);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void fisEditorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fisEditorBtnActionPerformed
        this.setVisible(false);

        new FIS_Editor().setVisible(true);

    }//GEN-LAST:event_fisEditorBtnActionPerformed

    private void memFuncEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memFuncEditBtnActionPerformed
        this.setVisible(false);

        new Membership_Function_Editor().setVisible(true);    }//GEN-LAST:event_memFuncEditBtnActionPerformed

    private void ruleEditorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruleEditorBtnActionPerformed
        this.setVisible(false);

        new Rule_Editor().setVisible(true);
    }//GEN-LAST:event_ruleEditorBtnActionPerformed

    private void ruleViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruleViewBtnActionPerformed
        this.setVisible(false);

        new Rule_Viewer().setVisible(true);
    }//GEN-LAST:event_ruleViewBtnActionPerformed
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fisEditorBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton memFuncEditBtn;
    private javax.swing.JButton ruleEditorBtn;
    private javax.swing.JButton ruleViewBtn;
    // End of variables declaration//GEN-END:variables
}