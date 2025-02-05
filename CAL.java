public class CAL{
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java CommandLineCalculator <num1> <operator> <num2>");
            System.out.println("Example: java CommandLineCalculator 20 + 30");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            String operator = args[1];
            int num2 = Integer.parseInt(args[2]);

            int result = 0;
            String operation = "";
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    operation = "Sum";
                    break;
                case "-":
                    result = num1 - num2;
                    operation = "Difference";
                    break;
                case "*":
                    result = num1 * num2;
                    operation = "Product";
                    break;
                default:
                    System.out.println("Invalid operator! Use +, -, or *.");
                    return;
            }
            System.out.println(operation + " of " + num1 + " and " + num2 + " is " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");
        }
    }
}
