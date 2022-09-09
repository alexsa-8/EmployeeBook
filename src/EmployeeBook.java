import java.util.Scanner;

public class EmployeeBook {
    public static double percent;
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
                System.out.println(employee.toString());
            }
        }
    }

    public void amountCostsSalary() {
        double sum = 0;
        for (Employee element : employees) {
            if (element != null) {
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

    public void averageSalary() {
        double sum = 0;
        for (Employee element : employees) {
            if (element != null) {
                sum += element.getSalary();
            }
        }
        double averageSalary = sum / employees.length;
        System.out.println("Среднее значение зарплат: " + averageSalary + " рублей");
    }

    public void listEmployees() {
        System.out.println("Список Ф. И. О. всех сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getEmployeeName());
            }
        }
    }

    public void indexingSalary() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите процент индексирования зарплат: ");
        double percent = input.nextDouble();
        for (Employee employee : employees) {
            if (employee != null) {
                double indexingSalary = (employee.getSalary() * (percent / 100) + employee.getSalary());
                System.out.println("Было:" + employee.getSalary() + " руб. стало: " + indexingSalary + " руб.");
            }
        }
    }

    public void numbersDepartment() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getEmployeeName() + " работает в " + employee.getDepartment() + " отделе.");
            }
        }
    }

    public void printEmployeeMinimumSalary(){
        for (Employee employee : employees) {
            for (Employee value : employees) {
                if (employee.getDepartment() == value.getDepartment() && employee.getSalary() < value.getSalary()) {
                    System.out.println("Сотрудник: " + employee.getEmployeeName() + " из отдела №" + employee.getDepartment() +
                            " с минимальной зарплатой " + employee.getSalary() + " руб.");
                }
            }
        }
    }
    public void printEmployeeMaximumSalary(){
        for (Employee employee : employees) {
            for (Employee value : employees) {
                if (employee.getDepartment() == value.getDepartment() && employee.getSalary() > value.getSalary()) {
                    System.out.println("Сотрудник: " + employee.getEmployeeName() + " из отдела №" + employee.getDepartment() +
                            " с максимальной зарплатой " + employee.getSalary() + " руб.");
                }
            }
        }
    }

   /* public void amountOfSalaryCostsByDepartment(){
        for (Employee employee : employees) {
            double costAmount=0;
            costAmount=employee.getSalary();
            for (int i=1; i<6;i++) {
                if (employee.getDepartment() == i && employee.getEmployeeName()!= employees[i-1].getEmployeeName()) {
                    costAmount+=employees[i-1].getSalary();

                    System.out.println("Сумма затрат на зарплату в отделе №"+employee.getDepartment()+" = " + costAmount + " руб.");
                }
            }
        }
    }*/
}