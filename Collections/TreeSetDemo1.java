package Collections;

import java.util.*;

/**
 * TreeSetDemo1
 */
public class TreeSetDemo1 {

    public static void main(String[] args) {
        Set<String> hs = new TreeSet<String>();

        hs.add("George");
        hs.add("Mark");
        hs.add("Allan");
        hs.add("Calvin");
        hs.add("Jemiam");
        hs.add("George");

        System.out.println("The tree set is: " + hs.size());

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}