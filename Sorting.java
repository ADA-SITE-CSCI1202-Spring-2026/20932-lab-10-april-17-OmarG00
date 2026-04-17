import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getSalary() { return salary; }
}

public class Sorting{
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Omar", "Gadimli", 72000.00));
        employees.add(new Employee("Asd", "Asdli", 85000.50));
        employees.add(new Employee("Abdurrahmanullah", "Samedov", 61500.75));
        employees.add(new Employee("Idk", "Alisov", 93000.00));
        employees.add(new Employee("Seymur", "Alizade", 47800.25));

        Function<Employee, String> formatCard = e -> "Name: [" + e.getLastName() + ", " + e.getFirstName() + "] - Salary: $" + e.getSalary();

        Function<Employee, Double> salaryPicker = Employee::getSalary;

        for (Employee emp : employees) {
            System.out.println(formatCard.apply(emp));
            System.out.println("Extracted Salary: $" + salaryPicker.apply(emp));
            System.out.println("----------------------------------");
        }
    }
}