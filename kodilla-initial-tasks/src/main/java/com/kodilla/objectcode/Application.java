package com.kodilla.objectcode;

public class Application {
    public static void main (String[] args) throws java.lang.Exception
    {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        UserValidator validator = new UserValidator();
        boolean nameDifferentThanNull = validator.validateName(name);

        if (nameDifferentThanNull) {
            validator.validateAgeAndHeight(age,height);
        }
    }
}
