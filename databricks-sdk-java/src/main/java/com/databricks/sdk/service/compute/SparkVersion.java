// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

@Generated
@JsonSerialize(using = SparkVersion.SparkVersionSerializer.class)
@JsonDeserialize(using = SparkVersion.SparkVersionDeserializer.class)
public class SparkVersion {
  /**
   * Spark version key, for example "2.1.x-scala2.11". This is the value which should be provided as
   * the "spark_version" when creating a new cluster. Note that the exact Spark version may change
   * over time for a "wildcard" version (i.e., "2.1.x-scala2.11" is a "wildcard" version) with minor
   * bug fixes.
   */
  private String key;

  /** A descriptive name for this Spark version, for example "Spark 2.1". */
  private String name;

  public SparkVersion setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SparkVersion setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkVersion that = (SparkVersion) o;
    return Objects.equals(key, that.key) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkVersion.class).add("key", key).add("name", name).toString();
  }

  SparkVersionPb toPb() {
    SparkVersionPb pb = new SparkVersionPb();
    pb.setKey(key);
    pb.setName(name);

    return pb;
  }

  static SparkVersion fromPb(SparkVersionPb pb) {
    SparkVersion model = new SparkVersion();
    model.setKey(pb.getKey());
    model.setName(pb.getName());

    return model;
  }

  public static class SparkVersionSerializer extends JsonSerializer<SparkVersion> {
    @Override
    public void serialize(SparkVersion value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SparkVersionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SparkVersionDeserializer extends JsonDeserializer<SparkVersion> {
    @Override
    public SparkVersion deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SparkVersionPb pb = mapper.readValue(p, SparkVersionPb.class);
      return SparkVersion.fromPb(pb);
    }
  }
}
