package com.databricks.sdk.core.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;
import java.io.IOException;

public class TimestampSerializer extends JsonSerializer<Timestamp> {
  @Override
  public void serialize(Timestamp value, JsonGenerator gen, SerializerProvider serializers)
      throws IOException {
    if (value != null) {
      String timestampStr = Timestamps.toString(value); // Converts to RFC 3339 format
      gen.writeString(timestampStr);
    } else {
      gen.writeNull();
    }
  }
}
