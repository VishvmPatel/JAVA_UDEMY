class StackOverFlow extends Exception {
    @Override
    public String toString() {
        return "Stack is Full";
    }
}

class StackUnderFlow extends Exception {
    @Override
    public String toString() {
        return "Stack is Empty";
    }
}

class Stack {
    private int size;
    private int top = -1;
    private int[] S;

    // Constructor to initialize the stack
    public Stack(int sz) {
        size = sz;
        S = new int[sz];
    }

    // Push method to add an element to the stack
    public void push(int x) throws StackOverFlow {
        if (top == size - 1) {
            throw new StackOverFlow(); // Stack is full
        }
        top++;
        S[top] = x;
    }

    // Pop method to remove and return the top element of the stack
    public int pop() throws StackUnderFlow {
        if (top == -1) {
            throw new StackUnderFlow(); // Stack is empty
        }
        int x = S[top];
        top--;
        return x;
    }
}

public class StackOverFlowExceptionHandling{
    public static void main(String[] args) {
        Stack st = new Stack(5);

        // Demonstrating push operation with exception handling
        try {
            System.out.println("Pushing elements onto the stack...");
            st.push(10);
            st.push(15);
            st.push(20);
            st.push(25);
            st.push(30);
            st.push(35); // This will cause a StackOverFlow exception
        } catch (StackOverFlow s) {
            System.out.println(s); // Custom exception message
        }

        // Demonstrating pop operation with exception handling
        try {
            System.out.println("\nPopping elements from the stack...");
            for (int i = 0; i < 6; i++) { // Attempting to pop more elements than present
                System.out.println("Popped: " + st.pop());
            }
        } catch (StackUnderFlow s) {
            System.out.println(s); // Custom exception message
        }

        System.out.println("\nProgram execution completed.");
    }
}
