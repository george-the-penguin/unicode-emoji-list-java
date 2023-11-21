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
 * Unicode Emoji Sub-Category: Animal Bug.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiAnimalBugSubCategory {

    /**
     * Snail.
     */
    SNAIL(EmojiCategory.ANIMALS_NATURE,667L,"U+1F40C","snail"),

    /**
     * Butterfly.
     */
    BUTTERFLY(EmojiCategory.ANIMALS_NATURE,668L,"U+1F98B","butterfly"),

    /**
     * Bug.
     */
    BUG(EmojiCategory.ANIMALS_NATURE,669L,"U+1F41B","bug"),

    /**
     * Ant.
     */
    ANT(EmojiCategory.ANIMALS_NATURE,670L,"U+1F41C","ant"),

    /**
     * Honeybee.
     */
    HONEYBEE(EmojiCategory.ANIMALS_NATURE,671L,"U+1F41D","honeybee"),

    /**
     * Beetle.
     */
    BEETLE(EmojiCategory.ANIMALS_NATURE,672L,"U+1FAB2","beetle"),

    /**
     * Lady beetle.
     */
    LADY_BEETLE(EmojiCategory.ANIMALS_NATURE,673L,"U+1F41E","lady beetle"),

    /**
     * Cricket.
     */
    CRICKET(EmojiCategory.ANIMALS_NATURE,674L,"U+1F997","cricket"),

    /**
     * Cockroach.
     */
    COCKROACH(EmojiCategory.ANIMALS_NATURE,675L,"U+1FAB3","cockroach"),

    /**
     * Spider.
     */
    SPIDER(EmojiCategory.ANIMALS_NATURE,676L,"U+1F577","spider"),

    /**
     * Spider web.
     */
    SPIDER_WEB(EmojiCategory.ANIMALS_NATURE,677L,"U+1F578","spider web"),

    /**
     * Scorpion.
     */
    SCORPION(EmojiCategory.ANIMALS_NATURE,678L,"U+1F982","scorpion"),

    /**
     * Mosquito.
     */
    MOSQUITO(EmojiCategory.ANIMALS_NATURE,679L,"U+1F99F","mosquito"),

    /**
     * Fly.
     */
    FLY(EmojiCategory.ANIMALS_NATURE,680L,"U+1FAB0","fly"),

    /**
     * Worm.
     */
    WORM(EmojiCategory.ANIMALS_NATURE,681L,"U+1FAB1","worm"),

    /**
     * Microbe.
     */
    MICROBE(EmojiCategory.ANIMALS_NATURE,682L,"U+1F9A0","microbe");

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
    EmojiAnimalBugSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
