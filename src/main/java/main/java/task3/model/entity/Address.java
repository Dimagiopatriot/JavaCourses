package main.java.task3.model.entity;

import main.java.task3.util.GrammarValues;

/**
 * Created by troll on 27.07.2017.
 */
public class Address {

    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;

    public Address(String city, String street, String houseNumber, String apartmentNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        StringBuilder address = new StringBuilder();
        address.append("City").append(GrammarValues.COLON).append(GrammarValues.SPACE).append(city)
                .append(GrammarValues.NEW_ROW)
                .append("Street").append(GrammarValues.COLON).append(GrammarValues.SPACE).append(street)
                .append(GrammarValues.NEW_ROW)
                .append("House #").append(GrammarValues.COLON).append(GrammarValues.SPACE).append(houseNumber)
                .append(GrammarValues.NEW_ROW)
                .append("Apartment #").append(GrammarValues.COLON).append(GrammarValues.SPACE).append(apartmentNumber);
        return address.toString();
    }
}
