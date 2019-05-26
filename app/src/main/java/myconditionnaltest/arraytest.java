package myconditionnaltest;

import java.util.Random;

/**
 * 23 mai 2019
 */
public class arraytest {
    public static void main(String[] arg) {
        /**
         * a = 0 par default
         */
        // int a;

        Random ramdon = new Random();


        int[] data = new int[15];

//        System.out.println("We have " + data.length + " elements in the array");

//        System.out.println("The value of the element on index " + (data.length - 1) + " is " + data[data.length - 1]);

        for (int i = 0; i < data.length; i++){

            data[i] = ramdon.nextInt(100);
        }

        for(int i = 0; i < data.length; i++) {
            System.out.println("The value of the element on index " + i + " is " +              data[i]);
        }
         System.out.println("hello world");
    }
}
