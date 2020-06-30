package SnakesAndLadders;

import java.util.*;
import java.io.*;

public class Game {
    int dice;
    boolean end;
    Game()
    {
        dice=0;
        end=false;
    }
    ArrayList<Player> inputPlayer() throws IOException
    {
        int numP;
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter num Of Players");
        numP = Integer.parseInt(br.readLine());
        ArrayList<Player> al=new ArrayList<>();
        for(int i=0;i<numP;i++)
        {
//            System.out.println("Enter a String");
            name = br.readLine();
            Player p= new Player(name);
            al.add(p);
        }
        return al;


    }
    Map<Integer,Snake> inputSnake()
    {
        int numS;
        int head, tail;
        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter num Of Snakes");
        numS=scn.nextInt();
        Map<Integer,Snake> map=new HashMap<Integer,Snake>();
        for(int i=0;i<numS;i++)
        {
//            System.out.println("Enter Snakes head and tail");
            head=scn.nextInt();
            tail=scn.nextInt();
            Snake s= new Snake(head,tail);
            map.put(head,s);
        }
        return map;
    }
    Map<Integer,Ladder> inputLadder()
    {
        int numL;
        int start, end;
        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter num Of Ladder");
        numL=scn.nextInt();
        Map<Integer,Ladder> map=new HashMap<>();
        for(int i=0;i<numL;i++)
        {
//            System.out.println("Enter Ladder start and end");
            start=scn.nextInt();
            end=scn.nextInt();
            Ladder l= new Ladder(start,end);
            map.put(start,l);
        }
        return map;
    }
    public static void main(String[] args) throws IOException {
        Game g=new Game();

//        int numP=players.size();
        Random rand = new Random();
        Map<Integer,Snake> snakes=g.inputSnake();
        Map<Integer,Ladder> ladders=g.inputLadder();
        ArrayList<Player> players=g.inputPlayer();
        while(g.end==false)
        {
            Iterator<Player> it = players.iterator();
            while(it.hasNext()&&g.end==false)
            {
                Player p = it.next();
                // Generate random integers in range 0 to 6
                g.dice = rand.nextInt(6)+1;
                System.out.print(p.getNames()+" rolled a "+g.dice+" and moved from "+p.getPos());
                g.end=p.move(g.dice);
                boolean sOL=true;
                while(sOL)
                {
                    if(snakes.containsKey(p.getPos()))
                    {
                        Snake s=snakes.get(p.getPos());
                        p.setPos(s.getTail());
                    }
                    else if(ladders.containsKey(p.getPos()))
                    {
                        Ladder l=ladders.get(p.getPos());
                        p.setPos(l.getEnd());
                    }
                    else
                        sOL=false;
                }
                System.out.println(" to "+p.getPos());
                if(p.getPos()==100)
                {
                    g.end=true;
                    System.out.println(p.getNames()+" wins the game");
                }
            }
        }
    }
}
