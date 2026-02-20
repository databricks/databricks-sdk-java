package com.databricks.sdk.core.utils;

import com.databricks.sdk.support.InternalApi;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.google.protobuf.Duration;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Durations;
import com.google.protobuf.util.Timestamps;
import java.io.IOException;

/** Jackson module for serializing and deserializing Google Protocol Buffers types. */
@InternalApi
public class ProtobufModule extends SimpleModule {

  public ProtobufModule() {
    super("ProtobufModule");

    // FieldMask serializers.
    addSerializer(FieldMask.class, new FieldMaskSerializer());
    addDeserializer(FieldMask.class, new FieldMaskDeserializer());

    // Duration serializers.
    addSerializer(Duration.class, new DurationSerializer());
    addDeserializer(Duration.class, new DurationDeserializer());

    // Timestamp serializers.
    addSerializer(Timestamp.class, new TimestampSerializer());
    addDeserializer(Timestamp.class, new TimestampDeserializer());
  }

  /** Serializes FieldMask using simple string joining to preserve original casing. */
  public static class FieldMaskSerializer extends JsonSerializer<FieldMask> {
    @Override
    public void serialize(FieldMask fieldMask, JsonGenerator gen, SerializerProvider serializers)
        throws IOException {
      // Unlike the Google API, we preserve the original casing of the field paths.
      gen.writeString(String.join(",", fieldMask.getPathsList()));
    }
  }

  /** Deserializes FieldMask using simple string splitting to preserve original casing. */
  public static class FieldMaskDeserializer extends JsonDeserializer<FieldMask> {
    @Override
    public FieldMask deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String pathsString = p.getValueAsString();
      if (pathsString == null || pathsString.trim().isEmpty()) {
        return FieldMask.getDefaultInstance();
      }

      // Unlike the Google API, we preserve the original casing of the field paths.
      FieldMask.Builder builder = FieldMask.newBuilder();
      String[] paths = pathsString.split(",");
      for (String path : paths) {
        String trimmedPath = path.trim();
        if (!trimmedPath.isEmpty()) {
          builder.addPaths(trimmedPath);
        }
      }
      return builder.build();
    }
  }

  /** Serializes Duration using Google's built-in utility. */
  public static class DurationSerializer extends JsonSerializer<Duration> {
    @Override
    public void serialize(Duration duration, JsonGenerator gen, SerializerProvider serializers)
        throws IOException {
      gen.writeString(Durations.toString(duration));
    }
  }

  /** Deserializes Duration using Google's built-in utility. */
  public static class DurationDeserializer extends JsonDeserializer<Duration> {
    @Override
    public Duration deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String durationString = p.getValueAsString();
      if (durationString == null || durationString.trim().isEmpty()) {
        return Duration.getDefaultInstance();
      }

      try {
        return Durations.parse(durationString.trim());
      } catch (Exception e) {
        throw new IOException("Invalid duration format: " + durationString, e);
      }
    }
  }

  /** Serializes Timestamp using Google's built-in utility. */
  public static class TimestampSerializer extends JsonSerializer<Timestamp> {
    @Override
    public void serialize(Timestamp timestamp, JsonGenerator gen, SerializerProvider serializers)
        throws IOException {
      gen.writeString(Timestamps.toString(timestamp));
    }
  }

  /** Deserializes Timestamp using Google's built-in utility. */
  public static class TimestampDeserializer extends JsonDeserializer<Timestamp> {
    @Override
    public Timestamp deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String timestampString = p.getValueAsString();
      if (timestampString == null || timestampString.trim().isEmpty()) {
        return Timestamp.getDefaultInstance();
      }

      try {
        return Timestamps.parse(timestampString.trim());
      } catch (Exception e) {
        throw new IOException("Invalid timestamp format: " + timestampString, e);
      }
    }
  }
}
