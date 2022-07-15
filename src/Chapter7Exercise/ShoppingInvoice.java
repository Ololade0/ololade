package Chapter7Exercise;

public class ShoppingInvoice {
    private  String[] item;
    private int[] quantity;
    private int[] price;

    public ShoppingInvoice() {
        item = new String[10];
        quantity = new int[10];
        price = new int[10];
    }

    public void addItem(String item, int index){
        this.item[index] = item;

    }

    public void addQuantity(int quantity, int index){

        this.quantity[index] = quantity;
    }

    public void addPrice(int price,int index){

        this.price[index] = price;
    }

    public String getItem(int index){

        return item[index];
    }

    public int getQuantity(int index){

        return quantity[index];
    }

    public double getPrice(int index){
        return price[index];
    }


    public double total(int index){

        double total =  quantity[index] * price[index];

        return total;
    }

    public int getAmountPaid(int amount){

        return amount;
    }




    }





