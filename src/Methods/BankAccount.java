package Methods;

public class BankAccount {

    String name;
    String bankName;
    int accountNumber;
    double balance;
    int expirationYear;

    public void displayInfo(){


        System.out.println(name);
        System.out.println(bankName);
        System.out.println(accountNumber);
        System.out.println(balance);
        System.out.println(expirationYear);
    }

    public double deposit(int depositAmount){
        balance=balance+depositAmount;
        return balance;
    }
    public double withdraw(int withdrawAmount){
        balance=balance-withdrawAmount;
        return balance;

    }

    public static void main(String[] args) {

        BankAccount ba=new BankAccount();

        ba.name="Muammer";
        ba.accountNumber=1248938;
        ba.bankName="Chase";
        ba.expirationYear=2022;
        ba.balance=10;

        ba.displayInfo();
        ba.deposit(1000);
        ba.displayInfo();
        ba.withdraw(480);
        ba.displayInfo();
        ba.withdraw(1000);
        ba.displayInfo();

    }
}
