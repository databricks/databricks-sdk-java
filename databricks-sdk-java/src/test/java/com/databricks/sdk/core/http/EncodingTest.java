package com.databricks.sdk.core.http;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EncodingTest {
  @Test
  public void encodeMultiSegmentPathParameter() {
    assertEquals("/foo/bar", Encoding.encodeMultiSegmentPathParameter("/foo/bar"));
    assertEquals("a%3Fb%23c", Encoding.encodeMultiSegmentPathParameter("a?b#c"));
  }
}
