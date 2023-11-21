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
 * Unicode Emoji Sub-Category: Arrow.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiArrowSubCategory {

    /**
     * Up arrow.
     */
    UP_ARROW(EmojiCategory.SYMBOLS,1437L,"U+2B06","up arrow"),

    /**
     * Up-right arrow.
     */
    UP_RIGHT_ARROW(EmojiCategory.SYMBOLS,1438L,"U+2197","up-right arrow"),

    /**
     * Right arrow.
     */
    RIGHT_ARROW(EmojiCategory.SYMBOLS,1439L,"U+27A1","right arrow"),

    /**
     * Down-right arrow.
     */
    DOWN_RIGHT_ARROW(EmojiCategory.SYMBOLS,1440L,"U+2198","down-right arrow"),

    /**
     * Down arrow.
     */
    DOWN_ARROW(EmojiCategory.SYMBOLS,1441L,"U+2B07","down arrow"),

    /**
     * Down-left arrow.
     */
    DOWN_LEFT_ARROW(EmojiCategory.SYMBOLS,1442L,"U+2199","down-left arrow"),

    /**
     * Left arrow.
     */
    LEFT_ARROW(EmojiCategory.SYMBOLS,1443L,"U+2B05","left arrow"),

    /**
     * Up-left arrow.
     */
    UP_LEFT_ARROW(EmojiCategory.SYMBOLS,1444L,"U+2196","up-left arrow"),

    /**
     * Up-down arrow.
     */
    UP_DOWN_ARROW(EmojiCategory.SYMBOLS,1445L,"U+2195","up-down arrow"),

    /**
     * Left-right arrow.
     */
    LEFT_RIGHT_ARROW(EmojiCategory.SYMBOLS,1446L,"U+2194","left-right arrow"),

    /**
     * Right arrow curving left.
     */
    RIGHT_ARROW_CURVING_LEFT(EmojiCategory.SYMBOLS,1447L,"U+21A9","right arrow curving left"),

    /**
     * Left arrow curving right.
     */
    LEFT_ARROW_CURVING_RIGHT(EmojiCategory.SYMBOLS,1448L,"U+21AA","left arrow curving right"),

    /**
     * Right arrow curving up.
     */
    RIGHT_ARROW_CURVING_UP(EmojiCategory.SYMBOLS,1449L,"U+2934","right arrow curving up"),

    /**
     * Right arrow curving down.
     */
    RIGHT_ARROW_CURVING_DOWN(EmojiCategory.SYMBOLS,1450L,"U+2935","right arrow curving down"),

    /**
     * Clockwise vertical arrows.
     */
    CLOCKWISE_VERTICAL_ARROWS(EmojiCategory.SYMBOLS,1451L,"U+1F503","clockwise vertical arrows"),

    /**
     * Counterclockwise arrows button.
     */
    COUNTERCLOCKWISE_ARROWS_BUTTON(EmojiCategory.SYMBOLS,1452L,"U+1F504","counterclockwise arrows button"),

    /**
     * BACK arrow.
     */
    BACK_ARROW(EmojiCategory.SYMBOLS,1453L,"U+1F519","BACK arrow"),

    /**
     * END arrow.
     */
    END_ARROW(EmojiCategory.SYMBOLS,1454L,"U+1F51A","END arrow"),

    /**
     * ON! arrow.
     */
    ON_ARROW(EmojiCategory.SYMBOLS,1455L,"U+1F51B","ON! arrow"),

    /**
     * SOON arrow.
     */
    SOON_ARROW(EmojiCategory.SYMBOLS,1456L,"U+1F51C","SOON arrow"),

    /**
     * TOP arrow.
     */
    TOP_ARROW(EmojiCategory.SYMBOLS,1457L,"U+1F51D","TOP arrow");

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
    EmojiArrowSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
