package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> setOfSquares = new TreeSet<>();

        for (Integer e : sourceList) {
            setOfSquares.add(e * e);
        }

        return setOfSquares.subSet(lowerBound, upperBound + 1);
    }
}
