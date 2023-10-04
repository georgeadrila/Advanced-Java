package javaMapInterface;
import java.util.*;

public class mapremoving {
    public static void main(String[] args) {
        // create and populate the harsh map
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(100, "George");
        map.put(101, "Adrian");
        map.put(102, "Monkey");

        System.out.println("Values before removing: " + map);
        // removing the value 102
        map.remove(102);
        System.out.println("Values after removing: " + map);
    }
}
