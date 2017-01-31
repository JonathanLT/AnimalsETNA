package com.etna;

/**
 * Created by crystal on 22/01/2017.
 */
public class Player {
    private String playerName;
    private int playerScore;

    Player(String name) {
        this.playerName = name;
        this.playerScore = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public void winGame() {
        this.setPlayerScore(this.getPlayerScore() + 1);
    }
}