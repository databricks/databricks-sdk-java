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
@JsonSerialize(using = UpdateProviderResponse.UpdateProviderResponseSerializer.class)
@JsonDeserialize(using = UpdateProviderResponse.UpdateProviderResponseDeserializer.class)
public class UpdateProviderResponse {
  /** */
  private ProviderInfo provider;

  public UpdateProviderResponse setProvider(ProviderInfo provider) {
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
    UpdateProviderResponse that = (UpdateProviderResponse) o;
    return Objects.equals(provider, that.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateProviderResponse.class).add("provider", provider).toString();
  }

  UpdateProviderResponsePb toPb() {
    UpdateProviderResponsePb pb = new UpdateProviderResponsePb();
    pb.setProvider(provider);

    return pb;
  }

  static UpdateProviderResponse fromPb(UpdateProviderResponsePb pb) {
    UpdateProviderResponse model = new UpdateProviderResponse();
    model.setProvider(pb.getProvider());

    return model;
  }

  public static class UpdateProviderResponseSerializer
      extends JsonSerializer<UpdateProviderResponse> {
    @Override
    public void serialize(
        UpdateProviderResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateProviderResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateProviderResponseDeserializer
      extends JsonDeserializer<UpdateProviderResponse> {
    @Override
    public UpdateProviderResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateProviderResponsePb pb = mapper.readValue(p, UpdateProviderResponsePb.class);
      return UpdateProviderResponse.fromPb(pb);
    }
  }
}
