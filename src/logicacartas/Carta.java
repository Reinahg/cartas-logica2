/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicacartas;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author valer
 */
public class Carta {
    public int indice;
    
    public int valor;
    
    public enum PintaCarta {

        NINGUNO,
        TREBOL,
        PICA,
        CORAZON,
        DIAMANTE
    }
    
    public enum Conjunto {

        NINGUNO,
        UNO,
        PAR,
        TERNA,
        CUARTA
    }
    
    public enum NombreCarta {

        NINGUNO,
        ACE,
        DOS,
        TRES,
        CUATRO,
        CINCO,
        SEIS,
        SIETE,
        OCHO,
        NUEVE,
        DIEZ,
        JACK,
        QUEEN,
        KING;
    }
    
    public Carta(Random r){
        indice = r.nextInt(52)+1;
    }
    
    public PintaCarta obtenerPinta(){
        if (indice <= 13) {
            return PintaCarta.TREBOL;
        }
        else if(indice<=26){
            return PintaCarta.PICA;
        }
        else if(indice<=39){
            return PintaCarta.CORAZON;
        }
        else{
            return PintaCarta.DIAMANTE;
        }
    }
    
    public NombreCarta obtenerNombre(){
        int numero = indice%13;
        if (numero==0) {
            numero = 13;
        }
        return NombreCarta.values()[numero];
    }
    
    public int obtenerValor(){  
        //el valor es el módulo de índice sobre 13, si este valor es igual a 1,11,12,13 pasa a ser igual a 10
        valor = indice%13;
        if (valor == 1 || valor==11 || valor == 12 || valor==13 ) {
            valor = 10;
        }
        return valor;
    }
    
    public void mostrarCarta(int x, int y, JPanel pnl, boolean tapada){
        String nombreImagen;
        if (tapada) {
            nombreImagen = "/cartas/Tapada.jpg";
        }
        else{
            nombreImagen = "/cartas/Carta" + String.valueOf(indice) + ".JPG";
        }
        
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));
        
        JLabel lblCarta = new JLabel(imagen);
        
        lblCarta.setBounds(x,y,x+imagen.getIconWidth(),y+imagen.getIconHeight());
        
        pnl.add(lblCarta);
    }
    
}
