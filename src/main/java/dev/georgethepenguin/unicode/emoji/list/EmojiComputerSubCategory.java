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
 * Unicode Emoji Sub-Category: Computer.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiComputerSubCategory {

    /**
     * Battery.
     */
    BATTERY(EmojiCategory.OBJECTS,1231L,"U+1F50B","battery"),

    /**
     * Low battery.
     */
    LOW_BATTERY(EmojiCategory.OBJECTS,1232L,"U+1FAAB","low battery"),

    /**
     * Electric plug.
     */
    ELECTRIC_PLUG(EmojiCategory.OBJECTS,1233L,"U+1F50C","electric plug"),

    /**
     * Laptop.
     */
    LAPTOP(EmojiCategory.OBJECTS,1234L,"U+1F4BB","laptop"),

    /**
     * Desktop computer.
     */
    DESKTOP_COMPUTER(EmojiCategory.OBJECTS,1235L,"U+1F5A5","desktop computer"),

    /**
     * Printer.
     */
    PRINTER(EmojiCategory.OBJECTS,1236L,"U+1F5A8","printer"),

    /**
     * Keyboard.
     */
    KEYBOARD(EmojiCategory.OBJECTS,1237L,"U+2328","keyboard"),

    /**
     * Computer mouse.
     */
    COMPUTER_MOUSE(EmojiCategory.OBJECTS,1238L,"U+1F5B1","computer mouse"),

    /**
     * Trackball.
     */
    TRACKBALL(EmojiCategory.OBJECTS,1239L,"U+1F5B2","trackball"),

    /**
     * Computer disk.
     */
    COMPUTER_DISK(EmojiCategory.OBJECTS,1240L,"U+1F4BD","computer disk"),

    /**
     * Floppy disk.
     */
    FLOPPY_DISK(EmojiCategory.OBJECTS,1241L,"U+1F4BE","floppy disk"),

    /**
     * Optical disk.
     */
    OPTICAL_DISK(EmojiCategory.OBJECTS,1242L,"U+1F4BF","optical disk"),

    /**
     * Dvd.
     */
    DVD(EmojiCategory.OBJECTS,1243L,"U+1F4C0","dvd"),

    /**
     * Abacus.
     */
    ABACUS(EmojiCategory.OBJECTS,1244L,"U+1F9EE","abacus");

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
    EmojiComputerSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
