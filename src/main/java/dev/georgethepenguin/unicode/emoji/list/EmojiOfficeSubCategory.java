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
 * Unicode Emoji Sub-Category: Office.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiOfficeSubCategory {

    /**
     * Briefcase.
     */
    BRIEFCASE(EmojiCategory.OBJECTS,1308L,"U+1F4BC","briefcase"),

    /**
     * File folder.
     */
    FILE_FOLDER(EmojiCategory.OBJECTS,1309L,"U+1F4C1","file folder"),

    /**
     * Open file folder.
     */
    OPEN_FILE_FOLDER(EmojiCategory.OBJECTS,1310L,"U+1F4C2","open file folder"),

    /**
     * Card index dividers.
     */
    CARD_INDEX_DIVIDERS(EmojiCategory.OBJECTS,1311L,"U+1F5C2","card index dividers"),

    /**
     * Calendar.
     */
    CALENDAR(EmojiCategory.OBJECTS,1312L,"U+1F4C5","calendar"),

    /**
     * Tear-off calendar.
     */
    TEAR_OFF_CALENDAR(EmojiCategory.OBJECTS,1313L,"U+1F4C6","tear-off calendar"),

    /**
     * Spiral notepad.
     */
    SPIRAL_NOTEPAD(EmojiCategory.OBJECTS,1314L,"U+1F5D2","spiral notepad"),

    /**
     * Spiral calendar.
     */
    SPIRAL_CALENDAR(EmojiCategory.OBJECTS,1315L,"U+1F5D3","spiral calendar"),

    /**
     * Card index.
     */
    CARD_INDEX(EmojiCategory.OBJECTS,1316L,"U+1F4C7","card index"),

    /**
     * Chart increasing.
     */
    CHART_INCREASING(EmojiCategory.OBJECTS,1317L,"U+1F4C8","chart increasing"),

    /**
     * Chart decreasing.
     */
    CHART_DECREASING(EmojiCategory.OBJECTS,1318L,"U+1F4C9","chart decreasing"),

    /**
     * Bar chart.
     */
    BAR_CHART(EmojiCategory.OBJECTS,1319L,"U+1F4CA","bar chart"),

    /**
     * Clipboard.
     */
    CLIPBOARD(EmojiCategory.OBJECTS,1320L,"U+1F4CB","clipboard"),

    /**
     * Pushpin.
     */
    PUSHPIN(EmojiCategory.OBJECTS,1321L,"U+1F4CC","pushpin"),

    /**
     * Round pushpin.
     */
    ROUND_PUSHPIN(EmojiCategory.OBJECTS,1322L,"U+1F4CD","round pushpin"),

    /**
     * Paperclip.
     */
    PAPERCLIP(EmojiCategory.OBJECTS,1323L,"U+1F4CE","paperclip"),

    /**
     * Linked paperclips.
     */
    LINKED_PAPERCLIPS(EmojiCategory.OBJECTS,1324L,"U+1F587","linked paperclips"),

    /**
     * Straight ruler.
     */
    STRAIGHT_RULER(EmojiCategory.OBJECTS,1325L,"U+1F4CF","straight ruler"),

    /**
     * Triangular ruler.
     */
    TRIANGULAR_RULER(EmojiCategory.OBJECTS,1326L,"U+1F4D0","triangular ruler"),

    /**
     * Scissors.
     */
    SCISSORS(EmojiCategory.OBJECTS,1327L,"U+2702","scissors"),

    /**
     * Card file box.
     */
    CARD_FILE_BOX(EmojiCategory.OBJECTS,1328L,"U+1F5C3","card file box"),

    /**
     * File cabinet.
     */
    FILE_CABINET(EmojiCategory.OBJECTS,1329L,"U+1F5C4","file cabinet"),

    /**
     * Wastebasket.
     */
    WASTEBASKET(EmojiCategory.OBJECTS,1330L,"U+1F5D1","wastebasket");

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
    EmojiOfficeSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
