package com.databricks.sdk.core.serialization;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.protobuf.Duration;
import com.google.protobuf.util.Durations;
import org.junit.jupiter.api.Test;

public class DurationDeserializerTest {
  private static class TestClass {
    @JsonDeserialize(using = DurationDeserializer.class)
    private Duration duration;

    public Duration getDuration() {
      return duration;
    }
  }

  @Test
  public void testDurationDeserialization() throws Exception {
    String json = "{\"duration\":\"3.500s\"}";
    ObjectMapper mapper = new ObjectMapper();
    TestClass obj = mapper.readValue(json, TestClass.class);
    assertEquals(Durations.parse("3.500s"), obj.getDuration());
  }

  @Test
  public void testNullDurationDeserialization() throws Exception {
    String json = "{\"duration\":null}";
    ObjectMapper mapper = new ObjectMapper();
    TestClass obj = mapper.readValue(json, TestClass.class);
    assertNull(obj.getDuration());
  }
} 