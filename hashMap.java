//Link: https://practice.geeksforgeeks.org/problems/java-hashmap/0

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main (String[] args) {
        int t,n,val;
        String ky;
        Scanner scn= new Scanner(System.in);
        t=scn.nextInt();
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        while(t>0)
        {
            n=scn.nextInt();
            for(int i=0;i<n;i++)
            {
                ky=scn.next();
                val=scn.nextInt();
                hm.put(ky,val);
            }
            ky=scn.next();
            if(hm.containsKey(ky))
                System.out.println(hm.get(ky));
            else
                System.out.println(-1);
            hm.clear();
            t--;
        }
    }
}