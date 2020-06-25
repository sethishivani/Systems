//Link : https://practice.geeksforgeeks.org/problems/java-collection-set-3-hashmap/1
import java.util.*;
class hashMap2
{
    /*Inserts an entry with key x and value y in map */
    void add_Value(HashMap<Integer,Integer> hm, int x, int y)
    {
        hm.put(x,y);
    }

    /*Returns the value with key x from the map */
    int find_value(HashMap<Integer, Integer> hm, int x)
    {
        if(hm.containsKey(x))
            return hm.get(x);
        return -1;
    }

    /*Returns the size of the map */
    int getSize(HashMap<Integer, Integer> hm)
    {
        return hm.size();
    }

    /*Removes the entry with key x from the map */
    void removeKey(HashMap<Integer, Integer> hm, int x)
    {
        hm.remove(x);
    }
}