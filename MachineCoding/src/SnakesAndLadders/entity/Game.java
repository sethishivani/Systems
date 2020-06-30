package SnakesAndLadders.entity;

import java.util.*;
import java.io.*;

public class Game {
    private int dice;
    private boolean end;
    private Map<Integer, Snake> snakes;
    private Map<Integer, Ladder> ladders;
    private ArrayList<Player> players;
    public Game() throws IOException {
        dice=0;
        end=false;
        snakes=inputSnake();
        ladders=inputLadder();
        players=inputPlayer();
    }
    public ArrayList<Player> inputPlayer() throws IOException
    {
        int numP;
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter num Of Players");
        numP = Integer.parseInt(br.readLine());
        ArrayList<Player> al=new ArrayList<>();
        for(int i=0;i<numP;i++)
        {
            System.out.println("Enter a String");
            name = br.readLine();
            Player p=new Player(name);
            al.add(p);
        }
        return al;
    }
    public Map<Integer,Snake> inputSnake()throws IOException
    {
        int numS;
        int head, tail;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter num Of Snakes");
        numS=Integer.parseInt(br.readLine());
        Map<Integer,Snake> map=new HashMap<Integer,Snake>();
        for(int i=0;i<numS;i++)
        {
            System.out.println("Enter Snakes head and tail");
            head=Integer.parseInt(br.readLine());
            tail=Integer.parseInt(br.readLine());
            Snake s= new Snake(head,tail);
            map.put(head,s);
        }
        return map;
    }
    public Map<Integer,Ladder> inputLadder()throws IOException
    {
        int numL;
        int start, end;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter num Of Ladder");
        numL=Integer.parseInt(br.readLine());
        Map<Integer,Ladder> map=new HashMap<>();
        for(int i=0;i<numL;i++)
        {
            System.out.println("Enter Ladder start and end");
            start=Integer.parseInt(br.readLine());
            end=Integer.parseInt(br.readLine());
            Ladder l= new Ladder(start,end);
            map.put(start,l);
        }
        return map;
    }
    public void play()
    {
        Random rand = new Random();
        while(end==false)
        {
            Iterator<Player> it = players.iterator();
            while(it.hasNext()&&end==false)
            {
                Player p = it.next();
                // Generate random integers in range 0 to 6
                int rd = rand.nextInt(6)+1;
                dice=rd;
                System.out.print(p.getNames()+" rolled a "+dice+" and moved from "+p.getPos());
                end=p.move(dice);
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
                    end=true;
                    System.out.println(p.getNames()+" wins the game");
                }
            }
        }
    }
}
