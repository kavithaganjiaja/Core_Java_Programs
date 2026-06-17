package ForLoopAssignments;
import java.util.Scanner;

public class SumOfAmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
int tot=0;
        System.out.println("Armstrong numbers between 1 and " + n + " are:");
        
        // Outer loop to check every number from 1 to n
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
                tot=tot+i;
            }
        }
        System.out.println(tot);
        sc.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        
        // Find the number of digits (power to be raised)
        int digits = String.valueOf(num).length();
        
        // Calculate the sum of the digits raised to the power of 'digits'
        int temp = num;
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        
        return sum == originalNumber;
    }
}
