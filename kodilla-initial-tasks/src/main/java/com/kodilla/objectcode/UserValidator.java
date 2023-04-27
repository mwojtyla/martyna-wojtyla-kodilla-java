package com.kodilla.objectcode;

public class UserValidator {
    public boolean validateName(String name) {
        if (name!=null) {
            return true;
        } else {
            return false;
        }
    }

    public void validateAgeAndHeight(double age, double height) {
        if (age > 30 && height > 160) {
            System.out.println("User is older than 30 and higher then 160cm");
        } else {
            System.out.println("User is younger than 30 or lower than 160cm");
        }

    }
}
