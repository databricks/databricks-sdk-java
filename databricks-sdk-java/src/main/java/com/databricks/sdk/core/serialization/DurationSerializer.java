package com.databricks.sdk.core.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.protobuf.Duration;
import com.google.protobuf.util.Durations;
import java.io.IOException;

public class DurationSerializer extends JsonSerializer<Duration> {
  @Override
  public void serialize(Duration value, JsonGenerator gen, SerializerProvider serializers)
      throws IOException {
    if (value != null) {
      String durationStr = Durations.toString(value); // Converts to "3.000s"
      gen.writeString(durationStr);
    } else {
      gen.writeNull();
    }
  }
}
