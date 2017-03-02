/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class NodoCola {

    private Participante dato;
    private NodoCola siguiente;

    public NodoCola() {
        this.dato = null;
        this.siguiente = null;
    }

    public NodoCola(Participante dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public NodoCola(Participante dato, NodoCola siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Participante getDato() {
        return dato;
    }

    public void setDato(Participante dato) {
        this.dato = dato;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

}
