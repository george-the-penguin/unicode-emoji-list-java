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
 * Unicode Emoji Sub-Category: Zodiac.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiZodiacSubCategory {

    /**
     * Aries.
     */
    ARIES(EmojiCategory.SYMBOLS,1471L,"U+2648","Aries"),

    /**
     * Taurus.
     */
    TAURUS(EmojiCategory.SYMBOLS,1472L,"U+2649","Taurus"),

    /**
     * Gemini.
     */
    GEMINI(EmojiCategory.SYMBOLS,1473L,"U+264A","Gemini"),

    /**
     * Cancer.
     */
    CANCER(EmojiCategory.SYMBOLS,1474L,"U+264B","Cancer"),

    /**
     * Leo.
     */
    LEO(EmojiCategory.SYMBOLS,1475L,"U+264C","Leo"),

    /**
     * Virgo.
     */
    VIRGO(EmojiCategory.SYMBOLS,1476L,"U+264D","Virgo"),

    /**
     * Libra.
     */
    LIBRA(EmojiCategory.SYMBOLS,1477L,"U+264E","Libra"),

    /**
     * Scorpio.
     */
    SCORPIO(EmojiCategory.SYMBOLS,1478L,"U+264F","Scorpio"),

    /**
     * Sagittarius.
     */
    SAGITTARIUS(EmojiCategory.SYMBOLS,1479L,"U+2650","Sagittarius"),

    /**
     * Capricorn.
     */
    CAPRICORN(EmojiCategory.SYMBOLS,1480L,"U+2651","Capricorn"),

    /**
     * Aquarius.
     */
    AQUARIUS(EmojiCategory.SYMBOLS,1481L,"U+2652","Aquarius"),

    /**
     * Pisces.
     */
    PISCES(EmojiCategory.SYMBOLS,1482L,"U+2653","Pisces"),

    /**
     * Ophiuchus.
     */
    OPHIUCHUS(EmojiCategory.SYMBOLS,1483L,"U+26CE","Ophiuchus");

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
    EmojiZodiacSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
