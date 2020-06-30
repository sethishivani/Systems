package SnakesAndLadders;

import SnakesAndLadders.entity.Game;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        try
        {
            Game ob=new Game();
            ob.play();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
