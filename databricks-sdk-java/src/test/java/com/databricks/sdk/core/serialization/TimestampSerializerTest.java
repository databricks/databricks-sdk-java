package com.databricks.sdk.core.serialization;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;
import org.junit.jupiter.api.Test;

public class TimestampSerializerTest {
  private static class TestClass {
    @JsonSerialize(using = TimestampSerializer.class)
    private Timestamp timestamp;

    public TestClass(Timestamp timestamp) {
      this.timestamp = timestamp;
    }
  }

  @Test
  public void testTimestampSerialization() throws Exception {
    Timestamp ts = Timestamps.parse("2024-06-20T12:34:56Z");
    TestClass testObject = new TestClass(ts);
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(testObject);
    assertEquals("{\"timestamp\":\"2024-06-20T12:34:56Z\"}", json);
  }

  @Test
  public void testNullTimestampSerialization() throws Exception {
    TestClass testObject = new TestClass(null);
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(testObject);
    assertEquals("{\"timestamp\":null}", json);
  }

  @Test
  public void testTimestampSerializationWithNanos() throws Exception {
    Timestamp ts = Timestamp.newBuilder()
        .setSeconds(1718886896L) // 2024-06-20T12:34:56Z
        .setNanos(123456789)
        .build();
    TestClass testObject = new TestClass(ts);
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(testObject);
    // Should match the RFC 3339 format with fractional seconds
    assertEquals("{\"timestamp\":\"2024-06-20T12:34:56.123456789Z\"}", json);
  }
} 