package Estore;

public class BillingInformation {
    private String name;
    private String phoneNumber;
    private String deliveryAddress;

    private CreditCardInformation [] myCard ;
  //  private ArrayList<CreditCardInformation> myCard = new ArrayList();

    public BillingInformation(String name, String phoneNumber, String deliveryAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.deliveryAddress = deliveryAddress;
    }

    public BillingInformation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
