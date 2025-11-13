package test;

import controller.LightOnController;
import view.LightOnView;
import model.LightOnModel;

public class TestKapcsol {
    public static void main(String[] args) {
        LightOnView view = new LightOnView();
        LightOnController controller = new LightOnController(view);

        assert controller.getLampaLista().length == 9 : "Nem 9 lámpa van a listában";

        for (LightOnModel lamp : controller.getLampaLista()) {
            assert lamp.getAllapot() == 0 || lamp.getAllapot() == 1 : "Lámpa állapot érvénytelen";
        }

        controller.kapcsol(4);

        LightOnModel[] lista = controller.getLampaLista();
        int[] vartIndexek = {1, 3, 4, 5, 7};
        for (int i : vartIndexek) {
            int allapot = lista[i].getAllapot();
            assert allapot == 0 || allapot == 1 : "A(z) " + i + ". indexen a lámpa állapota hibás: " + allapot;
        }


        System.out.println("TestKapcsol minden teszt sikeresen lefutott!");
    }
}
