package org.example.stack;

public class Stack {
    int size;
    int top;
    int[] array;

    Stack(int capacity){
        size = capacity;
        top = -1;
        array = new int[size];
    }
}
