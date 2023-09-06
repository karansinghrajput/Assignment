// 2. Write a program to create an object of an class which contain a method and call that class method in
// main method.

public class A2 {
    
    // A method inside the class
    public void displayMessage() {
        System.out.println("Hello from SampleClass!");
    }

    public static void main(String[] args) {
        // Create an object of SampleClass
        A2 obj = new A2();

        // Call the method using the object
        obj.displayMessage();
    }
}


