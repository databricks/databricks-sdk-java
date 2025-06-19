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
@JsonSerialize(using = CreateProviderRequest.CreateProviderRequestSerializer.class)
@JsonDeserialize(using = CreateProviderRequest.CreateProviderRequestDeserializer.class)
public class CreateProviderRequest {
  /** */
  private ProviderInfo provider;

  public CreateProviderRequest setProvider(ProviderInfo provider) {
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
    CreateProviderRequest that = (CreateProviderRequest) o;
    return Objects.equals(provider, that.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateProviderRequest.class).add("provider", provider).toString();
  }

  CreateProviderRequestPb toPb() {
    CreateProviderRequestPb pb = new CreateProviderRequestPb();
    pb.setProvider(provider);

    return pb;
  }

  static CreateProviderRequest fromPb(CreateProviderRequestPb pb) {
    CreateProviderRequest model = new CreateProviderRequest();
    model.setProvider(pb.getProvider());

    return model;
  }

  public static class CreateProviderRequestSerializer
      extends JsonSerializer<CreateProviderRequest> {
    @Override
    public void serialize(
        CreateProviderRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateProviderRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateProviderRequestDeserializer
      extends JsonDeserializer<CreateProviderRequest> {
    @Override
    public CreateProviderRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateProviderRequestPb pb = mapper.readValue(p, CreateProviderRequestPb.class);
      return CreateProviderRequest.fromPb(pb);
    }
  }
}
