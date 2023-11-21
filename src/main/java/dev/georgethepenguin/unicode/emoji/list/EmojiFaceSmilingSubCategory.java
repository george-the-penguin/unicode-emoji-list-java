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
 * Unicode Emoji Sub-Category: Face Smiling.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFaceSmilingSubCategory {

    /**
     * Grinning face.
     */
    GRINNING_FACE(EmojiCategory.SMILEYS_EMOTION,1L,"U+1F600","grinning face"),

    /**
     * Grinning face with big eyes.
     */
    GRINNING_FACE_WITH_BIG_EYES(EmojiCategory.SMILEYS_EMOTION,2L,"U+1F603","grinning face with big eyes"),

    /**
     * Grinning face with smiling eyes.
     */
    GRINNING_FACE_WITH_SMILING_EYES(EmojiCategory.SMILEYS_EMOTION,3L,"U+1F604","grinning face with smiling eyes"),

    /**
     * Beaming face with smiling eyes.
     */
    BEAMING_FACE_WITH_SMILING_EYES(EmojiCategory.SMILEYS_EMOTION,4L,"U+1F601","beaming face with smiling eyes"),

    /**
     * Grinning squinting face.
     */
    GRINNING_SQUINTING_FACE(EmojiCategory.SMILEYS_EMOTION,5L,"U+1F606","grinning squinting face"),

    /**
     * Grinning face with sweat.
     */
    GRINNING_FACE_WITH_SWEAT(EmojiCategory.SMILEYS_EMOTION,6L,"U+1F605","grinning face with sweat"),

    /**
     * Rolling on the floor laughing.
     */
    ROLLING_ON_THE_FLOOR_LAUGHING(EmojiCategory.SMILEYS_EMOTION,7L,"U+1F923","rolling on the floor laughing"),

    /**
     * Face with tears of joy.
     */
    FACE_WITH_TEARS_OF_JOY(EmojiCategory.SMILEYS_EMOTION,8L,"U+1F602","face with tears of joy"),

    /**
     * Slightly smiling face.
     */
    SLIGHTLY_SMILING_FACE(EmojiCategory.SMILEYS_EMOTION,9L,"U+1F642","slightly smiling face"),

    /**
     * Upside-down face.
     */
    UPSIDE_DOWN_FACE(EmojiCategory.SMILEYS_EMOTION,10L,"U+1F643","upside-down face"),

    /**
     * Melting face.
     */
    MELTING_FACE(EmojiCategory.SMILEYS_EMOTION,11L,"U+1FAE0","melting face"),

    /**
     * Winking face.
     */
    WINKING_FACE(EmojiCategory.SMILEYS_EMOTION,12L,"U+1F609","winking face"),

    /**
     * Smiling face with smiling eyes.
     */
    SMILING_FACE_WITH_SMILING_EYES(EmojiCategory.SMILEYS_EMOTION,13L,"U+1F60A","smiling face with smiling eyes"),

    /**
     * Smiling face with halo.
     */
    SMILING_FACE_WITH_HALO(EmojiCategory.SMILEYS_EMOTION,14L,"U+1F607","smiling face with halo");

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
    EmojiFaceSmilingSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
