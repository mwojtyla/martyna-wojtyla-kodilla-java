package com.kodilla.good.patterns.challenges;

import java.util.Map;
import java.util.stream.Collectors;

public class ChallengesApplication {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String movies = movieStore.getMovies().entrySet().stream()
                        .map(Map.Entry::getValue)
                        .map(List->List.get(0)+"!"+List.get(1))
                        .collect(Collectors.joining("!","",""));

        System.out.print(movies);
    }

}

