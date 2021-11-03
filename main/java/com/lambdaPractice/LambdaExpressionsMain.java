package com.lambdaPractice;


import java.util.function.Predicate;

interface ValidUserDetails {
    static boolean validateFirstName(String fname) {
        boolean isValid = isValid(fname, (String info) -> {
            String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
            return info.matches(regex);
        });
        return isValid;
    }

    static boolean validateLastName(String lname) {
        boolean isValid = isValid(lname, (String info) -> {
            String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
            return info.matches(regex);
        });
        return isValid;
    }

    static boolean validateEmail(String email) {
        boolean isValid = isValid(email, (String info) -> {
            String regex = "^[0-9a-zA-Z]{2,}[.+][0-9a-zA-Z]{2,}+@(bridgeLabz.co.)[a-z]{2,3}$";
            return info.matches(regex);
        });
        return isValid;
    }

    static boolean validateMobileNumber(String num) {
        boolean isValid = isValid(num, (String info) -> {
            String regex = "(0/91)?[7-9][0-9]{9}";
            return info.matches(regex);
        });
        return isValid;
    }

    static boolean validatePassword(String pass) {
        boolean isValid = isValid(pass, (String info) -> {
            String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
            return info.matches(regex);
        });
        return isValid;
    }


    static boolean isValid(String data, Predicate<String> predicate) {
        return predicate.test(data);
    }
}
