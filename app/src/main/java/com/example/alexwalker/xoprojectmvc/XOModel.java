package com.example.alexwalker.xoprojectmvc;

/**
 * Created by alexwalker on 13.04.17.
 */

class XOModel {

    private int player;
    private int winner;
    private int[][] coordinates;

    public XOModel() {
        player = 1;
        winner = 0;
        coordinates = new int[3][3];
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public int getWinner() {
        return winner;
    }
    public void setWinner(int winner) {
        this.winner = winner;
    }

    public int getCoordinates(int x, int y) {
        return coordinates[x][y];
    }

    public void setData(int x, int y, int player) {
        coordinates[x][y] = player;
        setPlayer(player);
    }


}
