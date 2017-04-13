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
        if(model.getPlayer() == 1){
            return "x";
        } else  return "o";
    }

    public String getWinner() {
        if(model.getWinner() == 1){
            return "The winner is X";
        } else return "The winner is O";
    }
}
