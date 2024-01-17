package Model;

import java.util.List;

import Controller.Interfaces.IGetModel;
import Model.Domain.Student;

// Класс описывающий базовую модель
public class ModelClass implements IGetModel{
    // Список студентов
    private List<Student> studentList;
    // Конструктор
    public ModelClass(List<Student> studentList) {
        this.studentList = studentList;
    }
    // Метод для получения списка студентов
    public List<Student> getStudents(){
        return this.studentList;
    }
    // Метод позволяющий удалить студента из списка по индексу
    @Override
    public void deleteStudent(int index) {
        if (studentList.size() > index && index >= 0) {
            studentList.remove(index);
        } else {
            System.out.println("This index does not exist!");
        }
        
    }
}
