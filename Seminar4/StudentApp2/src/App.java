

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controller.AccountController;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Student<Integer> student1 = new Student("Ivan", 21);
        Student<Integer> student2 = new Student("Anna", 22);
        Student<Integer> student3 = new Student("Olga", 20);
        Student<Integer> student4 = new Student("Nikita", 25);
        Student<Integer> student5 = new Student("Vladimir", 28);
        Student<Integer> student6 = new Student("Kseniya", 21);
        List<Student<Integer>> group1 = new ArrayList<>();
        group1.add(student1);
        group1.add(student2);
        group1.add(student3);
        group1.add(student4);
        group1.add(student5);
        group1.add(student6);
        StudentGroup studentGroup1 = new StudentGroup(group1, 5282);
        System.out.println(studentGroup1);
        for (Student<Integer> student : studentGroup1) {
            System.out.println(student);
        }
        Collections.sort(studentGroup1.getGroup());
        System.out.println("---------------");
        for (Student<Integer> student : studentGroup1) {
            System.out.println(student);
        }
        System.out.println("##################");
        Student<Integer> student7 = new Student("Semen", 19);
        Student<Integer> student8 = new Student("Oleg", 28);
        Student<Integer> student9 = new Student("Dmitriy", 22);
        Student<Integer> student10 = new Student("Egor", 20);
        Student<Integer> student11 = new Student("Vadim", 23);
        Student<Integer> student12 = new Student("Anastasiya", 26);
        List<Student<Integer>> group2 = new ArrayList<>();
        group2.add(student7);
        group2.add(student8);
        group2.add(student9);
        group2.add(student10);
        group2.add(student11);
        //group2.add(student12);
        StudentGroup studentGroup2 = new StudentGroup(group2, 5194);
        List<StudentGroup> steam1 = new ArrayList<>();
        steam1.add(studentGroup1);
        steam1.add(studentGroup2);
        StudentSteam steamGroup = new StudentSteam(steam1);
        for (StudentGroup studentGroup : steamGroup) {
            System.out.println(studentGroup);
        }
        Collections.sort(steamGroup.getLstGrp());
        System.out.println("---------------");
        for (StudentGroup studentGroup : steamGroup) {
            System.out.println(studentGroup);
        }
        Teacher<Integer> teacher1 = new Teacher("Tatiyana", 42, "Docent");
        Teacher<Integer> teacher2 = new Teacher("Valentina", 54, "Docent");
        Teacher<Integer> teacher3 = new Teacher("Zinaida", 60, "Docent");
        
        System.out.println(new PersonComparator<Teacher<Integer>>().compare(teacher1, teacher2));
        System.out.println(new PersonComparator<Student<Integer>>().compare(student7, student10));

        AccountController accountController = new AccountController();
        accountController.paySalary(teacher1, 50000);

        List<Teacher<Integer>> groupTeachers = new ArrayList<>();
        groupTeachers.add(teacher1);
        groupTeachers.add(teacher2);
        groupTeachers.add(teacher3);

        AccountController.averageAge(groupTeachers);
        AccountController.averageAge(group1);

        

    }
}
