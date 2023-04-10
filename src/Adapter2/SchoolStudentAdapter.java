package Adapter2;

public class SchoolStudentAdapter implements  Student{

    private SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return this.schoolStudent.fName;
    }

    @Override
    public String getSurname() {
        return this.schoolStudent.lName;
    }

    @Override
    public int getId() {
        return this.schoolStudent.sid;
    }
}
