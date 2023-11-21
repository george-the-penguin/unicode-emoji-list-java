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
 * Unicode Emoji Sub-Category: Household.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiHouseholdSubCategory {

    /**
     * Door.
     */
    DOOR(EmojiCategory.OBJECTS,1377L,"U+1F6AA","door"),

    /**
     * Elevator.
     */
    ELEVATOR(EmojiCategory.OBJECTS,1378L,"U+1F6D7","elevator"),

    /**
     * Mirror.
     */
    MIRROR(EmojiCategory.OBJECTS,1379L,"U+1FA9E","mirror"),

    /**
     * Window.
     */
    WINDOW(EmojiCategory.OBJECTS,1380L,"U+1FA9F","window"),

    /**
     * Bed.
     */
    BED(EmojiCategory.OBJECTS,1381L,"U+1F6CF","bed"),

    /**
     * Couch and lamp.
     */
    COUCH_AND_LAMP(EmojiCategory.OBJECTS,1382L,"U+1F6CB","couch and lamp"),

    /**
     * Chair.
     */
    CHAIR(EmojiCategory.OBJECTS,1383L,"U+1FA91","chair"),

    /**
     * Toilet.
     */
    TOILET(EmojiCategory.OBJECTS,1384L,"U+1F6BD","toilet"),

    /**
     * Plunger.
     */
    PLUNGER(EmojiCategory.OBJECTS,1385L,"U+1FAA0","plunger"),

    /**
     * Shower.
     */
    SHOWER(EmojiCategory.OBJECTS,1386L,"U+1F6BF","shower"),

    /**
     * Bathtub.
     */
    BATHTUB(EmojiCategory.OBJECTS,1387L,"U+1F6C1","bathtub"),

    /**
     * Mouse trap.
     */
    MOUSE_TRAP(EmojiCategory.OBJECTS,1388L,"U+1FAA4","mouse trap"),

    /**
     * Razor.
     */
    RAZOR(EmojiCategory.OBJECTS,1389L,"U+1FA92","razor"),

    /**
     * Lotion bottle.
     */
    LOTION_BOTTLE(EmojiCategory.OBJECTS,1390L,"U+1F9F4","lotion bottle"),

    /**
     * Safety pin.
     */
    SAFETY_PIN(EmojiCategory.OBJECTS,1391L,"U+1F9F7","safety pin"),

    /**
     * Broom.
     */
    BROOM(EmojiCategory.OBJECTS,1392L,"U+1F9F9","broom"),

    /**
     * Basket.
     */
    BASKET(EmojiCategory.OBJECTS,1393L,"U+1F9FA","basket"),

    /**
     * Roll of paper.
     */
    ROLL_OF_PAPER(EmojiCategory.OBJECTS,1394L,"U+1F9FB","roll of paper"),

    /**
     * Bucket.
     */
    BUCKET(EmojiCategory.OBJECTS,1395L,"U+1FAA3","bucket"),

    /**
     * Soap.
     */
    SOAP(EmojiCategory.OBJECTS,1396L,"U+1F9FC","soap"),

    /**
     * Bubbles.
     */
    BUBBLES(EmojiCategory.OBJECTS,1397L,"U+1FAE7","bubbles"),

    /**
     * Toothbrush.
     */
    TOOTHBRUSH(EmojiCategory.OBJECTS,1398L,"U+1FAA5","toothbrush"),

    /**
     * Sponge.
     */
    SPONGE(EmojiCategory.OBJECTS,1399L,"U+1F9FD","sponge"),

    /**
     * Fire extinguisher.
     */
    FIRE_EXTINGUISHER(EmojiCategory.OBJECTS,1400L,"U+1F9EF","fire extinguisher"),

    /**
     * Shopping cart.
     */
    SHOPPING_CART(EmojiCategory.OBJECTS,1401L,"U+1F6D2","shopping cart");

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
    EmojiHouseholdSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
