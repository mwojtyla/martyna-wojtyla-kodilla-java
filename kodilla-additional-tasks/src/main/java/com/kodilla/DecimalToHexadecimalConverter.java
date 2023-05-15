package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class DecimalToHexadecimalConverter {
    public String converter(int number) {
        List<String> list = new ArrayList<>();
        String hexadecimalNumbers = "";
        boolean value = true;
        String hexadecimalValues = "0123456789ABCDEF";

        while (value) {
            int rest = number % 16;
            if (number > 0) {
                for (int i = 0; i < 16; i++) {
                    if (rest == i) {
                        list.add(String.valueOf(hexadecimalValues.charAt(i)));
                        number = number / 16;
                    }
                }
            } else if (number == 0) {
                value = false;
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            hexadecimalNumbers = hexadecimalNumbers + list.get(i);
        }
        return hexadecimalNumbers;
    }
}

