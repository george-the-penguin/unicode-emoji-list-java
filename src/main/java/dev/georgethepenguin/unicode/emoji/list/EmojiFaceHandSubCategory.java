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
 * Unicode Emoji Sub-Category: Face Hand.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFaceHandSubCategory {

    /**
     * Smiling face with open hands.
     */
    SMILING_FACE_WITH_OPEN_HANDS(EmojiCategory.SMILEYS_EMOTION,30L,"U+1F917","smiling face with open hands"),

    /**
     * Face with hand over mouth.
     */
    FACE_WITH_HAND_OVER_MOUTH(EmojiCategory.SMILEYS_EMOTION,31L,"U+1F92D","face with hand over mouth"),

    /**
     * Face with open eyes and hand over mouth.
     */
    FACE_WITH_OPEN_EYES_AND_HAND_OVER_MOUTH(EmojiCategory.SMILEYS_EMOTION,32L,"U+1FAE2","face with open eyes and hand over mouth"),

    /**
     * Face with peeking eye.
     */
    FACE_WITH_PEEKING_EYE(EmojiCategory.SMILEYS_EMOTION,33L,"U+1FAE3","face with peeking eye"),

    /**
     * Shushing face.
     */
    SHUSHING_FACE(EmojiCategory.SMILEYS_EMOTION,34L,"U+1F92B","shushing face"),

    /**
     * Thinking face.
     */
    THINKING_FACE(EmojiCategory.SMILEYS_EMOTION,35L,"U+1F914","thinking face"),

    /**
     * Saluting face.
     */
    SALUTING_FACE(EmojiCategory.SMILEYS_EMOTION,36L,"U+1FAE1","saluting face");

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
    EmojiFaceHandSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
