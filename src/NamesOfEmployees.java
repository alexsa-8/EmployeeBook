public class NamesOfEmployees {
    String lastName;
    String firstName;
    String patronymic;

    public NamesOfEmployees(String lastName, String firstName, String patronymic){
        this.lastName=lastName;
        this.firstName=firstName;
        this.patronymic=patronymic;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "NamesOfEmployees{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
