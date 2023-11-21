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
 * Unicode Emoji Sub-Category: Religion.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiReligionSubCategory {

    /**
     * Place of worship.
     */
    PLACE_OF_WORSHIP(EmojiCategory.SYMBOLS,1458L,"U+1F6D0","place of worship"),

    /**
     * Atom symbol.
     */
    ATOM_SYMBOL(EmojiCategory.SYMBOLS,1459L,"U+269B","atom symbol"),

    /**
     * Om.
     */
    OM(EmojiCategory.SYMBOLS,1460L,"U+1F549","om"),

    /**
     * Star of David.
     */
    STAR_OF_DAVID(EmojiCategory.SYMBOLS,1461L,"U+2721","star of David"),

    /**
     * Wheel of dharma.
     */
    WHEEL_OF_DHARMA(EmojiCategory.SYMBOLS,1462L,"U+2638","wheel of dharma"),

    /**
     * Yin yang.
     */
    YIN_YANG(EmojiCategory.SYMBOLS,1463L,"U+262F","yin yang"),

    /**
     * Latin cross.
     */
    LATIN_CROSS(EmojiCategory.SYMBOLS,1464L,"U+271D","latin cross"),

    /**
     * Orthodox cross.
     */
    ORTHODOX_CROSS(EmojiCategory.SYMBOLS,1465L,"U+2626","orthodox cross"),

    /**
     * Star and crescent.
     */
    STAR_AND_CRESCENT(EmojiCategory.SYMBOLS,1466L,"U+262A","star and crescent"),

    /**
     * Peace symbol.
     */
    PEACE_SYMBOL(EmojiCategory.SYMBOLS,1467L,"U+262E","peace symbol"),

    /**
     * Menorah.
     */
    MENORAH(EmojiCategory.SYMBOLS,1468L,"U+1F54E","menorah"),

    /**
     * Dotted six-pointed star.
     */
    DOTTED_SIX_POINTED_STAR(EmojiCategory.SYMBOLS,1469L,"U+1F52F","dotted six-pointed star"),

    /**
     * Khanda.
     */
    KHANDA(EmojiCategory.SYMBOLS,1470L,"U+1FAAF","khanda");

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
    EmojiReligionSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
