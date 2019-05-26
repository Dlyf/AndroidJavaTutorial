package myconditionnaltest;

/**
 * test
 * 3 or 4 maximum
 * 23 mai 2019
 */
public class testdeux {
    public static void main(String[] args) {
        int speed = 0;

        switch (speed) {

            case 1:
                // execute the code that is here
                System.out.println("Speed is 1");
                break;

            case 2:
                System.out.println("Speed is 2");
                break;

            case 3:
                System.out.println("Speed is 3");
                break;

            default:
                System.out.println("Default case executed");
                break;

        }


        // after break we go here


//        if(speed > 11) {
//            // the condition above needs to be true so that we execute the code
//            System.out.println("Speed is greater");
//
//        } else if(speed == 11) {
//            System.out.println("Speed is Equal");
//
//        } else {
//            System.out.println("Speed is lower");
//        }

    }
}
