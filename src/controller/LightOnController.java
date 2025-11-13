package controller;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import model.LightOnModel;
import view.LightOnView;

public class LightOnController {

    private LightOnModel[] lampaLista = new LightOnModel[9];
    private LightOnView view;
    private static final Random RND = new Random();

    public LightOnController(LightOnView view) {
        this.view = view;
        listaFeltoltes();
        initEventek();
        refreshView();
    }

    // kezdeti random állapot
    public void listaFeltoltes() {
        for (int i = 0; i < lampaLista.length; i++) {
            int veletlen = RND.nextInt(2);
            lampaLista[i] = new LightOnModel(veletlen, i);
        }
    }

    // minden gombra event
    private void initEventek() {
        JButton[] gombok = view.getGombok();
        for (int i = 0; i < gombok.length; i++) {
            final int index = i;
            gombok[i].addActionListener(e -> kapcsol(index));
        }

        // új játék gomb
        view.getBtnUjJatek().addActionListener(e -> ujJatek());
    }

    // lámpa és szomszédai váltása
    private void kapcsol(int index) {
        toggle(index);
        if (index - 3 >= 0) toggle(index - 3); // fölötte
        if (index + 3 < 9) toggle(index + 3);  // alatta
        if (index % 3 != 0) toggle(index - 1); // balra
        if (index % 3 != 2) toggle(index + 1); // jobbra
        refreshView();
    }

    // egy adott lámpa állapotváltása
    private void toggle(int index) {
        LightOnModel lampa = lampaLista[index];
        lampa.setAllapot(lampa.getAllapot() == 0 ? 1 : 0);
    }

    // színek frissítése
    private void refreshView() {
        JButton[] gombok = view.getGombok();
        for (int i = 0; i < lampaLista.length; i++) {
            if (lampaLista[i].getAllapot() == 1) {
                gombok[i].setBackground(Color.YELLOW);
            } else {
                gombok[i].setBackground(Color.DARK_GRAY);
            }
        }
    }

    // ÚJ JÁTÉK – véletlen új állapot
    private void ujJatek() {
        for (int i = 0; i < lampaLista.length; i++) {
            int random = RND.nextInt(2);
            lampaLista[i].setAllapot(random);
        }
        refreshView();
    }
}
