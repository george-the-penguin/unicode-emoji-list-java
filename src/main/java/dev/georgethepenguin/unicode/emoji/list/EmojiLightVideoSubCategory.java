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
 * Unicode Emoji Sub-Category: Light & Video.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiLightVideoSubCategory {

    /**
     * Movie camera.
     */
    MOVIE_CAMERA(EmojiCategory.OBJECTS,1245L,"U+1F3A5","movie camera"),

    /**
     * Film frames.
     */
    FILM_FRAMES(EmojiCategory.OBJECTS,1246L,"U+1F39E","film frames"),

    /**
     * Film projector.
     */
    FILM_PROJECTOR(EmojiCategory.OBJECTS,1247L,"U+1F4FD","film projector"),

    /**
     * Clapper board.
     */
    CLAPPER_BOARD(EmojiCategory.OBJECTS,1248L,"U+1F3AC","clapper board"),

    /**
     * Television.
     */
    TELEVISION(EmojiCategory.OBJECTS,1249L,"U+1F4FA","television"),

    /**
     * Camera.
     */
    CAMERA(EmojiCategory.OBJECTS,1250L,"U+1F4F7","camera"),

    /**
     * Camera with flash.
     */
    CAMERA_WITH_FLASH(EmojiCategory.OBJECTS,1251L,"U+1F4F8","camera with flash"),

    /**
     * Video camera.
     */
    VIDEO_CAMERA(EmojiCategory.OBJECTS,1252L,"U+1F4F9","video camera"),

    /**
     * Videocassette.
     */
    VIDEOCASSETTE(EmojiCategory.OBJECTS,1253L,"U+1F4FC","videocassette"),

    /**
     * Magnifying glass tilted left.
     */
    MAGNIFYING_GLASS_TILTED_LEFT(EmojiCategory.OBJECTS,1254L,"U+1F50D","magnifying glass tilted left"),

    /**
     * Magnifying glass tilted right.
     */
    MAGNIFYING_GLASS_TILTED_RIGHT(EmojiCategory.OBJECTS,1255L,"U+1F50E","magnifying glass tilted right"),

    /**
     * Candle.
     */
    CANDLE(EmojiCategory.OBJECTS,1256L,"U+1F56F","candle"),

    /**
     * Light bulb.
     */
    LIGHT_BULB(EmojiCategory.OBJECTS,1257L,"U+1F4A1","light bulb"),

    /**
     * Flashlight.
     */
    FLASHLIGHT(EmojiCategory.OBJECTS,1258L,"U+1F526","flashlight"),

    /**
     * Red paper lantern.
     */
    RED_PAPER_LANTERN(EmojiCategory.OBJECTS,1259L,"U+1F3EE","red paper lantern"),

    /**
     * Diya lamp.
     */
    DIYA_LAMP(EmojiCategory.OBJECTS,1260L,"U+1FA94","diya lamp");

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
    EmojiLightVideoSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
