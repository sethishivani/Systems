package SnakesAndLadders;

public class Player {
    String names;
    int pos;
    Player(String names)
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

    public String getNames() {
        return names;
    }

    public boolean move(int diceVal)
    {
        if(pos+diceVal>100)
            return false;
        pos=pos+diceVal;
        if(pos==100)
            return true;
        return false;
    }
}
