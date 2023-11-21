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
 * Unicode Emoji Sub-Category: Sound.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiSoundSubCategory {

    /**
     * Muted speaker.
     */
    MUTED_SPEAKER(EmojiCategory.OBJECTS,1196L,"U+1F507","muted speaker"),

    /**
     * Speaker low volume.
     */
    SPEAKER_LOW_VOLUME(EmojiCategory.OBJECTS,1197L,"U+1F508","speaker low volume"),

    /**
     * Speaker medium volume.
     */
    SPEAKER_MEDIUM_VOLUME(EmojiCategory.OBJECTS,1198L,"U+1F509","speaker medium volume"),

    /**
     * Speaker high volume.
     */
    SPEAKER_HIGH_VOLUME(EmojiCategory.OBJECTS,1199L,"U+1F50A","speaker high volume"),

    /**
     * Loudspeaker.
     */
    LOUDSPEAKER(EmojiCategory.OBJECTS,1200L,"U+1F4E2","loudspeaker"),

    /**
     * Megaphone.
     */
    MEGAPHONE(EmojiCategory.OBJECTS,1201L,"U+1F4E3","megaphone"),

    /**
     * Postal horn.
     */
    POSTAL_HORN(EmojiCategory.OBJECTS,1202L,"U+1F4EF","postal horn"),

    /**
     * Bell.
     */
    BELL(EmojiCategory.OBJECTS,1203L,"U+1F514","bell"),

    /**
     * Bell with slash.
     */
    BELL_WITH_SLASH(EmojiCategory.OBJECTS,1204L,"U+1F515","bell with slash");

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
    EmojiSoundSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
