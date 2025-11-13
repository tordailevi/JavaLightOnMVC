package test;

import controller.LightOnController;
import view.LightOnView;
import model.LightOnModel;

public class TestUjJatek {
    public static void main(String[] args) {
        LightOnView view = new LightOnView();
        LightOnController controller = new LightOnController(view);

        assert controller.getLampaLista().length == 9;

        controller.ujJatek();

        for (LightOnModel lamp : controller.getLampaLista()) {
            assert lamp.getAllapot() == 0 || lamp.getAllapot() == 1 : "Új játék után érvénytelen állapot";
        }

        System.out.println("TestUjJatek minden teszt sikeresen lefutott!");
    }
}
