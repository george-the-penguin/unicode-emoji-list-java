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
 * Unicode Emoji Sub-Category: Drink.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiDrinkSubCategory {

    /**
     * Baby bottle.
     */
    BABY_BOTTLE(EmojiCategory.FOOD_DRINK,819L,"U+1F37C","baby bottle"),

    /**
     * Glass of milk.
     */
    GLASS_OF_MILK(EmojiCategory.FOOD_DRINK,820L,"U+1F95B","glass of milk"),

    /**
     * Hot beverage.
     */
    HOT_BEVERAGE(EmojiCategory.FOOD_DRINK,821L,"U+2615","hot beverage"),

    /**
     * Teapot.
     */
    TEAPOT(EmojiCategory.FOOD_DRINK,822L,"U+1FAD6","teapot"),

    /**
     * Teacup without handle.
     */
    TEACUP_WITHOUT_HANDLE(EmojiCategory.FOOD_DRINK,823L,"U+1F375","teacup without handle"),

    /**
     * Sake.
     */
    SAKE(EmojiCategory.FOOD_DRINK,824L,"U+1F376","sake"),

    /**
     * Bottle with popping cork.
     */
    BOTTLE_WITH_POPPING_CORK(EmojiCategory.FOOD_DRINK,825L,"U+1F37E","bottle with popping cork"),

    /**
     * Wine glass.
     */
    WINE_GLASS(EmojiCategory.FOOD_DRINK,826L,"U+1F377","wine glass"),

    /**
     * Cocktail glass.
     */
    COCKTAIL_GLASS(EmojiCategory.FOOD_DRINK,827L,"U+1F378","cocktail glass"),

    /**
     * Tropical drink.
     */
    TROPICAL_DRINK(EmojiCategory.FOOD_DRINK,828L,"U+1F379","tropical drink"),

    /**
     * Beer mug.
     */
    BEER_MUG(EmojiCategory.FOOD_DRINK,829L,"U+1F37A","beer mug"),

    /**
     * Clinking beer mugs.
     */
    CLINKING_BEER_MUGS(EmojiCategory.FOOD_DRINK,830L,"U+1F37B","clinking beer mugs"),

    /**
     * Clinking glasses.
     */
    CLINKING_GLASSES(EmojiCategory.FOOD_DRINK,831L,"U+1F942","clinking glasses"),

    /**
     * Tumbler glass.
     */
    TUMBLER_GLASS(EmojiCategory.FOOD_DRINK,832L,"U+1F943","tumbler glass"),

    /**
     * Pouring liquid.
     */
    POURING_LIQUID(EmojiCategory.FOOD_DRINK,833L,"U+1FAD7","pouring liquid"),

    /**
     * Cup with straw.
     */
    CUP_WITH_STRAW(EmojiCategory.FOOD_DRINK,834L,"U+1F964","cup with straw"),

    /**
     * Bubble tea.
     */
    BUBBLE_TEA(EmojiCategory.FOOD_DRINK,835L,"U+1F9CB","bubble tea"),

    /**
     * Beverage box.
     */
    BEVERAGE_BOX(EmojiCategory.FOOD_DRINK,836L,"U+1F9C3","beverage box"),

    /**
     * Mate.
     */
    MATE(EmojiCategory.FOOD_DRINK,837L,"U+1F9C9","mate"),

    /**
     * Ice.
     */
    ICE(EmojiCategory.FOOD_DRINK,838L,"U+1F9CA","ice");

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
    EmojiDrinkSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
