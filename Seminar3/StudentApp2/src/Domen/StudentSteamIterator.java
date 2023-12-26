package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentSteamIterator implements Iterator<StudentGroup> {
    private int count;
    private final List<StudentGroup> list;
    public StudentSteamIterator(List<StudentGroup> list) {
        this.list = list;
        this.count = 0;
    }
    @Override
    public boolean hasNext() {
        return count < list.size();
    }
    @Override
    public StudentGroup next() {
        return this.list.get(count++);
    }
    
}
