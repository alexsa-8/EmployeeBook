public class Main {
    /*public class OrderedObject {
        private static int nextId=1;
        private int id=nextId++;

        public int getOrder() {
            return id;
        }

        public String toString()
        {
            return "OrderedObject-"+id;
        }*/

    public static void main(String[] args) {
        Employee Employee1 = new Employee("Иванов", "Иван", "Иванович", 1, 50_000);
        Employee Employee2 = new Employee("Петров", "Петр", "Петрович", 1, 55_000);
        Employee Employee3 = new Employee("Сидоров", "Сидор", "Сидорович", 2, 57_000);
        Employee Employee4 = new Employee("Васечкин", "Василий", "Васильевич", 2, 59_000);
        Employee Employee5 = new Employee("Андреев", "Андрей", "Андреевич", 3, 65_000);
        Employee Employee6 = new Employee("Иванова", "Ольга", "Ардреевна", 3, 67_000);
        Employee Employee7 = new Employee("Петрова", "Наталья", "Ивановна", 4, 59_000);
        Employee Employee8 = new Employee("Сидорова", "Галина", "Петровна", 4, 62_000);
        Employee Employee9 = new Employee("Васечкина", "Дарья", "Сидоровна", 5, 71_000);
        Employee Employee10 = new Employee("Андреева", "Аксана", "Васильевна", 5, 70_000);
        Employee[] employees = new Employee[10];
        employees[0] = Employee1;
        employees[1] = Employee2;
        employees[2] = Employee3;
        employees[3] = Employee4;
        employees[4] = Employee5;
        employees[5] = Employee6;
        employees[6] = Employee7;
        employees[7] = Employee8;
        employees[8] = Employee9;
        employees[9] = Employee10;
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        double[] salaries = new double[10];
        salaries[0] = Employee1.getSalary();
        salaries[1] = Employee2.getSalary();
        salaries[2] = Employee3.getSalary();
        salaries[3] = Employee4.getSalary();
        salaries[4] = Employee5.getSalary();
        salaries[5] = Employee6.getSalary();
        salaries[6] = Employee7.getSalary();
        salaries[7] = Employee8.getSalary();
        salaries[8] = Employee9.getSalary();
        salaries[9] = Employee10.getSalary();
        double sum = 0;
        for (double salary : salaries) {
            sum += salary;
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
        double min=salaries[0];
        for (double salary : salaries) {
            if (salary < min) {
                min = salary;
            }
        }
        System.out.println("Минимальная зарплата сотрудника: " + min);
        double max=0;
        for (double salary : salaries) {
            if (salary > max) {
                max = salary;
            }
        }
        System.out.println("Максимальная зарплата сотрудника: " + max);
        double averageSalary=sum/salaries.length;
        System.out.println("Среднее значение зарплат: " + averageSalary);
        String[] nameEmployees=new String[10];
        nameEmployees[0]=Employee1.getEmployeeName();
        nameEmployees[1]=Employee2.getEmployeeName();
        nameEmployees[2]=Employee3.getEmployeeName();
        nameEmployees[3]=Employee4.getEmployeeName();
        nameEmployees[4]=Employee5.getEmployeeName();
        nameEmployees[5]=Employee6.getEmployeeName();
        nameEmployees[6]=Employee7.getEmployeeName();
        nameEmployees[7]=Employee8.getEmployeeName();
        nameEmployees[8]=Employee9.getEmployeeName();
        nameEmployees[9]=Employee10.getEmployeeName();
        System.out.println("Список Ф. И. О. всех сотрудников: ");
        for (String nameEmployee : nameEmployees) {
            System.out.println(nameEmployee);
        }
    }
}