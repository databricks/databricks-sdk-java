// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

/** Key-value pair. */
@Generated
@JsonSerialize(using = MapStringValueEntry.MapStringValueEntrySerializer.class)
@JsonDeserialize(using = MapStringValueEntry.MapStringValueEntryDeserializer.class)
public class MapStringValueEntry {
  /** Column name. */
  private String key;

  /** Column value, nullable. */
  private Value value;

  public MapStringValueEntry setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public MapStringValueEntry setValue(Value value) {
    this.value = value;
    return this;
  }

  public Value getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MapStringValueEntry that = (MapStringValueEntry) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(MapStringValueEntry.class).add("key", key).add("value", value).toString();
  }

  MapStringValueEntryPb toPb() {
    MapStringValueEntryPb pb = new MapStringValueEntryPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static MapStringValueEntry fromPb(MapStringValueEntryPb pb) {
    MapStringValueEntry model = new MapStringValueEntry();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class MapStringValueEntrySerializer extends JsonSerializer<MapStringValueEntry> {
    @Override
    public void serialize(MapStringValueEntry value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MapStringValueEntryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MapStringValueEntryDeserializer
      extends JsonDeserializer<MapStringValueEntry> {
    @Override
    public MapStringValueEntry deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MapStringValueEntryPb pb = mapper.readValue(p, MapStringValueEntryPb.class);
      return MapStringValueEntry.fromPb(pb);
    }
  }
}
