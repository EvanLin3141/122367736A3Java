package org.example;

public class ColourPalette {
    private int totalColour;

    public ColourPalette() {
        //pass
    }

    public ColourPalette(int size) {
        if (size <= 1 || (size & (size - 1)) != 0) {
            throw new IllegalArgumentException("Total number of colours needs to be " +
                    "greater than 1 & to the power of 2.");
        } else {
            this.totalColour = size;
        }
    }

    public int getSize() {
        return this.totalColour;
    }


}
