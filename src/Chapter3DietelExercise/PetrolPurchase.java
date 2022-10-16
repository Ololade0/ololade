package Chapter3DietelExercise;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantityPurchaseInLitre;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType,
                          int quantityPurchaseInLitre,
                          double pricePerLitre,
                          double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantityPurchaseInLitre = quantityPurchaseInLitre;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantityPurchaseInLitre() {
        return quantityPurchaseInLitre;
    }

    public void setQuantityPurchaseInLitre(int quantityPurchaseInLitre) {
        this.quantityPurchaseInLitre = quantityPurchaseInLitre;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }





    public double getPurchaseAmount(int quantityPurchaseInLitre, double pricePerLitre, double percentageDiscount){
       double netPurchaseAmount =  quantityPurchaseInLitre * pricePerLitre - percentageDiscount;
            return netPurchaseAmount;

    }


}
