import java.util.Stack;

public class Solution {
    static class SpecialStack {
        Stack<Integer>s=new Stack<>();
        int mini;
        void push(int data) {
            // Implement the push() function.
            if (s.empty()) {
                s.push(data);
                mini=data;
            }
            else
            {
                if (data<mini) {
                    int val=2*data-mini;
                    s.push(val);
                    mini=data;
                }
                else{
                    s.push(data);
                }
            }
        }

        void pop() {
            // Implement the pop() function.
            if (s.empty()) {
                return ;
            }
            int curr=s.peek();
            s.pop();
            if (curr>mini) {
               return;
            }
            else
            {
                int prevMini=mini;
                int val=2*mini-curr;
                mini=val;
            }
        }

        int top() {
            // Implement the top() function.
            if (s.empty()) {
                return -1;
            }
            int current = s.peek();
            if (current<mini) {
                return mini;
            }
            else
            {
                return current;
            }
        }

        int getMin() {
            // Implement the getMin() function.
            if (s.empty()) {
                return -1;
            }
            return mini;
        }
    };
}
