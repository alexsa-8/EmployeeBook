public class Employee {
    String employeeName;
    int department;
    double salary;

    public Employee(String employeeName, int department, double salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    public Employee(String lastName, String firstName, String patronymic, int department, double salaries){
        this.employeeName= String.valueOf(new NamesOfEmployees(lastName, firstName, patronymic));
        this.department=department;
        this.salary= new Salaries(salaries).getSalaries();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {return salary;}

    public void setSalary(double salary) {this.salary = salary;}

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
