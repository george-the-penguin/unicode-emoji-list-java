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
 * Unicode Emoji Sub-Category: Geometric.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiGeometricSubCategory {

    /**
     * Red circle.
     */
    RED_CIRCLE(EmojiCategory.SYMBOLS,1600L,"U+1F534","red circle"),

    /**
     * Orange circle.
     */
    ORANGE_CIRCLE(EmojiCategory.SYMBOLS,1601L,"U+1F7E0","orange circle"),

    /**
     * Yellow circle.
     */
    YELLOW_CIRCLE(EmojiCategory.SYMBOLS,1602L,"U+1F7E1","yellow circle"),

    /**
     * Green circle.
     */
    GREEN_CIRCLE(EmojiCategory.SYMBOLS,1603L,"U+1F7E2","green circle"),

    /**
     * Blue circle.
     */
    BLUE_CIRCLE(EmojiCategory.SYMBOLS,1604L,"U+1F535","blue circle"),

    /**
     * Purple circle.
     */
    PURPLE_CIRCLE(EmojiCategory.SYMBOLS,1605L,"U+1F7E3","purple circle"),

    /**
     * Brown circle.
     */
    BROWN_CIRCLE(EmojiCategory.SYMBOLS,1606L,"U+1F7E4","brown circle"),

    /**
     * Black circle.
     */
    BLACK_CIRCLE(EmojiCategory.SYMBOLS,1607L,"U+26AB","black circle"),

    /**
     * White circle.
     */
    WHITE_CIRCLE(EmojiCategory.SYMBOLS,1608L,"U+26AA","white circle"),

    /**
     * Red square.
     */
    RED_SQUARE(EmojiCategory.SYMBOLS,1609L,"U+1F7E5","red square"),

    /**
     * Orange square.
     */
    ORANGE_SQUARE(EmojiCategory.SYMBOLS,1610L,"U+1F7E7","orange square"),

    /**
     * Yellow square.
     */
    YELLOW_SQUARE(EmojiCategory.SYMBOLS,1611L,"U+1F7E8","yellow square"),

    /**
     * Green square.
     */
    GREEN_SQUARE(EmojiCategory.SYMBOLS,1612L,"U+1F7E9","green square"),

    /**
     * Blue square.
     */
    BLUE_SQUARE(EmojiCategory.SYMBOLS,1613L,"U+1F7E6","blue square"),

    /**
     * Purple square.
     */
    PURPLE_SQUARE(EmojiCategory.SYMBOLS,1614L,"U+1F7EA","purple square"),

    /**
     * Brown square.
     */
    BROWN_SQUARE(EmojiCategory.SYMBOLS,1615L,"U+1F7EB","brown square"),

    /**
     * Black large square.
     */
    BLACK_LARGE_SQUARE(EmojiCategory.SYMBOLS,1616L,"U+2B1B","black large square"),

    /**
     * White large square.
     */
    WHITE_LARGE_SQUARE(EmojiCategory.SYMBOLS,1617L,"U+2B1C","white large square"),

    /**
     * Black medium square.
     */
    BLACK_MEDIUM_SQUARE(EmojiCategory.SYMBOLS,1618L,"U+25FC","black medium square"),

    /**
     * White medium square.
     */
    WHITE_MEDIUM_SQUARE(EmojiCategory.SYMBOLS,1619L,"U+25FB","white medium square"),

    /**
     * Black medium-small square.
     */
    BLACK_MEDIUM_SMALL_SQUARE(EmojiCategory.SYMBOLS,1620L,"U+25FE","black medium-small square"),

    /**
     * White medium-small square.
     */
    WHITE_MEDIUM_SMALL_SQUARE(EmojiCategory.SYMBOLS,1621L,"U+25FD","white medium-small square"),

    /**
     * Black small square.
     */
    BLACK_SMALL_SQUARE(EmojiCategory.SYMBOLS,1622L,"U+25AA","black small square"),

    /**
     * White small square.
     */
    WHITE_SMALL_SQUARE(EmojiCategory.SYMBOLS,1623L,"U+25AB","white small square"),

    /**
     * Large orange diamond.
     */
    LARGE_ORANGE_DIAMOND(EmojiCategory.SYMBOLS,1624L,"U+1F536","large orange diamond"),

    /**
     * Large blue diamond.
     */
    LARGE_BLUE_DIAMOND(EmojiCategory.SYMBOLS,1625L,"U+1F537","large blue diamond"),

    /**
     * Small orange diamond.
     */
    SMALL_ORANGE_DIAMOND(EmojiCategory.SYMBOLS,1626L,"U+1F538","small orange diamond"),

    /**
     * Small blue diamond.
     */
    SMALL_BLUE_DIAMOND(EmojiCategory.SYMBOLS,1627L,"U+1F539","small blue diamond"),

    /**
     * Red triangle pointed up.
     */
    RED_TRIANGLE_POINTED_UP(EmojiCategory.SYMBOLS,1628L,"U+1F53A","red triangle pointed up"),

    /**
     * Red triangle pointed down.
     */
    RED_TRIANGLE_POINTED_DOWN(EmojiCategory.SYMBOLS,1629L,"U+1F53B","red triangle pointed down"),

    /**
     * Diamond with a dot.
     */
    DIAMOND_WITH_A_DOT(EmojiCategory.SYMBOLS,1630L,"U+1F4A0","diamond with a dot"),

    /**
     * Radio button.
     */
    RADIO_BUTTON(EmojiCategory.SYMBOLS,1631L,"U+1F518","radio button"),

    /**
     * White square button.
     */
    WHITE_SQUARE_BUTTON(EmojiCategory.SYMBOLS,1632L,"U+1F533","white square button"),

    /**
     * Black square button.
     */
    BLACK_SQUARE_BUTTON(EmojiCategory.SYMBOLS,1633L,"U+1F532","black square button");

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
    EmojiGeometricSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
