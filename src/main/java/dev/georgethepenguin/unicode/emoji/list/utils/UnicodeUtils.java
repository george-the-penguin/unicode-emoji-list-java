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

package dev.georgethepenguin.unicode.emoji.list.utils;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Unicode utilities.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
public final class UnicodeUtils {

    private UnicodeUtils() {
    }

    /**
     * Converts a unicode string to a string that can be printed.
     *
     * @param unicode The unicode string.
     * @return The string that can be printed.
     */
    public static String toPrint(final String unicode) {
        return Stream.of(unicode.split("\\s+"))
                .map(UnicodeUtils::getSurrogatePair)
                .collect(Collectors.joining(" "));
    }

    private static String getSurrogatePair(final String unicode) {
        final var codePoint = Integer.parseInt(unicode.substring(2), 16);

        if (codePoint >= 0x0000 && codePoint <= 0xFFFF) {
            return String.valueOf((char) codePoint);
        }

        final var adjustedCodePoint = codePoint - 0x10000;
        return new String(new char[]{(char) (0xD800 + (adjustedCodePoint >> 10)),
                (char) (0xDC00 + (adjustedCodePoint & 0x3FF))});
    }
}
