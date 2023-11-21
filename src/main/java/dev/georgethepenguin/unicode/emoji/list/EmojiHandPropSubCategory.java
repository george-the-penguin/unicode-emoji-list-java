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
 * Unicode Emoji Sub-Category: Hand Prop.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiHandPropSubCategory {

    /**
     * Writing hand.
     */
    WRITING_HAND(EmojiCategory.PEOPLE_BODY,209L,"U+270D","writing hand"),

    /**
     * Nail polish.
     */
    NAIL_POLISH(EmojiCategory.PEOPLE_BODY,210L,"U+1F485","nail polish"),

    /**
     * Selfie.
     */
    SELFIE(EmojiCategory.PEOPLE_BODY,211L,"U+1F933","selfie"),

    /**
     * Writing hand: light skin tone.
     */
    WRITING_HAND_LIGHT_SKIN_TONE(EmojiCategory.PEOPLE_BODY,221L,"U+270D U+1F3FB","writing hand: light skin tone"),

    /**
     * Writing hand: medium-light skin tone.
     */
    WRITING_HAND_MEDIUM_LIGHT_SKIN_TONE(EmojiCategory.PEOPLE_BODY,222L,"U+270D U+1F3FC","writing hand: medium-light skin tone"),

    /**
     * Writing hand: medium skin tone.
     */
    WRITING_HAND_MEDIUM_SKIN_TONE(EmojiCategory.PEOPLE_BODY,223L,"U+270D U+1F3FD","writing hand: medium skin tone"),

    /**
     * Writing hand: medium-dark skin tone.
     */
    WRITING_HAND_MEDIUM_DARK_SKIN_TONE(EmojiCategory.PEOPLE_BODY,224L,"U+270D U+1F3FE","writing hand: medium-dark skin tone"),

    /**
     * Writing hand: dark skin tone.
     */
    WRITING_HAND_DARK_SKIN_TONE(EmojiCategory.PEOPLE_BODY,225L,"U+270D U+1F3FF","writing hand: dark skin tone"),

    /**
     * Nail polish: light skin tone.
     */
    NAIL_POLISH_LIGHT_SKIN_TONE(EmojiCategory.PEOPLE_BODY,226L,"U+1F485 U+1F3FB","nail polish: light skin tone"),

    /**
     * Nail polish: medium-light skin tone.
     */
    NAIL_POLISH_MEDIUM_LIGHT_SKIN_TONE(EmojiCategory.PEOPLE_BODY,227L,"U+1F485 U+1F3FC","nail polish: medium-light skin tone"),

    /**
     * Nail polish: medium skin tone.
     */
    NAIL_POLISH_MEDIUM_SKIN_TONE(EmojiCategory.PEOPLE_BODY,228L,"U+1F485 U+1F3FD","nail polish: medium skin tone"),

    /**
     * Nail polish: medium-dark skin tone.
     */
    NAIL_POLISH_MEDIUM_DARK_SKIN_TONE(EmojiCategory.PEOPLE_BODY,229L,"U+1F485 U+1F3FE","nail polish: medium-dark skin tone"),

    /**
     * Nail polish: dark skin tone.
     */
    NAIL_POLISH_DARK_SKIN_TONE(EmojiCategory.PEOPLE_BODY,230L,"U+1F485 U+1F3FF","nail polish: dark skin tone"),

    /**
     * Selfie: light skin tone.
     */
    SELFIE_LIGHT_SKIN_TONE(EmojiCategory.PEOPLE_BODY,231L,"U+1F933 U+1F3FB","selfie: light skin tone"),

    /**
     * Selfie: medium-light skin tone.
     */
    SELFIE_MEDIUM_LIGHT_SKIN_TONE(EmojiCategory.PEOPLE_BODY,232L,"U+1F933 U+1F3FC","selfie: medium-light skin tone"),

    /**
     * Selfie: medium skin tone.
     */
    SELFIE_MEDIUM_SKIN_TONE(EmojiCategory.PEOPLE_BODY,233L,"U+1F933 U+1F3FD","selfie: medium skin tone"),

    /**
     * Selfie: medium-dark skin tone.
     */
    SELFIE_MEDIUM_DARK_SKIN_TONE(EmojiCategory.PEOPLE_BODY,234L,"U+1F933 U+1F3FE","selfie: medium-dark skin tone"),

    /**
     * Selfie: dark skin tone.
     */
    SELFIE_DARK_SKIN_TONE(EmojiCategory.PEOPLE_BODY,235L,"U+1F933 U+1F3FF","selfie: dark skin tone");

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
    EmojiHandPropSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
