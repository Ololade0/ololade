package Estore;

import DataStructureAndAlgorith.ArrayList;

public class CreditCardInformation {

    private int Cvv;
    private String month;
    private int year;
    private int cardNumber;
    private String cardName;

    private ArrayList myCard = new ArrayList();

    public CreditCardInformation(int cvv, String month, int year, int cardNumber, String cardName) {
       this.Cvv = cvv;
        this.month = month;
        this.year = year;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.myCard = new ArrayList();
    }

    public int getCvv() {
        return Cvv;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public ArrayList getCardType() {

        return myCard;
    }
}
