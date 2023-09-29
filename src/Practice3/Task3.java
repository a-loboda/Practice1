package Practice3;

public class Task3 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivanov Ivan Ivanych", 5000),
                new Employee("Petrov Peter Petrovich", 6000),
                new Employee("Sidorov Kirill Aleksandrovich", 7000)
        };

        Report.generateReport(employees);
    }
}
