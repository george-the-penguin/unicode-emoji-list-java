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
 * Unicode Emoji Sub-Category: Keycap.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiKeycapSubCategory {

    /**
     * Keycap: #.
     */
    KEYCAP_HASH(EmojiCategory.SYMBOLS,1548L,"U+0023 U+FE0F U+20E3","keycap: #"),

    /**
     * Keycap: *.
     */
    KEYCAP_ASTERISK(EmojiCategory.SYMBOLS,1549L,"U+002A U+FE0F U+20E3","keycap: *"),

    /**
     * Keycap: 0.
     */
    KEYCAP_0(EmojiCategory.SYMBOLS,1550L,"U+0030 U+FE0F U+20E3","keycap: 0"),

    /**
     * Keycap: 1.
     */
    KEYCAP_1(EmojiCategory.SYMBOLS,1551L,"U+0031 U+FE0F U+20E3","keycap: 1"),

    /**
     * Keycap: 2.
     */
    KEYCAP_2(EmojiCategory.SYMBOLS,1552L,"U+0032 U+FE0F U+20E3","keycap: 2"),

    /**
     * Keycap: 3.
     */
    KEYCAP_3(EmojiCategory.SYMBOLS,1553L,"U+0033 U+FE0F U+20E3","keycap: 3"),

    /**
     * Keycap: 4.
     */
    KEYCAP_4(EmojiCategory.SYMBOLS,1554L,"U+0034 U+FE0F U+20E3","keycap: 4"),

    /**
     * Keycap: 5.
     */
    KEYCAP_5(EmojiCategory.SYMBOLS,1555L,"U+0035 U+FE0F U+20E3","keycap: 5"),

    /**
     * Keycap: 6.
     */
    KEYCAP_6(EmojiCategory.SYMBOLS,1556L,"U+0036 U+FE0F U+20E3","keycap: 6"),

    /**
     * Keycap: 7.
     */
    KEYCAP_7(EmojiCategory.SYMBOLS,1557L,"U+0037 U+FE0F U+20E3","keycap: 7"),

    /**
     * Keycap: 8.
     */
    KEYCAP_8(EmojiCategory.SYMBOLS,1558L,"U+0038 U+FE0F U+20E3","keycap: 8"),

    /**
     * Keycap: 9.
     */
    KEYCAP_9(EmojiCategory.SYMBOLS,1559L,"U+0039 U+FE0F U+20E3","keycap: 9"),

    /**
     * Keycap: 10.
     */
    KEYCAP_10(EmojiCategory.SYMBOLS,1560L,"U+1F51F","keycap: 10");

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
    EmojiKeycapSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
