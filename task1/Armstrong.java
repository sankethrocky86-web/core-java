import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int remainder;
        int result = 0;

        while (num != 0) {
            remainder = num % 10;
            result = result + (remainder * remainder * remainder);
            num = num / 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();
    }
}