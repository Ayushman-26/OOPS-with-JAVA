class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public void computePay(int hours) {
        System.out.println("Weekly pay for " + name + " cannot be determined from the base class.");
    }

    public void displayDetails() {
        System.out.println("Worker Name: " + name);
        System.out.println("Salary Rate: " + salaryRate + " per hour");
    }
}
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public void computePay(int hours) {
        
        int daysWorked = hours / 8;
        double pay = daysWorked * salaryRate * 8; 
        System.out.println(name + " (DailyWorker) worked for " + daysWorked + " days. Weekly pay: $" + pay);
    }
}
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public void computePay(int hours) {
        
        double pay = 40 * salaryRate;
        System.out.println(name + " (SalariedWorker) receives a fixed weekly pay: $" + pay);
    }
}
public class Main1{
    public static void main(String[] args) {
        
        DailyWorker dailyWorker = new DailyWorker("John Doe", 20.0);  
        SalariedWorker salariedWorker = new SalariedWorker("Jane Smith", 25.0);

        System.out.println("=== Daily Worker Details ===");
        dailyWorker.displayDetails();
        dailyWorker.computePay(48); 

        System.out.println("\n=== Salaried Worker Details ===");
        salariedWorker.displayDetails();
        salariedWorker.computePay(50); 
    }
}
