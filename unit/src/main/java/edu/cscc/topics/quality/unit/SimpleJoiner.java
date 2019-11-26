package edu.cscc.topics.quality.unit;

public class SimpleJoiner implements Joiner {

    public String join(String separator, String base, String... parts) {
        String accumulation = base;
        if (parts != null) {
            for (int i = 0; i < parts.length; i++) {
                if (parts[i] != null) {
                    accumulation = accumulation + separator + parts[i];
                }
            }
        } else {
            accumulation = base;
        }
        return accumulation;
    }
}