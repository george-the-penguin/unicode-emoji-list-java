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
 * Unicode Emoji Sub-Category: Warning.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiWarningSubCategory {

    /**
     * Warning.
     */
    WARNING(EmojiCategory.SYMBOLS,1424L,"U+26A0","warning"),

    /**
     * Children crossing.
     */
    CHILDREN_CROSSING(EmojiCategory.SYMBOLS,1425L,"U+1F6B8","children crossing"),

    /**
     * No entry.
     */
    NO_ENTRY(EmojiCategory.SYMBOLS,1426L,"U+26D4","no entry"),

    /**
     * Prohibited.
     */
    PROHIBITED(EmojiCategory.SYMBOLS,1427L,"U+1F6AB","prohibited"),

    /**
     * No bicycles.
     */
    NO_BICYCLES(EmojiCategory.SYMBOLS,1428L,"U+1F6B3","no bicycles"),

    /**
     * No smoking.
     */
    NO_SMOKING(EmojiCategory.SYMBOLS,1429L,"U+1F6AD","no smoking"),

    /**
     * No littering.
     */
    NO_LITTERING(EmojiCategory.SYMBOLS,1430L,"U+1F6AF","no littering"),

    /**
     * Non-potable water.
     */
    NON_POTABLE_WATER(EmojiCategory.SYMBOLS,1431L,"U+1F6B1","non-potable water"),

    /**
     * No pedestrians.
     */
    NO_PEDESTRIANS(EmojiCategory.SYMBOLS,1432L,"U+1F6B7","no pedestrians"),

    /**
     * No mobile phones.
     */
    NO_MOBILE_PHONES(EmojiCategory.SYMBOLS,1433L,"U+1F4F5","no mobile phones"),

    /**
     * No one under eighteen.
     */
    NO_ONE_UNDER_EIGHTEEN(EmojiCategory.SYMBOLS,1434L,"U+1F51E","no one under eighteen"),

    /**
     * Radioactive.
     */
    RADIOACTIVE(EmojiCategory.SYMBOLS,1435L,"U+2622","radioactive"),

    /**
     * Biohazard.
     */
    BIOHAZARD(EmojiCategory.SYMBOLS,1436L,"U+2623","biohazard");

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
    EmojiWarningSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
