package model.services;

public class UsaTaxService implements TaxService{
    public double tax (double amount){
        if(amount <= 100.0){
            return amount * 0.4;
        } else{
            return amount * 0.3;
        }

    }
}
