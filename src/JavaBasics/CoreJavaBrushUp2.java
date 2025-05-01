package JavaBasics;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {

    public static void main(String[] args) {
        // ArrayList accepts duplicate value
        // ArrayList, LinkedList, Vector: Implementing list interface
        // array have fixed size where as arraylist can grow dynamically
        // you can access and insert any value in any index

        // check if array has multiple of 2

        int[] arr2 = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 122 };

        for (int j : arr2) {
            if (j % 2 == 0)
                System.out.println(j);

            else {
                System.out.println(j + " is not multiple of 2");
            }
        }

        System.out.println("**********");

        for (int j : arr2) {
            if (j % 2 != 0)
                System.out.println(j);
        }

        // ArrayList
        System.out.println("**********");

        ArrayList<String> a = new ArrayList<String>();
        a.add("rahul");
        a.add("shetty");
        a.add("academy");
        a.add("selenium");
        a.add("812");
        a.add(0, "Bhagyashri");
        System.out.println(a.get(3));
        a.remove(3);
        a.indexOf("shetty");
        a.contains("academy");
        a.isEmpty();
        a.size();
        // System.out.println(a.get(3));

        System.out.println("**********");

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
            System.out.println(a.contains("selenium")); // contains method only works in Array List and not arrays
        }

        System.out.println("**********");

        for (String value : a) {
            System.out.println(value);
        }

    }

}