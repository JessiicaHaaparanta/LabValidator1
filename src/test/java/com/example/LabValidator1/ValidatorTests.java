package com.example.LabValidator1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ValidatorTests {

    Validator validator = new Validator();

    @Test
    void isNotValidPhoneNumber() {

        boolean expected = false;
        boolean actual = Validator.isPhoneNumberValid("842323232");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void thePhoneNumberIsTrue() {

        boolean expected = true;
        boolean actual = Validator.isPhoneNumberValid("0707096531");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void isNotValidNumb() {

        boolean expected = false;
        boolean actual = Validator.isPhoneNumberValid("34879790");
    }

    @Test
    void thePhoneNumberIsToLong () {

        boolean expected = false;
        boolean actual = Validator.isPhoneNumberValid("07098471621");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void thePhoneNumberIsToShort () {

        boolean expected = false;
        boolean actual = Validator.isPhoneNumberValid("07098");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void thePhoneNumbersLenghtIsCorrect() {

        boolean expected = true;
        boolean actual = Validator.isPhoneNumberValid("0701234567");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void phoneNumberMatches () {

        boolean expected = true;
        boolean actual = Validator.isPhoneNumberValid("07098712");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void phoneNumberIsNotAMatch() {

        boolean expected = false;
        boolean actual = Validator.isPhoneNumberValid("0987?!");

        Assertions.assertEquals(expected,actual);
    }

}
