package in.stacks.ds;

// Stack implementation using array
class Stack {
    int arr[];  // array to store stack elements
    int size;   // maximum size of the stack
    int top;    // index of the top element (-1 means stack is empty)

    // Constructor → initialize stack with given size
    public Stack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    // Push operation → add element to the top of stack
    public void push(int val) {
        if (top == arr.length - 1) {  // overflow condition
            System.out.println("Stack is overflow");
        } else {
            top++;
            arr[top] = val;
            System.out.println(val + " is successfully inserted at the top");
        }
    }

    // Pop operation → remove and return the top element
    public int pop() {
        if (top == -1) {  // underflow condition
            System.out.println("Stack is empty");
        } else {
            int a = arr[top];   // get top element
            arr[top] = 0;       // optional: clear the position
            top--;              // move top pointer one step down
            System.out.println(a + " is successfully popped out of the stack");
            return a;
        }
        return -1;
    }

    // Size operation → return current number of elements
    public int size() {
        if (top == -1) {
            return 0;
        }
        return top + 1;
    }

    // Peek operation → return top element without removing it
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == arr.length - 1;
    }
}

// Driver class to test the stack
public class Stackkkkk {
    public static void main(String[] args) {
        Stack s1 = new Stack(5);

        // Push elements
        s1.push(12);
        s1.push(13);
        s1.push(14);
        s1.push(15);
        s1.push(16);

        // Trying to push when stack is full
        s1.push(2); // Overflow

        // Pop operation
        s1.pop();

        // Peek the current top
        System.out.println("Top element is: " + s1.peek());

        // More pops
        s1.pop();
        s1.pop();

        // Size of stack
        System.out.println("Current size of stack: " + s1.size());

        // Pop remaining elements
        s1.pop();
        s1.pop();

        // Trying to pop when empty
        s1.pop(); // Underflow
    }
}
