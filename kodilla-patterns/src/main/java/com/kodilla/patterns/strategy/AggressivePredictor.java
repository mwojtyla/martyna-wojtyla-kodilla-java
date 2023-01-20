package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.BuyPredictor;

public non-sealed class AggressivePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}
