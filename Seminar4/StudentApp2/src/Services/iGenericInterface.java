package Services;

import java.util.List;

public interface iGenericInterface<T> {
    List<T> getAll();
    void create(String name, int age);
}