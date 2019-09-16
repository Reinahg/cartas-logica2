/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicacartas;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logicacartas.Carta.Conjunto;
import logicacartas.Carta.NombreCarta;
import logicacartas.Carta.PintaCarta;

/**
 *
 * @author valer
 */
public class Jugador {

    private Random r;
    private Carta[] cartas;

    private Conjunto[] conjuntos;
    private NombreCarta[] cartasFigura;

    

    int valorCarta = 0;     //El valor de la carta dentro de la figura
    int cantidadCarta = 0;  //El valor de la figura, terna o cuarta
    int valorFigura = 0;    //La multiplicación de ambos, dando el valor total de la figura

    public Jugador() {
        r = new Random();
    }

    public void repartir() { //Método para obtener las cartas para el jugador
        cartas = new Carta[10];
        for (int i = 0; i < 10; i++) {
            cartas[i] = new Carta(r);
        }
        obtenerFiguras();
    }

    public void mostrar(JPanel pnl, boolean tapada) {    //Mostrar las cartas recibidas 
        pnl.removeAll();
        for (int i = 0; i < 10; i++) {
            cartas[i].mostrarCarta(5 + i * 45, 5, pnl, tapada);
        }
        pnl.repaint();
    }

    public String obtenerFiguras() { //Obtener las figuras iguales en cartas
        valorFigura = 0;

        conjuntos = null;

        int[] contadores = new int[13];
        for (int i = 0; i < 10; i++) {
            contadores[cartas[i].obtenerNombre().ordinal() - 1]++;
        }
        int totalFiguras = 0;
        for (int i = 0; i < 13; i++) {
            if (contadores[i] >= 3) {
                totalFiguras++;
            }
        }
        if (totalFiguras > 0) {
            conjuntos = new Conjunto[totalFiguras];
            cartasFigura = new NombreCarta[totalFiguras];
            totalFiguras = 0;
            for (int i = 0; i < 13; i++) {
                if (contadores[i] >= 3) {
                    conjuntos[totalFiguras] = Conjunto.values()[contadores[i]];
                    cartasFigura[totalFiguras] = NombreCarta.values()[i + 1];
                    if (NombreCarta.values()[i + 1].ordinal() == 13 || NombreCarta.values()[i + 1].ordinal() == 12 || NombreCarta.values()[i + 1].ordinal() == 11 || NombreCarta.values()[i + 1].ordinal() == 1) {
                        valorCarta = 10;
                    } else {
                        valorCarta = NombreCarta.values()[i + 1].ordinal();
                    }
                    totalFiguras++;
                }
            }
        }
        String mensaje = "";
        if (conjuntos == null) {
            mensaje = "No hay figuras";
        } else {
            mensaje = "El jugador tiene las siguientes Figuras:\n ";
            for (int i = 0; i < conjuntos.length; i++) {
                mensaje += conjuntos[i].name() + " de " + cartasFigura[i].toString() + "\n";
               
                
                cantidadCarta = conjuntos[i].ordinal();
                valorFigura += cantidadCarta * valorCarta;
                //System.out.println("valorFigura: "+ valorFigura);
            }
        }
        return mensaje;
    }

    public int obtenerValorTotal() { //Recibe el numero de la carta, los suma y devuelve el valor total
        //System.out.println("valorFigura: "+ valorFigura);
        obtenerFiguras(); 
        int valorTotal = 0; 
        
        for (int i = 0; i < 10; i++) {
            valorTotal += cartas[i].obtenerValor(); //Sumo todos los valores de las cartas
        }
        //System.out.println("valorTotal: "+ valorTotal);
        valorTotal -= valorFigura; //Estos valores les resto los valores de las cartas con figuras
                 

        return valorTotal;
    }
    
    public String obtenerEscalera(){
         int cartasOrdenadas[] = new int[13];    //Creo un nuevo array

        for (int i = 0; i < cartas.length; i++) {
            cartasOrdenadas[i] = cartas[i].indice;  //El indice de cada carta se lo asigno a el nuevo array
        }

        Arrays.sort(cartasOrdenadas);   //Organizo los indices recogidos
        String escalera = "";
        boolean escaleraTrue;
        int i = 0;
        while (i < cartasOrdenadas.length) {    //while para que pueda encontrar varias escaleras sí las hay 

            String pinta;
            if (cartasOrdenadas[i] <= 13) {
                pinta = "Trebol";
            } else if (cartasOrdenadas[i] <= 26) {
                pinta = "Pica";
            } else if (cartasOrdenadas[i] <= 39) {
                pinta = "Corazón";
            } else {
                pinta = "Diamante";
            }   //Recibo la pinta de el índice donde estoy

            //No se utilizó el método obtenerPinta de Carta por que el índice seria diferente ya
            //que en el al utilizar cartasOrdenadas[i], es totalmente diferente a cartas[i] por el hecho
            //de que una está organizada de menor a mayor y la otra está al azar. Y 
            //devolvería la pinta que no es
            try {
                if (cartasOrdenadas[i] == cartasOrdenadas[i + 1] - 1
                        && cartasOrdenadas[i + 1] == cartasOrdenadas[i + 2] - 1
                        && cartasOrdenadas[i + 2] == cartasOrdenadas[i + 3] - 1) {
                    //sí dos números son consecutivos, el número anterior debe ser igual al siguiente, solo que con -1
                    //ejm: 3 = 4-1
                    //Se compara que sean consecutivos 4 veces, sí es verdadero entonces sería una cuarta

                    escalera = "Tiene una cuarta de " + pinta + "\n";
                    i += 4;
                } else if (cartasOrdenadas[i] == cartasOrdenadas[i + 1] - 1
                        && cartasOrdenadas[i + 1] == cartasOrdenadas[i + 2] - 1) {
                    //Sino, se compara que sea consecutivos 3 veces, si es verdadero entonces sería una terna
                    escalera = "Tiene una terna de " + pinta + "\n";
                    i += 3;
                    //i+= para qué no siga comparando las que ya fueron encontradas
                }
            } catch (Exception e) {
                escalera = "No tiene escaleras";
            }
            i++;
        }

        return escalera;
    }

}

    

