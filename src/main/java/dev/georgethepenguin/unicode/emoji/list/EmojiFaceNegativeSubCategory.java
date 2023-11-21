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
 * Unicode Emoji Sub-Category: Face Negative.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFaceNegativeSubCategory {

    /**
     * Face with steam from nose.
     */
    FACE_WITH_STEAM_FROM_NOSE(EmojiCategory.SMILEYS_EMOTION,102L,"U+1F624","face with steam from nose"),

    /**
     * Enraged face.
     */
    ENRAGED_FACE(EmojiCategory.SMILEYS_EMOTION,103L,"U+1F621","enraged face"),

    /**
     * Angry face.
     */
    ANGRY_FACE(EmojiCategory.SMILEYS_EMOTION,104L,"U+1F620","angry face"),

    /**
     * Face with symbols on mouth.
     */
    FACE_WITH_SYMBOLS_ON_MOUTH(EmojiCategory.SMILEYS_EMOTION,105L,"U+1F92C","face with symbols on mouth"),

    /**
     * Smiling face with horns.
     */
    SMILING_FACE_WITH_HORNS(EmojiCategory.SMILEYS_EMOTION,106L,"U+1F608","smiling face with horns"),

    /**
     * Angry face with horns.
     */
    ANGRY_FACE_WITH_HORNS(EmojiCategory.SMILEYS_EMOTION,107L,"U+1F47F","angry face with horns"),

    /**
     * Skull.
     */
    SKULL(EmojiCategory.SMILEYS_EMOTION,108L,"U+1F480","skull"),

    /**
     * Skull and crossbones.
     */
    SKULL_AND_CROSSBONES(EmojiCategory.SMILEYS_EMOTION,109L,"U+2620","skull and crossbones");

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
    EmojiFaceNegativeSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
