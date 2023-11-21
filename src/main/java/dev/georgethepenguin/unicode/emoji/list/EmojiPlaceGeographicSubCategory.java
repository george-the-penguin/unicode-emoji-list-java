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
 * Unicode Emoji Sub-Category: Place Geographic.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiPlaceGeographicSubCategory {

    /**
     * Snow-capped mountain.
     */
    SNOW_CAPPED_MOUNTAIN(EmojiCategory.TRAVEL_PLACES,853L,"U+1F3D4","snow-capped mountain"),

    /**
     * Mountain.
     */
    MOUNTAIN(EmojiCategory.TRAVEL_PLACES,854L,"U+26F0","mountain"),

    /**
     * Volcano.
     */
    VOLCANO(EmojiCategory.TRAVEL_PLACES,855L,"U+1F30B","volcano"),

    /**
     * Mount fuji.
     */
    MOUNT_FUJI(EmojiCategory.TRAVEL_PLACES,856L,"U+1F5FB","mount fuji"),

    /**
     * Camping.
     */
    CAMPING(EmojiCategory.TRAVEL_PLACES,857L,"U+1F3D5","camping"),

    /**
     * Beach with umbrella.
     */
    BEACH_WITH_UMBRELLA(EmojiCategory.TRAVEL_PLACES,858L,"U+1F3D6","beach with umbrella"),

    /**
     * Desert.
     */
    DESERT(EmojiCategory.TRAVEL_PLACES,859L,"U+1F3DC","desert"),

    /**
     * Desert island.
     */
    DESERT_ISLAND(EmojiCategory.TRAVEL_PLACES,860L,"U+1F3DD","desert island"),

    /**
     * National park.
     */
    NATIONAL_PARK(EmojiCategory.TRAVEL_PLACES,861L,"U+1F3DE","national park");

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
    EmojiPlaceGeographicSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
