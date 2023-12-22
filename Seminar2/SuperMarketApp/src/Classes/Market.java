package Classes;

import java.io.FileWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Interfsces.iActorBehavor;
import Interfsces.iMarketBehavor;
import Interfsces.iQueueBehavor;
import Interfsces.iReturnOrder;

/**Класс описывающий все что происходит в магазине*/
public class Market implements iMarketBehavor,iQueueBehavor, iReturnOrder {
    /**Инициализация записи в файл*/
    private FileWriter fileWriter; //= new FileWriter("log.txt");
    /**Поле, содержащее список посетителе в очереди магазина(т.е. в магазине)*/
    private List<iActorBehavor> queue;
    /**Список содержащий акционных клиентов*/
    private List<iActorBehavor> promo = new ArrayList<>();
    /**Максимальное количество акционных клиентов*/
    private int amountPromo = 2;
    /**Конструктор*/
    public Market() {
        this.queue = new ArrayList<iActorBehavor>();
    }
    /**Создание файла для записи*/
    public void initFile(){
        try {
            fileWriter = new FileWriter("log.log");
            fileWriter.write("  LogFile \n");
            
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
    /**Запись в файл*/
    public void logFile(String message){
        byte[] buffer = message.getBytes();
        try {
            String s  = new String(buffer, "UTF-8");
            fileWriter.append("\n"+s+"\n");
            
        } catch (Exception e) {
            System.out.println("Exception");
        }
        
    }
    /**Закрытие файла*/
    public void closeFile(){
        try {
        fileWriter.flush();
        fileWriter.close();
            
        } catch (Exception e) {
            System.out.println("Exception");
        }
        
    }
    /**Появление посетителя в магазине(добавленеие его в очередь)*/
    @Override
    public void acceptToMarket(iActorBehavor actor) {
        if (actor instanceof Actor) {
            if (actor instanceof PromotionalClient) {
                this.promo.add(actor);
            }   
        }
        System.out.println(actor.geActor().getName() + " клиент пришел в магазин ");
        logFile(actor.geActor().getName() + " the client came to the store ");
        takeInQueue(actor);
    }
    /**Добавление в очередь посетителя*/
    @Override
    public void takeInQueue(iActorBehavor actor) {
        if (actor instanceof Actor) {
            if (actor instanceof PromotionalClient) {
                if (promo.size() > amountPromo ) {
                    System.out.println("Количество участников акции заполнено!!!!!!!!!!!!!!!!!!!!!!!!!!! Идите домой");
                    logFile("The number of participants in the promotion is full!!!!!! Go home!!");
                    return;
                }
            }   
        }
        this.queue.add(actor);
        System.out.println(actor.geActor().getName() + " клиент добавлен в очередь ");
        logFile(actor.geActor().getName() + " client added to queue ");
    }
    /**Уход посетителя из магазине(удаление его из очереди)*/
    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            logFile(actor.getName() + " the customer left the store ");
            queue.remove(actor);
        }

    }
    /**Запуск событий магазина*/
    @Override
    public void update() {
        initFile();
        takeOrder();
        giveOrder();
        takeReturnOrder();
        releaseFromQueue();
        closeFile();
    }
    /**Получение заказа посетителем*/
    @Override
    public void giveOrder() {
        for (iActorBehavor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент получил свой заказ ");
                logFile(actor.geActor().getName() + " the customer received his order ");
            }
        }
    }
    /**Удаление из очереди посетителя*/
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehavor actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.geActor());
                System.out.println(actor.geActor().getName() + " клиент ушел из очереди ");
                logFile(actor.geActor().getName() + " the client left the queue ");
            }
        }
        releseFromMarket(releaseActors);
    }
    /**Совершение заказа посетителем*/
    @Override
    public void takeOrder() {
        for (iActorBehavor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент сделал заказ ");
                logFile(actor.geActor().getName() + " the client placed an order ");
            }
        }

    }
    /**Получение возможности возврата и вывод на экран*/
    @Override
    public void takeReturnOrder() {
        for (iActorBehavor actor : queue) {
            if (actor.isTakeOrder() && getChanceOfReturn()) {
                System.out.println(actor.geActor().getName() + " клиент получил возврат " + getAmountOrderForRO() + " товаров, по причине: " + this.getCauseForRO() + ", на сумму: " + this.getMoneyForRO());
                logFile(actor.geActor().getName() + " the client received a refund " + getAmountOrderForRO() + " goods, due to: " + this.getCauseForRO() + ", for the amount: " + this.getMoneyForRO());
            }
        }
    }
    /**Причина возврата*/
    @Override
    public String getCauseForRO() {
        // Заглушка
        return "breaking";
    }
    /**Сумма возврата*/
    @Override
    public double getMoneyForRO() {
        // Заглушка
        return 2.99;
    }
    /**Заглушка, возвращает случайную вероятность возврата*/
    @Override
    public boolean getChanceOfReturn() {
        Random random = new Random();
        boolean isReturn = random.nextBoolean();
        return isReturn;
    }
    @Override
    public int getAmountOrderForRO() {
        Random random = new Random();
        int num = random.nextInt(3) + 1;
        return num;
    }
}

