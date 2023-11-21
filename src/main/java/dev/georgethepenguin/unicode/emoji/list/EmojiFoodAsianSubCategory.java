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
 * Unicode Emoji Sub-Category: Food Asian.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFoodAsianSubCategory {

    /**
     * Bento box.
     */
    BENTO_BOX(EmojiCategory.FOOD_DRINK,783L,"U+1F371","bento box"),

    /**
     * Rice cracker.
     */
    RICE_CRACKER(EmojiCategory.FOOD_DRINK,784L,"U+1F358","rice cracker"),

    /**
     * Rice ball.
     */
    RICE_BALL(EmojiCategory.FOOD_DRINK,785L,"U+1F359","rice ball"),

    /**
     * Cooked rice.
     */
    COOKED_RICE(EmojiCategory.FOOD_DRINK,786L,"U+1F35A","cooked rice"),

    /**
     * Curry rice.
     */
    CURRY_RICE(EmojiCategory.FOOD_DRINK,787L,"U+1F35B","curry rice"),

    /**
     * Steaming bowl.
     */
    STEAMING_BOWL(EmojiCategory.FOOD_DRINK,788L,"U+1F35C","steaming bowl"),

    /**
     * Spaghetti.
     */
    SPAGHETTI(EmojiCategory.FOOD_DRINK,789L,"U+1F35D","spaghetti"),

    /**
     * Roasted sweet potato.
     */
    ROASTED_SWEET_POTATO(EmojiCategory.FOOD_DRINK,790L,"U+1F360","roasted sweet potato"),

    /**
     * Oden.
     */
    ODEN(EmojiCategory.FOOD_DRINK,791L,"U+1F362","oden"),

    /**
     * Sushi.
     */
    SUSHI(EmojiCategory.FOOD_DRINK,792L,"U+1F363","sushi"),

    /**
     * Fried shrimp.
     */
    FRIED_SHRIMP(EmojiCategory.FOOD_DRINK,793L,"U+1F364","fried shrimp"),

    /**
     * Fish cake with swirl.
     */
    FISH_CAKE_WITH_SWIRL(EmojiCategory.FOOD_DRINK,794L,"U+1F365","fish cake with swirl"),

    /**
     * Moon cake.
     */
    MOON_CAKE(EmojiCategory.FOOD_DRINK,795L,"U+1F96E","moon cake"),

    /**
     * Dango.
     */
    DANGO(EmojiCategory.FOOD_DRINK,796L,"U+1F361","dango"),

    /**
     * Dumpling.
     */
    DUMPLING(EmojiCategory.FOOD_DRINK,797L,"U+1F95F","dumpling"),

    /**
     * Fortune cookie.
     */
    FORTUNE_COOKIE(EmojiCategory.FOOD_DRINK,798L,"U+1F960","fortune cookie"),

    /**
     * Takeout box.
     */
    TAKEOUT_BOX(EmojiCategory.FOOD_DRINK,799L,"U+1F961","takeout box");

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
    EmojiFoodAsianSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
