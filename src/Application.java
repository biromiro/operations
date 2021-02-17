import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate the sum of two numbers\n");

        System.out.print("Please input the first number: ");
        int a = scanner.nextInt();
        System.out.print("Please input the second number: ");
        int b = scanner.nextInt();

        System.out.format("The sum is equal to %d", a + b);
    }
}