package Chapter8Exercise;

public enum Food {;
    private String Apple;
    private String Banana;
    private String Carrot;


    Food(String apple, String banana, String carrot) {
        Apple = apple;
        Banana = banana;
        Carrot = carrot;
    }

    public void setApple(String vegetable, int numberOfCalories){
        this.Apple = Apple;
    }

    public void setBanana(String vegetable, int numberOfCalories){
        this.Banana = Banana;
    }

    public void setCarrot(String vegetable, int numberOfCalories){
        this.Carrot = Carrot;
    }

    public String getApple() {
        return Apple;
    }

    public String getBanana() {
        return Banana;
    }

    public String getCarrot() {
        return Carrot;
    }

public String toString(){
        return String.format("""
                FirstFruit: %s
                Second fruit: %s
                third Fruit : %s
                
                """, getApple(),getCarrot(), getBanana());
}

}
