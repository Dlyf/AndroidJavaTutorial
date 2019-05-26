package myconditionnaltest;

/**
 * 23 mai 2019
 */
public class loopstest {

    public static void main(String[] arg) {

        // for int i which is equal to zero, as long as i is less then 10
        // loop, then increment i by 1
//        for(int i = 0; i < 10; i++) {
//            System.out.println("Printed " + i + " times");
//        }
//
        int i = 0;

        // while i is less then 10 execute whats in the while loop
        while(i < 10) {
            // the condition needs to be true in order to execute the code
            System.out.println("Printed " + i + " times");
            i++;
        }
    }
}
