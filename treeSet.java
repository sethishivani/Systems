//Link : https://practice.geeksforgeeks.org/problems/java-collections-set-8-treeset/1

//for(String tmp : ts)
//{
//    Character ch=tmp.charAt(0);
//    if(ch.compareTo(a)<0)
//        al1.add(tmp);
//    if(ch.compareTo(b)>=0)
//        al2.add(tmp);
//    if(ch.compareTo(c)>=0&&ch.compareTo(d)<0)
//        al3.add(tmp);
//}

class treeSet
{
    void task(TreeSet<String> ts,char a,char b,char c,char d)
    {
        TreeSet<String> al1 = new TreeSet<String>();
        TreeSet<String> al2 = new TreeSet<String>();
        TreeSet<String> al3 = new TreeSet<String>();
        for(String tmp : ts)
        {
            char ch=tmp.charAt(0);
            if(ch<a)
                al1.add(tmp);
            if(ch>=b)
                al2.add(tmp);
            if(ch>=c&&ch<d)
                al3.add(tmp);
        }
        System.out.println(al1);
        System.out.println(al2);
        System.out.println(al3);
    }
}
