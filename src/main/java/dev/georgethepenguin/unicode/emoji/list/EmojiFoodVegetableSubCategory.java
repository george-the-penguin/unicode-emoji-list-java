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
 * Unicode Emoji Sub-Category: Food Vegetable.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFoodVegetableSubCategory {

    /**
     * Avocado.
     */
    AVOCADO(EmojiCategory.FOOD_DRINK,731L,"U+1F951","avocado"),

    /**
     * Eggplant.
     */
    EGGPLANT(EmojiCategory.FOOD_DRINK,732L,"U+1F346","eggplant"),

    /**
     * Potato.
     */
    POTATO(EmojiCategory.FOOD_DRINK,733L,"U+1F954","potato"),

    /**
     * Carrot.
     */
    CARROT(EmojiCategory.FOOD_DRINK,734L,"U+1F955","carrot"),

    /**
     * Ear of corn.
     */
    EAR_OF_CORN(EmojiCategory.FOOD_DRINK,735L,"U+1F33D","ear of corn"),

    /**
     * Hot pepper.
     */
    HOT_PEPPER(EmojiCategory.FOOD_DRINK,736L,"U+1F336","hot pepper"),

    /**
     * Bell pepper.
     */
    BELL_PEPPER(EmojiCategory.FOOD_DRINK,737L,"U+1FAD1","bell pepper"),

    /**
     * Cucumber.
     */
    CUCUMBER(EmojiCategory.FOOD_DRINK,738L,"U+1F952","cucumber"),

    /**
     * Leafy green.
     */
    LEAFY_GREEN(EmojiCategory.FOOD_DRINK,739L,"U+1F96C","leafy green"),

    /**
     * Broccoli.
     */
    BROCCOLI(EmojiCategory.FOOD_DRINK,740L,"U+1F966","broccoli"),

    /**
     * Garlic.
     */
    GARLIC(EmojiCategory.FOOD_DRINK,741L,"U+1F9C4","garlic"),

    /**
     * Onion.
     */
    ONION(EmojiCategory.FOOD_DRINK,742L,"U+1F9C5","onion"),

    /**
     * Peanuts.
     */
    PEANUTS(EmojiCategory.FOOD_DRINK,743L,"U+1F95C","peanuts"),

    /**
     * Beans.
     */
    BEANS(EmojiCategory.FOOD_DRINK,744L,"U+1FAD8","beans"),

    /**
     * Chestnut.
     */
    CHESTNUT(EmojiCategory.FOOD_DRINK,745L,"U+1F330","chestnut"),

    /**
     * Ginger root.
     */
    GINGER_ROOT(EmojiCategory.FOOD_DRINK,746L,"U+1FADA","ginger root"),

    /**
     * Pea pod.
     */
    PEA_POD(EmojiCategory.FOOD_DRINK,747L,"U+1FADB","pea pod"),

    /**
     * Brown mushroom.
     */
    BROWN_MUSHROOM(EmojiCategory.FOOD_DRINK,748L,"U+1F344 U+200D U+1F7EB","brown mushroom");

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
    EmojiFoodVegetableSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
