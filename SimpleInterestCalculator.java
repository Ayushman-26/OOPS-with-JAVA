import java.util.Scanner;

public class SimpleInterestCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal Amount (P): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest per annum (R): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time in years (T): ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is: " + simpleInterest);
        scanner.close();
    }
}
