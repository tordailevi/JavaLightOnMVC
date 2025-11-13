package main;

import view.LightOnView;
import controller.LightOnController;

public class Jatekindito {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            LightOnView view = new LightOnView();
            LightOnController controller = new LightOnController(view);
            view.setVisible(true); view.setLocationRelativeTo(null);
        });
    }
}