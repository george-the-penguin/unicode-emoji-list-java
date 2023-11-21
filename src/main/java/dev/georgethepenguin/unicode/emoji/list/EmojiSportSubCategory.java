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
 * Unicode Emoji Sub-Category: Sport.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiSportSubCategory {

    /**
     * Soccer ball.
     */
    SOCCER_BALL(EmojiCategory.ACTIVITIES,1091L,"U+26BD","soccer ball"),

    /**
     * Baseball.
     */
    BASEBALL(EmojiCategory.ACTIVITIES,1092L,"U+26BE","baseball"),

    /**
     * Softball.
     */
    SOFTBALL(EmojiCategory.ACTIVITIES,1093L,"U+1F94E","softball"),

    /**
     * Basketball.
     */
    BASKETBALL(EmojiCategory.ACTIVITIES,1094L,"U+1F3C0","basketball"),

    /**
     * Volleyball.
     */
    VOLLEYBALL(EmojiCategory.ACTIVITIES,1095L,"U+1F3D0","volleyball"),

    /**
     * American football.
     */
    AMERICAN_FOOTBALL(EmojiCategory.ACTIVITIES,1096L,"U+1F3C8","american football"),

    /**
     * Rugby football.
     */
    RUGBY_FOOTBALL(EmojiCategory.ACTIVITIES,1097L,"U+1F3C9","rugby football"),

    /**
     * Tennis.
     */
    TENNIS(EmojiCategory.ACTIVITIES,1098L,"U+1F3BE","tennis"),

    /**
     * Flying disc.
     */
    FLYING_DISC(EmojiCategory.ACTIVITIES,1099L,"U+1F94F","flying disc"),

    /**
     * Bowling.
     */
    BOWLING(EmojiCategory.ACTIVITIES,1100L,"U+1F3B3","bowling"),

    /**
     * Cricket game.
     */
    CRICKET_GAME(EmojiCategory.ACTIVITIES,1101L,"U+1F3CF","cricket game"),

    /**
     * Field hockey.
     */
    FIELD_HOCKEY(EmojiCategory.ACTIVITIES,1102L,"U+1F3D1","field hockey"),

    /**
     * Ice hockey.
     */
    ICE_HOCKEY(EmojiCategory.ACTIVITIES,1103L,"U+1F3D2","ice hockey"),

    /**
     * Lacrosse.
     */
    LACROSSE(EmojiCategory.ACTIVITIES,1104L,"U+1F94D","lacrosse"),

    /**
     * Ping pong.
     */
    PING_PONG(EmojiCategory.ACTIVITIES,1105L,"U+1F3D3","ping pong"),

    /**
     * Badminton.
     */
    BADMINTON(EmojiCategory.ACTIVITIES,1106L,"U+1F3F8","badminton"),

    /**
     * Boxing glove.
     */
    BOXING_GLOVE(EmojiCategory.ACTIVITIES,1107L,"U+1F94A","boxing glove"),

    /**
     * Martial arts uniform.
     */
    MARTIAL_ARTS_UNIFORM(EmojiCategory.ACTIVITIES,1108L,"U+1F94B","martial arts uniform"),

    /**
     * Goal net.
     */
    GOAL_NET(EmojiCategory.ACTIVITIES,1109L,"U+1F945","goal net"),

    /**
     * Flag in hole.
     */
    FLAG_IN_HOLE(EmojiCategory.ACTIVITIES,1110L,"U+26F3","flag in hole"),

    /**
     * Ice skate.
     */
    ICE_SKATE(EmojiCategory.ACTIVITIES,1111L,"U+26F8","ice skate"),

    /**
     * Fishing pole.
     */
    FISHING_POLE(EmojiCategory.ACTIVITIES,1112L,"U+1F3A3","fishing pole"),

    /**
     * Diving mask.
     */
    DIVING_MASK(EmojiCategory.ACTIVITIES,1113L,"U+1F93F","diving mask"),

    /**
     * Running shirt.
     */
    RUNNING_SHIRT(EmojiCategory.ACTIVITIES,1114L,"U+1F3BD","running shirt"),

    /**
     * Skis.
     */
    SKIS(EmojiCategory.ACTIVITIES,1115L,"U+1F3BF","skis"),

    /**
     * Sled.
     */
    SLED(EmojiCategory.ACTIVITIES,1116L,"U+1F6F7","sled"),

    /**
     * Curling stone.
     */
    CURLING_STONE(EmojiCategory.ACTIVITIES,1117L,"U+1F94C","curling stone");

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
    EmojiSportSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
