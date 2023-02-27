package com.kodilla.weightedAverage;

import java.util.ArrayList;
import java.util.List;

public class WeightedAverageRunner {

    public static void main(String[] args) {
        WeightedAverage weightedAverage = new WeightedAverage();
        List<Integer> marks = new ArrayList<>();
        marks.add(3);
        marks.add(1);
        marks.add(1);
        marks.add(5);
        marks.add(6);
        marks.add(4);

        List<Integer> weights = new ArrayList<>();
        weights.add(4);
        weights.add(6);
        weights.add(8);
        weights.add(4);
        weights.add(4);
        weights.add(10);
    try {
        double result = weightedAverage.calculateWeightedAverage(marks, weights);
        System.out.println(result);
    } catch (ZeroLengthListException e){
        System.out.println("The length of at least one of the lists is zero!");
    } catch (IncompatibleListsSizeException e){
        System.out.println("The lengths of lists are different!");
    } catch (MarkOutOfRangeException e){
        System.out.println("Incorrect list of marks. One or more marks are out of range 1-6!");
    } catch (WeightOutOfRangeException e) {
        System.out.println("Incorrect list of weights. One or more weights are out of range 1-10!");
    }


    }
}
