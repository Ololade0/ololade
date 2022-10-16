package Chapter3DietelExercise;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Yaba",
                "disel", 7, 50.0, 5.0);
        System.out.println(petrolPurchase.getPurchaseAmount(7, 50.0, 5.0));

    }

}
