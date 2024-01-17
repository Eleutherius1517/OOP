package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.IGetView;
import Model.Domain.Student;

// Класс описывающий базовую вью
public class ViewClass implements IGetView {
    // Метод вывода на экран всех студентов
    public void printAllStudents(List<Student> studentList){
        System.out.println("---Student List Russian Version---");
        for (Student student : studentList) {
            if(student == null) continue;
            System.out.println(student);
        }
        System.out.println("----------------------------------");
    }
    // Метод для записи пользовательского сообщения в строку
    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
