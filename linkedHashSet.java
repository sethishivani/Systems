//Link: https://practice.geeksforgeeks.org/problems/java-collection-set-5-linkedhash-set/1
import java.util.*;
class linkedHashSet
{
    /*inserts an element x to the set s */
    void insert(LinkedHashSet<Integer> s, int x)
    {
        s.add(x);
    }

    /*prints the contents of the set s in ascending order */
    void print_Contents_Increasing_Order(LinkedHashSet<Integer> s)
    {
        TreeSet<Integer> t=new TreeSet<Integer>(s);
        Iterator it=t.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
    }

    /*prints the contents of the set s in ascending order */
    void print_Contents_Insertion_Order(LinkedHashSet<Integer> s)
    {
        Iterator it=s.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
    }

    /*erases an element x from the set s */
    void erase(LinkedHashSet<Integer> s, int x)
    {
        s.remove(x);
    }

    /*returns the size of the set s */
    int size(LinkedHashSet<Integer> s)
    {
        return s.size();
    }

    /*returns 1 if the element x is
    present in set s else returns -1 */
    int find(LinkedHashSet<Integer> s, int x)
    {
        if(s.contains(x))
            return 1;
        return -1;
    }
}