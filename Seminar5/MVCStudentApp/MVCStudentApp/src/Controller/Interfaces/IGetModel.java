package Controller.Interfaces;

import java.util.List;
import Model.Domain.Student;
// Интерфейс описывающий поведение модели
public interface IGetModel {
    // Метод для получения списка студентов
    public List<Student> getStudents();
    // Метод позволяющий удалить студента из списка по индексу
    public void deleteStudent(int index);
}
