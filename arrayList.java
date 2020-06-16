//Link: https://practice.geeksforgeeks.org/problems/java-arraylist/0
import java.util.*;
import java.lang.*;
import java.io.*;
class arrayList {
    public static void main (String[] args) {
        int t,n,q,p,r,data;
        Scanner scn= new Scanner(System.in);
        t=scn.nextInt();
        while(t!=0)
        {
            n=scn.nextInt();
            q=scn.nextInt();
            ArrayList<Integer> list=new ArrayList<Integer>(n);
            for(int i=0;i<n;i++)
            {
                data=scn.nextInt();
                list.add(data);
            }
            if(q==1)
            {
                p=scn.nextInt();
                r=scn.nextInt();
                list.add(p,r);
                n++;
                for(int i=0;i<n;i++)
                    System.out.print(list.get(i)+" ");
                System.out.println();
            }
            else
            {
                p=scn.nextInt();
                System.out.println(list.lastIndexOf(p));
            }
            t--;
        }
    }
}