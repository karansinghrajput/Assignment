// 3. Write a Java program to calculate the sum of all elements in an integer array?

public class A3 {
    
    // Function to calculate the sum of all elements in an array
    public static int sum(int[] array) {
        int total = 0;
        for(int num : array) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Example array

        int result = sum(numbers);
        System.out.println("The sum of all elements in the array is: " + result);
    }
}
