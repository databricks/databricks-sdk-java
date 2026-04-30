package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

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
    assertTrue(new DatabricksCliVersion(0, 0, 0).isDefaultDevBuild());
    assertFalse(new DatabricksCliVersion(0, 0, 1).isDefaultDevBuild());
    assertFalse(DatabricksCliVersion.UNKNOWN.isDefaultDevBuild());
  }

  @Test
  void testToString() {
    assertEquals("v0.207.1", new DatabricksCliVersion(0, 207, 1).toString());
    assertEquals("v1.0.0", new DatabricksCliVersion(1, 0, 0).toString());
    assertEquals("v0.0.0-dev", new DatabricksCliVersion(0, 0, 0).toString());
    assertEquals("unknown", DatabricksCliVersion.UNKNOWN.toString());
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
