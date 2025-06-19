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
import java.util.Objects;

@Generated
@JsonSerialize(using = GetActivationUrlInfoResponse.GetActivationUrlInfoResponseSerializer.class)
@JsonDeserialize(
    using = GetActivationUrlInfoResponse.GetActivationUrlInfoResponseDeserializer.class)
public class GetActivationUrlInfoResponse {

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
    return new ToStringer(GetActivationUrlInfoResponse.class).toString();
  }

  GetActivationUrlInfoResponsePb toPb() {
    GetActivationUrlInfoResponsePb pb = new GetActivationUrlInfoResponsePb();

    return pb;
  }

  static GetActivationUrlInfoResponse fromPb(GetActivationUrlInfoResponsePb pb) {
    GetActivationUrlInfoResponse model = new GetActivationUrlInfoResponse();

    return model;
  }

  public static class GetActivationUrlInfoResponseSerializer
      extends JsonSerializer<GetActivationUrlInfoResponse> {
    @Override
    public void serialize(
        GetActivationUrlInfoResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetActivationUrlInfoResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetActivationUrlInfoResponseDeserializer
      extends JsonDeserializer<GetActivationUrlInfoResponse> {
    @Override
    public GetActivationUrlInfoResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetActivationUrlInfoResponsePb pb = mapper.readValue(p, GetActivationUrlInfoResponsePb.class);
      return GetActivationUrlInfoResponse.fromPb(pb);
    }
  }
}
