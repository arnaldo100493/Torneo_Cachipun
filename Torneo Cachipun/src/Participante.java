/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Participante {

    private String nombre;
    private int puntaje;

    public Participante() {
        this.nombre = "";
        this.puntaje = 0;
    }

    public Participante(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public Participante(Participante participante) {
        this.nombre = participante.getNombre();
        this.puntaje = participante.getPuntaje();
    }

    public String getDatosParticipante() {
        return this.nombre + " [" + this.puntaje + " puntos]";
    }

    public void ganar() {
        this.puntaje++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

}
