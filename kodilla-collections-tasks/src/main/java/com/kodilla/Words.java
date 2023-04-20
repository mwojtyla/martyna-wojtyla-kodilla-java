package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class Words {
    public static void main (String[] args) {

        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");


        String words = "";
        for (int i=0; i<companies.size(); i++){
            words = words + companies.get(i) + ", ";
        }

        System.out.print(words.substring(0,(words.length()-2)));

    }
}
