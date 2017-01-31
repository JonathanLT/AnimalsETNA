package com.etna;

import java.util.ArrayList;

/**
 * Created by crystal on 22/01/2017.
 */
public class GameArena {
    private ArrayList<Player> gamePlayers = new ArrayList<>();

    public GameArena(String NamePlayer1, String NamePlayer2) {
        gamePlayers.add(new Player(NamePlayer1));
        gamePlayers.add(new Player(NamePlayer2));
    }

    public boolean fight(AbstractAnimal fighterP1, AbstractAnimal fighterP2) {
        if (fighterP1.get_status() == statusAnimal.DEAD || fighterP2.get_status() == statusAnimal.DEAD) {
            System.out.println("Les animaux morts ne peuvent combatre");
            return (false);
        }
        System.out.println("Fight between " + fighterP1.get_name() + " and " + fighterP2.get_name());
        int i = 0;
        while (fighterP1.get_status() != statusAnimal.DEAD && fighterP2.get_status() != statusAnimal.DEAD) {
            fighterP1.attack(fighterP2);
            fighterP2.attack(fighterP1);
            System.out.println("Round " + i++ + " Animal/HP :" + fighterP1.get_name() + "/" + fighterP1.get_hp() + " and " + fighterP2.get_name() + "/" + fighterP2.get_hp());
        }
        AbstractAnimal winner = getWinnerFighter(fighterP1, fighterP2);
        if (winner == fighterP1) {
            gamePlayers.get(0).winGame();
        } else if (winner == fighterP2) {
            gamePlayers.get(1).winGame();
        }
        if (winner != null) {
            System.out.println(winner.get_name() + " is the Winner");
            return (true);
        } else {
            System.out.println("Match nul !");
            return (false);
        }
    }

    private AbstractAnimal getWinnerFighter(AbstractAnimal fighterP1, AbstractAnimal fighterP2) {
        if (fighterP1.get_status() == statusAnimal.ALIVE && fighterP2.get_status() == statusAnimal.DEAD) {
            return fighterP1;
        }
        if (fighterP2.get_status() == statusAnimal.ALIVE && fighterP1.get_status() == statusAnimal.DEAD) {
            return fighterP2;
        }
        System.out.println("All animals are Dead .... No one wins !!!");
        return (null);
    }

    public void printScores() {
        System.out.println("????? Scores ?????");
        for (Player aPlayer : gamePlayers) {
            System.out.println("Nom : " + aPlayer.getPlayerName() + ", Score : " + aPlayer.getPlayerScore());
        }
        System.out.println("????? End Score ?????");
    }
}