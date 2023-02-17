package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequences {
    List<Integer> seqList = new ArrayList<>();

    public int sequences(int n){
        seqList.add(0);
        seqList.add(1);
        for (int i=2; i<=n; i++){
            seqList.add(seqList.get(i-1) + seqList.get(i-2));
        }
        return seqList.get(n);
    }
}
