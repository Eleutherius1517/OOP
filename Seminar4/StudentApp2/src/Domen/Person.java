package Domen;

public class Person<T extends Number> {
    private String name;
    private T age;
    public Person(String name, T age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public T getAge() {
        return age;
    }
    public void setAge(T age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person = " + this.name + ", age = " + this.age;
    }
}
