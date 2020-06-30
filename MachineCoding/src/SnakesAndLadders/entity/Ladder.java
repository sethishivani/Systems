package SnakesAndLadders.entity;

public class Ladder {
    private int start;
    private int end;
    public Ladder(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    int getEnd() {
        return end;
    }
}
