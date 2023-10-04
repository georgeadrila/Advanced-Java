package javaMapInterface;
import java.util.*;

public class mapInterfaceExample1 {
    public static void main(String args[]){
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(100, "George");
        map.put(101, "Adrian");
        map.put(102, "Monkey");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
