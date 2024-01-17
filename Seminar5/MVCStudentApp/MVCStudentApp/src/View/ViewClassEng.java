package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.IGetView;
import Model.Domain.Student;

// Класс описывающий вью с Английским языком
public class ViewClassEng implements IGetView {
    // Метод вывода на экран всех студентов
    @Override
    public void printAllStudents(List<Student> studentList) {
        System.out.println("---Student List English Version---");
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
