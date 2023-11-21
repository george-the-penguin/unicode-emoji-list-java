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
 * Unicode Emoji Sub-Category: Food Sweet.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFoodSweetSubCategory {

    /**
     * Soft ice cream.
     */
    SOFT_ICE_CREAM(EmojiCategory.FOOD_DRINK,805L,"U+1F366","soft ice cream"),

    /**
     * Shaved ice.
     */
    SHAVED_ICE(EmojiCategory.FOOD_DRINK,806L,"U+1F367","shaved ice"),

    /**
     * Ice cream.
     */
    ICE_CREAM(EmojiCategory.FOOD_DRINK,807L,"U+1F368","ice cream"),

    /**
     * Doughnut.
     */
    DOUGHNUT(EmojiCategory.FOOD_DRINK,808L,"U+1F369","doughnut"),

    /**
     * Cookie.
     */
    COOKIE(EmojiCategory.FOOD_DRINK,809L,"U+1F36A","cookie"),

    /**
     * Birthday cake.
     */
    BIRTHDAY_CAKE(EmojiCategory.FOOD_DRINK,810L,"U+1F382","birthday cake"),

    /**
     * Shortcake.
     */
    SHORTCAKE(EmojiCategory.FOOD_DRINK,811L,"U+1F370","shortcake"),

    /**
     * Cupcake.
     */
    CUPCAKE(EmojiCategory.FOOD_DRINK,812L,"U+1F9C1","cupcake"),

    /**
     * Pie.
     */
    PIE(EmojiCategory.FOOD_DRINK,813L,"U+1F967","pie"),

    /**
     * Chocolate bar.
     */
    CHOCOLATE_BAR(EmojiCategory.FOOD_DRINK,814L,"U+1F36B","chocolate bar"),

    /**
     * Candy.
     */
    CANDY(EmojiCategory.FOOD_DRINK,815L,"U+1F36C","candy"),

    /**
     * Lollipop.
     */
    LOLLIPOP(EmojiCategory.FOOD_DRINK,816L,"U+1F36D","lollipop"),

    /**
     * Custard.
     */
    CUSTARD(EmojiCategory.FOOD_DRINK,817L,"U+1F36E","custard"),

    /**
     * Honey pot.
     */
    HONEY_POT(EmojiCategory.FOOD_DRINK,818L,"U+1F36F","honey pot");

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
    EmojiFoodSweetSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
