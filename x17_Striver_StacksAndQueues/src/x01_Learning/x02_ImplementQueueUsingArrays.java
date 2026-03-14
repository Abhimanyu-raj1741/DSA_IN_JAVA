package x01_Learning;

public class x02_ImplementQueueUsingArrays {

    int[] arr;
    int capacity;
    int front;
    int rear;
    int count;

    public x02_ImplementQueueUsingArrays(int size) {
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    void push(int value) {

        if (count == capacity) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        count++;
    }

    int pop() {

        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int result = arr[front];
        front = (front + 1) % capacity;
        count--;

        return result;
    }

    int size() {
        return count;
    }

    void display() {

        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

    	x02_ImplementQueueUsingArrays queue =
                new x02_ImplementQueueUsingArrays(5);

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.display();

        queue.pop();
        queue.pop();
        queue.display();

        queue.push(6);
        queue.push(7);
        queue.display();
    }
	}

