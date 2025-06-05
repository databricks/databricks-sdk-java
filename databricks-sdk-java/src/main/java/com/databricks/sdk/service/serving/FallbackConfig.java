// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(using = FallbackConfig.FallbackConfigSerializer.class)
@JsonDeserialize(using = FallbackConfig.FallbackConfigDeserializer.class)
public class FallbackConfig {
  /**
   * Whether to enable traffic fallback. When a served entity in the serving endpoint returns
   * specific error codes (e.g. 500), the request will automatically be round-robin attempted with
   * other served entities in the same endpoint, following the order of served entity list, until a
   * successful response is returned. If all attempts fail, return the last response with the error
   * code.
   */
  private Boolean enabled;

  public FallbackConfig setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FallbackConfig that = (FallbackConfig) o;
    return Objects.equals(enabled, that.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    return new ToStringer(FallbackConfig.class).add("enabled", enabled).toString();
  }

  FallbackConfigPb toPb() {
    FallbackConfigPb pb = new FallbackConfigPb();
    pb.setEnabled(enabled);

    return pb;
  }

  static FallbackConfig fromPb(FallbackConfigPb pb) {
    FallbackConfig model = new FallbackConfig();
    model.setEnabled(pb.getEnabled());

    return model;
  }

  public static class FallbackConfigSerializer extends JsonSerializer<FallbackConfig> {
    @Override
    public void serialize(FallbackConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FallbackConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FallbackConfigDeserializer extends JsonDeserializer<FallbackConfig> {
    @Override
    public FallbackConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FallbackConfigPb pb = mapper.readValue(p, FallbackConfigPb.class);
      return FallbackConfig.fromPb(pb);
    }
  }
}
