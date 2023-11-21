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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link UnicodeUtils}.
 *
 * @author Jorge Garcia (George the Penguin).
 * @version 1.0.0-v15.1
 * @since 17
 */
class UnicodeUtilsTest {

    /**
     * GIVEN: A unicode string outside the BMP.
     * WHEN: UnicodeUtils.toPrint is called.
     * THEN: The string is converted to a printable string.
     */
    @Test
    void givenUnicodeOutsideBMP_whenToPrint_thenPrintableString() {
        assertEquals("🔠", UnicodeUtils.toPrint("U+1F520"));
    }

    /**
     * GIVEN: A unicode string inside the BMP.
     * WHEN: UnicodeUtils.toPrint is called.
     * THEN: The string is converted to a printable string.
     */
    @Test
    void givenUnicodeInsideBMP_whenToPrint_thenPrintableString() {
        assertEquals("A", UnicodeUtils.toPrint("U+0041"));
    }
}