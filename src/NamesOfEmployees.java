public class NamesOfEmployees {
    private final String lastName;
    private final String firstName;
    private final String patronymic;

    public NamesOfEmployees(String lastName, String firstName, String patronymic){
        this.lastName=lastName;
        this.firstName=firstName;
        this.patronymic=patronymic;
    }

    @Override
    public String toString() {
        return " " + lastName +
                " " + firstName +
                " " + patronymic;
    }
}
