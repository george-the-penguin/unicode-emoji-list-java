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
 * Unicode Emoji Sub-Category: Tool.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
@SuppressWarnings("unused")
public enum EmojiToolSubCategory {

    /**
     * Hammer.
     */
    HAMMER(EmojiCategory.OBJECTS,1337L,"U+1F528","hammer"),

    /**
     * Axe.
     */
    AXE(EmojiCategory.OBJECTS,1338L,"U+1FA93","axe"),

    /**
     * Pick.
     */
    PICK(EmojiCategory.OBJECTS,1339L,"U+26CF","pick"),

    /**
     * Hammer and pick.
     */
    HAMMER_AND_PICK(EmojiCategory.OBJECTS,1340L,"U+2692","hammer and pick"),

    /**
     * Hammer and wrench.
     */
    HAMMER_AND_WRENCH(EmojiCategory.OBJECTS,1341L,"U+1F6E0","hammer and wrench"),

    /**
     * Dagger.
     */
    DAGGER(EmojiCategory.OBJECTS,1342L,"U+1F5E1","dagger"),

    /**
     * Crossed swords.
     */
    CROSSED_SWORDS(EmojiCategory.OBJECTS,1343L,"U+2694","crossed swords"),

    /**
     * Bomb.
     */
    BOMB(EmojiCategory.OBJECTS,1344L,"U+1F4A3","bomb"),

    /**
     * Boomerang.
     */
    BOOMERANG(EmojiCategory.OBJECTS,1345L,"U+1FA83","boomerang"),

    /**
     * Bow and arrow.
     */
    BOW_AND_ARROW(EmojiCategory.OBJECTS,1346L,"U+1F3F9","bow and arrow"),

    /**
     * Shield.
     */
    SHIELD(EmojiCategory.OBJECTS,1347L,"U+1F6E1","shield"),

    /**
     * Carpentry saw.
     */
    CARPENTRY_SAW(EmojiCategory.OBJECTS,1348L,"U+1FA9A","carpentry saw"),

    /**
     * Wrench.
     */
    WRENCH(EmojiCategory.OBJECTS,1349L,"U+1F527","wrench"),

    /**
     * Screwdriver.
     */
    SCREWDRIVER(EmojiCategory.OBJECTS,1350L,"U+1FA9B","screwdriver"),

    /**
     * Nut and bolt.
     */
    NUT_AND_BOLT(EmojiCategory.OBJECTS,1351L,"U+1F529","nut and bolt"),

    /**
     * Gear.
     */
    GEAR(EmojiCategory.OBJECTS,1352L,"U+2699","gear"),

    /**
     * Clamp.
     */
    CLAMP(EmojiCategory.OBJECTS,1353L,"U+1F5DC","clamp"),

    /**
     * Balance scale.
     */
    BALANCE_SCALE(EmojiCategory.OBJECTS,1354L,"U+2696","balance scale"),

    /**
     * White cane.
     */
    WHITE_CANE(EmojiCategory.OBJECTS,1355L,"U+1F9AF","white cane"),

    /**
     * Link.
     */
    LINK(EmojiCategory.OBJECTS,1356L,"U+1F517","link"),

    /**
     * Broken chain.
     */
    BROKEN_CHAIN(EmojiCategory.OBJECTS,1357L,"U+26D3 U+FE0F U+200D U+1F4A5","broken chain"),

    /**
     * Chains.
     */
    CHAINS(EmojiCategory.OBJECTS,1358L,"U+26D3","chains"),

    /**
     * Hook.
     */
    HOOK(EmojiCategory.OBJECTS,1359L,"U+1FA9D","hook"),

    /**
     * Toolbox.
     */
    TOOLBOX(EmojiCategory.OBJECTS,1360L,"U+1F9F0","toolbox"),

    /**
     * Magnet.
     */
    MAGNET(EmojiCategory.OBJECTS,1361L,"U+1F9F2","magnet"),

    /**
     * Ladder.
     */
    LADDER(EmojiCategory.OBJECTS,1362L,"U+1FA9C","ladder");

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
    EmojiToolSubCategory(EmojiCategory emojiCategory, Long number, String unicode, String cldr) {
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
