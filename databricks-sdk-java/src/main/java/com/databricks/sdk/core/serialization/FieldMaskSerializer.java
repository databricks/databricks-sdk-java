package com.databricks.sdk.core.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.protobuf.FieldMask;
import com.google.protobuf.util.FieldMaskUtil;
import java.io.IOException;

public class FieldMaskSerializer extends JsonSerializer<FieldMask> {
  @Override
  public void serialize(FieldMask value, JsonGenerator gen, SerializerProvider serializers)
      throws IOException {
    if (value != null) {
      String fieldMaskStr = FieldMaskUtil.toJsonString(value); // Converts to JSON string format
      gen.writeString(fieldMaskStr);
    } else {
      gen.writeNull();
    }
  }
}
