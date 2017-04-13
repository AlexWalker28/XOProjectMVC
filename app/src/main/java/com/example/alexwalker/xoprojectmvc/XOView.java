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
        if(model.getWinner() == 1){
            return "The winner is X";
        } else return "The winner is O";
    }
}
