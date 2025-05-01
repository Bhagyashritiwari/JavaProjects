package JavaBasics;

public class CoreJavaBrushUp1 {

    public static void main(String[] args) {

        int num = 5;
        String name = "Bani";
        char letter = 'B';
        double value = 9.99;
        boolean myCard = true;

        System.out.println(num);
        System.out.println(name);
        System.out.println(letter);
        System.out.println(value);
        System.out.println(myCard);

        // Arrays
        int[] arrays = new int[5];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;
        arrays[3] = 4;
        arrays[4] = 5;

        System.out.println(arrays[4]);

        int arrays2[] = { 1, 2, 3, 4, 5 };
        System.out.println(arrays2[4]);

        // For Loop
        System.out.println("************");

        for (int j : arrays2) {
            System.out.println(j);
        }

        // String array
        System.out.println("************");

        String[] arrayName = { "Bhanu", "Bani", "selenium" };
        for (String s : arrayName) {
            System.out.println(s);
        }
    }
}