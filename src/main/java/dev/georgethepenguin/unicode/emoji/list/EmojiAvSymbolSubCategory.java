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
 * Unicode Emoji Sub-Category: Av Symbol.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiAvSymbolSubCategory {

    /**
     * Shuffle tracks button.
     */
    SHUFFLE_TRACKS_BUTTON(EmojiCategory.SYMBOLS,1484L,"U+1F500","shuffle tracks button"),

    /**
     * Repeat button.
     */
    REPEAT_BUTTON(EmojiCategory.SYMBOLS,1485L,"U+1F501","repeat button"),

    /**
     * Repeat single button.
     */
    REPEAT_SINGLE_BUTTON(EmojiCategory.SYMBOLS,1486L,"U+1F502","repeat single button"),

    /**
     * Play button.
     */
    PLAY_BUTTON(EmojiCategory.SYMBOLS,1487L,"U+25B6","play button"),

    /**
     * Fast-forward button.
     */
    FAST_FORWARD_BUTTON(EmojiCategory.SYMBOLS,1488L,"U+23E9","fast-forward button"),

    /**
     * Next track button.
     */
    NEXT_TRACK_BUTTON(EmojiCategory.SYMBOLS,1489L,"U+23ED","next track button"),

    /**
     * Play or pause button.
     */
    PLAY_OR_PAUSE_BUTTON(EmojiCategory.SYMBOLS,1490L,"U+23EF","play or pause button"),

    /**
     * Reverse button.
     */
    REVERSE_BUTTON(EmojiCategory.SYMBOLS,1491L,"U+25C0","reverse button"),

    /**
     * Fast reverse button.
     */
    FAST_REVERSE_BUTTON(EmojiCategory.SYMBOLS,1492L,"U+23EA","fast reverse button"),

    /**
     * Last track button.
     */
    LAST_TRACK_BUTTON(EmojiCategory.SYMBOLS,1493L,"U+23EE","last track button"),

    /**
     * Upwards button.
     */
    UPWARDS_BUTTON(EmojiCategory.SYMBOLS,1494L,"U+1F53C","upwards button"),

    /**
     * Fast up button.
     */
    FAST_UP_BUTTON(EmojiCategory.SYMBOLS,1495L,"U+23EB","fast up button"),

    /**
     * Downwards button.
     */
    DOWNWARDS_BUTTON(EmojiCategory.SYMBOLS,1496L,"U+1F53D","downwards button"),

    /**
     * Fast down button.
     */
    FAST_DOWN_BUTTON(EmojiCategory.SYMBOLS,1497L,"U+23EC","fast down button"),

    /**
     * Pause button.
     */
    PAUSE_BUTTON(EmojiCategory.SYMBOLS,1498L,"U+23F8","pause button"),

    /**
     * Stop button.
     */
    STOP_BUTTON(EmojiCategory.SYMBOLS,1499L,"U+23F9","stop button"),

    /**
     * Record button.
     */
    RECORD_BUTTON(EmojiCategory.SYMBOLS,1500L,"U+23FA","record button"),

    /**
     * Eject button.
     */
    EJECT_BUTTON(EmojiCategory.SYMBOLS,1501L,"U+23CF","eject button"),

    /**
     * Cinema.
     */
    CINEMA(EmojiCategory.SYMBOLS,1502L,"U+1F3A6","cinema"),

    /**
     * Dim button.
     */
    DIM_BUTTON(EmojiCategory.SYMBOLS,1503L,"U+1F505","dim button"),

    /**
     * Bright button.
     */
    BRIGHT_BUTTON(EmojiCategory.SYMBOLS,1504L,"U+1F506","bright button"),

    /**
     * Antenna bars.
     */
    ANTENNA_BARS(EmojiCategory.SYMBOLS,1505L,"U+1F4F6","antenna bars"),

    /**
     * Wireless.
     */
    WIRELESS(EmojiCategory.SYMBOLS,1506L,"U+1F6DC","wireless"),

    /**
     * Vibration mode.
     */
    VIBRATION_MODE(EmojiCategory.SYMBOLS,1507L,"U+1F4F3","vibration mode"),

    /**
     * Mobile phone off.
     */
    MOBILE_PHONE_OFF(EmojiCategory.SYMBOLS,1508L,"U+1F4F4","mobile phone off");

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
    EmojiAvSymbolSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
