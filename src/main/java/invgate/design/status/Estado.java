package invgate.design.status;

import invgate.design.especie.Especie;

public interface Estado {

    void hacerRuido(Especie especie);

    void moverse(Especie especie);

}
