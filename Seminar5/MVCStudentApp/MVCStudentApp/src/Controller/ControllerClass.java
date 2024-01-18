package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.IGetModel;
import Controller.Interfaces.IGetView;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

// Класс контроллер, в нем взаимодействие модели и вью
public class ControllerClass {
    //Экземпляр модели
    private IGetModel model;
    //Экземпляр вью
    private IGetView view;
    //Список студентов
    private List<Student> bufferData = new ArrayList<>();
    //Список моделей студентов
    private List<IGetModel> modelData = new ArrayList<>();

    //Конструктор
    public ControllerClass(List<IGetModel> modelData) {
        this.modelData = modelData;
        model = modelData.get(0);
    }
    // MVP логика
    public void update(){
        System.out.println("Выберите язык: 1 - Русский, 2 - Английский:");
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());
        setLanguage(number);
        
        bufferData = model.getStudents();
        if (testData(bufferData)) {
            view.printAllStudents(model.getStudents());
        }
        else{
            System.out.println("Student List Empty!");
        }
        
    }
    // Метод поиска студентов по имени во всех моделях
    public void findStudent(String nameStd){
        for (IGetModel model : modelData) {
            for (Student student : model.getStudents()) {
                if (student.getName().equalsIgnoreCase(nameStd)) {
                    System.out.println(student);
                    return;
                }
            }
        }
        System.out.println("Студент по имени не найден!");
    }
    // Проверка валидности данных
    private boolean testData (List<Student> studentList){
        if (studentList.size() > 0) {
            return true;
        }
        else{
            return false;
        }
    }
    //Метод установки языка
    private void setLanguage(int indexLang){
        if (indexLang == 1) {
            view = new ViewClass();
            return;
        }
        if (indexLang == 2) {
            view = new ViewClassEng();
            return;
        } else {
            view = new ViewClass();
            System.out.println("Вы ввели не верное число, язык по умолчанию - Русский.");
        }
    }
    //логика MVP - взаимодействие модели и вью
    public void run()
    {
        System.out.println("Выберите язык: 1 - Русский, 2 - Английский:");
        Scanner in1 = new Scanner(System.in);
        int number = Integer.parseInt(in1.nextLine());
        setLanguage(number);

        Command com = (Command)Command.NONE;
        boolean getNewIter = true;
        while(getNewIter)
        {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                   getNewIter = false;
                   System.out.println("Выход из программы");
                   break;
                case LIST:
                   view.printAllStudents(model.getStudents());
                   break;
                case DELETE:
                    int number1 = Integer.parseInt(view.prompt("Введите номер студента на удаление:"));
                    model.deleteStudent(number1);
                    break;
                case FIND:
                    String nameStd = view.prompt("Введите номер имя студента для поиска:");
                    findStudent(nameStd);
                    break;
            }
        }
    }
}
