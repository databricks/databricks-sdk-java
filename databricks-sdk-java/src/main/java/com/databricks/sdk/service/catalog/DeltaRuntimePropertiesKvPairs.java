// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
import java.util.Map;
import java.util.Objects;

/**
 * Properties pertaining to the current state of the delta table as given by the commit server. This
 * does not contain **delta.*** (input) properties in __TableInfo.properties__.
 */
@Generated
@JsonSerialize(using = DeltaRuntimePropertiesKvPairs.DeltaRuntimePropertiesKvPairsSerializer.class)
@JsonDeserialize(
    using = DeltaRuntimePropertiesKvPairs.DeltaRuntimePropertiesKvPairsDeserializer.class)
public class DeltaRuntimePropertiesKvPairs {
  /** A map of key-value properties attached to the securable. */
  private Map<String, String> deltaRuntimeProperties;

  public DeltaRuntimePropertiesKvPairs setDeltaRuntimeProperties(
      Map<String, String> deltaRuntimeProperties) {
    this.deltaRuntimeProperties = deltaRuntimeProperties;
    return this;
  }

  public Map<String, String> getDeltaRuntimeProperties() {
    return deltaRuntimeProperties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaRuntimePropertiesKvPairs that = (DeltaRuntimePropertiesKvPairs) o;
    return Objects.equals(deltaRuntimeProperties, that.deltaRuntimeProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaRuntimeProperties);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaRuntimePropertiesKvPairs.class)
        .add("deltaRuntimeProperties", deltaRuntimeProperties)
        .toString();
  }

  DeltaRuntimePropertiesKvPairsPb toPb() {
    DeltaRuntimePropertiesKvPairsPb pb = new DeltaRuntimePropertiesKvPairsPb();
    pb.setDeltaRuntimeProperties(deltaRuntimeProperties);

    return pb;
  }

  static DeltaRuntimePropertiesKvPairs fromPb(DeltaRuntimePropertiesKvPairsPb pb) {
    DeltaRuntimePropertiesKvPairs model = new DeltaRuntimePropertiesKvPairs();
    model.setDeltaRuntimeProperties(pb.getDeltaRuntimeProperties());

    return model;
  }

  public static class DeltaRuntimePropertiesKvPairsSerializer
      extends JsonSerializer<DeltaRuntimePropertiesKvPairs> {
    @Override
    public void serialize(
        DeltaRuntimePropertiesKvPairs value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeltaRuntimePropertiesKvPairsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeltaRuntimePropertiesKvPairsDeserializer
      extends JsonDeserializer<DeltaRuntimePropertiesKvPairs> {
    @Override
    public DeltaRuntimePropertiesKvPairs deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeltaRuntimePropertiesKvPairsPb pb =
          mapper.readValue(p, DeltaRuntimePropertiesKvPairsPb.class);
      return DeltaRuntimePropertiesKvPairs.fromPb(pb);
    }
  }
}
