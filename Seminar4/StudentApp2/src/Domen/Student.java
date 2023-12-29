package Domen;

public class Student<T extends Number> extends Person implements Comparable<Student> {
    private int id;
    private static int generalId;
    public Student(String name, T age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return super.toString() + ", id = " + this.id;
    }

    @Override
    public int compareTo(Student o) {
        if (super.getAge().intValue() > o.getAge().intValue()) {
            return 1;
        }
        if (super.getAge().intValue() < o.getAge().intValue()) {
            return -1;
        }
        if (this.id > o.id) {
            return 1;
        }
        if (this.id < o.id) {
            return -1;
        }
        return 0;
    }
    
}

