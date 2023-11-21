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
 * Unicode Emoji Sub-Category: Other Object.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiOtherObjectSubCategory {

    /**
     * Cigarette.
     */
    CIGARETTE(EmojiCategory.OBJECTS,1402L,"U+1F6AC","cigarette"),

    /**
     * Coffin.
     */
    COFFIN(EmojiCategory.OBJECTS,1403L,"U+26B0","coffin"),

    /**
     * Headstone.
     */
    HEADSTONE(EmojiCategory.OBJECTS,1404L,"U+1FAA6","headstone"),

    /**
     * Funeral urn.
     */
    FUNERAL_URN(EmojiCategory.OBJECTS,1405L,"U+26B1","funeral urn"),

    /**
     * Nazar amulet.
     */
    NAZAR_AMULET(EmojiCategory.OBJECTS,1406L,"U+1F9FF","nazar amulet"),

    /**
     * Hamsa.
     */
    HAMSA(EmojiCategory.OBJECTS,1407L,"U+1FAAC","hamsa"),

    /**
     * Moai.
     */
    MOAI(EmojiCategory.OBJECTS,1408L,"U+1F5FF","moai"),

    /**
     * Placard.
     */
    PLACARD(EmojiCategory.OBJECTS,1409L,"U+1FAA7","placard"),

    /**
     * Identification card.
     */
    IDENTIFICATION_CARD(EmojiCategory.OBJECTS,1410L,"U+1FAAA","identification card");

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
    EmojiOtherObjectSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
