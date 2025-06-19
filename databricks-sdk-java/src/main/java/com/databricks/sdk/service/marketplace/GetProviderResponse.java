// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = GetProviderResponse.GetProviderResponseSerializer.class)
@JsonDeserialize(using = GetProviderResponse.GetProviderResponseDeserializer.class)
public class GetProviderResponse {
  /** */
  private ProviderInfo provider;

  public GetProviderResponse setProvider(ProviderInfo provider) {
    this.provider = provider;
    return this;
  }

  public ProviderInfo getProvider() {
    return provider;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetProviderResponse that = (GetProviderResponse) o;
    return Objects.equals(provider, that.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider);
  }

  @Override
  public String toString() {
    return new ToStringer(GetProviderResponse.class).add("provider", provider).toString();
  }

  GetProviderResponsePb toPb() {
    GetProviderResponsePb pb = new GetProviderResponsePb();
    pb.setProvider(provider);

    return pb;
  }

  static GetProviderResponse fromPb(GetProviderResponsePb pb) {
    GetProviderResponse model = new GetProviderResponse();
    model.setProvider(pb.getProvider());

    return model;
  }

  public static class GetProviderResponseSerializer extends JsonSerializer<GetProviderResponse> {
    @Override
    public void serialize(GetProviderResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetProviderResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetProviderResponseDeserializer
      extends JsonDeserializer<GetProviderResponse> {
    @Override
    public GetProviderResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetProviderResponsePb pb = mapper.readValue(p, GetProviderResponsePb.class);
      return GetProviderResponse.fromPb(pb);
    }
  }
}
