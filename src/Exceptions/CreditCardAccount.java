package Exceptions;

public class CreditCardAccount extends MyBankAccount {

    @Override
    public void transaction(int amount) throws Exception {
        System.out.println("You are crossing credit card limit");
        throw new Exception("You are crossing credit card limit");
    }
    @Override
    public void deposit(int amount) throws NullPointerException {
        System.out.println("Paying off my debt");
        throw new RuntimeException("Paying off my debt");
    }
    @Override
    public void withDraw(int amount) throws RuntimeException{
        System.out.println("I am withdrawing money");
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
