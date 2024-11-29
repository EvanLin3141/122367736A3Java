package test;

import org.example.ColourPalette;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ColourPaletteTest {
    private ColourPalette palette;
    private ColourPalette palette1;

    @BeforeEach
    void setUp() {
        palette = new ColourPalette(4);
        palette1 = new ColourPalette(2);
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

    @Test
    void testAddColoursToPalette() {
        assertDoesNotThrow(() -> palette.add(150,250,100));
        assertDoesNotThrow(() -> palette1.add(15,25,10));
    }

}
