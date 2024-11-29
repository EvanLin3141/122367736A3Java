package test;

import org.example.ColourPalette;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ColourPaletteTest {
    private ColourPalette palette;
    private ColourPalette palette1;

    @BeforeEach
    void setUp() {
        palette = new ColourPalette(4);
        palette.add(150,250,100);
        palette1 = new ColourPalette(2);
        palette1.add(15,25,10);
    }
    @Test
    void testIfColourPaletteExist() {
        assertNotNull(palette, "Colour Palette Instantiated Successfully");
        assertNotNull(palette1, "Colour Palette1 Instantiated Successfully");
    }

    @Test
    void testTotalNumberOfColourInPalette() {
        assertEquals(2, palette1.getSize());
        assertEquals(4, palette.getSize());

    }

    @Test
    void isSizePowerOfTwo() {
        assertThrows(IllegalArgumentException.class, () -> new ColourPalette(10),
                "Total number of colours needs to be greater than 1 & to the power of 2.");

        assertDoesNotThrow(() -> new ColourPalette(2), "ColourPalette created.");
    }

    @Test
    void createExceptionWhenNoSizeGiven() {
        assertThrows(IllegalArgumentException.class, ColourPalette::new,
                "Need to give ColourPalette a size");
    }
/**
    @Test
    void testAddColoursToPalette() {
        assertDoesNotThrow(() -> palette.add(150,250,100));
        assertDoesNotThrow(() -> palette1.add(15,25,10));
    }
*/
    @Test
    void testIfColourExist() {
        assertTrue(palette.contains(150,250,100));
        assertFalse(palette.contains(15,25,10));
        assertTrue(palette1.contains(15,25,10));
        assertFalse(palette1.contains(150,250,100));
    }

    @Test
    void testDoNotAddColourAlreadyExist() {
        assertThrows(IllegalArgumentException.class, () -> palette.add(150,250,100),
                "Cannot Add The Same Colour");
        assertThrows(IllegalArgumentException.class, () -> palette1.add(15,25,10),
                "Cannot Add The Same Colour");
    }

    @Test
    void testValidityOfColour() {
        assertThrows(IllegalArgumentException.class, () -> palette.add(300,250,100),
                "Colour needs to be within 0-255 value of RGB");
        assertThrows(IllegalArgumentException.class, () -> palette1.add(800,550,100),
                "Colour needs to be within 0-255 value of RGB");
        assertDoesNotThrow(() -> palette1.add(100,20,130), "Colour added.");

    }

    @Test
    void testCapacityOfPalette() {
        assertDoesNotThrow(() -> palette1.add(200,250,100));
        assertThrows(IllegalStateException.class, () -> palette1.add(100,250,100),
                "Exceeded palette capacity.");
    }

}
