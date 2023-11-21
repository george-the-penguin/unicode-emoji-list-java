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
 * Unicode Emoji Sub-Category: Animal Bird.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiAnimalBirdSubCategory {

    /**
     * Turkey.
     */
    TURKEY(EmojiCategory.ANIMALS_NATURE,624L,"U+1F983","turkey"),

    /**
     * Chicken.
     */
    CHICKEN(EmojiCategory.ANIMALS_NATURE,625L,"U+1F414","chicken"),

    /**
     * Rooster.
     */
    ROOSTER(EmojiCategory.ANIMALS_NATURE,626L,"U+1F413","rooster"),

    /**
     * Hatching chick.
     */
    HATCHING_CHICK(EmojiCategory.ANIMALS_NATURE,627L,"U+1F423","hatching chick"),

    /**
     * Baby chick.
     */
    BABY_CHICK(EmojiCategory.ANIMALS_NATURE,628L,"U+1F424","baby chick"),

    /**
     * Front-facing baby chick.
     */
    FRONT_FACING_BABY_CHICK(EmojiCategory.ANIMALS_NATURE,629L,"U+1F425","front-facing baby chick"),

    /**
     * Bird.
     */
    BIRD(EmojiCategory.ANIMALS_NATURE,630L,"U+1F426","bird"),

    /**
     * Penguin.
     */
    PENGUIN(EmojiCategory.ANIMALS_NATURE,631L,"U+1F427","penguin"),

    /**
     * Dove.
     */
    DOVE(EmojiCategory.ANIMALS_NATURE,632L,"U+1F54A","dove"),

    /**
     * Eagle.
     */
    EAGLE(EmojiCategory.ANIMALS_NATURE,633L,"U+1F985","eagle"),

    /**
     * Duck.
     */
    DUCK(EmojiCategory.ANIMALS_NATURE,634L,"U+1F986","duck"),

    /**
     * Swan.
     */
    SWAN(EmojiCategory.ANIMALS_NATURE,635L,"U+1F9A2","swan"),

    /**
     * Owl.
     */
    OWL(EmojiCategory.ANIMALS_NATURE,636L,"U+1F989","owl"),

    /**
     * Dodo.
     */
    DODO(EmojiCategory.ANIMALS_NATURE,637L,"U+1F9A4","dodo"),

    /**
     * Feather.
     */
    FEATHER(EmojiCategory.ANIMALS_NATURE,638L,"U+1FAB6","feather"),

    /**
     * Flamingo.
     */
    FLAMINGO(EmojiCategory.ANIMALS_NATURE,639L,"U+1F9A9","flamingo"),

    /**
     * Peacock.
     */
    PEACOCK(EmojiCategory.ANIMALS_NATURE,640L,"U+1F99A","peacock"),

    /**
     * Parrot.
     */
    PARROT(EmojiCategory.ANIMALS_NATURE,641L,"U+1F99C","parrot"),

    /**
     * Wing.
     */
    WING(EmojiCategory.ANIMALS_NATURE,642L,"U+1FABD","wing"),

    /**
     * Black bird.
     */
    BLACK_BIRD(EmojiCategory.ANIMALS_NATURE,643L,"U+1F426 U+200D U+2B1B","black bird"),

    /**
     * Goose.
     */
    GOOSE(EmojiCategory.ANIMALS_NATURE,644L,"U+1FABF","goose"),

    /**
     * Phoenix.
     */
    PHOENIX(EmojiCategory.ANIMALS_NATURE,645L,"U+1F426 U+200D U+1F525","phoenix");

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
    EmojiAnimalBirdSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
