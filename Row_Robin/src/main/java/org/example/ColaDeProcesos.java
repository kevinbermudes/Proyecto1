package org.example;

import org.example.Proceso;

import java.util.LinkedList;
import java.util.Queue;

class ColaDeProcesos {
    public static void main(String[] args) {
        int capacidadCola = 50;
        Proceso[] cola = new Proceso[capacidadCola];
        int indiceInicio = 0;
        int indiceFin = 0;

        // generador de procesos
        for (int i = 0; i < capacidadCola; i++) {
            cola[indiceFin] = new Proceso();
            indiceFin = (indiceFin + 1) % capacidadCola;
        }

        // bucle de procesos
        while (cola[indiceInicio] != null) {
            Proceso procesoActual = cola[indiceInicio];
            procesoActual.ejecutar();
            cola[indiceInicio] = null;
            indiceInicio = (indiceInicio + 1) % capacidadCola;
        }
    }
}


