package com.train;

public class Ticket {
    int price = 1000;
    int amount;
    int roundtrip;


    public Ticket(int amount ,int roundtrip){
        this.amount=amount;
        this.roundtrip=roundtrip;
    }

    public double getPrice(){
        return price*(amount-roundtrip)+(price*2*roundtrip)*0.9;
    }

    public void println(){
        System.out.println("Total tickets:\t" + amount + "\tRound-trip:\t" + roundtrip +  "\tTotal:\t" + getPrice()) ;
    }

}
