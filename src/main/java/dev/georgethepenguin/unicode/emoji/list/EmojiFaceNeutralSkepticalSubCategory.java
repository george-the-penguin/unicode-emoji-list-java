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
 * Unicode Emoji Sub-Category: Face Neutral Skeptical.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFaceNeutralSkepticalSubCategory {

    /**
     * Zipper-mouth face.
     */
    ZIPPER_MOUTH_FACE(EmojiCategory.SMILEYS_EMOTION,37L,"U+1F910","zipper-mouth face"),

    /**
     * Face with raised eyebrow.
     */
    FACE_WITH_RAISED_EYEBROW(EmojiCategory.SMILEYS_EMOTION,38L,"U+1F928","face with raised eyebrow"),

    /**
     * Neutral face.
     */
    NEUTRAL_FACE(EmojiCategory.SMILEYS_EMOTION,39L,"U+1F610","neutral face"),

    /**
     * Expressionless face.
     */
    EXPRESSIONLESS_FACE(EmojiCategory.SMILEYS_EMOTION,40L,"U+1F611","expressionless face"),

    /**
     * Face without mouth.
     */
    FACE_WITHOUT_MOUTH(EmojiCategory.SMILEYS_EMOTION,41L,"U+1F636","face without mouth"),

    /**
     * Dotted line face.
     */
    DOTTED_LINE_FACE(EmojiCategory.SMILEYS_EMOTION,42L,"U+1FAE5","dotted line face"),

    /**
     * Face in clouds.
     */
    FACE_IN_CLOUDS(EmojiCategory.SMILEYS_EMOTION,43L,"U+1F636 U+200D U+1F32B U+FE0F","face in clouds"),

    /**
     * Smirking face.
     */
    SMIRKING_FACE(EmojiCategory.SMILEYS_EMOTION,44L,"U+1F60F","smirking face"),

    /**
     * Unamused face.
     */
    UNAMUSED_FACE(EmojiCategory.SMILEYS_EMOTION,45L,"U+1F612","unamused face"),

    /**
     * Face with rolling eyes.
     */
    FACE_WITH_ROLLING_EYES(EmojiCategory.SMILEYS_EMOTION,46L,"U+1F644","face with rolling eyes"),

    /**
     * Grimacing face.
     */
    GRIMACING_FACE(EmojiCategory.SMILEYS_EMOTION,47L,"U+1F62C","grimacing face"),

    /**
     * Face exhaling.
     */
    FACE_EXHALING(EmojiCategory.SMILEYS_EMOTION,48L,"U+1F62E U+200D U+1F4A8","face exhaling"),

    /**
     * Lying face.
     */
    LYING_FACE(EmojiCategory.SMILEYS_EMOTION,49L,"U+1F925","lying face"),

    /**
     * Shaking face.
     */
    SHAKING_FACE(EmojiCategory.SMILEYS_EMOTION,50L,"U+1FAE8","shaking face"),

    /**
     * Head shaking horizontally.
     */
    HEAD_SHAKING_HORIZONTALLY(EmojiCategory.SMILEYS_EMOTION,51L,"U+1F642 U+200D U+2194 U+FE0F","head shaking horizontally"),

    /**
     * Head shaking vertically.
     */
    HEAD_SHAKING_VERTICALLY(EmojiCategory.SMILEYS_EMOTION,52L,"U+1F642 U+200D U+2195 U+FE0F","head shaking vertically");

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
    EmojiFaceNeutralSkepticalSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
