import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting three integer values from the user
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int c = scanner.nextInt();

        // Finding the minimum value
        int min = Math.min(a, Math.min(b, c));

        // Finding the maximum value
        int max = Math.max(a, Math.max(b, c));

        // Finding the middle value using sum
        int mid = (a + b + c) - (min + max);

        // Displaying the values in ascending order
        System.out.println("The integers in ascending order are: " + min + ", " + mid + ", " + max);
    }
}
