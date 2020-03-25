package dev.chaudhry.credit;


public class CreditMain {

    public static void main(String[] args) {

        Items item1 = new Items("Xbox", 399);
        Items item2 = new Items("Playstation", 499);
        Items item3 = new Items("Switch", 299);
        Items item4 = new Items("iPhone", 999);

        AMEX amexCard = new AMEX();
        amexCard.setOwner("Adam");
        VISA visaCard = new VISA();
        visaCard.setOwner("John");

        amexCard.purchase(item1);
        amexCard.purchase(item2);
        amexCard.purchase(item3);
        amexCard.purchase(item4);


        visaCard.purchase(item1);
        visaCard.purchase(item2);
        visaCard.purchase(item3);
        visaCard.purchase(item4);


        amexCard.printStatement();
        visaCard.printStatement();

    }



}
