package Classes;
/**Класс описывает специального клиента*/
public class SpecialClient extends Actor {
    /**VIP id пользователя*/
    private int idVIP;
    /**Конструктор*/
    public SpecialClient(String name, int id) {
        super(name);
        this.idVIP = id;
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
    /**Метод для получения имени посетителя*/
    @Override
    String getName() {
        return super.name;
    }
    /**Метод для установки имени посетителя*/
    @Override
    void setName(String str) {
        super.name = str;
    }
}
