public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        int myFavoriteNumber = 49;
        System.out.println(myFavoriteNumber);

        String myString = "I hope Java doesn't kill me!";
        System.out.println(myString);



// The code below will not work due to M being denoted as a character by the single quotes.
//        String myString = 'M';




// This code below will give errors. The value does not equal a string.
//        String myString = 3.14159;
//        System.out.println(myString);




// The code below will give you an error saying that variable myNumber is not initialized
//        long myNumber;
//        System.out.println(myNumber);




/* The code below will give an error of incompatible types
/       you can fix this by adding an f to the end of 3.14 or
/       by using double instead of float. This is the preferred way.
 */

//        float myNumber = 3.14;
//        System.out.println(myNumber);




//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

    }
}


//Type "psvm" and then tab to quickly print out "public static void main(String[] args) {
//
//    }"
//Type "sout" and than tab to quickly print out "System.out.println();"

