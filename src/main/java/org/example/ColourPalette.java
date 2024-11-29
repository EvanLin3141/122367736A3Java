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
        if (this.contains(red, green, blue)) {
            throw new IllegalArgumentException("Cannot Add The Same Colour");
        } else if (!isValidColour(red, green, blue)) {
            throw new IllegalArgumentException("Colour needs to be within 0-255 value of RGB");
        } else {
            this.palette.add(new int[]{red, green, blue});
        }
    }

    public boolean contains (int red, int green, int blue) {
        for (int[] color : palette) {
            if (color[0] == red && color[1] == green && color[2] == blue) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidColour(int red, int green, int blue) {
        return red >= 0 && red <= 255 && green >= 0 && green <= 255 && blue >= 0 && blue <= 255;
    }

}
