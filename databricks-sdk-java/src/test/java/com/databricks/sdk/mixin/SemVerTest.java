package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SemVerTest {
  @Test
  void equalComparisonTest() {
    SemVer testSemVer1 = new SemVer(0, 0, 0, "", "");
    SemVer testSemVer2 = new SemVer(0, 0, 0, "", "");
    int compareResult = testSemVer1.compareTo(testSemVer2);
    assertEquals(0, compareResult);
  }

  @Test
  void lessComparisonTest() {
    SemVer testSemVer1 = new SemVer(0, 0, 0, "", "");
    SemVer testSemVer2 = new SemVer(0, 1, 0, "beta", "");
    int compareResult = testSemVer1.compareTo(testSemVer2);
    assertEquals(-1, compareResult);
  }

  @Test
  void moreComparisonTest() {
    SemVer testSemVer1 = new SemVer(1, 0, 0, "", "build");
    SemVer testSemVer2 = new SemVer(0, 2, 0, "preRelease", "");
    int compareResult = testSemVer1.compareTo(testSemVer2);
    assertEquals(1, compareResult);
  }

  @Test
  void parseTest() {
    String testString = "v1.2.3-alpha+build-20230510";
    SemVer parsedSemVer = SemVer.parse(testString);
    SemVer expectedSemVer = new SemVer(1, 2, 3, "alpha", "build-20230510");
    int compareResult = parsedSemVer.compareTo(expectedSemVer);
    assertEquals(0, compareResult);
  }

  @Test
  void parseOrNullReturnsNullForInvalid() {
    // Spark runtime key shape that crashed selectSparkVersion(): only two version segments and a
    // leading "v", which is not a valid SemVer.
    assertNull(SemVer.parseOrNull("v18.x-scala2.13"));
    assertNull(SemVer.parseOrNull("not-a-version"));
    assertNull(SemVer.parseOrNull(null));
    assertNull(SemVer.parseOrNull(""));
  }

  @Test
  void parseOrNullParsesValid() {
    SemVer parsed = SemVer.parseOrNull("v1.2.3-alpha+build-20230510");
    assertNotNull(parsed);
    assertEquals(0, parsed.compareTo(new SemVer(1, 2, 3, "alpha", "build-20230510")));
  }
}
