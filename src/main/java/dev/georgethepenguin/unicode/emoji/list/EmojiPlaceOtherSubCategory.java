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
 * Unicode Emoji Sub-Category: Place Other.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiPlaceOtherSubCategory {

    /**
     * Fountain.
     */
    FOUNTAIN(EmojiCategory.TRAVEL_PLACES,895L,"U+26F2","fountain"),

    /**
     * Tent.
     */
    TENT(EmojiCategory.TRAVEL_PLACES,896L,"U+26FA","tent"),

    /**
     * Foggy.
     */
    FOGGY(EmojiCategory.TRAVEL_PLACES,897L,"U+1F301","foggy"),

    /**
     * Night with stars.
     */
    NIGHT_WITH_STARS(EmojiCategory.TRAVEL_PLACES,898L,"U+1F303","night with stars"),

    /**
     * Cityscape.
     */
    CITYSCAPE(EmojiCategory.TRAVEL_PLACES,899L,"U+1F3D9","cityscape"),

    /**
     * Sunrise over mountains.
     */
    SUNRISE_OVER_MOUNTAINS(EmojiCategory.TRAVEL_PLACES,900L,"U+1F304","sunrise over mountains"),

    /**
     * Sunrise.
     */
    SUNRISE(EmojiCategory.TRAVEL_PLACES,901L,"U+1F305","sunrise"),

    /**
     * Cityscape at dusk.
     */
    CITYSCAPE_AT_DUSK(EmojiCategory.TRAVEL_PLACES,902L,"U+1F306","cityscape at dusk"),

    /**
     * Sunset.
     */
    SUNSET(EmojiCategory.TRAVEL_PLACES,903L,"U+1F307","sunset"),

    /**
     * Bridge at night.
     */
    BRIDGE_AT_NIGHT(EmojiCategory.TRAVEL_PLACES,904L,"U+1F309","bridge at night"),

    /**
     * Hot springs.
     */
    HOT_SPRINGS(EmojiCategory.TRAVEL_PLACES,905L,"U+2668","hot springs"),

    /**
     * Carousel horse.
     */
    CAROUSEL_HORSE(EmojiCategory.TRAVEL_PLACES,906L,"U+1F3A0","carousel horse"),

    /**
     * Playground slide.
     */
    PLAYGROUND_SLIDE(EmojiCategory.TRAVEL_PLACES,907L,"U+1F6DD","playground slide"),

    /**
     * Ferris wheel.
     */
    FERRIS_WHEEL(EmojiCategory.TRAVEL_PLACES,908L,"U+1F3A1","ferris wheel"),

    /**
     * Roller coaster.
     */
    ROLLER_COASTER(EmojiCategory.TRAVEL_PLACES,909L,"U+1F3A2","roller coaster"),

    /**
     * Barber pole.
     */
    BARBER_POLE(EmojiCategory.TRAVEL_PLACES,910L,"U+1F488","barber pole"),

    /**
     * Circus tent.
     */
    CIRCUS_TENT(EmojiCategory.TRAVEL_PLACES,911L,"U+1F3AA","circus tent");

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
    EmojiPlaceOtherSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
