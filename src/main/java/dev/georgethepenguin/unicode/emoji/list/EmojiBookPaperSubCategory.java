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
 * Unicode Emoji Sub-Category: Book Paper.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiBookPaperSubCategory {

    /**
     * Notebook with decorative cover.
     */
    NOTEBOOK_WITH_DECORATIVE_COVER(EmojiCategory.OBJECTS,1261L,"U+1F4D4","notebook with decorative cover"),

    /**
     * Closed book.
     */
    CLOSED_BOOK(EmojiCategory.OBJECTS,1262L,"U+1F4D5","closed book"),

    /**
     * Open book.
     */
    OPEN_BOOK(EmojiCategory.OBJECTS,1263L,"U+1F4D6","open book"),

    /**
     * Green book.
     */
    GREEN_BOOK(EmojiCategory.OBJECTS,1264L,"U+1F4D7","green book"),

    /**
     * Blue book.
     */
    BLUE_BOOK(EmojiCategory.OBJECTS,1265L,"U+1F4D8","blue book"),

    /**
     * Orange book.
     */
    ORANGE_BOOK(EmojiCategory.OBJECTS,1266L,"U+1F4D9","orange book"),

    /**
     * Books.
     */
    BOOKS(EmojiCategory.OBJECTS,1267L,"U+1F4DA","books"),

    /**
     * Notebook.
     */
    NOTEBOOK(EmojiCategory.OBJECTS,1268L,"U+1F4D3","notebook"),

    /**
     * Ledger.
     */
    LEDGER(EmojiCategory.OBJECTS,1269L,"U+1F4D2","ledger"),

    /**
     * Page with curl.
     */
    PAGE_WITH_CURL(EmojiCategory.OBJECTS,1270L,"U+1F4C3","page with curl"),

    /**
     * Scroll.
     */
    SCROLL(EmojiCategory.OBJECTS,1271L,"U+1F4DC","scroll"),

    /**
     * Page facing up.
     */
    PAGE_FACING_UP(EmojiCategory.OBJECTS,1272L,"U+1F4C4","page facing up"),

    /**
     * Newspaper.
     */
    NEWSPAPER(EmojiCategory.OBJECTS,1273L,"U+1F4F0","newspaper"),

    /**
     * Rolled-up newspaper.
     */
    ROLLED_UP_NEWSPAPER(EmojiCategory.OBJECTS,1274L,"U+1F5DE","rolled-up newspaper"),

    /**
     * Bookmark tabs.
     */
    BOOKMARK_TABS(EmojiCategory.OBJECTS,1275L,"U+1F4D1","bookmark tabs"),

    /**
     * Bookmark.
     */
    BOOKMARK(EmojiCategory.OBJECTS,1276L,"U+1F516","bookmark"),

    /**
     * Label.
     */
    LABEL(EmojiCategory.OBJECTS,1277L,"U+1F3F7","label");

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
    EmojiBookPaperSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
