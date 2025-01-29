public class CommandLineExample {
    public static void main(String args[]) {
        
        if (args.length < 3) {
            System.out.println("Please provide at least three numbers as arguments.");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        //int num2 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);

        String Symbol = args[1];
        int sum = num1  num2;
        
        System.out.print("Inputs: ");
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        System.out.println("\nSum: " + sum);
    }
}