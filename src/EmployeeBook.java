import java.lang.*;
import java.util.Scanner;

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

    public void printEmployeeMinimumSalary() {
        for (Employee employee : employees) {
            for (Employee value : employees) {
                if (employee != null && employee.getDepartment() == value.getDepartment() &&
                        employee.getSalary() < value.getSalary()) {
                    System.out.println("Сотрудник: " + employee.getEmployeeName() +
                            " из отдела №" + employee.getDepartment() +
                            " с минимальной зарплатой " + employee.getSalary() + " руб.");
                }
            }
        }
    }

    public void printEmployeeMaximumSalary() {
        for (Employee employee : employees) {
            for (Employee value : employees) {
                if (employee != null && employee.getDepartment() == value.getDepartment() &&
                        employee.getSalary() > value.getSalary()) {
                    System.out.println("Сотрудник: " + employee.getEmployeeName() +
                            " из отдела №" + employee.getDepartment() +
                            " с максимальной зарплатой " + employee.getSalary() + " руб.");
                }
            }
        }
    }

    public void amountOfSalaryCostsByDepartment() {
        double costAmount;
        for (int i = 1; i < 6; i++) {
            costAmount = 0;
            for (Employee employee : employees)
                if (employee != null && employee.getDepartment() == i) {
                    costAmount += employee.getSalary();
                }
            System.out.println("Сумма затрат на зарплату в отделе №" + employees[i].getDepartment() +
                    " = " + costAmount + " руб.");
        }
    }

    public void averageSalaryByDepartment() {
        double costAmount, averageSalary;
        int numberOfEmployees;
        for (int i = 1; i < 6; i++) {
            costAmount = 0;
            numberOfEmployees = 0;
            averageSalary = 0;
            for (Employee employee : employees)
                if (employee != null && employee.getDepartment() == i) {
                    costAmount += employee.getSalary();
                    numberOfEmployees++;
                    averageSalary = costAmount / (double) numberOfEmployees;
                }
            System.out.println("Средняя зарплата в отделе №" + employees[i].getDepartment() +
                    " = " + averageSalary + " руб.");
        }
    }

    public void indexDepartmentSalaryPercentage() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер отделения от 1 до 5 включительно: ");
        int departmentNumber = input.nextInt();
        System.out.print("Введите процент индексирования зарплат: ");
        double percent = input.nextDouble();
        double indexedSalary;
        System.out.println("В отделе №" + departmentNumber + " проиндексирована зарплата на " + percent + " % :");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == departmentNumber) {
                indexedSalary = employee.getSalary() * percent / 100 + employee.getSalary();
                System.out.println(employee.getEmployeeName() + " " + indexedSalary + " руб.");
            }
        }
    }

    public void workEmployeesDepartment() {
        Scanner input = new Scanner(System.in);
        System.out.print("Данные сотрудников кокого отдела вывести? Ведите номер отделения от 1 до 5 включительно: ");
        int departmentNumber = input.nextInt();
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == departmentNumber) {
                System.out.println(employee.getEmployeeName() +
                        " з/п " + employee.getSalary() + " руб. id-" + employee.getId());
            }
        }
    }

    public void earnLessNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер зарплаты, вы увидите сотрудников которые получают меньше указанного числа: ");
        double salaryNumber = input.nextDouble();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salaryNumber) {
                System.out.println(employee.getEmployeeName() + " з/п " + employee.getSalary() +
                        " руб. id-" + employee.getId());
            }
        }
    }

    public void earnMoreNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер зарплаты, вы увидите сотрудников которые получают столько или больше указанного числа: ");
        double salaryNumber = input.nextDouble();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salaryNumber) {
                System.out.println(employee.getEmployeeName() + " з/п " + employee.getSalary() +
                        " руб. id-" + employee.getId());
            }
        }
    }

    public void deleteAnEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                System.out.println("Из списка удаляем сотрудника с id = " + id);
                employees[i] = null;
                return;
            }
        }
    }

    public void addNewEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee("Васильев",
                        "Иван", "Степанович",
                        5, 75_000);
                System.out.println("Новый сотрудник :\n" + employees[i]);
                return;
            }
        }
    }

    public void changeAnEmployee(double salary, int department) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите id сотрудника для изменения его зарплаты и отдела: ");
        int id = input.nextInt();
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                employee.setSalary(salary);
                employee.setDepartment(department);
                System.out.println("Новая зарплата = " + employee.getSalary() + " руб.");
                System.out.println("Новый отдел №" + employee.getDepartment());
            }
        }
    }

    public void getNameEmployeesDepartment(){
        for (int i = 1; i < 6; i++) {
            System.out.println("Сотрудники отдела №"+i+" :");
            for (Employee employee : employees) {
                if (employee != null && employee.getDepartment()==i) {
                    System.out.println(employee.getEmployeeName());
                }
            }
        }
    }
}