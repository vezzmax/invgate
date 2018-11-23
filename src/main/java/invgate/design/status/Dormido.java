package invgate.design.status;

import invgate.design.especie.Especie;

public class Dormido implements Estado {

    public void hacerRuido(Especie especie) {
        especie.roncar();
    }

    public void moverse(Especie especie) {
        //do nothing
    }
}
