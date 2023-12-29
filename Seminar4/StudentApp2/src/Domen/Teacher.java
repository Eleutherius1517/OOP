package Domen;

public class Teacher<T extends Number> extends Person{
    private String acadDegree;
    public Teacher(String firstName, T age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}
