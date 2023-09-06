// 5. Write a Java program to print an entire array?

public class A5 {

    // Function to print the entire array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            
            // Print a comma after every element except the last one
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();  // New line after printing the entire array
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 33, 47, 55};  // Example array

        System.out.print("Array contents: ");
        printArray(numbers);
    }
}

