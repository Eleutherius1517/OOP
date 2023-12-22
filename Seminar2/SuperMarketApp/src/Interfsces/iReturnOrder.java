package Interfsces;
/**Интерфейс описывающий возможное поведение при возврате товара*/
public interface iReturnOrder {
    /**Получение возможности возврата и вывод на экран*/
    public void takeReturnOrder();
    /**Причина возврата*/
    public String getCauseForRO();
    /**Цена возврата*/
    public double getMoneyForRO();
    /**Заглушка, возвращает случайную вероятность возврата*/
    public boolean getChanceOfReturn();
    /**Заглушка, возвращает количество товара на возврат*/
    public int getAmountOrderForRO();
}
