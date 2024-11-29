package test;

import org.example.ColourPalette;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ColourPaletteTest {
    private ColourPalette palette;
    private ColourPalette palette1;

    @BeforeEach
    void setUp() {
        palette = new ColourPalette(4);
        palette1 = new ColourPalette(10);
    }
    @Test
    void testIfColourPaletteExist() {
        assertNotNull(palette, "Colour Palette Instantiated Successfully");
    }

    @Test
    void testTotalNumberOfColourInPalette() {
        assertEquals(10, palette1.getSize());
    }
}
