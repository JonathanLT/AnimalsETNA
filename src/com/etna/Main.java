package com.etna;

public class Main {

    public static void main(String[] args) {
        // write your code here
        GameArena game = new GameArena("Marcel", "Suzie");

        Chien marcel_f1 = new Chien("Pikachu");
        Furet marcel_f2 = new Furet("Evoli");

        Chat suzie_f1 = new Chat("Miaouss");
        Chien suzie_f2 = new Chien("Belle");

        game.fight(marcel_f1, suzie_f1);
        game.fight(marcel_f2, suzie_f2);

        // Affichage des scores finale !
        game.printScores();

    }
}
