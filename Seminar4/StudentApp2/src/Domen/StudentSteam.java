package Domen;

import java.util.Iterator;
import java.util.List;
//Класс описывающий Поток студентов, несколько групп
public class StudentSteam implements Iterable<StudentGroup>{
    //Список групп
    private List<StudentGroup> lstGrp;
    //id потока студентов
    private int id;
    //статический подсчет потоков
    private static int generalId;
    //Конструктор
    public StudentSteam(List<StudentGroup> lstGrp) {
        this.lstGrp = lstGrp;
        this.id = generalId;
        generalId++;
    }
    // переопределенный метод для описания своего итератора
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentSteamIterator(lstGrp);
    }
    //Метод для получения списка групп
    public List<StudentGroup> getLstGrp() {
        return lstGrp;
    }
    //Метод для установления списка групп
    public void setLstGrp(List<StudentGroup> lstGrp) {
        this.lstGrp = lstGrp;
    }
    //Метод для получения id потока
    public int getId() {
        return id;
    }
    //Метод для установления id потока
    public void setId(int id) {
        this.id = id;
    }
    // переопределенный метод по заданию
    @Override
    public String toString() {
        String studentStr = "-";
        for (StudentGroup studentGroup : lstGrp) {
            for (Student<Integer> student : studentGroup) {
                studentStr += student + ", id group: " + studentGroup.getIdGroup() + "\n-";
            }
        }
        return "\n***Number stream: " + this.id + "\n***Amount group: " + this.lstGrp.size()  + "\n***Student List:\n" + studentStr;
    }
    
    
}
