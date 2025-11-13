package test;

import model.LightOnModel;

public class TestToggle {
    public static void main(String[] args) {
        LightOnModel lampa = new LightOnModel(0, 0);

        assert lampa.getAllapot() == 0 : "Kezdeti állapot nem 0";

        lampa.setAllapot(lampa.getAllapot() == 0 ? 1 : 0);
        assert lampa.getAllapot() == 1 : "Toggle után az állapot nem 1";

        lampa.setAllapot(lampa.getAllapot() == 0 ? 1 : 0);
        assert lampa.getAllapot() == 0 : "Második toggle után az állapot nem 0";

        System.out.println("TestToggleAssert minden teszt sikeresen lefutott!");
    }
}
