
package Clases;

import Estructuras.BinNode;
import java.time.LocalTime;

public class Juego {
    private LocalTime temporizador;
    private BinNode<Jugador> jugadores;
    
    public Juego(BinNode<Jugador> jugadores){
        temporizador=LocalTime.now();
        this.jugadores=jugadores;
    }
    
}
