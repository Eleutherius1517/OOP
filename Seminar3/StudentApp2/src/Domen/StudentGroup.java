package Domen;

import java.util.Iterator;
import java.util.List;
//Класс описывающий группу студентов
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    //Список студентов
    private List<Student> group;
    //Id группы
    private int idGroup;
    //Конструктор
    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }
    //Метод для получения списка студентов
    public List<Student> getGroup() {
        return group;
    }
    //Метод для установления списка студентов
    public void setGroup(List<Student> group) {
        this.group = group;
    }
    //Метод для получения id группы
    public int getIdGroup() {
        return idGroup;
    }
    //Метод для установления id группы
    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }
    // переопределенный метод по заданию
    @Override
    public String toString() {
        for (Student student : group) {
            System.out.println(student);
        }
        return "Student Group id = " + this.idGroup + ", amount student" + this.group.size();
    }
    // переопределенный метод для описания своего итератора
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }
    // переопределенный метод для описания своей логики сравнения
    @Override
    public int compareTo(StudentGroup o) {
        if (this.getGroup().size() > o.getGroup().size()) {
            return 1;
        }
        if (this.getGroup().size() < o.getGroup().size()) {
            return -1;
        }
        if (this.idGroup > o.idGroup) {
            return 1;
        }
        if (this.idGroup < o.idGroup) {
            return -1;
        }
        return 0;
    }
}
