class Account{
    int interestRate=5;
    int amount=0;
    Account(int initialAmount){
        amount=initialAmount;
    }
    void interest(){
        amount=amount+(amount*interestRate)/100;
        System.out.println("Interest Rate: "+interestRate);
    }
    void withdraw(int w){
        if(amount-w<0) System.out.println("Cannot withdraw");
        else amount=amount-w;
        System.out.println("Current Amount: "+amount);
    }
    void deposit(int w){
        amount=amount+w;
        System.out.println("Current Amount: "+amount);
    }
    void currentAmount(){
        System.out.println("Current Amount: "+amount);
    }
}

public class AccountClass {
    public static void main(String[] args) {
        Account a1=new Account(1000);
        Account a2=new Account(2000);

        a1.deposit(1000);
        a1.currentAmount();
    }
}
