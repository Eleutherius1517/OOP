package Domen;

public class Employee<T extends Number> extends Person{
    private String special;

    public Employee(String firstName, T age, String special) {
        super(firstName, age);
        this.special = special;
    }
}
