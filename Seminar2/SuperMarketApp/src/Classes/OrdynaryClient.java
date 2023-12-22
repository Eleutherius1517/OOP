package Classes;

/**Класс описывающий обычного клиента*/
public class OrdynaryClient extends Actor {
    /**Конструктор*/
    public OrdynaryClient(String name) {
        super(name);
    }
    /**Проверка, получил ли посетитель заказ*/
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /**Проверка, сделал ли посетитель заказ*/
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**Метод регистрации получения заказа посетителем*/
    @Override
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }
    /**Метод регистрации совершения заказа посетителем*/
    @Override
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }
    /**Метод возвращает экземпляр посетителя*/
    @Override
    public Actor geActor() {
        return this;
    }
    /**Метод возвращает имя посетителя*/
    @Override
    String getName() {
        return super.name;
    }
    /**Метод задает имя посетителя*/
    @Override
    void setName(String str) {
        super.name = str;
    }
    
}
