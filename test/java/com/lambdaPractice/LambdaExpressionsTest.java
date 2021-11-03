package com.lambdaPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LambdaExpressionsTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = ValidUserDetails.validateFirstName("Arshjeet");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        boolean result = ValidUserDetails.validateFirstName("Ar");
        Assertions.assertEquals(false, result);
        System.out.println(result);
    }

    @Test
    public void givenFirstName_WhenSpChars_ShouldReturnFalse() {
        boolean result = ValidUserDetails.validateFirstName("Arsh@jeet");
        Assertions.assertEquals(false, result);
        System.out.println(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = ValidUserDetails.validateLastName("Barkade");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        boolean result = ValidUserDetails.validateLastName("Br");
        Assertions.assertEquals(false, result);
        System.out.println(result);
    }

    @Test
    public void givenLastName_WhenSpChars_ShouldReturnFalse() {
        boolean result = ValidUserDetails.validateLastName("Bar@Kade");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        boolean result = ValidUserDetails.validateEmail("arshjeet.barkade@bridgeLabz.co.in");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenEmail_WhenInValid_ShouldReturnTrue() {
        boolean result = ValidUserDetails.validateEmail("arshjeet.barkade@bridgeLabz.in");
        Assertions.assertEquals(false, result);
        System.out.println(result);
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        boolean result = ValidUserDetails.validateMobileNumber("7756096271");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenMobileNumber_WhenInValid_ShouldReturnFalse() {
        boolean result = ValidUserDetails.validateMobileNumber("3255516565");
        Assertions.assertEquals(false, result);
        System.out.println(result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        boolean result = ValidUserDetails.validatePassword("Password@1");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenPassword_WhenInValid_ShouldReturnTrue() {
        boolean result = ValidUserDetails.validatePassword("Password");
        Assertions.assertEquals(false, result);
        System.out.println(result);
    }
}
