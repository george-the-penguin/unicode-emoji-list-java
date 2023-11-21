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
 * Unicode Emoji Sub-Category: Transport Sign.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiTransportSignSubCategory {

    /**
     * ATM sign.
     */
    ATM_SIGN(EmojiCategory.SYMBOLS,1411L,"U+1F3E7","ATM sign"),

    /**
     * Litter in bin sign.
     */
    LITTER_IN_BIN_SIGN(EmojiCategory.SYMBOLS,1412L,"U+1F6AE","litter in bin sign"),

    /**
     * Potable water.
     */
    POTABLE_WATER(EmojiCategory.SYMBOLS,1413L,"U+1F6B0","potable water"),

    /**
     * Wheelchair symbol.
     */
    WHEELCHAIR_SYMBOL(EmojiCategory.SYMBOLS,1414L,"U+267F","wheelchair symbol"),

    /**
     * Mens room.
     */
    MENS_ROOM(EmojiCategory.SYMBOLS,1415L,"U+1F6B9","mens room"),

    /**
     * Womens room.
     */
    WOMENS_ROOM(EmojiCategory.SYMBOLS,1416L,"U+1F6BA","womens room"),

    /**
     * Restroom.
     */
    RESTROOM(EmojiCategory.SYMBOLS,1417L,"U+1F6BB","restroom"),

    /**
     * Baby symbol.
     */
    BABY_SYMBOL(EmojiCategory.SYMBOLS,1418L,"U+1F6BC","baby symbol"),

    /**
     * Water closet.
     */
    WATER_CLOSET(EmojiCategory.SYMBOLS,1419L,"U+1F6BE","water closet"),

    /**
     * Passport control.
     */
    PASSPORT_CONTROL(EmojiCategory.SYMBOLS,1420L,"U+1F6C2","passport control"),

    /**
     * Customs.
     */
    CUSTOMS(EmojiCategory.SYMBOLS,1421L,"U+1F6C3","customs"),

    /**
     * Baggage claim.
     */
    BAGGAGE_CLAIM(EmojiCategory.SYMBOLS,1422L,"U+1F6C4","baggage claim"),

    /**
     * Left luggage.
     */
    LEFT_LUGGAGE(EmojiCategory.SYMBOLS,1423L,"U+1F6C5","left luggage");

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
    EmojiTransportSignSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
