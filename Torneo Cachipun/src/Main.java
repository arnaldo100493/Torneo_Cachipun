/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("TORNEO CACHIPUN");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola primeraRonda = new Cola();
        Cola segundaRonda = new Cola();
        int maximoClasificados = 10;
        int cantidadClasificados = 0;
        int puntosParaClasificar = 5;

        for (int i = 1; i <= 20; i++) {
            primeraRonda.push(new Participante());
        }

        Participante p1 = null;
        Participante p2 = null;

        // Primera ronda
        while (cantidadClasificados < maximoClasificados) {
            if (p1 == null) {
                p1 = primeraRonda.pop();
            }
            if (p2 == null) {
                p2 = primeraRonda.pop();
            }
            c.print(p1.getNombre() + " VS " + p2.getNombre());
            int ganador = (int) (Math.random() * 2) + 1;

            if (ganador == 1) {
                p1.ganar(); // Suma un punto
                c.println(p1.getDatosParticipante() + " WIN");
                primeraRonda.push(p2);
                p2 = null;

                if (p1.getPuntaje() == puntosParaClasificar) {
                    c.println("Clasificado para la segunda ronda");
                    segundaRonda.push(p1);
                    cantidadClasificados++;
                    p1 = null;
                }
            }
            if (ganador == 2) {
                p2.ganar(); // Suma un punto
                c.println(p1.getDatosParticipante() + " WIN");
                primeraRonda.push(p1);
                p1 = null;

                if (p2.getPuntaje() == puntosParaClasificar) {
                    c.println("Clasificado para la segunda ronda");
                    segundaRonda.push(p2);
                    cantidadClasificados++;
                    p2 = null;
                }
            }
        }
        c.println("Clasificados Segunda Ronda: ");
        c.println(segundaRonda.imprimir());

        // Segunda ronda
        c.println("\nSegunda Ronda: ");
        while (cantidadClasificados > 1) {
            p1 = segundaRonda.pop();
            p2 = segundaRonda.pop();

            c.print(p1.getNombre() + " VS " + p2.getNombre());

            int ganador = (int) (Math.random() * 2) + 1;

            if (ganador == 1) {
                c.println(p1.getNombre() + " WIN");
                segundaRonda.push(p1);
            }

            if (ganador == 2) {
                c.println(p2.getNombre() + " WIN");
                segundaRonda.push(p2);
            }
            cantidadClasificados--;
        }
        Participante campeon = segundaRonda.pop();
        c.println("\nCampeón Cachipun 2012 " + campeon.getDatosParticipante());

    }
}
