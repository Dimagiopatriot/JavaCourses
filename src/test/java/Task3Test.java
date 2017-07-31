import org.junit.Test;

import static main.java.task3.controller.util.RegExpressions.*;
import static org.junit.Assert.*;

/**
 * Created by troll on 31.07.2017.
 */
public class Task3Test {
    @Test
    public void firstNameTestWithRightValue(){
        String name = "Dmitriy";
        boolean expected = true;
        boolean actual = name.matches(NAME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void firstNameTestWithSmallFirstLetter(){
        String name = "dmitriy";
        boolean expected = false;
        boolean actual = name.matches(NAME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void firstNameTestWithLargeLetterInMiddle(){
        String name = "SeRgei";
        boolean expected = false;
        boolean actual = name.matches(NAME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void lastNameTestWithRightValue(){
        String name = "Smishniy";
        boolean expected = true;
        boolean actual = name.matches(SURNAME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void lastNameTestWithSmallFirstLetter(){
        String name = "smishniy";
        boolean expected = false;
        boolean actual = name.matches(SURNAME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void lastNameTestWithLargeLetterInMiddle(){
        String name = "SmishNIY";
        boolean expected = false;
        boolean actual = name.matches(SURNAME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void cityTestWithRightValue(){
        String city = "Kiyv";
        boolean expected = true;
        boolean actual = city.matches(CITY_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void cityTestWithSmallFirstLetter(){
        String city = "kiyv";
        boolean expected = false;
        boolean actual = city.matches(CITY_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void cityTestWithLargeLetterInMiddle(){
        String city = "KiYv";
        boolean expected = false;
        boolean actual = city.matches(CITY_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void streetTestWithRightValue(){
        String street = "Yangelya";
        boolean expected = true;
        boolean actual = street.matches(STREET_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void streetTestWithSmallFirstLetter(){
        String street = "yangelya";
        boolean expected = false;
        boolean actual = street.matches(STREET_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void streetTestWithLargeLetterInMiddle(){
        String street = "YanGElya";
        boolean expected = false;
        boolean actual = street.matches(STREET_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void emailTestRightValue(){
        String email = "troll3758@gmail.com";
        boolean expected = true;
        boolean actual = email.matches(EMAIL_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void emailTestWithoutPrefix(){
        String email = "@gmail.com";
        boolean expected = false;
        boolean actual = email.matches(EMAIL_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void emailTestWithoutDot(){
        String email = "tr@com";
        boolean expected = false;
        boolean actual = email.matches(EMAIL_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void emailTestWithoutSuffixAfterDot(){
        String email = "trol@com.";
        boolean expected = false;
        boolean actual = email.matches(EMAIL_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void apartmentNumberTestRightValue(){
        String num = "535";
        boolean expected = true;
        boolean actual = num.matches(APARTMENT_NUMBER_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void apartmentNumberTestWithNegativeNumber(){
        String num = "-535";
        boolean expected = false;
        boolean actual = num.matches(APARTMENT_NUMBER_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void apartmentNumberTestWithRealNumber(){
        String num = "5.35";
        boolean expected = false;
        boolean actual = num.matches(APARTMENT_NUMBER_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void apartmentNumberTestWithString(){
        String num = "Test";
        boolean expected = false;
        boolean actual = num.matches(APARTMENT_NUMBER_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void houseNumberTestRightValue(){
        String num = "20";
        boolean expected = true;
        boolean actual = num.matches(NUMBER_HOME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void houseNumberTestWithNegativeNumber(){
        String num = "-20";
        boolean expected = false;
        boolean actual = num.matches(NUMBER_HOME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void houseNumberTestWithRealNumber(){
        String num = "20.0";
        boolean expected = false;
        boolean actual = num.matches(NUMBER_HOME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void houseNumberTestWithString(){
        String num = "Test";
        boolean expected = false;
        boolean actual = num.matches(NUMBER_HOME_REG_EX);
        assertEquals(expected, actual);
    }

    @Test
    public void phoneTestRightValue(){
        String phone = "0982986452";
        boolean expected = true;
        boolean actual = phone.matches(MOBILE_PHONE_REG_EX);
        assertEquals(expected, actual);
    }
}
