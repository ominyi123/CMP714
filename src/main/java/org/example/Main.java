package org.example;

public class Main {

    static int[] myArray = new int[5];
     int[] anotherArray = {5,89, 6,7, 9};

    public static void main(String[] args) {

        Main myObject = new Main();
        for (int i = 0; i < myObject.anotherArray.length; i++) {
            if (myObject.anotherArray[i] == 7){
                System.out.println("Found 7 at: "+i);
                break;
            }
        }
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
    }
}