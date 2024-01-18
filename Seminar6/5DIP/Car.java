package Seminar6.5DIP;

public class Car {
    private iEngine engine;

    public Car(iEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}

public class PetrolEngine implements iEngine {
    public void start() {
    }
}
public class DieselEngine implements iEngine {
    public void start() {
    }
}
public interface iEngine {
    public void start();
}
