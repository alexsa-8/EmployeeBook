//import java.util.Arrays;
public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int size) {
        employees = new Employee[size];
    }

    public boolean add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }
    public void printAllEmployees() {
        System.out.println("Данные сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    public void amountCostsSalary(){
        double sum=0;
        for (Employee element : employees) {
            if (element != null){
                sum += element.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum + " рублей");
    }
    public void isMinimumSalary() {
        int minSalary = (int) employees[0].getSalary();
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = (int) employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        if (employeeWithMinSalary != null) {
            System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary.getEmployeeName());
        }
    }
    public void isMaximumSalary() {
        int maxSalary = 0;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = (int) employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        if (employeeWithMaxSalary != null) {
            System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary.getEmployeeName());
        }
    }
    public void averageSalary(){
        double sum=0;
        for (Employee element : employees) {
            if (element != null){
                sum += element.getSalary();
            }
        }
        double averageSalary=sum/employees.length;
        System.out.println("Среднее значение зарплат: "+averageSalary+" рублей");
    }
    public void listEmployees(){
        System.out.println("Список Ф. И. О. всех сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null){
                System.out.println(employee.getEmployeeName());
            }
        }
    }
    public void indexingSalary(double percent){
        for (Employee employee : employees){
            if (employee != null) {
                double indexingSalary=(employee.getSalary()*percent+employee.getSalary());
                employee.getSalary(indexingSalary);
            }
        }
    }

}