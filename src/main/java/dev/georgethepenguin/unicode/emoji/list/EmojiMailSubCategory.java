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
 * Unicode Emoji Sub-Category: Mail.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiMailSubCategory {

    /**
     * Envelope.
     */
    ENVELOPE(EmojiCategory.OBJECTS,1288L,"U+2709","envelope"),

    /**
     * E-mail.
     */
    E_MAIL(EmojiCategory.OBJECTS,1289L,"U+1F4E7","e-mail"),

    /**
     * Incoming envelope.
     */
    INCOMING_ENVELOPE(EmojiCategory.OBJECTS,1290L,"U+1F4E8","incoming envelope"),

    /**
     * Envelope with arrow.
     */
    ENVELOPE_WITH_ARROW(EmojiCategory.OBJECTS,1291L,"U+1F4E9","envelope with arrow"),

    /**
     * Outbox tray.
     */
    OUTBOX_TRAY(EmojiCategory.OBJECTS,1292L,"U+1F4E4","outbox tray"),

    /**
     * Inbox tray.
     */
    INBOX_TRAY(EmojiCategory.OBJECTS,1293L,"U+1F4E5","inbox tray"),

    /**
     * Package.
     */
    PACKAGE(EmojiCategory.OBJECTS,1294L,"U+1F4E6","package"),

    /**
     * Closed mailbox with raised flag.
     */
    CLOSED_MAILBOX_WITH_RAISED_FLAG(EmojiCategory.OBJECTS,1295L,"U+1F4EB","closed mailbox with raised flag"),

    /**
     * Closed mailbox with lowered flag.
     */
    CLOSED_MAILBOX_WITH_LOWERED_FLAG(EmojiCategory.OBJECTS,1296L,"U+1F4EA","closed mailbox with lowered flag"),

    /**
     * Open mailbox with raised flag.
     */
    OPEN_MAILBOX_WITH_RAISED_FLAG(EmojiCategory.OBJECTS,1297L,"U+1F4EC","open mailbox with raised flag"),

    /**
     * Open mailbox with lowered flag.
     */
    OPEN_MAILBOX_WITH_LOWERED_FLAG(EmojiCategory.OBJECTS,1298L,"U+1F4ED","open mailbox with lowered flag"),

    /**
     * Postbox.
     */
    POSTBOX(EmojiCategory.OBJECTS,1299L,"U+1F4EE","postbox"),

    /**
     * Ballot box with ballot.
     */
    BALLOT_BOX_WITH_BALLOT(EmojiCategory.OBJECTS,1300L,"U+1F5F3","ballot box with ballot");

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
    EmojiMailSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
