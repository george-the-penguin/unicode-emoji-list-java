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
 * Unicode Emoji Sub-Category: Person Symbol.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiPersonSymbolSubCategory {

    /**
     * Speaking head.
     */
    SPEAKING_HEAD(EmojiCategory.PEOPLE_BODY,544L,"U+1F5E3","speaking head"),

    /**
     * Bust in silhouette.
     */
    BUST_IN_SILHOUETTE(EmojiCategory.PEOPLE_BODY,545L,"U+1F464","bust in silhouette"),

    /**
     * Busts in silhouette.
     */
    BUSTS_IN_SILHOUETTE(EmojiCategory.PEOPLE_BODY,546L,"U+1F465","busts in silhouette"),

    /**
     * People hugging.
     */
    PEOPLE_HUGGING(EmojiCategory.PEOPLE_BODY,547L,"U+1FAC2","people hugging"),

    /**
     * Family.
     */
    FAMILY(EmojiCategory.PEOPLE_BODY,548L,"U+1F46A","family"),

    /**
     * Family: adult, adult, child.
     */
    FAMILY_ADULT_ADULT_CHILD(EmojiCategory.PEOPLE_BODY,549L,"U+1F9D1 U+200D U+1F9D1 U+200D U+1F9D2","family: adult, adult, child"),

    /**
     * Family: adult, adult, child, child.
     */
    FAMILY_ADULT_ADULT_CHILD_CHILD(EmojiCategory.PEOPLE_BODY,550L,"U+1F9D1 U+200D U+1F9D1 U+200D U+1F9D2 U+200D U+1F9D2","family: adult, adult, child, child"),

    /**
     * Family: adult, child.
     */
    FAMILY_ADULT_CHILD(EmojiCategory.PEOPLE_BODY,551L,"U+1F9D1 U+200D U+1F9D2","family: adult, child"),

    /**
     * Family: adult, child, child.
     */
    FAMILY_ADULT_CHILD_CHILD(EmojiCategory.PEOPLE_BODY,552L,"U+1F9D1 U+200D U+1F9D2 U+200D U+1F9D2","family: adult, child, child"),

    /**
     * Footprints.
     */
    FOOTPRINTS(EmojiCategory.PEOPLE_BODY,553L,"U+1F463","footprints");

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
    EmojiPersonSymbolSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
