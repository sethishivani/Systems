import java.util.*;

class Students implements Comparable <Students> {
    int rollno;
    String name;
    int age;
    Students(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println(this.rollno+" "+this.name+" "+this.age);
    }

    @Override
    public int compareTo(Students o) {
        int diff=this.rollno - o.rollno;
        if(diff!=0)
            return diff;
        diff=(this.name).compareTo(o.name);
        return diff;
    }
}


public class arrayListComp  {
    public static void main(String[] args) {
        Students s1=new Students(10,"Sunchit",24);
        Students s2=new Students(14,"Kajal",20);
        Students s3=new Students(10,"Shivu",23);
        ArrayList <Students> al= new ArrayList <Students> ();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        for(Students i : al)
            i.display();
        Collections.sort(al);
        System.out.println("~~~~~~~~~~~~~~Sorted data~~~~~~~~~~~~~");
        for(Students i : al)
            i.display();
    }
}
