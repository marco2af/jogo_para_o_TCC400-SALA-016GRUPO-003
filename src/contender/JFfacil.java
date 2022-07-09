/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contender;


import java.util.Random;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author marco
 */
public class JFfacil extends javax.swing.JFrame {

    /**
     * @author TCC S05 G10
     */
    public int getTotalsf() {
        return totalsf;
    }

    /**
     * @param totalsf the totalsf to set
     */
    public void setTotalsf(int totalsf) {
        this.totalsf = totalsf;
    }

    private Timer timer;
    private String ent1;
    private String ent2;
    private int totalsf;
    private int fase;
    /**
     * Creates new form JFfacil
     */
    public JFfacil() {
         Random random = new Random();
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        JLtime.setText("00:59");
         /**
     * @sorteia qual sera o valor de entrada e saida correto
     * para o jogador adivinhar.
     */
       int numero = random.nextInt(2);
       if (numero == 1){
      
       
          JTsaida1.setText("0");
          JTsaida1.enable(false);
          JTsaida2.setText("1");
          JTsaida2.enable(false);
       }else{
          
          
          JTsaida1.setText("1");
          JTsaida1.enable(false);
          JTsaida2.setText("0");
          JTsaida2.enable(false);
       }
       /**
     * @conta o tempo em segundos
     */
        timer =new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           contar1();
          
            }
            
    });
        
             timer.start();
        
           
    }
         public void fase(int f){
           fase = f;  
         }
     int valor = 60;
  Contador retornapontuação = new Contador();
     int valorinicial = 6000;
      /**
     * @decrementa o tempo
     */
public void contar1(){
       valorinicial = valorinicial - 100;
            valor = valor - 1;            
           
           if (valor < 10){
           JLtime.setText("00:0"+ valor); 
           }else {
    JLtime.setText("00:"+ valor); 
    jBtotal.setText("0");
}
              /**
     * @finaliza caso o tempo acabe
     */
   if ((valor ==0 && fase == 1)){
       timer.stop();
    JFfimdejogo obj = new JFfimdejogo();
obj.setVisible(true);  
obj.respostacorreta(" "+ JTsaida2.getText()+" " + JTsaida1.getText() + " ", " facil 1 de 5");
dispose(); 
   }   
   
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLtime = new javax.swing.JLabel();
        JLjogador = new javax.swing.JLabel();
        JLtexto = new javax.swing.JLabel();
        JLfigura = new javax.swing.JLabel();
        JTentrada1 = new javax.swing.JTextField();
        JTentrada2 = new javax.swing.JTextField();
        JTsaida1 = new javax.swing.JTextField();
        JTsaida2 = new javax.swing.JTextField();
        JBenvia = new javax.swing.JButton();
        jBtotal = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jogo das portas logicas");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        JLtime.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JLtime.setText("00:00");

        JLjogador.setText("jogador 1");

        JLtexto.setText("pontuação");

        JLfigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/inicio.png"))); // NOI18N
        JLfigura.setText("jLabel4");

        JTentrada1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTentrada1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JTentrada2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTentrada2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JTsaida1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTsaida1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTsaida1.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        JTsaida2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTsaida2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTsaida2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        JTsaida2.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        JBenvia.setText("enviar");
        JBenvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBenviaActionPerformed(evt);
            }
        });

        jBtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jBtotal.setText("00000000000");

        jToggleButton1.setText("?");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(JLtime)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(JTentrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(JTentrada2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242)
                .addComponent(JTsaida1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(JTsaida2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(JBenvia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLjogador, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLtexto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLfigura, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jBtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLjogador)
                    .addComponent(JLtexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jBtotal))
                .addGap(2, 2, 2)
                .addComponent(JLtime, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTentrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTentrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTsaida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTsaida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBenvia))
                .addGap(18, 18, 18)
                .addComponent(JLfigura, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBenviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBenviaActionPerformed
// envia o resultado se o jogador acertou ou erro.

String entrada1 = JTentrada1.getText();
String en1 = JTsaida1.getText();
String en2 = JTsaida2.getText();
String entrada2 = JTentrada2.getText();
if (((entrada1.equalsIgnoreCase("0"))||(entrada1.equalsIgnoreCase("1")))&& ((entrada2.equalsIgnoreCase("0"))||(entrada2.equalsIgnoreCase("1")))) {
   if ((entrada1.equalsIgnoreCase(en1))&&(entrada2.equalsIgnoreCase(en2))){
     JFvoceganhou obj = new JFvoceganhou();
     retornapontuação.setConta(valorinicial);
     obj.recebevalor(retornapontuação);
obj.setVisible(true);
jBtotal.setText("" + valorinicial);
valor = -1;
 timer.stop();
dispose();
   } else {
     JFfimdejogo obj = new JFfimdejogo();
obj.setVisible(true); 
obj.respostacorreta(" "+ en1 +" " + en2 + " ", " facil 1 de 5");
dispose();
   }
    
}else{
     String[] opcoes = {"Fechar"};
JOptionPane.showOptionDialog(null, "Coloque 1 ou 0", "Insira o valor correto", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);

}
 
    }//GEN-LAST:event_JBenviaActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        JFajuda1 obj = new JFajuda1();
        obj.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFfacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFfacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFfacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFfacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFfacil().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBenvia;
    private javax.swing.JLabel JLfigura;
    private javax.swing.JLabel JLjogador;
    private javax.swing.JLabel JLtexto;
    private javax.swing.JLabel JLtime;
    private javax.swing.JTextField JTentrada1;
    private javax.swing.JTextField JTentrada2;
    private javax.swing.JTextField JTsaida1;
    private javax.swing.JTextField JTsaida2;
    private javax.swing.JTextField jBtotal;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private void Contador(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
