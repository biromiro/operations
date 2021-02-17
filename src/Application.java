import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate the sum/mul of two numbers\n");

        System.out.print("Please input the first number: ");
        int a = scanner.nextInt();
        System.out.print("Please input the second number: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        for(;;){
            System.out.print("Please input the desired operation (sum/mul): ");
            String op = scanner.nextLine();
            if (op.equals("mul")){
                System.out.format("The mul is equal to %d\n", a * b);
                break;
            }
            else if (op.equals("sum")){
                System.out.format("The sum is equal to %d\n", a + b);
                break;
            }
            else {
                System.out.print("Read carefully!!\n");
            }
        }
    }
}