// 4. Write a Java program to find the index of a specific element in an integer array.?


public class A4 {
    
    // Function to find the index of a specific element in an array
    public static int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index when the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 33, 47, 55}; // Example array
        int target = 33;

        int index = findIndex(numbers, target);
        
        if (index != -1) {
            System.out.println("The index of " + target + " in the array is: " + index);
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}

