package test;

import org.example.ColourPalette;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ColourPaletteTest {
    @Test
    void testIfColourPaletteExist() {
        ColourPalette palette = new ColourPalette();
        assertNotNull(palette, "Colour Palette Instantiated Successfully");
    }

    @Test
    void testTotalNumberOfColourInPalette() {
        ColourPalette palette = new ColourPalette(5);
        assertEquals(5, palette.getSize());
    }
}
