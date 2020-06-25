//Link : https://practice.geeksforgeeks.org/problems/java-collections-set-9-queue/1
import java.util.*;
public class queue
{
    Queue<Integer>q;
    queue(){
        q=new LinkedList<>();
    }
    public void addElement(int key)
    {
        q.add(key);
    }
    public void RemoveElement()
    {
        if(q.size()==0){
            System.out.print("-1 ");
            return;
        }
        System.out.print(q.remove()+" ");
        // q.remove();
    }
    public void peekElement()
    {
        if(q.size()==0){
            System.out.print("-1 ");
            return;
        }
        System.out.print(q.peek()+" ");
    }
    public void Size()
    {
        System.out.print(q.size()+" ");
    }
}