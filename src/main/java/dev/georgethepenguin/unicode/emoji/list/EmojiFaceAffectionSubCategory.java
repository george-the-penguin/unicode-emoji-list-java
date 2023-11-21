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
 * Unicode Emoji Sub-Category: Face Affection.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFaceAffectionSubCategory {

    /**
     * Smiling face with hearts.
     */
    SMILING_FACE_WITH_HEARTS(EmojiCategory.SMILEYS_EMOTION,15L,"U+1F970","smiling face with hearts"),

    /**
     * Smiling face with heart-eyes.
     */
    SMILING_FACE_WITH_HEART_EYES(EmojiCategory.SMILEYS_EMOTION,16L,"U+1F60D","smiling face with heart-eyes"),

    /**
     * Star-struck.
     */
    STAR_STRUCK(EmojiCategory.SMILEYS_EMOTION,17L,"U+1F929","star-struck"),

    /**
     * Face blowing a kiss.
     */
    FACE_BLOWING_A_KISS(EmojiCategory.SMILEYS_EMOTION,18L,"U+1F618","face blowing a kiss"),

    /**
     * Kissing face.
     */
    KISSING_FACE(EmojiCategory.SMILEYS_EMOTION,19L,"U+1F617","kissing face"),

    /**
     * Smiling face.
     */
    SMILING_FACE(EmojiCategory.SMILEYS_EMOTION,20L,"U+263A","smiling face"),

    /**
     * Kissing face with closed eyes.
     */
    KISSING_FACE_WITH_CLOSED_EYES(EmojiCategory.SMILEYS_EMOTION,21L,"U+1F61A","kissing face with closed eyes"),

    /**
     * Kissing face with smiling eyes.
     */
    KISSING_FACE_WITH_SMILING_EYES(EmojiCategory.SMILEYS_EMOTION,22L,"U+1F619","kissing face with smiling eyes"),

    /**
     * Smiling face with tear.
     */
    SMILING_FACE_WITH_TEAR(EmojiCategory.SMILEYS_EMOTION,23L,"U+1F972","smiling face with tear");

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
    EmojiFaceAffectionSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
