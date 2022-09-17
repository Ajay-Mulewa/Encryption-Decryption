package encryptdecrypt.impl;

import encryptdecrypt.algorithm.Algorithm;
import encryptdecrypt.algorithm.ShiftAlgo;
import encryptdecrypt.algorithm.UnicodeAlgo;

public class AlgorithmFactory {

    public Algorithm getAlgorithm(String requestedAlgo) {
        return switch (requestedAlgo) {
            case "unicode" -> new UnicodeAlgo();
            default -> new ShiftAlgo();
        };
    }
}
