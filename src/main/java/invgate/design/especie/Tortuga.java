package invgate.design.especie;

import java.util.Random;

import invgate.design.status.Despierto;

public class Tortuga extends Especie {

    private int duracion = 5;

    public Tortuga() {
        this.nombre = "Torguga";
        estado = new Despierto();
    }


    public void gruñir() {
        for (int i=0; i < duracion; i++) {
            System.out.println("Yi Yi Yi");
        }
    }

    public void roncar() {
        for (int i=0; i < duracion; i++) {
            System.out.println("ZzZ...");
        }
    }

    public void reir() {

    }

    public void llorar() {

    }

    public void desplazarse() {
        System.out.print("Moviendose " + new Random(10));
    }
}
