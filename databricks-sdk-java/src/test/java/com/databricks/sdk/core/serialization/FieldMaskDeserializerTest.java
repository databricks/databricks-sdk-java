package com.databricks.sdk.core.serialization;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.protobuf.FieldMask;
import com.google.protobuf.util.FieldMaskUtil;
import org.junit.jupiter.api.Test;

public class FieldMaskDeserializerTest {
  private static class TestClass {
    @JsonDeserialize(using = FieldMaskDeserializer.class)
    private FieldMask fieldMask;

    public FieldMask getFieldMask() {
      return fieldMask;
    }
  }

  @Test
  public void testFieldMaskDeserialization() throws Exception {
    String json = "{\"fieldMask\":\"foo,bar.baz\"}";
    ObjectMapper mapper = new ObjectMapper();
    TestClass obj = mapper.readValue(json, TestClass.class);
    assertEquals(FieldMaskUtil.fromStringList(java.util.Arrays.asList("foo", "bar.baz")), obj.getFieldMask());
  }

  @Test
  public void testNullFieldMaskDeserialization() throws Exception {
    String json = "{\"fieldMask\":null}";
    ObjectMapper mapper = new ObjectMapper();
    TestClass obj = mapper.readValue(json, TestClass.class);
    assertNull(obj.getFieldMask());
  }
} 