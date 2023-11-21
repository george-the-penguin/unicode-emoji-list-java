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
 * Unicode Emoji Sub-Category: Heart.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiHeartSubCategory {

    /**
     * Love letter.
     */
    LOVE_LETTER(EmojiCategory.SMILEYS_EMOTION,130L,"U+1F48C","love letter"),

    /**
     * Heart with arrow.
     */
    HEART_WITH_ARROW(EmojiCategory.SMILEYS_EMOTION,131L,"U+1F498","heart with arrow"),

    /**
     * Heart with ribbon.
     */
    HEART_WITH_RIBBON(EmojiCategory.SMILEYS_EMOTION,132L,"U+1F49D","heart with ribbon"),

    /**
     * Sparkling heart.
     */
    SPARKLING_HEART(EmojiCategory.SMILEYS_EMOTION,133L,"U+1F496","sparkling heart"),

    /**
     * Growing heart.
     */
    GROWING_HEART(EmojiCategory.SMILEYS_EMOTION,134L,"U+1F497","growing heart"),

    /**
     * Beating heart.
     */
    BEATING_HEART(EmojiCategory.SMILEYS_EMOTION,135L,"U+1F493","beating heart"),

    /**
     * Revolving hearts.
     */
    REVOLVING_HEARTS(EmojiCategory.SMILEYS_EMOTION,136L,"U+1F49E","revolving hearts"),

    /**
     * Two hearts.
     */
    TWO_HEARTS(EmojiCategory.SMILEYS_EMOTION,137L,"U+1F495","two hearts"),

    /**
     * Heart decoration.
     */
    HEART_DECORATION(EmojiCategory.SMILEYS_EMOTION,138L,"U+1F49F","heart decoration"),

    /**
     * Heart exclamation.
     */
    HEART_EXCLAMATION(EmojiCategory.SMILEYS_EMOTION,139L,"U+2763","heart exclamation"),

    /**
     * Broken heart.
     */
    BROKEN_HEART(EmojiCategory.SMILEYS_EMOTION,140L,"U+1F494","broken heart"),

    /**
     * Heart on fire.
     */
    HEART_ON_FIRE(EmojiCategory.SMILEYS_EMOTION,141L,"U+2764 U+FE0F U+200D U+1F525","heart on fire"),

    /**
     * Mending heart.
     */
    MENDING_HEART(EmojiCategory.SMILEYS_EMOTION,142L,"U+2764 U+FE0F U+200D U+1FA79","mending heart"),

    /**
     * Red heart.
     */
    RED_HEART(EmojiCategory.SMILEYS_EMOTION,143L,"U+2764","red heart"),

    /**
     * Pink heart.
     */
    PINK_HEART(EmojiCategory.SMILEYS_EMOTION,144L,"U+1FA77","pink heart"),

    /**
     * Orange heart.
     */
    ORANGE_HEART(EmojiCategory.SMILEYS_EMOTION,145L,"U+1F9E1","orange heart"),

    /**
     * Yellow heart.
     */
    YELLOW_HEART(EmojiCategory.SMILEYS_EMOTION,146L,"U+1F49B","yellow heart"),

    /**
     * Green heart.
     */
    GREEN_HEART(EmojiCategory.SMILEYS_EMOTION,147L,"U+1F49A","green heart"),

    /**
     * Blue heart.
     */
    BLUE_HEART(EmojiCategory.SMILEYS_EMOTION,148L,"U+1F499","blue heart"),

    /**
     * Light blue heart.
     */
    LIGHT_BLUE_HEART(EmojiCategory.SMILEYS_EMOTION,149L,"U+1FA75","light blue heart"),

    /**
     * Purple heart.
     */
    PURPLE_HEART(EmojiCategory.SMILEYS_EMOTION,150L,"U+1F49C","purple heart"),

    /**
     * Brown heart.
     */
    BROWN_HEART(EmojiCategory.SMILEYS_EMOTION,151L,"U+1F90E","brown heart"),

    /**
     * Black heart.
     */
    BLACK_HEART(EmojiCategory.SMILEYS_EMOTION,152L,"U+1F5A4","black heart"),

    /**
     * Grey heart.
     */
    GREY_HEART(EmojiCategory.SMILEYS_EMOTION,153L,"U+1FA76","grey heart"),

    /**
     * White heart.
     */
    WHITE_HEART(EmojiCategory.SMILEYS_EMOTION,154L,"U+1F90D","white heart");

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
    EmojiHeartSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
