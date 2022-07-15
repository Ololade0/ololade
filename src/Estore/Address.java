package Estore;

public class Address {

    private String cityName;
    private String countryName;
    private int houseNumber;
    private String state;
    private String streetName;

    public Address(String cityName, String countryName, int houseNumber, String streetName, String state) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.state = state;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getState() {
        return state;
    }

    public String getStreetName() {
        return streetName;
    }
}
