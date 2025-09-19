package in.stacks.ds;

// Node class represents each element (node) of the linked list
class Node {
    int data;      // stores value of the node
    Node next;     // pointer to the next node
    
    // Constructor to initialize the node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack implementation using Linked List
class StackLL {
    Node top;   // top node of the stack
    int size;   // to track the number of elements in the stack

    // Constructor to initialize an empty stack
    public StackLL() {
        top = null;
        size = 0;
    }

    // Push operation: Insert element at the top of the stack
    public void push(int data) {
        Node temp = new Node(data); // create new node
        temp.next = top;            // new node points to the old top
        top = temp;                 // update top to new node
        size++;                     // increase size
    }

    // Pop operation: Remove and return the top element of the stack
    public int pop() {
        if (top == null) {          // check underflow condition
            System.out.println("Stack is empty");
            return -1;
        }
        int value = top.data;       // store top value
        top = top.next;             // move top to the next node
        size--;                     // decrease size
        return value;               // return popped value
    }

    // Peek operation: Return top element without removing it
    public int peek() {
        if (top == null) {          // if stack is empty
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;            // return top value
    }

    // Return current size of stack
    public int size() {
        return size;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}

// Main class to test stack operations
public class StackUsingLL {
    public static void main(String[] args) {
        StackLL stack = new StackLL();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element (peek): " + stack.peek()); // 30
        System.out.println("Stack size: " + stack.size());         // 3

        // Pop elements
        System.out.println("Popped: " + stack.pop());              // 30
        System.out.println("Top element after pop: " + stack.peek()); // 20
        System.out.println("Stack size after pop: " + stack.size()); // 2
    }
}
