package Classes;

import Interfsces.iActorBehavor;

/**Класс описывает инспектора*/
public class TaxInspector implements iActorBehavor {
    /**Имя инспектора*/
    private String name;
    /**Флаг, получил ли посетитель заказ*/
    private boolean isTakeOrder;
    /**Флаг, сделал ли посетитель заказ*/
    private boolean isMakeOrder;

    /**Конструктор*/
    public TaxInspector() {
        this.name = "Tax Audit";
    }
    /**Метод для получения имени посетителя*/
    public String getName()
    {
        return name;
    }
    /**Проверка, получил ли посетитель заказ*/
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
    /**Проверка, сделал ли посетитель заказ*/
    public boolean isMakeOrder() {
        return isMakeOrder; 
    }
    /**Метод регистрации получения заказа посетителем*/
    public void setTakeOrder(boolean val) {
        isTakeOrder = val;
    }
    /**Метод регистрации совершения заказа посетителем*/
    public void setMakeOrder(boolean val) {
        isMakeOrder = val;        
    }
    /**Метод возвращает экземпляр посетителя*/
    @Override
    public Actor geActor() {
        return new OrdynaryClient(name);
    }

}
