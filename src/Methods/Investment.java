package Methods;

public class Investment {

    double years;   //2
    double amount;  //5
    double rate;    //5

    public double rateAmount(){
        return amount*rate*years/100; // 100*5*2 /100 -> 1000/100 --> 100
    }
    public double totalAmount(){
        return rateAmount()+amount; // 100 + 100 --> 200
    }
}
