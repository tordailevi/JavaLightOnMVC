package controller;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
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
        frissitSzam();
        ellenorizGyozelem();
    }

    public LightOnModel[] getLampaLista() {
        return lampaLista;
    }

    public void listaFeltoltes() {
        for (int i = 0; i < lampaLista.length; i++) {
            int veletlen = RND.nextInt(2);
            lampaLista[i] = new LightOnModel(veletlen, i);
        }
    }

    private void initEventek() {
        JButton[] gombok = view.getGombok();
        for (int i = 0; i < gombok.length; i++) {
            final int index = i;
            gombok[i].addActionListener(e -> {
                kapcsol(index);
                frissitSzam();
                ellenorizGyozelem();
            });
        }

        view.getBtnUjJatek().addActionListener(e -> {
            ujJatek();
            frissitSzam();
            ellenorizGyozelem();
        });

        view.getMnuMentes().addActionListener(e -> mentes());
        view.getMnuBetoltes().addActionListener(e -> betoltes());
    }

    public void kapcsol(int index) {
        JButton[] gombok = view.getGombok();
        toggle(index);
        int row = index / 3;
        int col = index % 3;

        if (row > 0) toggle(index - 3);
        if (row < 2) toggle(index + 3);
        if (col > 0) toggle(index - 1);
        if (col < 2) toggle(index + 1);

        animateButton(gombok[index], gombok[index].getBackground(), lampaLista[index].getAllapot() == 1 ? Color.YELLOW : Color.DARK_GRAY);
        refreshView();
    }

    public void toggle(int index) {
        LightOnModel lampa = lampaLista[index];
        lampa.setAllapot(lampa.getAllapot() == 0 ? 1 : 0);
    }

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

    public void ujJatek() {
        for (int i = 0; i < lampaLista.length; i++) {
            int random = RND.nextInt(2);
            lampaLista[i].setAllapot(random);
        }
        refreshView();
    }

    private void frissitSzam() {
        int lekapcs = 0;
        for (LightOnModel lampa : lampaLista) {
            if (lampa.getAllapot() == 0) lekapcs++;
        }
        view.getTxtLekapcsLampakSzama().setText(String.valueOf(lekapcs));
    }

    private void ellenorizGyozelem() {
        boolean mindenFel = true;
        for (LightOnModel lampa : lampaLista) {
            if (lampa.getAllapot() == 0) {
                mindenFel = false;
                break;
            }
        }
        if (mindenFel) {
            view.getTxtEredmenyKiiras().setText("Gratulálok, minden lámpa fel van kapcsolva!");
        } else {
            view.getTxtEredmenyKiiras().setText("Játék folyamatban...");
        }
    }

    private void mentes() {
        try (FileWriter fw = new FileWriter("lights_save.txt")) {
            for (LightOnModel lampa : lampaLista) {
                fw.write(lampa.getAllapot() + "\n");
            }
            JOptionPane.showMessageDialog(view, "Mentés kész!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(view, "Mentés sikertelen: " + ex.getMessage());
        }
    }
    
    private void betoltes() {
        try (java.util.Scanner sc = new java.util.Scanner(new java.io.File("lights_save.txt"))) {
            int i = 0;
            while (sc.hasNextLine() && i < lampaLista.length) {
                String sor = sc.nextLine();
                int allapot = Integer.parseInt(sor.trim());
                lampaLista[i].setAllapot(allapot);
                i++;
            }
            refreshView();
            frissitSzam();
            ellenorizGyozelem();
            JOptionPane.showMessageDialog(view, "Betöltés kész!");
        } catch (java.io.FileNotFoundException ex) {
            JOptionPane.showMessageDialog(view, "Nincs mentett fájl!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, "Hiba a betöltés során: " + ex.getMessage());
        }
    }
    
private void animateButton(JButton gomb, Color start, Color end) {
    Timer timer = new Timer(30, null); // gyorsabb, simább animáció
    final int steps = 15;
    final int[] currentStep = {0};

    timer.addActionListener(e -> {
        float t = (float) currentStep[0] / steps;
        // easing in-out (smoother)
        t = t * t * (3 - 2 * t);

        int r = (int) (start.getRed() * (1 - t) + end.getRed() * t);
        int g = (int) (start.getGreen() * (1 - t) + end.getGreen() * t);
        int b = (int) (start.getBlue() * (1 - t) + end.getBlue() * t);

        gomb.setBackground(new Color(r, g, b));
        currentStep[0]++;

        if (currentStep[0] > steps) {
            ((Timer) e.getSource()).stop();
        }
    });
    timer.start();
}


}
