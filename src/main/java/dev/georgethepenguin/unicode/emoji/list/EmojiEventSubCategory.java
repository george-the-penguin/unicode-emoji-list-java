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
 * Unicode Emoji Sub-Category: Event.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiEventSubCategory {

    /**
     * Jack-o-lantern.
     */
    JACK_O_LANTERN(EmojiCategory.ACTIVITIES,1064L,"U+1F383","jack-o-lantern"),

    /**
     * Christmas tree.
     */
    CHRISTMAS_TREE(EmojiCategory.ACTIVITIES,1065L,"U+1F384","Christmas tree"),

    /**
     * Fireworks.
     */
    FIREWORKS(EmojiCategory.ACTIVITIES,1066L,"U+1F386","fireworks"),

    /**
     * Sparkler.
     */
    SPARKLER(EmojiCategory.ACTIVITIES,1067L,"U+1F387","sparkler"),

    /**
     * Firecracker.
     */
    FIRECRACKER(EmojiCategory.ACTIVITIES,1068L,"U+1F9E8","firecracker"),

    /**
     * Sparkles.
     */
    SPARKLES(EmojiCategory.ACTIVITIES,1069L,"U+2728","sparkles"),

    /**
     * Balloon.
     */
    BALLOON(EmojiCategory.ACTIVITIES,1070L,"U+1F388","balloon"),

    /**
     * Party popper.
     */
    PARTY_POPPER(EmojiCategory.ACTIVITIES,1071L,"U+1F389","party popper"),

    /**
     * Confetti ball.
     */
    CONFETTI_BALL(EmojiCategory.ACTIVITIES,1072L,"U+1F38A","confetti ball"),

    /**
     * Tanabata tree.
     */
    TANABATA_TREE(EmojiCategory.ACTIVITIES,1073L,"U+1F38B","tanabata tree"),

    /**
     * Pine decoration.
     */
    PINE_DECORATION(EmojiCategory.ACTIVITIES,1074L,"U+1F38D","pine decoration"),

    /**
     * Japanese dolls.
     */
    JAPANESE_DOLLS(EmojiCategory.ACTIVITIES,1075L,"U+1F38E","Japanese dolls"),

    /**
     * Carp streamer.
     */
    CARP_STREAMER(EmojiCategory.ACTIVITIES,1076L,"U+1F38F","carp streamer"),

    /**
     * Wind chime.
     */
    WIND_CHIME(EmojiCategory.ACTIVITIES,1077L,"U+1F390","wind chime"),

    /**
     * Moon viewing ceremony.
     */
    MOON_VIEWING_CEREMONY(EmojiCategory.ACTIVITIES,1078L,"U+1F391","moon viewing ceremony"),

    /**
     * Red envelope.
     */
    RED_ENVELOPE(EmojiCategory.ACTIVITIES,1079L,"U+1F9E7","red envelope"),

    /**
     * Ribbon.
     */
    RIBBON(EmojiCategory.ACTIVITIES,1080L,"U+1F380","ribbon"),

    /**
     * Wrapped gift.
     */
    WRAPPED_GIFT(EmojiCategory.ACTIVITIES,1081L,"U+1F381","wrapped gift"),

    /**
     * Reminder ribbon.
     */
    REMINDER_RIBBON(EmojiCategory.ACTIVITIES,1082L,"U+1F397","reminder ribbon"),

    /**
     * Admission tickets.
     */
    ADMISSION_TICKETS(EmojiCategory.ACTIVITIES,1083L,"U+1F39F","admission tickets"),

    /**
     * Ticket.
     */
    TICKET(EmojiCategory.ACTIVITIES,1084L,"U+1F3AB","ticket");

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
    EmojiEventSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
