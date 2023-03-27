package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinaryConverter {

    public String converter(int number) {
        List<Integer> list = new ArrayList<>();
        String binaryNumbers = "";
        while ((number / 2) > 0) {
            int rest = number % 2;
            list.add(rest);
            number = number / 2;
        }
        for (int i = list.size() - 1; i >= 0; i--) {

            binaryNumbers = binaryNumbers + list.get(i);
        }
        return "1" + binaryNumbers;
    }
}
