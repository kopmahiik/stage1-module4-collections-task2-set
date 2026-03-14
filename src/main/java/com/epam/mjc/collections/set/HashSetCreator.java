package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();

        for (Integer e : sourceList) {
            if (e % 2 == 0) {
                result.add(e);
                do {
                    e /= 2;
                    result.add(e);
                } while (e % 2 == 0);
            } else {
                result.add(e);
                result.add(e * 2);
            }
        }

        return result;
    }
}
