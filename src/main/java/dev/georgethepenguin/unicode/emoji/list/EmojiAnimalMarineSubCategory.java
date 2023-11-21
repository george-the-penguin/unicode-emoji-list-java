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
 * Unicode Emoji Sub-Category: Animal Marine.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiAnimalMarineSubCategory {

    /**
     * Spouting whale.
     */
    SPOUTING_WHALE(EmojiCategory.ANIMALS_NATURE,655L,"U+1F433","spouting whale"),

    /**
     * Whale.
     */
    WHALE(EmojiCategory.ANIMALS_NATURE,656L,"U+1F40B","whale"),

    /**
     * Dolphin.
     */
    DOLPHIN(EmojiCategory.ANIMALS_NATURE,657L,"U+1F42C","dolphin"),

    /**
     * Seal.
     */
    SEAL(EmojiCategory.ANIMALS_NATURE,658L,"U+1F9AD","seal"),

    /**
     * Fish.
     */
    FISH(EmojiCategory.ANIMALS_NATURE,659L,"U+1F41F","fish"),

    /**
     * Tropical fish.
     */
    TROPICAL_FISH(EmojiCategory.ANIMALS_NATURE,660L,"U+1F420","tropical fish"),

    /**
     * Blowfish.
     */
    BLOWFISH(EmojiCategory.ANIMALS_NATURE,661L,"U+1F421","blowfish"),

    /**
     * Shark.
     */
    SHARK(EmojiCategory.ANIMALS_NATURE,662L,"U+1F988","shark"),

    /**
     * Octopus.
     */
    OCTOPUS(EmojiCategory.ANIMALS_NATURE,663L,"U+1F419","octopus"),

    /**
     * Spiral shell.
     */
    SPIRAL_SHELL(EmojiCategory.ANIMALS_NATURE,664L,"U+1F41A","spiral shell"),

    /**
     * Coral.
     */
    CORAL(EmojiCategory.ANIMALS_NATURE,665L,"U+1FAB8","coral"),

    /**
     * Jellyfish.
     */
    JELLYFISH(EmojiCategory.ANIMALS_NATURE,666L,"U+1FABC","jellyfish");

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
    EmojiAnimalMarineSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
