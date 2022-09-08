public class Employee {
    String employeeName;
    int department;
    double salary;
    int counter=1;
    int id;
    public Employee(String lastName, String firstName, String patronymic, int department, double salaries){
        this.employeeName= String.valueOf(new NamesOfEmployees(lastName, firstName, patronymic));
        this.department=department;
        this.salary= new Salaries(salaries).getSalaries();
        this.id=counter++;
    }
    public int getId() {return id;}
    public String getEmployeeName() {return employeeName;}
    public int getDepartment() {return department;}
    public void setDepartment(int department) {this.department = department;}
    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}

    @Override
    public String toString() {
        return "Ф.И.О.: " + employeeName  +
                ". Отдел № " + department +
                ". Зарплата: " + salary + " рублей. " +
                "id сотрудника: " + id;
   }

    public void getSalary(double indexingSalary) {

    }
}
