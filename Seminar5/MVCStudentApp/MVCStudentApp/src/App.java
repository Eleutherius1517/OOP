import java.util.ArrayList;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.IGetModel;
import Controller.Interfaces.IGetView;
import Model.Domain.*;
import Model.ModelClass;
import Model.ModelClassHash;
import View.ViewClass;
import View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Ivan", 21);
        Student student2 = new Student("Anna", 22);
        Student student3 = new Student("Olga", 20);
        Student student4 = new Student("Nikita", 25);
        Student student5 = new Student("Vladimir", 28);
        Student student6 = new Student("Kseniya", 21);
        List<Student> studentLst = new ArrayList<Student>();
        studentLst.add(student1);
        studentLst.add(student2);
        studentLst.add(student3);
        studentLst.add(student4);
        studentLst.add(student5);
        studentLst.add(student6);

        Student student7 = new Student("Sergey", 21);
        Student student8 = new Student("Veronika", 22);
        Student student9 = new Student("Dmitriy", 20);
        Student student10 = new Student("Svyatoslav", 25);
        Student student11 = new Student("Kuzma", 28);
        Student student12 = new Student("Anjelika", 21);
        List<Student> studentLst2 = new ArrayList<Student>();
        studentLst.add(student7);
        studentLst.add(student8);
        studentLst.add(student9);
        studentLst.add(student10);
        studentLst.add(student11);
        studentLst.add(student12);

        

        // IGetModel modelHash = new ModelClassHash(studentLst);
        // ControllerClass controller2 = new ControllerClass(modelHash);
        // controller2.run();

        IGetModel model1 = new ModelClass(studentLst);
        IGetModel model2 = new ModelClass(studentLst2);
        List<IGetModel> modelLst = new ArrayList<>();
        modelLst.add(model1);
        modelLst.add(model2);

        ControllerClass controller = new ControllerClass(modelLst);
        controller.run();
        
        
    }
}
