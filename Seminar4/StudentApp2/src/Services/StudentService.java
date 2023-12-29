package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Student;

public class StudentService implements iGenericInterface<Student> {
    private int count;
    private List<Student> lstStudent;
    public StudentService() {
        this.lstStudent = new ArrayList<>();
    }
    public void sortBySecondName(){
        PersonComparator<Student> personComp = new PersonComparator<>();
        this.lstStudent.sort(personComp);
    }
    @Override
    public List<Student> getAll() {
        return lstStudent;
    }
    @Override
    public void create(String name, int age) {
        lstStudent.add(new Student(name, age));
        count++;
    }
}
