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
 *@author TCC S05 G10
 */
public class JFnormalfase2 extends javax.swing.JFrame {

    /**
     * @return the valorrec
     */
    public int getValorrec() {
        return valorrec;
    }

    /**
     * @param valorrec the valorrec to set
     */
    public void setValorrec(int valorrec) {
        this.valorrec = valorrec;
    }

    private Timer timer;
    private String ent1;
    private String ent2;
    private String ent3;
    private String ent4;
     /**
     * @recebe o valor da fase anterior
     */
    private int valorrec;
      private int fase;
    
    /**
     * Creates new form JFfacil
     */
    public JFnormalfase2() {
         Random random = new Random();
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        JLtime.setText("00:59");
         /**
     * @carrega o valor da fase anterior e sorteia qual sera o valor de entrada e saida correto
     * para o jogador adivinhar.
     */
       int numero = random.nextInt(4);
       JFvoceganhoufasen2 obj2 = new JFvoceganhoufasen2();
       valorrec = obj2.getValort();
         jBtotal.setText("" + valorrec);
                 switch (numero) {
                     

case 1:


            ent1= "1";
            ent2= "1";
            ent3= "0";
            ent4= "0";
          JTsaida1.setText("0");
          JTsaida1.enable(false);
          JTsaida2.setText("1");
          JTsaida2.enable(false);
          JTsaida3.setText("0");
          JTsaida3.enable(false);
          JTsaida4.setText("0");
          JTsaida4.enable(false);

break;

case 2:


            ent1= "0";
            ent2= "0";
            ent3= "1";
            ent4= "1";
          JTsaida1.setText("1");
          JTsaida1.enable(false);
          JTsaida2.setText("0");
          JTsaida2.enable(false);
          JTsaida3.setText("0");
          JTsaida3.enable(false);
          JTsaida4.setText("0");
          JTsaida4.enable(false);

break;

case 3:


            ent1= "0";
            ent2= "0";
            ent3= "1";
            ent4= "1";
          JTsaida1.setText("0");
          JTsaida1.enable(false);
          JTsaida2.setText("0");
          JTsaida2.enable(false);
          JTsaida3.setText("0");
          JTsaida3.enable(false);
          JTsaida4.setText("1");
          JTsaida4.enable(false);

break;

default:


            ent1= "1";
            ent2= "0";
            ent3= "0";
            ent4= "1";
          JTsaida1.setText("0");
          JTsaida1.enable(false);
          JTsaida2.setText("0");
          JTsaida2.enable(false);
          JTsaida3.setText("1");
          JTsaida3.enable(false);
          JTsaida4.setText("0");
          JTsaida4.enable(false);

}
/**
     * @conta o tempo em segundos
     */

        timer =new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           contar();
          
            }
            
    });
        timer.start();
    }
     /**
     * @retorna o valor da fase anterior para ser apresentado
     */
     int valor2 = 60;
  Contador retornapontuação = new Contador();
     int valorinicial = 6000;
     public void valordefase(Contador t){
      
     }
     Contador t = new Contador();
         public void recebevalor(Contador t){
   
        int valort = t.totalscore();
        jBtotal.setText("" + valort);
               
  }
       public void fase(int f){
           fase = f;  
         }   
        /**
     * @decrementa o tempo
     */
public void contar(){
    
       valorinicial = valorinicial - 100;
            valor2 = valor2 - 1;            
           
           if (valor2 < 10){
           JLtime.setText("00:0"+ valor2); 
           }else {
    JLtime.setText("00:"+ valor2); 
   
}
              /**
     * @finaliza caso o tempo acabe
     */
   if ((valor2 ==0 && fase == 12)){
       timer.stop();
  JFfimdejogo obj = new JFfimdejogo();
obj.setVisible(true); 
obj.respostacorreta(" "+ ent1 +" " + ent2 + " "+ ent3 +" " + ent4 + " ", " normal 2 de 2");
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
        JTentrada3 = new javax.swing.JTextField();
        JTentrada4 = new javax.swing.JTextField();
        JTsaida3 = new javax.swing.JTextField();
        JTsaida4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jogo das portas logicas");
        setSize(new java.awt.Dimension(800, 600));

        JLtime.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JLtime.setText("00:00");

        JLjogador.setText("jogador 1");

        JLtexto.setText("pontuação");

        JLfigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/circuitoenot.jpg"))); // NOI18N
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

        JTentrada3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTentrada3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JTentrada4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTentrada4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JTsaida3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTsaida3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTsaida3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        JTsaida3.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        JTsaida4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTsaida4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTsaida4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        JTsaida4.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 145, Short.MAX_VALUE)
                        .addComponent(JLfigura, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLjogador, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLtexto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(JLtime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(JTentrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTentrada2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTentrada3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTentrada4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTsaida1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTsaida2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTsaida3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTsaida4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBenvia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(JLjogador)
                        .addGap(28, 28, 28)
                        .addComponent(JLtime, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JLtexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTentrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTentrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTentrada3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTentrada4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTsaida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTsaida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTsaida3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTsaida4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JBenvia)
                                .addGap(18, 18, 18)))))
                .addComponent(JLfigura, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBenviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBenviaActionPerformed
// envia o resultado se o jogador acertou ou erro.

String entrada1 = JTentrada1.getText();
String en1 = JTsaida1.getText();
String en2 = JTsaida2.getText();
String entrada2 = JTentrada2.getText();
String entrada3 = JTentrada3.getText();
String entrada4 = JTentrada4.getText();
if (((entrada1.equalsIgnoreCase("0"))||(entrada1.equalsIgnoreCase("1")))&& ((entrada2.equalsIgnoreCase("0"))||(entrada2.equalsIgnoreCase("1"))) && ((entrada3.equalsIgnoreCase("0"))||(entrada3.equalsIgnoreCase("1")))&& ((entrada4.equalsIgnoreCase("0"))||(entrada4.equalsIgnoreCase("1"))))  {
   if ((entrada1.equalsIgnoreCase(ent1))&&(entrada2.equalsIgnoreCase(ent2))&& (entrada3.equalsIgnoreCase(ent3))&&(entrada4.equalsIgnoreCase(ent4))){
     JFvoceganhoufasen3 obj = new JFvoceganhoufasen3();
     valorinicial = valorinicial + Integer.parseInt(jBtotal.getText());    
     retornapontuação.setConta(valorinicial); 
     obj.recebevalor(retornapontuação);
obj.setVisible(true);
jBtotal.setText("" + valorinicial);
 timer.stop();
dispose();
   } else {
     JFfimdejogo obj = new JFfimdejogo();
obj.setVisible(true); 
obj.respostacorreta(" "+ ent1 +" " + ent2 + " "+ ent3 +" " + ent4 + " ", " normal 2 de 2");
dispose();
   }
    
}else{
     String[] opcoes = {"Fechar"};
JOptionPane.showOptionDialog(null, "Coloque 1 ou 0", "Insira o valor correto", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);

}
 
    }//GEN-LAST:event_JBenviaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           JFajuda6 obj = new JFajuda6();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFnormalfase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFnormalfase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFnormalfase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFnormalfase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFnormalfase2().setVisible(true);
              
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
    private javax.swing.JTextField JTentrada3;
    private javax.swing.JTextField JTentrada4;
    private javax.swing.JTextField JTsaida1;
    private javax.swing.JTextField JTsaida2;
    private javax.swing.JTextField JTsaida3;
    private javax.swing.JTextField JTsaida4;
    private javax.swing.JTextField jBtotal;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    private void Contador(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
