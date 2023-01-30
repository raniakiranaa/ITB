import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double baseSalary = input.nextDouble();
        double currentPoints = input.nextDouble();
        double targetPoints = input.nextDouble();
        input.close();

        Employee employee = new Employee(name, baseSalary);
        EmployeePerformance performance = new EmployeePerformance(employee, currentPoints, targetPoints);
        if (performance.isPromotable()){
            System.out.println("YES");
            System.out.printf("%.2f\n", performance.getCurrentSalary());
        } else {
            System.out.println("NO");
            System.out.printf("%.2f\n", (2 * targetPoints) - currentPoints);
        }

    }
}