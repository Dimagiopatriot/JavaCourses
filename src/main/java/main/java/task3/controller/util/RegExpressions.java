package main.java.task3.controller.util;

/**
 * Created by troll on 27.07.2017.
 */
public interface RegExpressions {

    String NAME_REG_EX = "[A-Z]{1}[a-z]{1,20}";
    String SURNAME_REG_EX = "[A-Z]{1}[a-z]{1,20}";
    String MIDDLE_NAME_REG_EX = "[A-Z]{1}[a-z]{1,20}";
    String NICKNAME_REG_EX = "[A-Za-z0-9]{1,20}";

    String MOBILE_PHONE_REG_EX = "\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})";

    String EMAIL_REG_EX = "\\w+@[A-Za-z0-9]+\\.[A-Za-z]{2,64}";

    String CITY_REG_EX = "[A-Z]{1}[a-z]+";
    String STREET_REG_EX = "[A-Z]{1}[a-z]+";
    String NUMBER_HOME_REG_EX = "\\d+";
    String APARTMENT_NUMBER_REG_EX = "\\d+";
}
