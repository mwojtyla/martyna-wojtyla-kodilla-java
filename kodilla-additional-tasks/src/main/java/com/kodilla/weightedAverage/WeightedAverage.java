package com.kodilla.weightedAverage;

import java.util.List;

public class WeightedAverage {

    public double calculateWeightedAverage(List<Integer> marks, List<Integer> weights ) throws MarkOutOfRangeException, WeightOutOfRangeException, IncompatibleListsSizeException, ZeroLengthListException{
        double multiplication = 0;

        if (marks.size() == 0 || weights.size() ==0){
            throw new ZeroLengthListException();
        }

        if (marks.size() != weights.size()){
            throw new IncompatibleListsSizeException();
        }

        for (int i=0; i < marks.size(); i++) {
            if (marks.get(i) <1 || marks.get(i) > 6 ){
                throw new MarkOutOfRangeException();
                } else if (weights.get(i) <1 || weights.get(i) > 10 ){
                throw new WeightOutOfRangeException();
                } else {
                multiplication = multiplication + marks.get(i) * weights.get(i);
            }
        }
        int sumOfWeights = 0;
        for (int i=0; i<weights.size(); i++){
            sumOfWeights = sumOfWeights + weights.get(i);
        }

        return multiplication/sumOfWeights;
    }
}
