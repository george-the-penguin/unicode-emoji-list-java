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
 * Unicode Emoji Sub-Category: Place Building.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiPlaceBuildingSubCategory {

    /**
     * Stadium.
     */
    STADIUM(EmojiCategory.TRAVEL_PLACES,862L,"U+1F3DF","stadium"),

    /**
     * Classical building.
     */
    CLASSICAL_BUILDING(EmojiCategory.TRAVEL_PLACES,863L,"U+1F3DB","classical building"),

    /**
     * Building construction.
     */
    BUILDING_CONSTRUCTION(EmojiCategory.TRAVEL_PLACES,864L,"U+1F3D7","building construction"),

    /**
     * Brick.
     */
    BRICK(EmojiCategory.TRAVEL_PLACES,865L,"U+1F9F1","brick"),

    /**
     * Rock.
     */
    ROCK(EmojiCategory.TRAVEL_PLACES,866L,"U+1FAA8","rock"),

    /**
     * Wood.
     */
    WOOD(EmojiCategory.TRAVEL_PLACES,867L,"U+1FAB5","wood"),

    /**
     * Hut.
     */
    HUT(EmojiCategory.TRAVEL_PLACES,868L,"U+1F6D6","hut"),

    /**
     * Houses.
     */
    HOUSES(EmojiCategory.TRAVEL_PLACES,869L,"U+1F3D8","houses"),

    /**
     * Derelict house.
     */
    DERELICT_HOUSE(EmojiCategory.TRAVEL_PLACES,870L,"U+1F3DA","derelict house"),

    /**
     * House.
     */
    HOUSE(EmojiCategory.TRAVEL_PLACES,871L,"U+1F3E0","house"),

    /**
     * House with garden.
     */
    HOUSE_WITH_GARDEN(EmojiCategory.TRAVEL_PLACES,872L,"U+1F3E1","house with garden"),

    /**
     * Office building.
     */
    OFFICE_BUILDING(EmojiCategory.TRAVEL_PLACES,873L,"U+1F3E2","office building"),

    /**
     * Japanese post office.
     */
    JAPANESE_POST_OFFICE(EmojiCategory.TRAVEL_PLACES,874L,"U+1F3E3","Japanese post office"),

    /**
     * Post office.
     */
    POST_OFFICE(EmojiCategory.TRAVEL_PLACES,875L,"U+1F3E4","post office"),

    /**
     * Hospital.
     */
    HOSPITAL(EmojiCategory.TRAVEL_PLACES,876L,"U+1F3E5","hospital"),

    /**
     * Bank.
     */
    BANK(EmojiCategory.TRAVEL_PLACES,877L,"U+1F3E6","bank"),

    /**
     * Hotel.
     */
    HOTEL(EmojiCategory.TRAVEL_PLACES,878L,"U+1F3E8","hotel"),

    /**
     * Love hotel.
     */
    LOVE_HOTEL(EmojiCategory.TRAVEL_PLACES,879L,"U+1F3E9","love hotel"),

    /**
     * Convenience store.
     */
    CONVENIENCE_STORE(EmojiCategory.TRAVEL_PLACES,880L,"U+1F3EA","convenience store"),

    /**
     * School.
     */
    SCHOOL(EmojiCategory.TRAVEL_PLACES,881L,"U+1F3EB","school"),

    /**
     * Department store.
     */
    DEPARTMENT_STORE(EmojiCategory.TRAVEL_PLACES,882L,"U+1F3EC","department store"),

    /**
     * Factory.
     */
    FACTORY(EmojiCategory.TRAVEL_PLACES,883L,"U+1F3ED","factory"),

    /**
     * Japanese castle.
     */
    JAPANESE_CASTLE(EmojiCategory.TRAVEL_PLACES,884L,"U+1F3EF","Japanese castle"),

    /**
     * Castle.
     */
    CASTLE(EmojiCategory.TRAVEL_PLACES,885L,"U+1F3F0","castle"),

    /**
     * Wedding.
     */
    WEDDING(EmojiCategory.TRAVEL_PLACES,886L,"U+1F492","wedding"),

    /**
     * Tokyo tower.
     */
    TOKYO_TOWER(EmojiCategory.TRAVEL_PLACES,887L,"U+1F5FC","Tokyo tower"),

    /**
     * Statue of Liberty.
     */
    STATUE_OF_LIBERTY(EmojiCategory.TRAVEL_PLACES,888L,"U+1F5FD","Statue of Liberty");

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
    EmojiPlaceBuildingSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
