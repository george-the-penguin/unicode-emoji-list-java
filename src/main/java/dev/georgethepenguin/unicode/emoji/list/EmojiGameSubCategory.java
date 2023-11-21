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
 * Unicode Emoji Sub-Category: Game.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiGameSubCategory {

    /**
     * Bullseye.
     */
    BULLSEYE(EmojiCategory.ACTIVITIES,1118L,"U+1F3AF","bullseye"),

    /**
     * Yo-yo.
     */
    YO_YO(EmojiCategory.ACTIVITIES,1119L,"U+1FA80","yo-yo"),

    /**
     * Kite.
     */
    KITE(EmojiCategory.ACTIVITIES,1120L,"U+1FA81","kite"),

    /**
     * Water pistol.
     */
    WATER_PISTOL(EmojiCategory.ACTIVITIES,1121L,"U+1F52B","water pistol"),

    /**
     * Pool 8 ball.
     */
    POOL_8_BALL(EmojiCategory.ACTIVITIES,1122L,"U+1F3B1","pool 8 ball"),

    /**
     * Crystal ball.
     */
    CRYSTAL_BALL(EmojiCategory.ACTIVITIES,1123L,"U+1F52E","crystal ball"),

    /**
     * Magic wand.
     */
    MAGIC_WAND(EmojiCategory.ACTIVITIES,1124L,"U+1FA84","magic wand"),

    /**
     * Video game.
     */
    VIDEO_GAME(EmojiCategory.ACTIVITIES,1125L,"U+1F3AE","video game"),

    /**
     * Joystick.
     */
    JOYSTICK(EmojiCategory.ACTIVITIES,1126L,"U+1F579","joystick"),

    /**
     * Slot machine.
     */
    SLOT_MACHINE(EmojiCategory.ACTIVITIES,1127L,"U+1F3B0","slot machine"),

    /**
     * Game die.
     */
    GAME_DIE(EmojiCategory.ACTIVITIES,1128L,"U+1F3B2","game die"),

    /**
     * Puzzle piece.
     */
    PUZZLE_PIECE(EmojiCategory.ACTIVITIES,1129L,"U+1F9E9","puzzle piece"),

    /**
     * Teddy bear.
     */
    TEDDY_BEAR(EmojiCategory.ACTIVITIES,1130L,"U+1F9F8","teddy bear"),

    /**
     * Piata.
     */
    PIATA(EmojiCategory.ACTIVITIES,1131L,"U+1FA85","piata"),

    /**
     * Mirror ball.
     */
    MIRROR_BALL(EmojiCategory.ACTIVITIES,1132L,"U+1FAA9","mirror ball"),

    /**
     * Nesting dolls.
     */
    NESTING_DOLLS(EmojiCategory.ACTIVITIES,1133L,"U+1FA86","nesting dolls"),

    /**
     * Spade suit.
     */
    SPADE_SUIT(EmojiCategory.ACTIVITIES,1134L,"U+2660","spade suit"),

    /**
     * Heart suit.
     */
    HEART_SUIT(EmojiCategory.ACTIVITIES,1135L,"U+2665","heart suit"),

    /**
     * Diamond suit.
     */
    DIAMOND_SUIT(EmojiCategory.ACTIVITIES,1136L,"U+2666","diamond suit"),

    /**
     * Club suit.
     */
    CLUB_SUIT(EmojiCategory.ACTIVITIES,1137L,"U+2663","club suit"),

    /**
     * Chess pawn.
     */
    CHESS_PAWN(EmojiCategory.ACTIVITIES,1138L,"U+265F","chess pawn"),

    /**
     * Joker.
     */
    JOKER(EmojiCategory.ACTIVITIES,1139L,"U+1F0CF","joker"),

    /**
     * Mahjong red dragon.
     */
    MAHJONG_RED_DRAGON(EmojiCategory.ACTIVITIES,1140L,"U+1F004","mahjong red dragon"),

    /**
     * Flower playing cards.
     */
    FLOWER_PLAYING_CARDS(EmojiCategory.ACTIVITIES,1141L,"U+1F3B4","flower playing cards");

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
    EmojiGameSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
