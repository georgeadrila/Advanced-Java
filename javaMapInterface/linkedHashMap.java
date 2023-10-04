package javaMapInterface;

import java.util.*;

class TestCollection14 {
    public static void main(String args[]) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(100, "George");
        hm.put(101, "Adrian");
        hm.put(102, "Monkey");

        for (Map.Entry m : hm.entrySet()) {

            System.out.println(m.getKey() + " " + m.getValue());

        }

    }

}
