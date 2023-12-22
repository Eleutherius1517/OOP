package Classes;
/**Метод описывает акционного посетителя*/
public class PromotionalClient extends Actor {
    /**Название акции*/
    private String nameProm;
    /**Количество участников акции*/
    private static int сountMember = 0;
    /**Конструктор*/
    public PromotionalClient(String name, String promote) {
        super(name);
        this.nameProm = promote;
        сountMember++;
    }
    /**Статический метод, который возвращает количество участников акции*/
    public static int getAmountPromMembers(){
        return сountMember;
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
