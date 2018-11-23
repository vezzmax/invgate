package invgate.design.status;

import invgate.design.especie.Especie;

public class Despierto implements Estado {

    public void hacerRuido(Especie especie) {
        especie.gruñir();
    }

    public void moverse(Especie especie) {
        especie.desplazarse();
    }
}
