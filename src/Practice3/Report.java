package Practice3;

import java.text.DecimalFormat;

class Report {
    static DecimalFormat decimalFormat = new DecimalFormat("#,###.00");

    public static void generateReport(Employee[] employees) {
        System.out.println("Employees report:");
        for (Employee employee : employees) {
            String formattedSalary = decimalFormat.format(employee.getSalary());
            System.out.printf("║ %-30s║ %11s ║%n", employee.getFullname(), formattedSalary);
        }
    }
}
