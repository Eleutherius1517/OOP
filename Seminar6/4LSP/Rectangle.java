package Seminar6.4LSP;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }
}

public class Square extends Rectangle {
    public Square(int size){
        super(size, size);
    }
}
