 class Stack {
    private int[] data;
    private int top;
    private int size;

    public Stack(int size) {
        data = new int[size];
        top = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        data[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return data[top];
    }
}

public class Stackarr{
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        System.out.println("Pushing elements onto the stack...");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Popping elements from the stack...");
        System.out.println(stack.pop()); // prints 50
        System.out.println(stack.pop()); // prints 40
        System.out.println(stack.pop()); // prints 30

        System.out.println("Peeking at the top element of the stack...");
        System.out.println(stack.peek()); // prints 20

        System.out.println("Pushing another element onto the stack...");
        stack.push(60);

        System.out.println("Popping the remaining elements from the stack...");
        System.out.println(stack.pop()); // prints 60
        System.out.println(stack.pop()); // prints 20
        System.out.println(stack.pop()); // prints 10

        System.out.println("Attempting to pop an element from an empty stack...");
        System.out.println(stack.pop()); // prints "Stack underflow"
    }
}
