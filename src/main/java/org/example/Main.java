package org.example;

public class Main {

    static int[] myArray = new int[5];
    static int[] anotherArray = {5,89, 6,7, 9};

    public static void main(String[] args) {

        for (int i = 0; i < anotherArray.length; i++) {
            if (anotherArray[i] == 7){
                System.out.println("Found 7 at: "+i);
                break;
            }
        }
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
    }
}