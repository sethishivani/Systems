//Link : https://practice.geeksforgeeks.org/problems/java-collections-set-1-stack/0


import java.util.*;
import java.lang.*;
import java.io.*;

class stack {
    public static void main (String[] args) {
        int t,n,tmp;
        Scanner scn = new Scanner(System.in);
        t=scn.nextInt();
        while(t>0)
        {
            n=scn.nextInt();
            Stack<Integer> s=new Stack<Integer>();
            for(int i=0;i<n;i++)
            {
                tmp=scn.nextInt();
                if(i!=(n-1)/2)
                    s.push(tmp);
            }
            while(!s.empty())
                System.out.print(s.pop()+" ");
            t--;
            System.out.println();
        }
    }
}