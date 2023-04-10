package Adapter2;

public class CollageStudent implements Student {

    String firstName;
    String lastName;
    int id;

    public CollageStudent(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String getName() {
        return firstName;
    }

    @Override
    public String getSurname() {
        return lastName;
    }

    @Override
    public int getId() {
        return id;
    }
}
