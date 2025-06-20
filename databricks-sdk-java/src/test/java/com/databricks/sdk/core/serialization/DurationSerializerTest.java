package com.databricks.sdk.core.serialization;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Duration;
import org.junit.jupiter.api.Test;

public class DurationSerializerTest {

  private static class TestClass {
    @JsonSerialize(using = DurationSerializer.class)
    private Duration duration;

    public TestClass(Duration duration) {
      this.duration = duration;
    }
  }

  @Test
  public void testDurationSerialization() throws Exception {
    // Create a Duration of 3 seconds
    Duration duration = Duration.newBuilder().setSeconds(3).build();
    
    TestClass testObject = new TestClass(duration);
    
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(testObject);
    
    // The Duration should be serialized as "3s" by Durations.toString()
    assertEquals("{\"duration\":\"3s\"}", json);
  }

  @Test
  public void testDurationSerializationWithNanos() throws Exception {
    // Create a Duration of 3.5 seconds (3 seconds + 500000000 nanoseconds)
    Duration duration = Duration.newBuilder()
        .setSeconds(3)
        .setNanos(500000000)
        .build();
    
    TestClass testObject = new TestClass(duration);
    
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(testObject);
    
    // The Duration should be serialized as "3.500s" by Durations.toString()
    assertEquals("{\"duration\":\"3.500s\"}", json);
  }

  @Test
  public void testNullDurationSerialization() throws Exception {
    TestClass testObject = new TestClass(null);
    
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(testObject);
    
    // Null duration should be serialized as null
    assertEquals("{\"duration\":null}", json);
  }

  @Test
  public void testZeroDurationSerialization() throws Exception {
    // Create a Duration of 0 seconds
    Duration duration = Duration.newBuilder().setSeconds(0).build();
    
    TestClass testObject = new TestClass(duration);
    
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(testObject);
    
    // The Duration should be serialized as "0s" by Durations.toString()
    assertEquals("{\"duration\":\"0s\"}", json);
  }
} 