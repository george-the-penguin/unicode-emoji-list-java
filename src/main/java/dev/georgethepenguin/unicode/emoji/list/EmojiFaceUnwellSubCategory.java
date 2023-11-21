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
 * Unicode Emoji Sub-Category: Face Unwell.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFaceUnwellSubCategory {

    /**
     * Face with medical mask.
     */
    FACE_WITH_MEDICAL_MASK(EmojiCategory.SMILEYS_EMOTION,58L,"U+1F637","face with medical mask"),

    /**
     * Face with thermometer.
     */
    FACE_WITH_THERMOMETER(EmojiCategory.SMILEYS_EMOTION,59L,"U+1F912","face with thermometer"),

    /**
     * Face with head-bandage.
     */
    FACE_WITH_HEAD_BANDAGE(EmojiCategory.SMILEYS_EMOTION,60L,"U+1F915","face with head-bandage"),

    /**
     * Nauseated face.
     */
    NAUSEATED_FACE(EmojiCategory.SMILEYS_EMOTION,61L,"U+1F922","nauseated face"),

    /**
     * Face vomiting.
     */
    FACE_VOMITING(EmojiCategory.SMILEYS_EMOTION,62L,"U+1F92E","face vomiting"),

    /**
     * Sneezing face.
     */
    SNEEZING_FACE(EmojiCategory.SMILEYS_EMOTION,63L,"U+1F927","sneezing face"),

    /**
     * Hot face.
     */
    HOT_FACE(EmojiCategory.SMILEYS_EMOTION,64L,"U+1F975","hot face"),

    /**
     * Cold face.
     */
    COLD_FACE(EmojiCategory.SMILEYS_EMOTION,65L,"U+1F976","cold face"),

    /**
     * Woozy face.
     */
    WOOZY_FACE(EmojiCategory.SMILEYS_EMOTION,66L,"U+1F974","woozy face"),

    /**
     * Face with crossed-out eyes.
     */
    FACE_WITH_CROSSED_OUT_EYES(EmojiCategory.SMILEYS_EMOTION,67L,"U+1F635","face with crossed-out eyes"),

    /**
     * Face with spiral eyes.
     */
    FACE_WITH_SPIRAL_EYES(EmojiCategory.SMILEYS_EMOTION,68L,"U+1F635 U+200D U+1F4AB","face with spiral eyes"),

    /**
     * Exploding head.
     */
    EXPLODING_HEAD(EmojiCategory.SMILEYS_EMOTION,69L,"U+1F92F","exploding head");

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
    EmojiFaceUnwellSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
