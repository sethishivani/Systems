//Link : https://practice.geeksforgeeks.org/problems/java-collection-set-2-set/1
class set
{
    /*inserts an element x to the set s */
    void insert(Set<Integer> s, int x)
    {
        s.add(x);
    }

    /*prints the contents of the set s in ascending order */
    void print_contents(Set<Integer> s)
    {
        TreeSet t=new TreeSet<Integer>(s);
        Iterator i = t.iterator();
        while(i.hasNext())
            System.out.print(i.next()+" ");
    }

    /*erases an element x from the set s */
    void erase(Set<Integer> s, int x)
    {
        s.remove(x);
    }

    /*returns the size of the set s */
    int size(Set<Integer> s)
    {
        return s.size();
    }

    /*returns 1 if the element x is
    present in set s else returns -1 */
    int find(Set<Integer> s, int x)
    {
        if(s.contains(x))
            return 1;
        return -1;
    }
}