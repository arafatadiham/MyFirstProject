package day46_Wednesday;

public class SavingAccount extends BankAccount{

//    String accountHolder;
//    long accountNum;
//    double balance;
    double interestRate;



public SavingAccount(String accountHolder,long accountNum,double balance,double interestRate){

    super (accountHolder,accountNum,balance);

    this.interestRate = interestRate;

}


// Bad idea to have main here, just doing it for now :
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Alden", 12345678, 5000000,0.036);
        System.out.println("s1 = " + s1.toString());

        s1.withdraw(10000);
        System.out.println("s1  = " + s1);

        s1.deposit(2000);
        System.out.println("s1 = " + s1);
    }

    @Override
    public void deposit (int amount ){
       //balance += amount + amount  * interestRate;

       //Option 2, by using super. :
        // calculating the interest rate and casting to int variable
        // because deposit method accept int data type not double !!!!
       int actualAmount = (int) (amount + amount * interestRate);
        super.deposit(actualAmount);

    }


    // in our SavingAccount , if we withdraw amount you withdraw
    // you get 30 dollar penalty
    // so we will override the withdraw method to reflect this requirement
    @Override
    public void withdraw (int amount ){
      //  balance -= (amount +30);

        // OPTION2:
        super.withdraw(amount);
        super.withdraw(30);
       // OR : super.withdraw(amount+30);


    }


    // its optional , once being used , it will enforce overriding rule
    // if any rule does not match it will not even compile
    // so it's always good to use it to prevent accidental errors

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
