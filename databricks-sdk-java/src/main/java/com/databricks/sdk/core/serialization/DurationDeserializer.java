package com.databricks.sdk.core.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.protobuf.Duration;
import com.google.protobuf.util.Durations;
import java.io.IOException;

public class DurationDeserializer extends JsonDeserializer<Duration> {
  @Override
  public Duration deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
    String durationStr = p.getValueAsString();
    if (durationStr == null || durationStr.isEmpty()) {
      return null;
    }
    try {
      return Durations.parse(durationStr); // Parses duration format like "3.000s"
    } catch (Exception e) {
      throw new IOException("Failed to parse duration: " + durationStr, e);
    }
  }
}
