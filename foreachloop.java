package JAVA_DSA;

import java.util.*;

public class foreachloop {
    public static void main(String args[]) {
        // LinkedList<Integer> num = new LinkedList<>();
        // num.add(21);
        // num.add(19);
        // num.add(30);
        // num.add(29);
        // num.add(1);
        // num.add(4);

        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
