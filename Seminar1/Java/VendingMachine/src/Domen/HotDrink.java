package Domen;

public class HotDrink extends Product{
    
    private int temp;

    public  HotDrink(int price, int place, String name, long id){
        super(price,place,name,id);
        this.temp = 75;
    }
    public HotDrink (int price, int place, String name, long id, int temp){
        super(price,place,name,id);
        this.temp = temp;
    }

    @Override
    public String toString() {
        return super.toString() + "temperature = "+temp ;
    }
}
