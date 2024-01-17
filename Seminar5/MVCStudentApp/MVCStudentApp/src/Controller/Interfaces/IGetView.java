package Controller.Interfaces;

import java.util.List;
import Model.Domain.Student;

// Интерфейс описывающий поведение модели
public interface IGetView {
    // Метод вывода на экран всех студентов
    public void printAllStudents(List<Student> studentList);
    // Метод для записи пользовательского сообщения в строку
    String prompt(String msg);
}
