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
 * Unicode Emoji Sub-Category: Face Concerned.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFaceConcernedSubCategory {

    /**
     * Confused face.
     */
    CONFUSED_FACE(EmojiCategory.SMILEYS_EMOTION,76L,"U+1F615","confused face"),

    /**
     * Face with diagonal mouth.
     */
    FACE_WITH_DIAGONAL_MOUTH(EmojiCategory.SMILEYS_EMOTION,77L,"U+1FAE4","face with diagonal mouth"),

    /**
     * Worried face.
     */
    WORRIED_FACE(EmojiCategory.SMILEYS_EMOTION,78L,"U+1F61F","worried face"),

    /**
     * Slightly frowning face.
     */
    SLIGHTLY_FROWNING_FACE(EmojiCategory.SMILEYS_EMOTION,79L,"U+1F641","slightly frowning face"),

    /**
     * Frowning face.
     */
    FROWNING_FACE(EmojiCategory.SMILEYS_EMOTION,80L,"U+2639","frowning face"),

    /**
     * Face with open mouth.
     */
    FACE_WITH_OPEN_MOUTH(EmojiCategory.SMILEYS_EMOTION,81L,"U+1F62E","face with open mouth"),

    /**
     * Hushed face.
     */
    HUSHED_FACE(EmojiCategory.SMILEYS_EMOTION,82L,"U+1F62F","hushed face"),

    /**
     * Astonished face.
     */
    ASTONISHED_FACE(EmojiCategory.SMILEYS_EMOTION,83L,"U+1F632","astonished face"),

    /**
     * Flushed face.
     */
    FLUSHED_FACE(EmojiCategory.SMILEYS_EMOTION,84L,"U+1F633","flushed face"),

    /**
     * Pleading face.
     */
    PLEADING_FACE(EmojiCategory.SMILEYS_EMOTION,85L,"U+1F97A","pleading face"),

    /**
     * Face holding back tears.
     */
    FACE_HOLDING_BACK_TEARS(EmojiCategory.SMILEYS_EMOTION,86L,"U+1F979","face holding back tears"),

    /**
     * Frowning face with open mouth.
     */
    FROWNING_FACE_WITH_OPEN_MOUTH(EmojiCategory.SMILEYS_EMOTION,87L,"U+1F626","frowning face with open mouth"),

    /**
     * Anguished face.
     */
    ANGUISHED_FACE(EmojiCategory.SMILEYS_EMOTION,88L,"U+1F627","anguished face"),

    /**
     * Fearful face.
     */
    FEARFUL_FACE(EmojiCategory.SMILEYS_EMOTION,89L,"U+1F628","fearful face"),

    /**
     * Anxious face with sweat.
     */
    ANXIOUS_FACE_WITH_SWEAT(EmojiCategory.SMILEYS_EMOTION,90L,"U+1F630","anxious face with sweat"),

    /**
     * Sad but relieved face.
     */
    SAD_BUT_RELIEVED_FACE(EmojiCategory.SMILEYS_EMOTION,91L,"U+1F625","sad but relieved face"),

    /**
     * Crying face.
     */
    CRYING_FACE(EmojiCategory.SMILEYS_EMOTION,92L,"U+1F622","crying face"),

    /**
     * Loudly crying face.
     */
    LOUDLY_CRYING_FACE(EmojiCategory.SMILEYS_EMOTION,93L,"U+1F62D","loudly crying face"),

    /**
     * Face screaming in fear.
     */
    FACE_SCREAMING_IN_FEAR(EmojiCategory.SMILEYS_EMOTION,94L,"U+1F631","face screaming in fear"),

    /**
     * Confounded face.
     */
    CONFOUNDED_FACE(EmojiCategory.SMILEYS_EMOTION,95L,"U+1F616","confounded face"),

    /**
     * Persevering face.
     */
    PERSEVERING_FACE(EmojiCategory.SMILEYS_EMOTION,96L,"U+1F623","persevering face"),

    /**
     * Disappointed face.
     */
    DISAPPOINTED_FACE(EmojiCategory.SMILEYS_EMOTION,97L,"U+1F61E","disappointed face"),

    /**
     * Downcast face with sweat.
     */
    DOWNCAST_FACE_WITH_SWEAT(EmojiCategory.SMILEYS_EMOTION,98L,"U+1F613","downcast face with sweat"),

    /**
     * Weary face.
     */
    WEARY_FACE(EmojiCategory.SMILEYS_EMOTION,99L,"U+1F629","weary face"),

    /**
     * Tired face.
     */
    TIRED_FACE(EmojiCategory.SMILEYS_EMOTION,100L,"U+1F62B","tired face"),

    /**
     * Yawning face.
     */
    YAWNING_FACE(EmojiCategory.SMILEYS_EMOTION,101L,"U+1F971","yawning face");

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
    EmojiFaceConcernedSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
