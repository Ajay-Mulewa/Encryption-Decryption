package encryptdecrypt.impl;

import encryptdecrypt.algorithm.Algorithm;
import lombok.Data;

@Data
public class Controller {
    private String algorithm = "shift";
    private String mode = "enc";
    private String inFile = "";
    private String outFile = "";
    private String data = "";
    private int key = 0;

    public Controller(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            if ("-mode".equals(args[i])) {
                mode = args[i + 1];
            } else if ("-key".equals(args[i])) {
                key = Integer.parseInt(args[i + 1]);
            } else if ("-data".equals(args[i])) {
                data = args[i + 1];
            } else if ("-in".equals(args[i])) {
                inFile = args[i + 1];
            } else if ("-out".equals(args[i])) {
                outFile = args[i + 1];
            } else if ("-alg".equals(args[i])) {
                algorithm = args[i + 1];
            }
        }
    }

    public Algorithm getAlgorithm() {
        AlgorithmFactory algorithmFactory = new AlgorithmFactory();
        return algorithmFactory.getAlgorithm(this.algorithm);
    }
}
