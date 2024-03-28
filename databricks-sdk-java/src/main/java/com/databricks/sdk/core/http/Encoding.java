package com.databricks.sdk.core.http;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;

/**
 * Utility class for encoding strings for use in URLs.
 *
 * <p>Adapted from URLEncodingUtils.java from Apache's HttpClient library.
 */
public class Encoding {

  /**
   * Unreserved characters, i.e. alphanumeric, plus: {@code _ - ! . ~ ' ( ) *}
   *
   * <p>This list is the same as the {@code unreserved} list in <a
   * href="http://www.ietf.org/rfc/rfc2396.txt">RFC 2396</a>
   */
  private static final BitSet UNRESERVED = new BitSet(256);

  /**
   * Characters which are safe to use in a path, excluding /, i.e. {@link #UNRESERVED} plus punctuation
   * plus @
   */
  private static final BitSet PATHSAFE = new BitSet(256);

  /**
   * Characters which are safe to use in a path, including /.
   */
  private static final BitSet PATH_SPECIAL = new BitSet(256);

  static {
    // unreserved chars
    // alpha characters
    for (int i = 'a'; i <= 'z'; i++) {
      UNRESERVED.set(i);
    }
    for (int i = 'A'; i <= 'Z'; i++) {
      UNRESERVED.set(i);
    }
    // numeric characters
    for (int i = '0'; i <= '9'; i++) {
      UNRESERVED.set(i);
    }
    UNRESERVED.set('_'); // these are the characters of the "mark" list
    UNRESERVED.set('-');
    UNRESERVED.set('.');
    UNRESERVED.set('*');
    UNRESERVED.set('!');
    UNRESERVED.set('~');
    UNRESERVED.set('\'');
    UNRESERVED.set('(');
    UNRESERVED.set(')');

    // URL path safe
    PATHSAFE.or(UNRESERVED);
    PATHSAFE.set(';'); // param separator
    PATHSAFE.set(':'); // RFC 2396
    PATHSAFE.set('@');
    PATHSAFE.set('&');
    PATHSAFE.set('=');
    PATHSAFE.set('+');
    PATHSAFE.set('$');
    PATHSAFE.set(',');

    PATH_SPECIAL.or(PATHSAFE);
    PATH_SPECIAL.set('/');
  }

  private static final int RADIX = 16;

  private static String urlEncode(
      final String content,
      final Charset charset,
      final BitSet safechars,
      final boolean blankAsPlus) {
    if (content == null) {
      return null;
    }
    final StringBuilder buf = new StringBuilder();
    final ByteBuffer bb = charset.encode(content);
    while (bb.hasRemaining()) {
      final int b = bb.get() & 0xff;
      if (safechars.get(b)) {
        buf.append((char) b);
      } else if (blankAsPlus && b == ' ') {
        buf.append('+');
      } else {
        buf.append("%");
        final char hex1 = Character.toUpperCase(Character.forDigit((b >> 4) & 0xF, RADIX));
        final char hex2 = Character.toUpperCase(Character.forDigit(b & 0xF, RADIX));
        buf.append(hex1);
        buf.append(hex2);
      }
    }
    return buf.toString();
  }

  public static String encodeMultiSegmentPathParameter(String param) {
    return urlEncode(param, StandardCharsets.UTF_8, PATH_SPECIAL, false);
  }
}
