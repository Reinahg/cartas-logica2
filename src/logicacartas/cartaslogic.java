/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicacartas;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author valer
 */
public class cartaslogic extends javax.swing.JFrame {

    /**
     * Creates new form cartaslogic
     */
    
    Jugador[] jugadores = new Jugador[2];
    
    public cartaslogic() {
        initComponents();
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador();   
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnRepartir = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        btnGanador = new javax.swing.JButton();
        btnEscaleras = new javax.swing.JButton();
        tpJugadores = new javax.swing.JTabbedPane();
        pnlJugador1 = new javax.swing.JPanel();
        pnlJugador2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btnRepartir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Repartir.png"))); // NOI18N
        btnRepartir.setToolTipText("Encontrar grupos");
        btnRepartir.setFocusable(false);
        btnRepartir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRepartir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRepartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepartirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRepartir);

        btnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Verificar.png"))); // NOI18N
        btnVerificar.setToolTipText("Repartir cartas");
        btnVerificar.setFocusable(false);
        btnVerificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVerificar);

        btnGanador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ganador.png"))); // NOI18N
        btnGanador.setFocusable(false);
        btnGanador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGanador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGanador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGanadorActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGanador);

        btnEscaleras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Escalera.png"))); // NOI18N
        btnEscaleras.setFocusable(false);
        btnEscaleras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEscaleras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEscaleras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscalerasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEscaleras);

        tpJugadores.setBackground(new java.awt.Color(255, 255, 255));
        tpJugadores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tpJugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tpJugadores.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        pnlJugador1.setBackground(new java.awt.Color(153, 51, 255));

        javax.swing.GroupLayout pnlJugador1Layout = new javax.swing.GroupLayout(pnlJugador1);
        pnlJugador1.setLayout(pnlJugador1Layout);
        pnlJugador1Layout.setHorizontalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        pnlJugador1Layout.setVerticalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        tpJugadores.addTab("Jugador1", pnlJugador1);

        pnlJugador2.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout pnlJugador2Layout = new javax.swing.GroupLayout(pnlJugador2);
        pnlJugador2.setLayout(pnlJugador2Layout);
        pnlJugador2Layout.setHorizontalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        pnlJugador2Layout.setVerticalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        tpJugadores.addTab("Jugador 2", pnlJugador2);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Feliz.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(tpJugadores))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepartirActionPerformed
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].repartir(); //Reparto las cartas
        }
        jugadores[0].mostrar(pnlJugador1,false);    //Muestro las cartas
        jugadores[1].mostrar(pnlJugador2,false);
    }//GEN-LAST:event_btnRepartirActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        int pestaña = tpJugadores.getSelectedIndex();
        
        JOptionPane.showMessageDialog(new JFrame(),jugadores[pestaña].obtenerFiguras());
        
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnGanadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGanadorActionPerformed
        // TODO add your handling code here:
        String mensajeGanador = "";
        
        if (jugadores[0].obtenerValorTotal() < jugadores[1].obtenerValorTotal()) {
            mensajeGanador = "El jugador 1 es el ganador con " + jugadores[0].obtenerValorTotal() + " puntos, por encima del jugador 2 con " + jugadores[1].obtenerValorTotal() + " puntos";
        }else if(jugadores[0].obtenerValorTotal() > jugadores[1].obtenerValorTotal()){
            mensajeGanador = "El jugador 2 es el ganador con " + jugadores[1].obtenerValorTotal() + " puntos, por encima del jugador 1 con " + jugadores[0].obtenerValorTotal() + " puntos";
        }else{
            mensajeGanador = "Ambos jugadores empataron con " + jugadores[0].obtenerValorTotal() + " puntos";
        }
        
        JOptionPane.showMessageDialog(new JFrame(),mensajeGanador);
    }//GEN-LAST:event_btnGanadorActionPerformed

    private void btnEscalerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscalerasActionPerformed
        // TODO add your handling code here:
        int pestaña = tpJugadores.getSelectedIndex(); 
        
        JOptionPane.showMessageDialog(new JFrame(),jugadores[pestaña].obtenerEscalera());
        //Obtener escaleras 
    }//GEN-LAST:event_btnEscalerasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(new JFrame(),"Un trabajo excelente");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(cartaslogic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cartaslogic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cartaslogic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cartaslogic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cartaslogic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscaleras;
    private javax.swing.JButton btnGanador;
    private javax.swing.JButton btnRepartir;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton jButton2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel pnlJugador1;
    private javax.swing.JPanel pnlJugador2;
    private javax.swing.JTabbedPane tpJugadores;
    // End of variables declaration//GEN-END:variables
}