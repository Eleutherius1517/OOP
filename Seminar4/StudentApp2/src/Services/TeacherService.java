package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.PersonComparator;
import Domen.Student;
import Domen.Teacher;

public class TeacherService implements iGenericInterface<Teacher>{
    private int count;
    private List<Teacher> lstTeachers;

    public TeacherService() {
        this.lstTeachers = new ArrayList<>();
    }

    public void sortBySecondName(){
        PersonComparator<Teacher> personComp = new PersonComparator<>();
        this.lstTeachers.sort(personComp);
    }

    public void printTeachers(){
        this.sortBySecondName();
        for (Teacher teacher : lstTeachers) {
            System.out.println(teacher);
        }
    }

    @Override
    public List<Teacher> getAll() {
        return lstTeachers;
    }

    @Override
    public void create(String name, int age) {
        lstTeachers.add(new Teacher(name, age, "Basic"));
        count++;
    }
    
}
