/*
 * MIT License
 *
 * COPYRIGHT (c) 2023 Jorge Garcia - George The Penguin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package dev.georgethepenguin.unicode.emoji.list;

import static dev.georgethepenguin.unicode.emoji.list.utils.UnicodeUtils.toPrint;

/**
 * Unicode Emoji Sub-Category: Musical Instrument.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiMusicalInstrumentSubCategory {

    /**
     * Saxophone.
     */
    SAXOPHONE(EmojiCategory.OBJECTS,1214L,"U+1F3B7","saxophone"),

    /**
     * Accordion.
     */
    ACCORDION(EmojiCategory.OBJECTS,1215L,"U+1FA97","accordion"),

    /**
     * Guitar.
     */
    GUITAR(EmojiCategory.OBJECTS,1216L,"U+1F3B8","guitar"),

    /**
     * Musical keyboard.
     */
    MUSICAL_KEYBOARD(EmojiCategory.OBJECTS,1217L,"U+1F3B9","musical keyboard"),

    /**
     * Trumpet.
     */
    TRUMPET(EmojiCategory.OBJECTS,1218L,"U+1F3BA","trumpet"),

    /**
     * Violin.
     */
    VIOLIN(EmojiCategory.OBJECTS,1219L,"U+1F3BB","violin"),

    /**
     * Banjo.
     */
    BANJO(EmojiCategory.OBJECTS,1220L,"U+1FA95","banjo"),

    /**
     * Drum.
     */
    DRUM(EmojiCategory.OBJECTS,1221L,"U+1F941","drum"),

    /**
     * Long drum.
     */
    LONG_DRUM(EmojiCategory.OBJECTS,1222L,"U+1FA98","long drum"),

    /**
     * Maracas.
     */
    MARACAS(EmojiCategory.OBJECTS,1223L,"U+1FA87","maracas"),

    /**
     * Flute.
     */
    FLUTE(EmojiCategory.OBJECTS,1224L,"U+1FA88","flute");

    private final EmojiCategory emojiCategory;
    private final Long number;
    private final String unicode;
    private final String cldr;

    /**
     * Constructor.
     *
     * @param emojiCategory    The emoji category.
     * @param number           The number.
     * @param unicode          The unicode.
     * @param cldr             The CLDR.
     */
    EmojiMusicalInstrumentSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
        this.emojiCategory = emojiCategory;
        this.number = number;
        this.unicode = unicode;
        this.cldr = cldr;
    }

    /**
     * Gets the emoji category.
     *
     * @return The emoji category.
     */
    public EmojiCategory getEmojiCategory() {
        return emojiCategory;
    }

    /**
     * Gets the number.
     *
     * @return The number.
     */
    public Long getNumber() {
        return number;
    }

    /**
     * Gets the unicode.
     *
     * @return The unicode.
     */
    public String getUnicode() {
        return unicode;
    }

    /**
     * Gets the CLDR.
     *
     * @return The CLDR.
     */
    public String getCldr() {
        return cldr;
    }

    /**
     * Gets the unicode to print the emoji.
     *
     * @return The unicode to print the emoji.
     */
    public String print() {
        return toPrint(unicode);
    }
}
