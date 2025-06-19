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
@JsonSerialize(using = UnpinClusterResponse.UnpinClusterResponseSerializer.class)
@JsonDeserialize(using = UnpinClusterResponse.UnpinClusterResponseDeserializer.class)
public class UnpinClusterResponse {

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
    return new ToStringer(UnpinClusterResponse.class).toString();
  }

  UnpinClusterResponsePb toPb() {
    UnpinClusterResponsePb pb = new UnpinClusterResponsePb();

    return pb;
  }

  static UnpinClusterResponse fromPb(UnpinClusterResponsePb pb) {
    UnpinClusterResponse model = new UnpinClusterResponse();

    return model;
  }

  public static class UnpinClusterResponseSerializer extends JsonSerializer<UnpinClusterResponse> {
    @Override
    public void serialize(
        UnpinClusterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UnpinClusterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UnpinClusterResponseDeserializer
      extends JsonDeserializer<UnpinClusterResponse> {
    @Override
    public UnpinClusterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UnpinClusterResponsePb pb = mapper.readValue(p, UnpinClusterResponsePb.class);
      return UnpinClusterResponse.fromPb(pb);
    }
  }
}
