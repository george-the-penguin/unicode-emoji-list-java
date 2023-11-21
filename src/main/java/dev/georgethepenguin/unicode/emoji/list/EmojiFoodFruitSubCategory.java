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
 * Unicode Emoji Sub-Category: Food Fruit.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFoodFruitSubCategory {

    /**
     * Grapes.
     */
    GRAPES(EmojiCategory.FOOD_DRINK,711L,"U+1F347","grapes"),

    /**
     * Melon.
     */
    MELON(EmojiCategory.FOOD_DRINK,712L,"U+1F348","melon"),

    /**
     * Watermelon.
     */
    WATERMELON(EmojiCategory.FOOD_DRINK,713L,"U+1F349","watermelon"),

    /**
     * Tangerine.
     */
    TANGERINE(EmojiCategory.FOOD_DRINK,714L,"U+1F34A","tangerine"),

    /**
     * Lemon.
     */
    LEMON(EmojiCategory.FOOD_DRINK,715L,"U+1F34B","lemon"),

    /**
     * Lime.
     */
    LIME(EmojiCategory.FOOD_DRINK,716L,"U+1F34B U+200D U+1F7E9","lime"),

    /**
     * Banana.
     */
    BANANA(EmojiCategory.FOOD_DRINK,717L,"U+1F34C","banana"),

    /**
     * Pineapple.
     */
    PINEAPPLE(EmojiCategory.FOOD_DRINK,718L,"U+1F34D","pineapple"),

    /**
     * Mango.
     */
    MANGO(EmojiCategory.FOOD_DRINK,719L,"U+1F96D","mango"),

    /**
     * Red apple.
     */
    RED_APPLE(EmojiCategory.FOOD_DRINK,720L,"U+1F34E","red apple"),

    /**
     * Green apple.
     */
    GREEN_APPLE(EmojiCategory.FOOD_DRINK,721L,"U+1F34F","green apple"),

    /**
     * Pear.
     */
    PEAR(EmojiCategory.FOOD_DRINK,722L,"U+1F350","pear"),

    /**
     * Peach.
     */
    PEACH(EmojiCategory.FOOD_DRINK,723L,"U+1F351","peach"),

    /**
     * Cherries.
     */
    CHERRIES(EmojiCategory.FOOD_DRINK,724L,"U+1F352","cherries"),

    /**
     * Strawberry.
     */
    STRAWBERRY(EmojiCategory.FOOD_DRINK,725L,"U+1F353","strawberry"),

    /**
     * Blueberries.
     */
    BLUEBERRIES(EmojiCategory.FOOD_DRINK,726L,"U+1FAD0","blueberries"),

    /**
     * Kiwi fruit.
     */
    KIWI_FRUIT(EmojiCategory.FOOD_DRINK,727L,"U+1F95D","kiwi fruit"),

    /**
     * Tomato.
     */
    TOMATO(EmojiCategory.FOOD_DRINK,728L,"U+1F345","tomato"),

    /**
     * Olive.
     */
    OLIVE(EmojiCategory.FOOD_DRINK,729L,"U+1FAD2","olive"),

    /**
     * Coconut.
     */
    COCONUT(EmojiCategory.FOOD_DRINK,730L,"U+1F965","coconut");

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
    EmojiFoodFruitSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
