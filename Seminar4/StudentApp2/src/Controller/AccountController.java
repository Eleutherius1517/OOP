package Controller;

import java.util.List;
import Domen.Person;
import Domen.Teacher;

public class AccountController {
    public <T extends Teacher<Integer>> void paySalary(T person, int salary){
        System.out.println(" " + person.getName() + "get " + salary + "$");
    } 

    public static<T extends Person> void averageAge(List<? extends Person> lst){
        int sumAge = 0;
        int temp = 0;
        for (int index = 0; index < lst.size(); index++) {
            temp = lst.get(index).getAge().intValue();
            sumAge += temp;

        }
        System.out.println("Проверка метода averageAge: " + sumAge/lst.size());

    }
}
