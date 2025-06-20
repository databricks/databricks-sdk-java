package com.databricks.sdk.core.serialization;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.protobuf.FieldMask;
import com.google.protobuf.util.FieldMaskUtil;
import org.junit.jupiter.api.Test;

public class FieldMaskSerializerTest {
  private static class TestClass {
    @JsonSerialize(using = FieldMaskSerializer.class)
    private FieldMask fieldMask;

    public TestClass(FieldMask fieldMask) {
      this.fieldMask = fieldMask;
    }
  }

  @Test
  public void testFieldMaskSerialization() throws Exception {
    FieldMask mask = FieldMaskUtil.fromStringList(java.util.Arrays.asList("foo", "bar.baz"));
    TestClass testObject = new TestClass(mask);
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(testObject);
    assertEquals("{\"fieldMask\":\"foo,bar.baz\"}", json);
  }

  @Test
  public void testNullFieldMaskSerialization() throws Exception {
    TestClass testObject = new TestClass(null);
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(testObject);
    assertEquals("{\"fieldMask\":null}", json);
  }
} 