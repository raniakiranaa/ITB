/**
 * Employee.java
 * Mendat dan mengatur nama, gaji, dan jumlah karyawan
 * @author 
 */

public class Employee {
    private String name;
    private double baseSalary;

    private static int employeeCount;

    /**
     * Konstruktor
     * @param name
     * @param baseSalary
     */
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeCount++; // nilai employeeCount bertambah setiap ada pembuatan objek Employee
    }

    /**
     * Menambahkan gaji pegawai
     * @param amount jumlah peningkatan, asumsi amount >= 0
     */
    public void increaseSalary(double amount) {
        baseSalary += amount;
    }

    /**
     * Getter name
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter baseSalary
     * @return baseSalary
     */
    public double getBaseSalary() {
        return this.baseSalary;
    }

    /**
     * @return jumlah karyawan
     */
    public static int getEmployeeCount() {
        return employeeCount;
    }
}