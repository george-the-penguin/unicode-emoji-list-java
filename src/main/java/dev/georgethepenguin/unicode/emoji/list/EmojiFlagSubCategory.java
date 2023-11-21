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
 * Unicode Emoji Sub-Category: Flag.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFlagSubCategory {

    /**
     * Chequered flag.
     */
    CHEQUERED_FLAG(EmojiCategory.FLAGS,1634L,"U+1F3C1","chequered flag"),

    /**
     * Triangular flag.
     */
    TRIANGULAR_FLAG(EmojiCategory.FLAGS,1635L,"U+1F6A9","triangular flag"),

    /**
     * Crossed flags.
     */
    CROSSED_FLAGS(EmojiCategory.FLAGS,1636L,"U+1F38C","crossed flags"),

    /**
     * Black flag.
     */
    BLACK_FLAG(EmojiCategory.FLAGS,1637L,"U+1F3F4","black flag"),

    /**
     * White flag.
     */
    WHITE_FLAG(EmojiCategory.FLAGS,1638L,"U+1F3F3","white flag"),

    /**
     * Rainbow flag.
     */
    RAINBOW_FLAG(EmojiCategory.FLAGS,1639L,"U+1F3F3 U+FE0F U+200D U+1F308","rainbow flag"),

    /**
     * Transgender flag.
     */
    TRANSGENDER_FLAG(EmojiCategory.FLAGS,1640L,"U+1F3F3 U+FE0F U+200D U+26A7 U+FE0F","transgender flag"),

    /**
     * Pirate flag.
     */
    PIRATE_FLAG(EmojiCategory.FLAGS,1641L,"U+1F3F4 U+200D U+2620 U+FE0F","pirate flag");

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
    EmojiFlagSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
