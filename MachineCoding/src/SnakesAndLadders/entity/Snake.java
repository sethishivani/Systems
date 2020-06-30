package SnakesAndLadders.entity;

public class Snake {
    int head;
    int tail;
    public Snake(int head,int tail)
    {
        this.head = head;
        this.tail = tail;
    }

    public int getTail() {
        return tail;
    }
}
