package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student<Integer>>{
    private int count;
    private final List<Student<Integer>> list;
    public StudentIterator(List<Student<Integer>> list) {
        this.list = list;
        this.count = 0;
    }
    @Override
    public boolean hasNext() {
        return count < list.size();
    }
    @Override
    public Student next() {
        return this.list.get(count++);
    }
}
