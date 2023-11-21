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
 * Unicode Emoji Sub-Category: Food Prepared.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiFoodPreparedSubCategory {

    /**
     * Bread.
     */
    BREAD(EmojiCategory.FOOD_DRINK,749L,"U+1F35E","bread"),

    /**
     * Croissant.
     */
    CROISSANT(EmojiCategory.FOOD_DRINK,750L,"U+1F950","croissant"),

    /**
     * Baguette bread.
     */
    BAGUETTE_BREAD(EmojiCategory.FOOD_DRINK,751L,"U+1F956","baguette bread"),

    /**
     * Flatbread.
     */
    FLATBREAD(EmojiCategory.FOOD_DRINK,752L,"U+1FAD3","flatbread"),

    /**
     * Pretzel.
     */
    PRETZEL(EmojiCategory.FOOD_DRINK,753L,"U+1F968","pretzel"),

    /**
     * Bagel.
     */
    BAGEL(EmojiCategory.FOOD_DRINK,754L,"U+1F96F","bagel"),

    /**
     * Pancakes.
     */
    PANCAKES(EmojiCategory.FOOD_DRINK,755L,"U+1F95E","pancakes"),

    /**
     * Waffle.
     */
    WAFFLE(EmojiCategory.FOOD_DRINK,756L,"U+1F9C7","waffle"),

    /**
     * Cheese wedge.
     */
    CHEESE_WEDGE(EmojiCategory.FOOD_DRINK,757L,"U+1F9C0","cheese wedge"),

    /**
     * Meat on bone.
     */
    MEAT_ON_BONE(EmojiCategory.FOOD_DRINK,758L,"U+1F356","meat on bone"),

    /**
     * Poultry leg.
     */
    POULTRY_LEG(EmojiCategory.FOOD_DRINK,759L,"U+1F357","poultry leg"),

    /**
     * Cut of meat.
     */
    CUT_OF_MEAT(EmojiCategory.FOOD_DRINK,760L,"U+1F969","cut of meat"),

    /**
     * Bacon.
     */
    BACON(EmojiCategory.FOOD_DRINK,761L,"U+1F953","bacon"),

    /**
     * Hamburger.
     */
    HAMBURGER(EmojiCategory.FOOD_DRINK,762L,"U+1F354","hamburger"),

    /**
     * French fries.
     */
    FRENCH_FRIES(EmojiCategory.FOOD_DRINK,763L,"U+1F35F","french fries"),

    /**
     * Pizza.
     */
    PIZZA(EmojiCategory.FOOD_DRINK,764L,"U+1F355","pizza"),

    /**
     * Hot dog.
     */
    HOT_DOG(EmojiCategory.FOOD_DRINK,765L,"U+1F32D","hot dog"),

    /**
     * Sandwich.
     */
    SANDWICH(EmojiCategory.FOOD_DRINK,766L,"U+1F96A","sandwich"),

    /**
     * Taco.
     */
    TACO(EmojiCategory.FOOD_DRINK,767L,"U+1F32E","taco"),

    /**
     * Burrito.
     */
    BURRITO(EmojiCategory.FOOD_DRINK,768L,"U+1F32F","burrito"),

    /**
     * Tamale.
     */
    TAMALE(EmojiCategory.FOOD_DRINK,769L,"U+1FAD4","tamale"),

    /**
     * Stuffed flatbread.
     */
    STUFFED_FLATBREAD(EmojiCategory.FOOD_DRINK,770L,"U+1F959","stuffed flatbread"),

    /**
     * Falafel.
     */
    FALAFEL(EmojiCategory.FOOD_DRINK,771L,"U+1F9C6","falafel"),

    /**
     * Egg.
     */
    EGG(EmojiCategory.FOOD_DRINK,772L,"U+1F95A","egg"),

    /**
     * Cooking.
     */
    COOKING(EmojiCategory.FOOD_DRINK,773L,"U+1F373","cooking"),

    /**
     * Shallow pan of food.
     */
    SHALLOW_PAN_OF_FOOD(EmojiCategory.FOOD_DRINK,774L,"U+1F958","shallow pan of food"),

    /**
     * Pot of food.
     */
    POT_OF_FOOD(EmojiCategory.FOOD_DRINK,775L,"U+1F372","pot of food"),

    /**
     * Fondue.
     */
    FONDUE(EmojiCategory.FOOD_DRINK,776L,"U+1FAD5","fondue"),

    /**
     * Bowl with spoon.
     */
    BOWL_WITH_SPOON(EmojiCategory.FOOD_DRINK,777L,"U+1F963","bowl with spoon"),

    /**
     * Green salad.
     */
    GREEN_SALAD(EmojiCategory.FOOD_DRINK,778L,"U+1F957","green salad"),

    /**
     * Popcorn.
     */
    POPCORN(EmojiCategory.FOOD_DRINK,779L,"U+1F37F","popcorn"),

    /**
     * Butter.
     */
    BUTTER(EmojiCategory.FOOD_DRINK,780L,"U+1F9C8","butter"),

    /**
     * Salt.
     */
    SALT(EmojiCategory.FOOD_DRINK,781L,"U+1F9C2","salt"),

    /**
     * Canned food.
     */
    CANNED_FOOD(EmojiCategory.FOOD_DRINK,782L,"U+1F96B","canned food");

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
    EmojiFoodPreparedSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
