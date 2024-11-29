package org.example;

public class ColourPalette {
    private final int size;

    public ColourPalette() {
        throw new IllegalArgumentException("Need to give ColourPalette a size.");
    }

    public ColourPalette(int size) {
        if (size <= 1 || (size & (size - 1)) != 0) {
            throw new IllegalArgumentException("Total number of colours needs to be " +
                    "greater than 1 & to the power of 2.");
        } else {
            this.size = size;
        }
    }

    public int getSize() {
        return this.size;
    }


}
