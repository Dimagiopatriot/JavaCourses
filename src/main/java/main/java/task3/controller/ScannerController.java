package main.java.task3.controller;

import main.java.task3.view.View;
import main.java.task3.model.entity.Notation;
import static main.java.task3.controller.util.RegExpressions.*;

import java.util.Scanner;

/**
 * Created by troll on 27.07.2017.
 */
public class ScannerController {
    private Scanner scanner;
    private View view;

    private String name;
    private String surname;
    private String middleName;
    private String nickName;

    private String email;
    private String phone;

    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;

    private Notation notation;

    public ScannerController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public Notation createNotation() {
        if (notation == null) {

            view.printInputNameMessages();
            name = inputData(NAME_REG_EX);

            view.printInputSurnameMessages();
            surname = inputData(SURNAME_REG_EX);

            view.printInputMiddleNameMessages();
            middleName = inputData(MIDDLE_NAME_REG_EX);

            view.printInputNickNameMessages();
            nickName = inputData(NICKNAME_REG_EX);

            view.printInputEmailMessages();
            email = inputData(EMAIL_REG_EX);

            view.printInputPhoneMessages();
            phone = inputData(MOBILE_PHONE_REG_EX);

            view.printInputCityMessages();
            city = inputData(CITY_REG_EX);

            view.printInputStreetMessages();
            street = inputData(STREET_REG_EX);

            view.printInputHouseNumberMessages();
            houseNumber = inputData(NUMBER_HOME_REG_EX);

            view.printInputApartmentNumberMessages();
            apartmentNumber = inputData(APARTMENT_NUMBER_REG_EX);

            notation = Notation.createNotation(phone, email, name, surname, middleName, nickName, city, street,
                    houseNumber, apartmentNumber);
        }

        return notation;
    }

    private String inputData(String regex) {
        String res = "";
        while(!(scanner.hasNextLine() && checkInputString(res=scanner.nextLine(), regex))){
            view.printWrongInputMessages();
        }
        return res;
    }

    public void inputNewNickName(){
        view.printWrogInputNickName();
        view.printInputNickNameMessages();
        nickName = inputData(NICKNAME_REG_EX);
        notation.getCommonName().setNickName(nickName);

    }

    public boolean checkInputString(String str, String regex){
        return str.matches(regex);
    }
}
