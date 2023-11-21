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
 * Unicode Emoji Sub-Category: Time.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiTimeSubCategory {

    /**
     * Hourglass done.
     */
    HOURGLASS_DONE(EmojiCategory.TRAVEL_PLACES,986L,"U+231B","hourglass done"),

    /**
     * Hourglass not done.
     */
    HOURGLASS_NOT_DONE(EmojiCategory.TRAVEL_PLACES,987L,"U+23F3","hourglass not done"),

    /**
     * Watch.
     */
    WATCH(EmojiCategory.TRAVEL_PLACES,988L,"U+231A","watch"),

    /**
     * Alarm clock.
     */
    ALARM_CLOCK(EmojiCategory.TRAVEL_PLACES,989L,"U+23F0","alarm clock"),

    /**
     * Stopwatch.
     */
    STOPWATCH(EmojiCategory.TRAVEL_PLACES,990L,"U+23F1","stopwatch"),

    /**
     * Timer clock.
     */
    TIMER_CLOCK(EmojiCategory.TRAVEL_PLACES,991L,"U+23F2","timer clock"),

    /**
     * Mantelpiece clock.
     */
    MANTELPIECE_CLOCK(EmojiCategory.TRAVEL_PLACES,992L,"U+1F570","mantelpiece clock"),

    /**
     * Twelve oclock.
     */
    TWELVE_OCLOCK(EmojiCategory.TRAVEL_PLACES,993L,"U+1F55B","twelve oclock"),

    /**
     * Twelve-thirty.
     */
    TWELVE_THIRTY(EmojiCategory.TRAVEL_PLACES,994L,"U+1F567","twelve-thirty"),

    /**
     * One oclock.
     */
    ONE_OCLOCK(EmojiCategory.TRAVEL_PLACES,995L,"U+1F550","one oclock"),

    /**
     * One-thirty.
     */
    ONE_THIRTY(EmojiCategory.TRAVEL_PLACES,996L,"U+1F55C","one-thirty"),

    /**
     * Two oclock.
     */
    TWO_OCLOCK(EmojiCategory.TRAVEL_PLACES,997L,"U+1F551","two oclock"),

    /**
     * Two-thirty.
     */
    TWO_THIRTY(EmojiCategory.TRAVEL_PLACES,998L,"U+1F55D","two-thirty"),

    /**
     * Three oclock.
     */
    THREE_OCLOCK(EmojiCategory.TRAVEL_PLACES,999L,"U+1F552","three oclock"),

    /**
     * Three-thirty.
     */
    THREE_THIRTY(EmojiCategory.TRAVEL_PLACES,1000L,"U+1F55E","three-thirty"),

    /**
     * Four oclock.
     */
    FOUR_OCLOCK(EmojiCategory.TRAVEL_PLACES,1001L,"U+1F553","four oclock"),

    /**
     * Four-thirty.
     */
    FOUR_THIRTY(EmojiCategory.TRAVEL_PLACES,1002L,"U+1F55F","four-thirty"),

    /**
     * Five oclock.
     */
    FIVE_OCLOCK(EmojiCategory.TRAVEL_PLACES,1003L,"U+1F554","five oclock"),

    /**
     * Five-thirty.
     */
    FIVE_THIRTY(EmojiCategory.TRAVEL_PLACES,1004L,"U+1F560","five-thirty"),

    /**
     * Six oclock.
     */
    SIX_OCLOCK(EmojiCategory.TRAVEL_PLACES,1005L,"U+1F555","six oclock"),

    /**
     * Six-thirty.
     */
    SIX_THIRTY(EmojiCategory.TRAVEL_PLACES,1006L,"U+1F561","six-thirty"),

    /**
     * Seven oclock.
     */
    SEVEN_OCLOCK(EmojiCategory.TRAVEL_PLACES,1007L,"U+1F556","seven oclock"),

    /**
     * Seven-thirty.
     */
    SEVEN_THIRTY(EmojiCategory.TRAVEL_PLACES,1008L,"U+1F562","seven-thirty"),

    /**
     * Eight oclock.
     */
    EIGHT_OCLOCK(EmojiCategory.TRAVEL_PLACES,1009L,"U+1F557","eight oclock"),

    /**
     * Eight-thirty.
     */
    EIGHT_THIRTY(EmojiCategory.TRAVEL_PLACES,1010L,"U+1F563","eight-thirty"),

    /**
     * Nine oclock.
     */
    NINE_OCLOCK(EmojiCategory.TRAVEL_PLACES,1011L,"U+1F558","nine oclock"),

    /**
     * Nine-thirty.
     */
    NINE_THIRTY(EmojiCategory.TRAVEL_PLACES,1012L,"U+1F564","nine-thirty"),

    /**
     * Ten oclock.
     */
    TEN_OCLOCK(EmojiCategory.TRAVEL_PLACES,1013L,"U+1F559","ten oclock"),

    /**
     * Ten-thirty.
     */
    TEN_THIRTY(EmojiCategory.TRAVEL_PLACES,1014L,"U+1F565","ten-thirty"),

    /**
     * Eleven oclock.
     */
    ELEVEN_OCLOCK(EmojiCategory.TRAVEL_PLACES,1015L,"U+1F55A","eleven oclock"),

    /**
     * Eleven-thirty.
     */
    ELEVEN_THIRTY(EmojiCategory.TRAVEL_PLACES,1016L,"U+1F566","eleven-thirty");

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
    EmojiTimeSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
