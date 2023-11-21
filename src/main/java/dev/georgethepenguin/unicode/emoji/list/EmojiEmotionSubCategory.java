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
 * Unicode Emoji Sub-Category: Emotion.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiEmotionSubCategory {

    /**
     * Kiss mark.
     */
    KISS_MARK(EmojiCategory.SMILEYS_EMOTION,155L,"U+1F48B","kiss mark"),

    /**
     * Hundred points.
     */
    HUNDRED_POINTS(EmojiCategory.SMILEYS_EMOTION,156L,"U+1F4AF","hundred points"),

    /**
     * Anger symbol.
     */
    ANGER_SYMBOL(EmojiCategory.SMILEYS_EMOTION,157L,"U+1F4A2","anger symbol"),

    /**
     * Collision.
     */
    COLLISION(EmojiCategory.SMILEYS_EMOTION,158L,"U+1F4A5","collision"),

    /**
     * Dizzy.
     */
    DIZZY(EmojiCategory.SMILEYS_EMOTION,159L,"U+1F4AB","dizzy"),

    /**
     * Sweat droplets.
     */
    SWEAT_DROPLETS(EmojiCategory.SMILEYS_EMOTION,160L,"U+1F4A6","sweat droplets"),

    /**
     * Dashing away.
     */
    DASHING_AWAY(EmojiCategory.SMILEYS_EMOTION,161L,"U+1F4A8","dashing away"),

    /**
     * Hole.
     */
    HOLE(EmojiCategory.SMILEYS_EMOTION,162L,"U+1F573","hole"),

    /**
     * Speech balloon.
     */
    SPEECH_BALLOON(EmojiCategory.SMILEYS_EMOTION,163L,"U+1F4AC","speech balloon"),

    /**
     * Eye in speech bubble.
     */
    EYE_IN_SPEECH_BUBBLE(EmojiCategory.SMILEYS_EMOTION,164L,"U+1F441 U+FE0F U+200D U+1F5E8 U+FE0F","eye in speech bubble"),

    /**
     * Left speech bubble.
     */
    LEFT_SPEECH_BUBBLE(EmojiCategory.SMILEYS_EMOTION,165L,"U+1F5E8","left speech bubble"),

    /**
     * Right anger bubble.
     */
    RIGHT_ANGER_BUBBLE(EmojiCategory.SMILEYS_EMOTION,166L,"U+1F5EF","right anger bubble"),

    /**
     * Thought balloon.
     */
    THOUGHT_BALLOON(EmojiCategory.SMILEYS_EMOTION,167L,"U+1F4AD","thought balloon"),

    /**
     * ZZZ.
     */
    ZZZ(EmojiCategory.SMILEYS_EMOTION,168L,"U+1F4A4","ZZZ");

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
    EmojiEmotionSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
