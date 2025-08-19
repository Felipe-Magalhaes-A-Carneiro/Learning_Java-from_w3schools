public class RepeatingLoops {
    public static void main(String[] args) {
        
        // Using a for loop to print numbers from 1 to 5
        System.out.println("Using a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // Using a while loop to print numbers from 1 to 5
        System.out.println("Using a while loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++;
        }

        // Using a do-while loop to print numbers from 1 to 5
        System.out.println("Using a do-while loop:");
        int k = 1;
        do {
            System.out.println("Number: " + k);
            k++;
        } while (k <= 5);
    }
}
