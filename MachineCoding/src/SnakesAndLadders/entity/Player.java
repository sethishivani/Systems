package SnakesAndLadders.entity;

public class Player {
    private String names;
    private int pos;
    public Player(String names)
    {
        this.names=names;
        this.pos=0;
    }
    public int getPos() {
        return pos;
    }
    public void setPos(int pos) {
        this.pos = pos;
    }

    String getNames() {
        return names;
    }

    boolean move(int diceVal)
    {
        if(pos+diceVal>100)
            return false;
        pos=pos+diceVal;
        if(pos==100)
            return true;
        return false;
    }
}