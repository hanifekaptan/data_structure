package DataStructures;

public class Stack {
    
    private int index; // Index of the top element in the stack
    private int[] arr; // Array to store the elements of the stack
    
    public Stack(int capacity) throws Exception{
        // Constructor to initialize the stack with a specified capacity
        if (capacity <= 0) {
            throw new Exception("Capacity must be greater than 0"); // Ensure capacity is positive
        }
        index = -1; // Initialize index to -1 (indicating the stack is empty)
        arr = new int[capacity]; // Create an array with the specified capacity
    }
    
    public void push(int value) throws Exception{
        // Adds an element to the stack
        if (arr.length <= getCount()){ // Check if the stack is full
            throw new Exception("Stack is full, the push operation cannot be done.");
        }
        else{
            arr[++index] = value; // Increment the index and add the new value
        }
    }
    
    public void pop() throws Exception{
        // Pops an element onto the stack
        if (0 >= getCount()){ // Check if the stack is empty
            throw new Exception("Stack is empty, the pop operation cannot be performed.");
        }
        else{
            index = index - 1; // Decrement the index to remove the top element
        }
    }
    
    public int getCount(){
        // Returns the number of elements in the stack
        return index + 1;
    }
    
    public int peek(){
        // Returns the element at the top of the stack
        return arr[index];
    }
    
    public static void main(String[] args) throws Exception {
        Stack s = new Stack(10);
        try {
            s.push(3);
            System.out.println(s.peek());
            s.push(7);
            System.out.println(s.peek());
            s.push(12);
            System.out.println(s.peek());
            s.pop();
            System.out.println(s.peek());
        }
        catch(Exception ex) {
        }
    }
}
