package test;

import org.example.ColourPalette;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ColourPaletteTest {
    @Test
    void testIfColourPaletteExist() {
        ColourPalette palette = new ColourPalette();
        assertNotNull(palette);
    }
}
