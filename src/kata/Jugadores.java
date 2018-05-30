/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

/**
 *
 * @author Pc
 */
public class Jugadores {
    
    public String Nombre;
    public int Score;
    public boolean Ganador;

    public Jugadores() {
    }

    public Jugadores(int Score) {
        this.Score = Score;
    }
    
    public Jugadores(String Nombre, int Score, boolean Ganador) {
        this.Nombre = Nombre;
        this.Score = Score;
        this.Ganador = Ganador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public boolean isGanador() {
        
        return Ganador;
    }

    public void setGanador(boolean Ganador) {
        this.Ganador = Ganador;
    }
    
    
}
