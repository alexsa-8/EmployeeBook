public class NamesOfEmployees {
    String lastName;
    String firstName;
    String patronymic;

    public NamesOfEmployees(String lastName, String firstName, String patronymic){
        this.lastName=lastName;
        this.firstName=firstName;
        this.patronymic=patronymic;
    }

    public String getLastName() {return lastName;}

    public String getFirstName() {return firstName;}

    public String getPatronymic() {return patronymic;}

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
        return " " + lastName +
                " " + firstName +
                " " + patronymic;
    }
}
