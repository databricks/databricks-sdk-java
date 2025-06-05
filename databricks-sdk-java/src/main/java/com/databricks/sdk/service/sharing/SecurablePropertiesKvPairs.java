// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
 * An object with __properties__ containing map of key-value properties attached to the securable.
 */
@Generated
@JsonSerialize(using = SecurablePropertiesKvPairs.SecurablePropertiesKvPairsSerializer.class)
@JsonDeserialize(using = SecurablePropertiesKvPairs.SecurablePropertiesKvPairsDeserializer.class)
public class SecurablePropertiesKvPairs {
  /** A map of key-value properties attached to the securable. */
  private Map<String, String> properties;

  public SecurablePropertiesKvPairs setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecurablePropertiesKvPairs that = (SecurablePropertiesKvPairs) o;
    return Objects.equals(properties, that.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties);
  }

  @Override
  public String toString() {
    return new ToStringer(SecurablePropertiesKvPairs.class)
        .add("properties", properties)
        .toString();
  }

  SecurablePropertiesKvPairsPb toPb() {
    SecurablePropertiesKvPairsPb pb = new SecurablePropertiesKvPairsPb();
    pb.setProperties(properties);

    return pb;
  }

  static SecurablePropertiesKvPairs fromPb(SecurablePropertiesKvPairsPb pb) {
    SecurablePropertiesKvPairs model = new SecurablePropertiesKvPairs();
    model.setProperties(pb.getProperties());

    return model;
  }

  public static class SecurablePropertiesKvPairsSerializer
      extends JsonSerializer<SecurablePropertiesKvPairs> {
    @Override
    public void serialize(
        SecurablePropertiesKvPairs value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SecurablePropertiesKvPairsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SecurablePropertiesKvPairsDeserializer
      extends JsonDeserializer<SecurablePropertiesKvPairs> {
    @Override
    public SecurablePropertiesKvPairs deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SecurablePropertiesKvPairsPb pb = mapper.readValue(p, SecurablePropertiesKvPairsPb.class);
      return SecurablePropertiesKvPairs.fromPb(pb);
    }
  }
}
