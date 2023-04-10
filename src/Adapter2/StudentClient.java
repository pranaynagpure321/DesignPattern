package Adapter2;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentList()
    {
        List<Student> students = new ArrayList<>();

        CollageStudent collageStudent = new CollageStudent("Pranay","Nagpure",1);

        SchoolStudent schoolStudent = new  SchoolStudent("vikas","bhari",2);

        students.add(collageStudent);

        students.add(new SchoolStudentAdapter( schoolStudent));

        return students;
    }
}
