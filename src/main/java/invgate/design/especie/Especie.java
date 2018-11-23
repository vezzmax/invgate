package invgate.design.especie;

import java.util.List;

import invgate.design.Tamagochi;
import invgate.design.status.Despierto;
import invgate.design.status.Dormido;
import invgate.design.status.Estado;

public abstract class Especie implements Tamagochi {

    protected String nombre;

    protected List<Especie> temores;

    protected Estado estado;


    public void hacerRuido() {
        estado.hacerRuido(this);
    }

    public void moverse() {
        estado.moverse(this);
    }

    public void despertar() {
        estado = new Despierto();
    }

    public void dormir() {
        estado = new Dormido();
    }

    public abstract void gruñir();

    public abstract void roncar();

    public abstract void reir();

    public abstract void llorar();

    public abstract void desplazarse();
}
