import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Problem1 {

    public static void main(String args[]){

    LinkedList<String> name = new LinkedList<String>();
    name.add("Vinita");
    name.add("Pratik");
    name.add("Nitin");
        System.out.println(name);

        Iterator<String> itr = name.iterator();
        while(itr.hasNext()){


    System.out.println(itr.next());

}
}}