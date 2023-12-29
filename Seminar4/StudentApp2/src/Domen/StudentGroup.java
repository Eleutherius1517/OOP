package Domen;

import java.util.Iterator;
import java.util.List;
//Класс описывающий группу студентов
public class StudentGroup implements Iterable<Student<Integer>>, Comparable<StudentGroup>{
    //Список студентов
    private List<Student<Integer>> group;
    //Id группы
    private int idGroup;
    //Конструктор
    public StudentGroup(List<Student<Integer>> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }
    //Метод для получения списка студентов
    public List<Student<Integer>> getGroup() {
        return group;
    }
    //Метод для установления списка студентов
    public void setGroup(List<Student<Integer>> group) {
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
        String studentStr = "-";
        for (Student student : group) {
            studentStr += student + "\n-";
        }
        return "***Student Group id = " + this.idGroup + "\n***Amount student" + this.group.size() + "\n***Student List:\n" + studentStr;
    }
    // переопределенный метод для описания своего итератора
    @Override
    public Iterator<Student<Integer>> iterator() {
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
