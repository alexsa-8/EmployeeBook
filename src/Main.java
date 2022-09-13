
public class Main {

    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook(10);
        book.add(new Employee("Иванов", "Иван", "Иванович", 1, 50_000));
        book.add(new Employee("Петров", "Петр", "Петрович", 1, 55_000));
        book.add(new Employee("Сидоров", "Сидор", "Сидорович", 2, 57_000));
        book.add(new Employee("Васечкин", "Василий", "Васильевич", 2, 59_000));
        book.add(new Employee("Андреев", "Андрей", "Андреевич", 3, 65_000));
        book.add(new Employee("Иванова", "Ольга", "Андреевна", 3, 67_000));
        book.add(new Employee("Петрова", "Наталья", "Ивановна", 4, 59_000));
        book.add(new Employee("Сидорова", "Галина", "Петровна", 4, 62_000));
        book.add(new Employee("Васечкина", "Дарья", "Сидоровна", 5, 71_000));
        book.add(new Employee("Андреева", "Оксана", "Васильевна", 5, 70_000));
        //book.add(new Employee("Васильев", "Александр", "Юрьевич", 3, 69_000));

        book.printAllEmployees();
        book.amountCostsSalary();
        book.isMinimumSalary();
        book.isMaximumSalary();
        book.averageSalary();
        book.listEmployees();
        book.indexingSalary();
        book.numbersDepartment();
        book.printEmployeeMinimumSalary();
        book.printEmployeeMaximumSalary();
        book.amountOfSalaryCostsByDepartment();
        book.averageSalaryByDepartment();
        book.indexDepartmentSalaryPercentage();
        book.workEmployeesDepartment();
        book.earnLessNumber();
        book.earnMoreNumber();
        book.deleteAnEmployee(0);
        book.addNewEmployee();
        book.changeAnEmployee(75000,5);
    }
}