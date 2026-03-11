package com.databricks.sdk.core.http;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class EncodingTest {

  @ParameterizedTest(name = "encodeMultiSegmentPathParameter: {0}")
  @MethodSource("multiSegmentCases")
  public void encodeMultiSegmentPathParameter(String name, String input, String expected) {
    assertEquals(expected, Encoding.encodeMultiSegmentPathParameter(input));
  }

  static Stream<Arguments> multiSegmentCases() {
    return Stream.of(
        Arguments.of("preserves slashes", "/foo/bar", "/foo/bar"),
        Arguments.of("encodes question mark and hash", "a?b#c", "a%3Fb%23c"),
        Arguments.of("encodes pipe", "name|here", "name%7Chere"),
        Arguments.of("encodes brackets", "a[b]", "a%5Bb%5D"),
        Arguments.of("encodes space", "a b", "a%20b"),
        Arguments.of("encodes braces", "a{b}", "a%7Bb%7D"),
        Arguments.of("preserves sub-delims", "a$b(c)d+e", "a$b(c)d+e"),
        Arguments.of("preserves dots and hyphens", "catalog.schema.table-name", "catalog.schema.table-name"),
        Arguments.of(
            "customer table name from issue",
            "catalog.schema.df$(dfs)sdf+fds-sdf0123456789_abcdefghijklmnopqrstuvwxyz|",
            "catalog.schema.df$(dfs)sdf+fds-sdf0123456789_abcdefghijklmnopqrstuvwxyz%7C"));
  }
}
