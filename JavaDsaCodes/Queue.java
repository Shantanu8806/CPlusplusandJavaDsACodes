import java.util.* ;
import java.io.*; 
public class Queue {

    int qfront;
    int rear;
    int size;
    int arr[];
    Queue() {
        // Implement the Constructor
        this.size=1000001;
        arr = new int[size];
        qfront =0;
        rear=0;
    }
    /*----------------- Public Functions of Queue -----------------*/
    boolean isEmpty() {
        // Implement the isEmpty() function
        if (qfront==rear) {
            return true;
        }
        else
        {
            return false;
        }
    }
    void enqueue(int data) {
        // Implement the enqueue() function
        if (rear==size) {
            return;
        }
        arr[rear]=data;
        rear++;
    }

    int dequeue() {
        // Implement the dequeue() function
        if (rear==qfront) {
            return -1;
        }
        int ans=arr[qfront];
        arr[qfront]=-1;
        qfront++;
        if (qfront==rear) {
            qfront=0;
            rear=0;
        }
        return ans;
    }

    int front() {
        // Implement the front() function
        if (qfront==rear) {
            return -1;
        }
        return arr[qfront];
    }

}
