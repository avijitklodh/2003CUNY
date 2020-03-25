package dev.chaudhry.credit;

public class AMEX extends CreditCard {


    @Override
    public void purchase(Items item) {
        double rewardsMultiplier = 0.05;
        int cost = item.price;
        int earnedPoints = (int)Math.round(cost*rewardsMultiplier);

        this.rewardPoints += earnedPoints;

       //int totalPoints = Math.round(cost * pointsVal)/100;
       purchases.add(item);

    }


}
