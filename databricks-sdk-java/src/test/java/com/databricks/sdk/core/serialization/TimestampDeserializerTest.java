package com.databricks.sdk.core.serialization;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;
import org.junit.jupiter.api.Test;

public class TimestampDeserializerTest {
  private static class TestClass {
    @JsonDeserialize(using = TimestampDeserializer.class)
    private Timestamp timestamp;

    public Timestamp getTimestamp() {
      return timestamp;
    }
  }

  @Test
  public void testTimestampDeserialization() throws Exception {
    String json = "{\"timestamp\":\"2024-06-20T12:34:56Z\"}";
    ObjectMapper mapper = new ObjectMapper();
    TestClass obj = mapper.readValue(json, TestClass.class);
    assertEquals(Timestamps.parse("2024-06-20T12:34:56Z"), obj.getTimestamp());
  }

  @Test
  public void testNullTimestampDeserialization() throws Exception {
    String json = "{\"timestamp\":null}";
    ObjectMapper mapper = new ObjectMapper();
    TestClass obj = mapper.readValue(json, TestClass.class);
    assertNull(obj.getTimestamp());
  }

  @Test
  public void testTimestampDeserializationWithNanos() throws Exception {
    String json = "{\"timestamp\":\"2024-06-20T12:34:56.123456789Z\"}";
    ObjectMapper mapper = new ObjectMapper();
    TestClass obj = mapper.readValue(json, TestClass.class);
    Timestamp expected = Timestamp.newBuilder().setSeconds(1718886896L).setNanos(123456789).build();
    assertEquals(expected, obj.getTimestamp());
  }
}
