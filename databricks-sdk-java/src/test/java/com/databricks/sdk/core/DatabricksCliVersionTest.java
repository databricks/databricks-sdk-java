package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DatabricksCliVersionTest {

  @Test
  void testAtLeast_equal() {
    assertTrue(new DatabricksCliVersion(0, 207, 1).atLeast(new DatabricksCliVersion(0, 207, 1)));
  }

  @Test
  void testAtLeast_higherPatch() {
    assertTrue(new DatabricksCliVersion(0, 207, 2).atLeast(new DatabricksCliVersion(0, 207, 1)));
    assertFalse(new DatabricksCliVersion(0, 207, 0).atLeast(new DatabricksCliVersion(0, 207, 1)));
  }

  @Test
  void testAtLeast_higherMinor() {
    assertTrue(new DatabricksCliVersion(0, 296, 0).atLeast(new DatabricksCliVersion(0, 207, 1)));
    assertFalse(new DatabricksCliVersion(0, 100, 99).atLeast(new DatabricksCliVersion(0, 207, 1)));
  }

  @Test
  void testAtLeast_higherMajor() {
    assertTrue(new DatabricksCliVersion(1, 0, 0).atLeast(new DatabricksCliVersion(0, 999, 999)));
    assertFalse(new DatabricksCliVersion(0, 999, 999).atLeast(new DatabricksCliVersion(1, 0, 0)));
  }

  @Test
  void testAtLeast_unknownIsLessThanEverything() {
    assertFalse(DatabricksCliVersion.UNKNOWN.atLeast(new DatabricksCliVersion(0, 0, 0)));
    assertFalse(DatabricksCliVersion.UNKNOWN.atLeast(new DatabricksCliVersion(0, 207, 1)));
  }

  @Test
  void testIsDefaultDevBuild() {
    assertTrue(DatabricksCliVersion.DEFAULT_DEV_BUILD.isDefaultDevBuild());
    assertTrue(new DatabricksCliVersion(0, 0, 0).isDefaultDevBuild());
    assertFalse(new DatabricksCliVersion(0, 0, 1).isDefaultDevBuild());
    assertFalse(DatabricksCliVersion.UNKNOWN.isDefaultDevBuild());
  }

  @Test
  void testToString() {
    assertEquals("v0.207.1", new DatabricksCliVersion(0, 207, 1).toString());
    assertEquals("v1.0.0", new DatabricksCliVersion(1, 0, 0).toString());
    assertEquals("v0.0.0-dev", DatabricksCliVersion.DEFAULT_DEV_BUILD.toString());
    assertEquals("unknown", DatabricksCliVersion.UNKNOWN.toString());
  }

  // ---- compareTo sign tests ----

  private static Stream<Arguments> compareToCases() {
    DatabricksCliVersion v207_1 = new DatabricksCliVersion(0, 207, 1);
    DatabricksCliVersion v207_0 = new DatabricksCliVersion(0, 207, 0);
    DatabricksCliVersion v100_99 = new DatabricksCliVersion(0, 100, 99);
    DatabricksCliVersion v999_999 = new DatabricksCliVersion(0, 999, 999);
    DatabricksCliVersion v1_0_0 = new DatabricksCliVersion(1, 0, 0);
    return Stream.of(
        Arguments.of("equal", v207_1, v207_1, 0),
        Arguments.of("lesser by patch", v207_0, v207_1, -1),
        Arguments.of("greater by patch", v207_1, v207_0, 1),
        Arguments.of("lesser by minor", v100_99, v207_1, -1),
        Arguments.of("greater by minor", v207_1, v100_99, 1),
        Arguments.of("lesser by major", v999_999, v1_0_0, -1),
        Arguments.of("greater by major", v1_0_0, v999_999, 1),
        Arguments.of(
            "UNKNOWN < dev",
            DatabricksCliVersion.UNKNOWN,
            DatabricksCliVersion.DEFAULT_DEV_BUILD,
            -1),
        Arguments.of("UNKNOWN < real", DatabricksCliVersion.UNKNOWN, v207_1, -1),
        Arguments.of("dev < real", DatabricksCliVersion.DEFAULT_DEV_BUILD, v207_1, -1),
        Arguments.of("real > dev", v207_1, DatabricksCliVersion.DEFAULT_DEV_BUILD, 1),
        Arguments.of(
            "UNKNOWN equals UNKNOWN",
            DatabricksCliVersion.UNKNOWN,
            DatabricksCliVersion.UNKNOWN,
            0));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("compareToCases")
  void testCompareTo_Sign(
      String name, DatabricksCliVersion a, DatabricksCliVersion b, int expectedSign) {
    assertEquals(expectedSign, Integer.signum(a.compareTo(b)));
  }

  @Test
  void testEqualsAndHashCode() {
    assertEquals(new DatabricksCliVersion(0, 207, 1), new DatabricksCliVersion(0, 207, 1));
    assertEquals(
        new DatabricksCliVersion(0, 207, 1).hashCode(),
        new DatabricksCliVersion(0, 207, 1).hashCode());
    assertNotEquals(new DatabricksCliVersion(0, 207, 1), new DatabricksCliVersion(0, 207, 2));
    assertNotEquals(new DatabricksCliVersion(0, 207, 1), null);
    assertNotEquals(new DatabricksCliVersion(0, 207, 1), "v0.207.1");
  }
}
