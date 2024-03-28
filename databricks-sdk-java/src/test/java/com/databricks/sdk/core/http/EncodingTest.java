package com.databricks.sdk.core.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodingTest {
  @Test
  public void encodeMultiSegmentPathParameter() {
    assertEquals("/foo/bar", Encoding.encodeMultiSegmentPathParameter("/foo/bar"));
    assertEquals("a%3Fb%23c", Encoding.encodeMultiSegmentPathParameter("a?b#c"));
  }
}
