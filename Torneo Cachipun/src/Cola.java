/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Cola {

    private NodoCola first;
    private NodoCola last;

    public Cola() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void push(Participante dato) {
        NodoCola nodoCola = new NodoCola(dato);
        if (this.isEmpty()) {
            this.first = nodoCola;
            this.last = nodoCola;
        } else {
            this.last.setSiguiente(nodoCola);
            this.last = nodoCola;
        }
    }

    public Participante pop() {
        if (!this.isEmpty()) {
            NodoCola auxiliar = this.first;
            this.first = this.first.getSiguiente();
            return auxiliar.getDato();
        }
        return null;
    }

    public Participante peek() {
        if (!this.isEmpty()) {
            NodoCola auxiliar = this.first;
            return auxiliar.getDato();
        }
        return null;
    }

    public int contar() {
        int contador = 0;
        Cola auxiliar = new Cola();
        while (!this.isEmpty()) {
            auxiliar.push(this.pop());
            contador++;
        }
        while (!auxiliar.isEmpty()) {
            this.push(auxiliar.pop());
        }
        return contador;
    }

    public String imprimir() {
        String s = "";
        Cola auxiliar = new Cola();
        while (!this.isEmpty()) {
            Participante participante = this.pop();
            s += "\n" + participante.getNombre();
            auxiliar.push(participante);
        }
        while (!auxiliar.isEmpty()) {
            this.push(auxiliar.pop());
        }
        return s;
    }

}
