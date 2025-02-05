public class OperatorOverloadingExample {
    public static void main(String[] args) {
    // + as arithmetic addition
    int a = 10, b = 20;
    System.out.println("Sum: " + (a + b)); // Sum: 30
    // + as string concatenation
    String str1 = "Hello";
    String str2 = " World";
    System.out.println(str1 + str2); // Hello World
    // Mixed usage
    System.out.println("Result: " + a + b); // Result: 1020 (concatenation, not addition)
    System.out.println("Result: " + (a + b)); // Result: 30 (addition rst)
    }
   }