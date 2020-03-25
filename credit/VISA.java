package dev.chaudhry.credit;

public class VISA extends CreditCard {


    @Override
    public void purchase(Items item) {

        double rewardsMultiplier = 0.1;
        int cost = item.price;
        int earnedPoints = (int)Math.round(cost*rewardsMultiplier);

        this.rewardPoints += earnedPoints;
        purchases.add(item);



    }

}
