
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class entrada1 extends javax.swing.JFrame {

    /**
     * Creates new form entrada1
     */
    public entrada1() {
        initComponents();
        setSize(500,400);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resta = new javax.swing.JRadioButton();
        multiplicacion = new javax.swing.JRadioButton();
        suma = new javax.swing.JRadioButton();
        Division = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("CALCULADORA BASICA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel2.setText("basic calculator");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 159, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Seleccione su operacion :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 24));

        buttonGroup1.add(resta);
        resta.setText("resta");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        getContentPane().add(resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        buttonGroup1.add(multiplicacion);
        multiplicacion.setText("Multiplicacion");
        getContentPane().add(multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        buttonGroup1.add(suma);
        suma.setText("Suma");
        getContentPane().add(suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        buttonGroup1.add(Division);
        Division.setText("Division");
        getContentPane().add(Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel4.setText("Parametro 1 :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel5.setText("Parametro 2:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        getContentPane().add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 47, -1));
        getContentPane().add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 47, -1));

        aceptar.setText("ENVIAR DATOS PARA CALCULAR");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 257, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restaActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
     
    int numero1=0,numero2=0,bandera1=0,bandera2,s,r,d,m;
    String log=" ";
    
    if(n1.getText().length()==0 && n1.getText().length()==0){
        bandera2=0;
        
       
              
    }
    else
    {
        
        bandera2=1;
        numero1=Integer.parseInt(n1.getText());
        numero2=Integer.parseInt(n2.getText());
    }
    
    if(suma.isSelected() || resta.isSelected() || multiplicacion.isSelected() || Division.isSelected()){
        bandera1=1;
       
        
        if(suma.isSelected()){
            log="SUMA";
            final2 acep = new final2();
            acep.setVisible(true);
            final2.logo.setText(log);
            s=numero1+numero2;
            final2.resul.setText(String.valueOf(s));
            
            this.setVisible(false);
        }
        else
        {
            if(resta.isSelected()){
                log="RESTA";
                final2 acep= new final2();
                acep.setVisible(true);
                final2.logo.setText(log);
                r=numero1-numero2;
                final2.resul.setText(String.valueOf(r));
                this.setVisible(false);
            }
            else
            {
                if(multiplicacion.isSelected()){
                    log="MULTIPLICACION";
                    final2 acep = new final2();
                    acep.setVisible(true);
                    final2.logo.setText(log);
                    m=numero1*numero2;
                    final2.resul.setText(String.valueOf(m));
                    this.setVisible(false);
                }
                else
                {
                    if(Division.isSelected()){
                        log="DIVISION";
                        final2 acep = new final2();
                        acep.setVisible(true);
                        final2.logo.setText(log);
                        d=numero1/numero2;
                        final2.resul.setText(String.valueOf(d));
                        this.setVisible(false);
                    }
                }
            }
        }
    }
    else
    {
        if(bandera1==0 && bandera2==0){
            JOptionPane.showMessageDialog(null,"ERROR, DIGITE LOS CAMPOS");
            
        }
        
        
        {
            if(bandera1==0 && bandera2==1){
                JOptionPane.showMessageDialog( null,"ERROR, SELECCIONE ALGUNA OPERACION A REALIZAR");
            }
            {
                if (bandera1==1 && bandera2==0){
                    JOptionPane.showMessageDialog(null,"ERROR, Digite los parametros");
                }
            }
            
            
            
            
               
        
       
                }
    }
    
  
    

        
    
     
     
        
        
        
       
        
        
        
        
        
       
    
            
    }//GEN-LAST:event_aceptarActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
       
    }//GEN-LAST:event_n1ActionPerformed

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
            java.util.logging.Logger.getLogger(entrada1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entrada1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entrada1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entrada1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entrada1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton Division;
    public static javax.swing.JButton aceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JRadioButton multiplicacion;
    public static javax.swing.JTextField n1;
    public static javax.swing.JTextField n2;
    public static javax.swing.JRadioButton resta;
    public static javax.swing.JRadioButton suma;
    // End of variables declaration//GEN-END:variables
}
