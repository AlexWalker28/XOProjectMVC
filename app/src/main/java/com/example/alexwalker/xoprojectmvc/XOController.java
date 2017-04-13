package com.example.alexwalker.xoprojectmvc;

/**
 * Created by alexwalker on 13.04.17.
 */

class XOController {


    private XOModel model;


    public XOController(XOModel model) {
        this.model = model;
    }

    public void changePlayer() {
        if(getPlayer() == 1){
            setPlayer(2);
        } else setPlayer(1);
    }

    public int getPlayer() {
        return model.getPlayer();
    }

    public void setPlayer(int player) {
        model.setPlayer(player);
    }

    public void update() {
        if(getCoordinates(0,0) == 1 && getCoordinates(1,0) == 1 && getCoordinates(2,0) == 1){
            model.setWinner(1);
        }
        changePlayer();
    }

    private int getCoordinates(int x, int y) {
        return model.getCoordinates(x,y);
    }
    public void setData(int x, int y, int player) {
        model.setData(x, y, player);
    }
}
