public class CardRunner {
    public static void main(String args[]){
        TerrapinCard cardBilly = new TerrapinCard(20);
        TerrapinCard cardBrian = new TerrapinCard(30);
        cardBilly.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Billy: The card has " + cardBilly + " dollars");
        System.out.println("Brian: The card has " + cardBrian + " dollars");
        cardBilly.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Billy: The card has " + cardBilly + " dollars");
        System.out.println("Brian: The card has " + cardBrian + " dollars");
        cardBilly.payEconomical();
        cardBilly.payEconomical();
        cardBrian.loadMoney(50);
         System.out.println("Billy: The card has " + cardBilly + " dollars");
        System.out.println("Brian: The card has " + cardBrian + " dollars"); 
        

    }
}
