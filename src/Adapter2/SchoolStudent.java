package Adapter2;

public class SchoolStudent implements Student{

    String fName;
    String lName;
    int sid;

    public SchoolStudent(String fName, String lName, int sid) {
        this.fName = fName;
        this.lName = lName;
        this.sid = sid;
    }

    @Override
    public String getName() {
        return fName;
    }

    @Override
    public String getSurname() {
        return lName;
    }

    @Override
    public int getId() {
        return sid;
    }
}
