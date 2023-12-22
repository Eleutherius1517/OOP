package Interfsces;
import Classes.Actor;
public interface iActorBehavor{
    /**Проверка, получил ли посетитель заказ*/
    public boolean isTakeOrder();
    /**Проверка, сделал ли посетитель заказ*/
    public boolean isMakeOrder();
    /**Метод регистрации получения заказа посетителем*/
    public void setTakeOrder(boolean val);
    /**Метод регистрации совершения заказа посетителем*/
    public void setMakeOrder(boolean val);
    /**Метод возвращает экземпляр посетителя*/
    public Actor geActor();
}
