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

    boolean isFull(){
        return (top == size -1);
    }

    boolean isEmpty(){
        return (top == -1);
    }

    void push(int element){
        if (isFull()){
            System.out.println("Stack Overflow");
        }else{
            array[top+1] = element;
            top++;
            System.out.println(top+" === "+element);
        }
    }

    int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else {
            int previousTop = top;
            System.out.println("Top ==="+ top);
            top--;
            System.out.println("Top ==="+ top);
            System.out.println(array[previousTop]);
            return array[previousTop];
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(3);
        myStack.push(7);
        myStack.push(4);
        myStack.push(14);
        myStack.pop();
    }
}
