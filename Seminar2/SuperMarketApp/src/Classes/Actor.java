package Classes;

import Interfsces.iActorBehavor;

/**Класс описывающий посетителя*/
public abstract class Actor implements iActorBehavor{
    /**Имя посетителя*/
    protected String name;
    /**Флаг, получил ли посетитель заказ*/
    protected boolean isTakeOrder;
    /**Флаг, сделал ли посетитель заказ*/
    protected boolean isMakeOrder;
    /**Базовый конструктор*/
    public Actor(String name) {
        this.name = name;
    }
    /**Метод для получения имени посетителя*/
    abstract String getName();
    /**Метод для установки имени посетителя*/
    abstract void setName(String str);
}