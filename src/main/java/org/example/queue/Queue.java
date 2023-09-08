package org.example.queue;

class Queue {
    static private int front, rear, capacity;
    static private int queue[];

    Queue(int c)
    {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    boolean queueIsEmpty(){
        return (front == rear);
    }

    boolean queueIsFull(){
        return (capacity == rear);
    }

    void queueEnqueue(int data)
    {
        if (queueIsFull()) {
            System.out.println("Queue is full");
        }

        else {
            queue[rear] = data;
            rear++;
        }
    }

    void queueDequeue()
    {
        if (queueIsEmpty()) {
            System.out.println("Queue is empty");
        }

        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];// i = 0 therefore queue[0] = queue[0+1]
            }

            if (rear < capacity) {
                queue[rear] = 0;
            }
            rear--;
        }
    }

    void queueDisplay()
    {
        if (queueIsEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i < rear; i++) {
            System.out.println(" ===> " +queue[i]);
        }
    }

    void queueFront()
    {
        if (queueIsEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front Element is: "+ queue[front]);
    }

    public static void main(String[] args)
    {
        Queue myQueue = new Queue(3);

        myQueue.queueDisplay();

        myQueue.queueEnqueue(11);
        myQueue.queueEnqueue(13);
        myQueue.queueEnqueue(7);

        myQueue.queueDisplay();


        myQueue.queueDequeue();
        System.out.println("after two node deletion");

        myQueue.queueDisplay();

        myQueue.queueFront();
    }
}

