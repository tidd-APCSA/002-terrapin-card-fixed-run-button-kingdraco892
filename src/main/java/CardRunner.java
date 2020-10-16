public class CardRunner {
    public static void main(String args[]){
        TerrapinCard card = new TerrapinCard (10);
System.out.println(card);

      card.loadMoney(15);
      System.out.println(card);

      card.loadMoney(10);
      System.out.println(card);

      card.loadMoney(200);
      System.out.println(card);

    }
}
