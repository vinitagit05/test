import java.util.*;

public class MapTest {
    public static void main(String args[]) {
        Map<Integer, String> al = new TreeMap<Integer, String>();
           al.put(100,"Amit");
           al.put(107,"Vijay");
           al.put(102,"Rahul");
           for(Map.Entry m:al.entrySet())

            {

                {
                    System.out.println(m.getKey() + " " + m.getValue());

                }
            }
        }}
