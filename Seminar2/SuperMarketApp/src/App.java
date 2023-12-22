import Classes.Actor;
import Classes.Market;
import Classes.OrdynaryClient;
import Classes.PromotionalClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfsces.iActorBehavor;

public class App {
    public static void main(String[] args) throws Exception{
        Market magnit = new Market();

        iActorBehavor client1 = new OrdynaryClient("boris");
        iActorBehavor client2 = new OrdynaryClient("masha");
        iActorBehavor client3 = new SpecialClient("prezident", 1);
        iActorBehavor client4 = new TaxInspector();
        iActorBehavor client5 = new PromotionalClient("vasya", "2 for the price of 1");
        iActorBehavor client6 = new PromotionalClient("petya", "30% discounts");
        iActorBehavor client7 = new PromotionalClient("petruha", "20% discounts");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);

        magnit.update();
        System.out.println(PromotionalClient.getAmountPromMembers());
    }
}