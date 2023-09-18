package org.example;

import java.util.UUID;

public class Proceso {
    UUID pid;
    String nombre;
    long tiempoCreacion;
    long tiempoUltimaModificacion;
    int quantum;
    int prioridad;

    public Proceso() {
        this.pid = UUID.randomUUID();
        this.nombre = "P" + pid.toString().substring(0, 4);
        this.tiempoCreacion = System.currentTimeMillis();
        this.tiempoUltimaModificacion = this.tiempoCreacion;
        this.quantum = (int) (Math.random() * 100) + 1;
        this.prioridad = (int) (Math.random() * 9);
    }

    public void ejecutar() {
      
        System.out.println("Ejecutando proceso " + nombre + " con prioridad " + prioridad + " y quantum " + quantum);
        // Simulamos la ejecución del proceso
        try {
            Thread.sleep(quantum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Proceso " + nombre + " terminado");
    }
}

