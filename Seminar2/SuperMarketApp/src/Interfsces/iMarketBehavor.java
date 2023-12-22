package Interfsces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehavor {
    /**Появление посетителя в магазине(добавленеие его в очередь)*/
    public void acceptToMarket(iActorBehavor actor);
    /**Уход посетителя из магазине(удаление его из очереди)*/
    public void releseFromMarket(List<Actor> actors);
    /**Запуск событий магазина*/
    public void update();
} 
