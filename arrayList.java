import java.util.ArrayList;

public class arrayList {
    
    public static void main (String[] args) {
        ArrayList<String> a = new ArrayList<String>();
    
    a.add("apple");
    a.add("banana");
    a.add("cherry");
    a.add("mango");
    a.add("apple");
    
    System.out.println(a);

    a.remove(0);
    System.out.println(a);

    System.out.println(a.contains("orange"));

    System.out.println(a.size());
    for(int i=0;i<a.size();i++)
    {
        System.out.println(i+" "+a.get(i));
    }

    }
    
 
    
    

}
