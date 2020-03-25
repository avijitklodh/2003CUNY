package dev.chaudhry.credit;

import java.util.ArrayList;

public abstract class CreditCard {

    String cardCompany = this.getClass().getSimpleName();
    String owner;
    int rewardPoints;

    ArrayList<Items> purchases = new ArrayList<Items>();

    public abstract void purchase (Items item);



// NON-ABSTRACT METHODS
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public void printStatement(){
        System.out.println("");
        System.out.println(this.cardCompany);
        System.out.println("==============================");
        System.out.println("Cardholder Name: " + owner);
        System.out.println("Available Rewards Points: " + rewardPoints);
        System.out.println("==============================");



        final Object[][]table = new String[this.purchases.size()][];
        for (int i = 0; i < this.purchases.size(); i++){
           table[i] = new String[] {this.purchases.get(i).itemName,
                   "$" + Integer.toString(this.purchases.get(i).price)};
        }

        for (final Object[] row : table) {
            System.out.format("%-15s%-15s\n", row);
        }
        System.out.println("==============================");

    }

}
