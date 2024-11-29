package org.example;

import java.util.ArrayList;

public class ColourPalette {
    private final int size;
    private final ArrayList<int[]> palette = new ArrayList<>();


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

    public void add(int red, int green, int blue) {
        this.palette.add(new int[]{red, green, blue});
    }


}
