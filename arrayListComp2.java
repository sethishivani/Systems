import java.util.*;


class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(this.rollno + " " + this.name + " " + this.age);
    }
}
class rollnoComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        int diff;
        diff = s1.rollno-s2.rollno;
        if(diff!=0)
            return diff;
        diff = (s1.name).compareTo(s2.name);
        return diff;
    }
}
public class arrayListComp2 {
    public static void main(String[] args) {
        Student s1=new Student(10,"Sunchit",24);
        Student s2=new Student(14,"Kajal",20);
        Student s3=new Student(10,"Shivu",23);
        ArrayList<Student> al= new ArrayList <Student> ();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        for(Student i : al)
            i.display();
        Collections.sort(al, new rollnoComparator());
        System.out.println("##################Sorted Data####################");
        for(Student i : al)
            i.display();
    }
}
