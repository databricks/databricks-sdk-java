package com.databricks.sdk.core.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.protobuf.FieldMask;
import com.google.protobuf.util.FieldMaskUtil;
import java.io.IOException;

public class FieldMaskDeserializer extends JsonDeserializer<FieldMask> {
  @Override
  public FieldMask deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
    String fieldMaskStr = p.getValueAsString();
    if (fieldMaskStr == null || fieldMaskStr.isEmpty()) {
      return null;
    }
    try {
      return FieldMaskUtil.fromJsonString(fieldMaskStr); // Parses JSON string format
    } catch (Exception e) {
      throw new IOException("Failed to parse field mask: " + fieldMaskStr, e);
    }
  }
}
