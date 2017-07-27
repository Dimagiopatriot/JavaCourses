package main.java.task3.model.entity;

import main.java.task3.util.GrammarValues;

/**
 * Created by troll on 27.07.2017.
 */
public class Notation {

    private String phone;
    private String email;
    private CommonName commonName;
    private Address address;

    public Notation(String phone, String email, CommonName commonName, Address address) {
        this.phone = phone;
        this.email = email;
        this.commonName = commonName;
        this.address = address;
    }

    public static Notation createNotation(String phone, String email, String name, String surname,
                                          String middleName, String nickName, String city, String street,
                                          String houseNumber, String apartmentNumber){
        return new Notation(phone, email, new CommonName(name, surname, middleName, nickName),
                new Address(city, street, houseNumber, apartmentNumber));
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CommonName getCommonName() {
        return commonName;
    }

    public void setCommonName(CommonName commonName) {
        this.commonName = commonName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder notation = new StringBuilder();
        notation.append("Common name").append(GrammarValues.COLON).append(GrammarValues.SPACE).append(commonName)
                .append(GrammarValues.SEMICOLON).append(GrammarValues.NEW_ROW)
                .append("Phone").append(GrammarValues.COLON).append(GrammarValues.SPACE).append(phone)
                .append(GrammarValues.SEMICOLON).append(GrammarValues.NEW_ROW)
                .append("Email").append(GrammarValues.COLON).append(GrammarValues.SPACE).append(email)
                .append(GrammarValues.SEMICOLON).append(GrammarValues.NEW_ROW)
                .append("Address").append(GrammarValues.COLON).append(GrammarValues.NEW_ROW).append(address)
                .append(GrammarValues.SEMICOLON).append(GrammarValues.NEW_ROW);
        return notation.toString();
    }
}
