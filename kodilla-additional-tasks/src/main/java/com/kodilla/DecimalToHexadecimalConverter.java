package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class DecimalToHexadecimalConverter {
    public String converter(int number) {
        List<String> list = new ArrayList<>();
        String hexadecimalNumbers = "";
        boolean value = true;

        while (value) {
            int rest = number % 16;
            if (number > 0) {
                if (rest == 0) {
                    list.add(Integer.toString(rest));
                    number = number / 16;}
                if (rest == 1) {
                    list.add(Integer.toString(rest));
                    number = number / 16;}
                if (rest == 2) {
                    list.add(Integer.toString(rest));
                    number = number / 16;}
                if (rest == 3) {
                    list.add(Integer.toString(rest));
                    number = number / 16;}
                if (rest == 4) {
                    list.add(Integer.toString(rest));
                    number = number / 16;}
                if (rest == 5) {
                    list.add(Integer.toString(rest));
                    number = number / 16;}
                if (rest == 6) {
                    list.add(Integer.toString(rest));
                    number = number / 16;}
                if (rest == 7) {
                    list.add(Integer.toString(rest));
                    number = number / 16;}
                if (rest == 8) {
                    list.add(Integer.toString(rest));
                    number = number / 16;}
                if (rest == 9) {
                    list.add(Integer.toString(rest));
                    number = number / 16;}
                if (rest == 10) {
                    list.add("A");
                    number = number / 16;}
                if (rest == 11) {
                    list.add("B");
                    number = number / 16;}
                if (rest == 12) {
                    list.add("C");
                    number = number / 16;}
                if (rest == 13) {
                    list.add("D");
                    number = number / 16;}
                if (rest == 14) {
                    list.add("E");
                    number = number / 16;}
                if (rest == 15) {
                    list.add("F");
                    number = number / 16;
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

