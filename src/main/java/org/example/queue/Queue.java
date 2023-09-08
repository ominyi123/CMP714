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

    void queueEnqueue(int data)
    {
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
        }

        else {
            queue[rear] = data;
            rear++;
        }
    }

    boolean queueIsEmpty(){
        return (front == rear);
    }
    void queueDequeue()
    {
        if (queueIsEmpty()) {
            System.out.printf("\nQueue is empty\n");
        }

        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }
    }

    void queueDisplay()
    {
        if (queueIsEmpty()) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        for (int i = front; i < rear; i++) {
            System.out.printf(" ===> " +queue[i]);
        }
    }

    void queueFront()
    {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue(3);

        queue.queueDisplay();

        queue.queueEnqueue(11);
        queue.queueEnqueue(13);
        queue.queueEnqueue(7);

        queue.queueDisplay();


        queue.queueDequeue();
        System.out.printf(
                "\n\nafter two node deletion\n\n");

        queue.queueDisplay();

        queue.queueFront();
    }
}

