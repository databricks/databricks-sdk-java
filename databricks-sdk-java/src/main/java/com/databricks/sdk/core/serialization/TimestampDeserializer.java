package com.databricks.sdk.core.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;
import java.io.IOException;

public class TimestampDeserializer extends JsonDeserializer<Timestamp> {
  @Override
  public Timestamp deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
    String timestampStr = p.getValueAsString();
    if (timestampStr == null || timestampStr.isEmpty()) {
      return null;
    }
    try {
      return Timestamps.parse(timestampStr); // Parses RFC 3339 format
    } catch (Exception e) {
      throw new IOException("Failed to parse timestamp: " + timestampStr, e);
    }
  }
}
