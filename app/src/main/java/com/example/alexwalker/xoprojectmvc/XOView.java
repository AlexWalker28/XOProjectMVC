package com.example.alexwalker.xoprojectmvc;

/**
 * Created by alexwalker on 13.04.17.
 */

class XOView {

    private XOModel model;

    public XOView(XOModel model) {
        this.model = model;
    }

    public String getPlayer() {
        String player = "";
        if(model.getPlayer() == 1){
            player = "x";
        } else  if(model.getPlayer() == 2){
            player = "o";
        }
        return player;
    }

    public String getWinner() {
        String winner = "";
        if(model.getWinner() == 1){
            winner = "The winner is X";
        } else if(model.getWinner() == 2){
            winner = "The winner is O";
        }
        return winner;
    }
}
