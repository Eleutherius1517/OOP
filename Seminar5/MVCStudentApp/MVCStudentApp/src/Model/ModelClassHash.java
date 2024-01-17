package Model;

import java.util.*;

import Controller.Interfaces.IGetModel;
import Model.Domain.Student;

// Класс описывающий модель со списком HashMap
public class ModelClassHash implements IGetModel {
    // Список студентов
    private Map<Integer, Student> studentMap = new HashMap<Integer,Student>();
    // Конструктор
    public ModelClassHash(List<Student> studentList) {
        for (Student std : studentList) {
            this.studentMap.put(std.getId(), std);
        }
    }
    // Метод для получения списка студентов
    @Override
    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        for (int index = 0; index < studentMap.size(); index++) {
            studentList.add(studentMap.get(index));
        }
        return studentList;
    }
    // Метод позволяющий удалить студента из списка по индексу
    @Override
    public void deleteStudent(int index) {
        if (studentMap.containsKey(index)) {
            studentMap.remove(index);
        } else {
            System.out.println("This index does not exist!");
        }
        
    }
    
}
