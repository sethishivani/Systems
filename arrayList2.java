/*You are required to complete below methods*/
import java.util.*;

class arrayList2
{
    /*inserts an element x at
    the back of the ArrayList A */
    void add_to_ArrayList(ArrayList<Integer> A, int x)
    {
        A.add(x);
    }

    /*sort the ArrayList A in ascending order*/
    void sort_ArrayList_Asc(ArrayList<Integer> A)
    {
        Collections.sort(A);
    }

    /*reverses the ArrayList A*/
    void reverse_ArrayList(ArrayList<Integer> A)
    {
        Collections.reverse(A);
    }

    /*returns the size of the ArrayList A */
    int size_Of_ArrayList(ArrayList<Integer> A)
    {
        return A.size();
    }

    /*sorts the ArrayList A in descending order*/
    void sort_ArrayList_Desc(ArrayList<Integer> A)
    {
        Collections.sort(A,Collections.reverseOrder());
    }

    /*prints space separated
    elements of ArrayList A*/
    void print_ArrayList(ArrayList<Integer> A)
    {
        for(int i=0;i<A.size();i++)
            System.out.print(A.get(i)+" ");
        // System.out.println();
    }
}
