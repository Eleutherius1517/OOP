package Interfsces;

import Classes.Actor;

public interface iQueueBehavor {
    /**Добавление в очередь посетителя*/
    public void takeInQueue(iActorBehavor actor);
    /**Удаление из очереди посетителя*/
    public void releaseFromQueue();
    /**Получение заказа посетителем*/
    public void takeOrder ();
    /**Совершение заказа посетителем*/
    public void giveOrder ();
   // public void geActor ();
}
