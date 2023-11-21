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
 * Unicode Emoji Sub-Category: Cat Face.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiCatFaceSubCategory {

    /**
     * Grinning cat.
     */
    GRINNING_CAT(EmojiCategory.SMILEYS_EMOTION,118L,"U+1F63A","grinning cat"),

    /**
     * Grinning cat with smiling eyes.
     */
    GRINNING_CAT_WITH_SMILING_EYES(EmojiCategory.SMILEYS_EMOTION,119L,"U+1F638","grinning cat with smiling eyes"),

    /**
     * Cat with tears of joy.
     */
    CAT_WITH_TEARS_OF_JOY(EmojiCategory.SMILEYS_EMOTION,120L,"U+1F639","cat with tears of joy"),

    /**
     * Smiling cat with heart-eyes.
     */
    SMILING_CAT_WITH_HEART_EYES(EmojiCategory.SMILEYS_EMOTION,121L,"U+1F63B","smiling cat with heart-eyes"),

    /**
     * Cat with wry smile.
     */
    CAT_WITH_WRY_SMILE(EmojiCategory.SMILEYS_EMOTION,122L,"U+1F63C","cat with wry smile"),

    /**
     * Kissing cat.
     */
    KISSING_CAT(EmojiCategory.SMILEYS_EMOTION,123L,"U+1F63D","kissing cat"),

    /**
     * Weary cat.
     */
    WEARY_CAT(EmojiCategory.SMILEYS_EMOTION,124L,"U+1F640","weary cat"),

    /**
     * Crying cat.
     */
    CRYING_CAT(EmojiCategory.SMILEYS_EMOTION,125L,"U+1F63F","crying cat"),

    /**
     * Pouting cat.
     */
    POUTING_CAT(EmojiCategory.SMILEYS_EMOTION,126L,"U+1F63E","pouting cat");

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
    EmojiCatFaceSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
