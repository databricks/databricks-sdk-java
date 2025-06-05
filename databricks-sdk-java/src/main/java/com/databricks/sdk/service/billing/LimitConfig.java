// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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

/**
 * The limit configuration of the policy. Limit configuration provide a budget policy level cost
 * control by enforcing the limit.
 */
@Generated
@JsonSerialize(using = LimitConfig.LimitConfigSerializer.class)
@JsonDeserialize(using = LimitConfig.LimitConfigDeserializer.class)
public class LimitConfig {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(LimitConfig.class).toString();
  }

  LimitConfigPb toPb() {
    LimitConfigPb pb = new LimitConfigPb();

    return pb;
  }

  static LimitConfig fromPb(LimitConfigPb pb) {
    LimitConfig model = new LimitConfig();

    return model;
  }

  public static class LimitConfigSerializer extends JsonSerializer<LimitConfig> {
    @Override
    public void serialize(LimitConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LimitConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LimitConfigDeserializer extends JsonDeserializer<LimitConfig> {
    @Override
    public LimitConfig deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LimitConfigPb pb = mapper.readValue(p, LimitConfigPb.class);
      return LimitConfig.fromPb(pb);
    }
  }
}
