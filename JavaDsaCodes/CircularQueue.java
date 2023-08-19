import java.util.* ;
import java.io.*; 
public class CircularQueue {
	// Initialize your data structure.
	int arr[];
	int size;
	int front;
	int rear;
	public CircularQueue(int n) {
		this.size=n;
		arr = new int[size];
		front=rear=-1;
	}
	/*
	   Enqueues 'X' into the queue. Returns true if it gets pushed into the stack,
	   and false otherwise.
	*/
	public boolean enqueue(int value) {
		// Write your code here.
		if( (front == 0 && rear == size-1) || (rear == (front-1)%(size-1) ) ) {
            return false;
        }
        else if(front == -1) //first element to push
        {
			front = rear = 0;
            
        }
        else if(rear == size-1 && front != 0) {
            rear = 0; //to maintain cyclic nature
        }
        else
        {//normal flow
            rear++;
        }
        //push inside the queue
        arr[rear] = value;
        
        return true;
		
	}

	/*
	  Dequeues top element from queue. Returns -1 if the stack is empty, otherwise
	  returns the popped element.
	*/
	public int dequeue() {
		// Write you code here.
		if (front==-1) {
			return -1;
		}
		int ans=arr[front];
		arr[front]=-1;
        if (front==rear) {
			front=rear=-1;
		}
		else if (front==size-1) {
			front=0;
		}
		else{
			front++;
		}
        return ans;
	}
};
