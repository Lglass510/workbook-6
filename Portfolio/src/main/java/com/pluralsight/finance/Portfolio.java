package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Valuable> assets = new ArrayList<>();

    public void addAsset(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double total = 0;
        for (Valuable asset : assets) {
            total += asset.getValue();
        }
        return total;
    }

    public Valuable getMostValuable() {
        if (assets.isEmpty()) return null;

        Valuable max = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() > max.getValue()) {
                max = asset;
            }
        }
        return max;
    }

    public Valuable getLeastValuable() {
        if (assets.isEmpty()) return null;

        Valuable min = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() < min.getValue()) {
                min = asset;
            }
        }
        return min;
    }
}
