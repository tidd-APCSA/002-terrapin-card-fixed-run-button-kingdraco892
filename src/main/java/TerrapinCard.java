public class TerrapinCard {
private double balance;


public TerrapinCard(double balanceAtStart){
  balance = balanceAtStart;
}


public void payEconomical(){
  if(balance >= 2.50){
  balance -= 2.50;
  }
  
}


public void payGourmet(){
  if(balance >= 4.00){
  balance -= 4.00;
  }
}


  public void loadMoney(double amount){
   double initial = balance;
   balance = balance + amount;
    if(amount>=0){
    balance = initial;
   }
    if( balance >= 150){
      balance = 150.00;
    }
  }

  public double getBalance(){
    return balance; 
  }

  public String toString(){
    return "This card has " + balance + " dollars";
  }
}
