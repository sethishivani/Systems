import java.util.*;

class note
{
    int id;
    String name,author,publisher;
    int quantity;
    public note(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof note)) return false;
        note note = (note) o;
        return id == note.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public String toString() {
        return "note{"+ "id=" + id + ", name=" + name + ", publisher=" + publisher + ", quantity="+ quantity+" }";
    }
}
public class linkedHashSet2 {
    public static void main(String[] args) {
        Set<note> set= new LinkedHashSet<>();
        note b1=new note(101,"Let us C","Yashwant Kanetkar","BPB",8);
        note b2=new note(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        note b3=new note(103,"Operating System","Galvin","Wiley",6);
        /*
          HashSet will use the `equals()` & `hashCode()` implementations
          of the Customer class to check for duplicates and ignore them
        */
        note b4=new note(101,"Let us C","Yashwant Kanetkar","BPB",8);
        //Adding notes to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
//        for(note b:set){
//            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
//        }
        System.out.println(set);
    }
}
