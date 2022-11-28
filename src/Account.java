public class Account {
    //Main classdan bunu değiştirmek istemiyoruz (private)
    private float balance;

    public void deposit(float amount){
        if(amount > 0)
            balance += amount;
    }
    public void withdraw(float amount){
        if(amount > 0)
            balance -= amount;
    }

    //bu yüzden bir setter metodu oluşturduk
//    public void setBalance(float balance){
//        if(balance > 0)
//            this.balance = balance;
//    }

    //ve getter oluşturmak için
    public float getBalance(){
        return balance;
    }

}
