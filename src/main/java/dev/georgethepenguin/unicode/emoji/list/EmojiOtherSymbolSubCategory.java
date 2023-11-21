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
 * Unicode Emoji Sub-Category: Other Symbol.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiOtherSymbolSubCategory {

    /**
     * Medical symbol.
     */
    MEDICAL_SYMBOL(EmojiCategory.SYMBOLS,1527L,"U+2695","medical symbol"),

    /**
     * Recycling symbol.
     */
    RECYCLING_SYMBOL(EmojiCategory.SYMBOLS,1528L,"U+267B","recycling symbol"),

    /**
     * Fleur-de-lis.
     */
    FLEUR_DE_LIS(EmojiCategory.SYMBOLS,1529L,"U+269C","fleur-de-lis"),

    /**
     * Trident emblem.
     */
    TRIDENT_EMBLEM(EmojiCategory.SYMBOLS,1530L,"U+1F531","trident emblem"),

    /**
     * Name badge.
     */
    NAME_BADGE(EmojiCategory.SYMBOLS,1531L,"U+1F4DB","name badge"),

    /**
     * Japanese symbol for beginner.
     */
    JAPANESE_SYMBOL_FOR_BEGINNER(EmojiCategory.SYMBOLS,1532L,"U+1F530","Japanese symbol for beginner"),

    /**
     * Hollow red circle.
     */
    HOLLOW_RED_CIRCLE(EmojiCategory.SYMBOLS,1533L,"U+2B55","hollow red circle"),

    /**
     * Check mark button.
     */
    CHECK_MARK_BUTTON(EmojiCategory.SYMBOLS,1534L,"U+2705","check mark button"),

    /**
     * Check box with check.
     */
    CHECK_BOX_WITH_CHECK(EmojiCategory.SYMBOLS,1535L,"U+2611","check box with check"),

    /**
     * Check mark.
     */
    CHECK_MARK(EmojiCategory.SYMBOLS,1536L,"U+2714","check mark"),

    /**
     * Cross mark.
     */
    CROSS_MARK(EmojiCategory.SYMBOLS,1537L,"U+274C","cross mark"),

    /**
     * Cross mark button.
     */
    CROSS_MARK_BUTTON(EmojiCategory.SYMBOLS,1538L,"U+274E","cross mark button"),

    /**
     * Curly loop.
     */
    CURLY_LOOP(EmojiCategory.SYMBOLS,1539L,"U+27B0","curly loop"),

    /**
     * Double curly loop.
     */
    DOUBLE_CURLY_LOOP(EmojiCategory.SYMBOLS,1540L,"U+27BF","double curly loop"),

    /**
     * Part alternation mark.
     */
    PART_ALTERNATION_MARK(EmojiCategory.SYMBOLS,1541L,"U+303D","part alternation mark"),

    /**
     * Eight-spoked asterisk.
     */
    EIGHT_SPOKED_ASTERISK(EmojiCategory.SYMBOLS,1542L,"U+2733","eight-spoked asterisk"),

    /**
     * Eight-pointed star.
     */
    EIGHT_POINTED_STAR(EmojiCategory.SYMBOLS,1543L,"U+2734","eight-pointed star"),

    /**
     * Sparkle.
     */
    SPARKLE(EmojiCategory.SYMBOLS,1544L,"U+2747","sparkle"),

    /**
     * Copyright.
     */
    COPYRIGHT(EmojiCategory.SYMBOLS,1545L,"U+00A9","copyright"),

    /**
     * Registered.
     */
    REGISTERED(EmojiCategory.SYMBOLS,1546L,"U+00AE","registered"),

    /**
     * Trade mark.
     */
    TRADE_MARK(EmojiCategory.SYMBOLS,1547L,"U+2122","trade mark");

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
    EmojiOtherSymbolSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
