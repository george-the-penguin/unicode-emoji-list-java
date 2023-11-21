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
 * Unicode Emoji Sub-Category: Plant Other.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiPlantOtherSubCategory {

    /**
     * Seedling.
     */
    SEEDLING(EmojiCategory.ANIMALS_NATURE,695L,"U+1F331","seedling"),

    /**
     * Potted plant.
     */
    POTTED_PLANT(EmojiCategory.ANIMALS_NATURE,696L,"U+1FAB4","potted plant"),

    /**
     * Evergreen tree.
     */
    EVERGREEN_TREE(EmojiCategory.ANIMALS_NATURE,697L,"U+1F332","evergreen tree"),

    /**
     * Deciduous tree.
     */
    DECIDUOUS_TREE(EmojiCategory.ANIMALS_NATURE,698L,"U+1F333","deciduous tree"),

    /**
     * Palm tree.
     */
    PALM_TREE(EmojiCategory.ANIMALS_NATURE,699L,"U+1F334","palm tree"),

    /**
     * Cactus.
     */
    CACTUS(EmojiCategory.ANIMALS_NATURE,700L,"U+1F335","cactus"),

    /**
     * Sheaf of rice.
     */
    SHEAF_OF_RICE(EmojiCategory.ANIMALS_NATURE,701L,"U+1F33E","sheaf of rice"),

    /**
     * Herb.
     */
    HERB(EmojiCategory.ANIMALS_NATURE,702L,"U+1F33F","herb"),

    /**
     * Shamrock.
     */
    SHAMROCK(EmojiCategory.ANIMALS_NATURE,703L,"U+2618","shamrock"),

    /**
     * Four leaf clover.
     */
    FOUR_LEAF_CLOVER(EmojiCategory.ANIMALS_NATURE,704L,"U+1F340","four leaf clover"),

    /**
     * Maple leaf.
     */
    MAPLE_LEAF(EmojiCategory.ANIMALS_NATURE,705L,"U+1F341","maple leaf"),

    /**
     * Fallen leaf.
     */
    FALLEN_LEAF(EmojiCategory.ANIMALS_NATURE,706L,"U+1F342","fallen leaf"),

    /**
     * Leaf fluttering in wind.
     */
    LEAF_FLUTTERING_IN_WIND(EmojiCategory.ANIMALS_NATURE,707L,"U+1F343","leaf fluttering in wind"),

    /**
     * Empty nest.
     */
    EMPTY_NEST(EmojiCategory.ANIMALS_NATURE,708L,"U+1FAB9","empty nest"),

    /**
     * Nest with eggs.
     */
    NEST_WITH_EGGS(EmojiCategory.ANIMALS_NATURE,709L,"U+1FABA","nest with eggs"),

    /**
     * Mushroom.
     */
    MUSHROOM(EmojiCategory.ANIMALS_NATURE,710L,"U+1F344","mushroom");

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
    EmojiPlantOtherSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
