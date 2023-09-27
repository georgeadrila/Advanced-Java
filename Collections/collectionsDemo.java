package Collections;

import java.util.ArrayList;
import java.util.List;

public class collectionsDemo {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<Integer>();
        obj.add(0, 1);
        obj.add(1, 2);
        obj.add(2, 3);
        obj.add(3, 4);

        System.out.println("Elements are: " + obj);

        System.out.println("Using the while: The given list is : ");
        int count = 0;

        while (obj.size() > count) {
            System.out.println(obj.get(count));
            count++;
        }

        System.out.println("Using the for: The given list is : ");
        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));
        }

        
    }
}
