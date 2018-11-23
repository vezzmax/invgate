package invgate.design;

import org.junit.Test;

import invgate.design.especie.Tortuga;

public class TamagochiTest {

    @Test
    public void tortuga() {
        Tortuga tortuga = new Tortuga();
        tortuga.desplazarse();
        tortuga.dormir();
        tortuga.hacerRuido();
        tortuga.despertar();
        tortuga.hacerRuido();
    }
}
