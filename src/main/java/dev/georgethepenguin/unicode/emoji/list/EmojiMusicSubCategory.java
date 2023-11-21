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
 * Unicode Emoji Sub-Category: Music.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiMusicSubCategory {

    /**
     * Musical score.
     */
    MUSICAL_SCORE(EmojiCategory.OBJECTS,1205L,"U+1F3BC","musical score"),

    /**
     * Musical note.
     */
    MUSICAL_NOTE(EmojiCategory.OBJECTS,1206L,"U+1F3B5","musical note"),

    /**
     * Musical notes.
     */
    MUSICAL_NOTES(EmojiCategory.OBJECTS,1207L,"U+1F3B6","musical notes"),

    /**
     * Studio microphone.
     */
    STUDIO_MICROPHONE(EmojiCategory.OBJECTS,1208L,"U+1F399","studio microphone"),

    /**
     * Level slider.
     */
    LEVEL_SLIDER(EmojiCategory.OBJECTS,1209L,"U+1F39A","level slider"),

    /**
     * Control knobs.
     */
    CONTROL_KNOBS(EmojiCategory.OBJECTS,1210L,"U+1F39B","control knobs"),

    /**
     * Microphone.
     */
    MICROPHONE(EmojiCategory.OBJECTS,1211L,"U+1F3A4","microphone"),

    /**
     * Headphone.
     */
    HEADPHONE(EmojiCategory.OBJECTS,1212L,"U+1F3A7","headphone"),

    /**
     * Radio.
     */
    RADIO(EmojiCategory.OBJECTS,1213L,"U+1F4FB","radio");

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
    EmojiMusicSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
