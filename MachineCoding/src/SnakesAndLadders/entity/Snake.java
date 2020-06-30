package SnakesAndLadders.entity;

public class Snake {
    private int head;
    private int tail;
    public Snake(int head,int tail)
    {
        this.head = head;
        this.tail = tail;
    }

    public int getTail() {
        return tail;
    }
}
