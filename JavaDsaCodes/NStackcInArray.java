import java.util.* ;
import java.io.*; 
public class NStack {
    // Initialize your data structure.
    int arr[];
    int top[];
    int next[];
    int freespot;
    public NStack(int N, int S) {
        // Write your code here.
        arr = new int[S];
        top = new int[N];
        next = new int[S];

        //initialize top

        for(int i=0;i<N;i++)
        {
           top[i]=-1;
        }
        //initialize next

        for(int i=0;i<S;i++)
        {
            next[i]=i+1;
        }

        //update the last index
        next[S-1]=-1;
        //initialize the freespot
        freespot=0;
    }

    // Pushes 'X' into the Mth stack. Returns true if it gets pushed into the stack, and false otherwise.
    public boolean push(int x, int m) {
        // Write your code here.
        if (freespot==-1) {
            return false;
        }
        //find x
        int index = freespot;

        //update freespot
        freespot=next[index];

        //insert the element

        arr[index]=x;

        //update the next array (now the next array will store index of next element in the stack)

        next[index]=top[m-1];

        //update the top array

        top[m-1]=index;

        return true;
    }

    // Pops top element from Mth Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
    public int pop(int m) {
        // Write your code here.
        if (top[m-1]==-1) {
            return -1;
        }
        int index=top[m-1];

        top[m-1]=next[index];
        
        next[index]=freespot;

        freespot = index;

        return arr[index];

    }
}
