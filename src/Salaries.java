public class Salaries {
    double Salaries;
    public Salaries(double Salaries){
        this.Salaries =Salaries;
    }

    public double getSalaries() {
        return Salaries;
    }

    @Override
    public String toString() {
        return "Salaries{" +
                "Salaries=" + Salaries +
                '}';
    }
}
