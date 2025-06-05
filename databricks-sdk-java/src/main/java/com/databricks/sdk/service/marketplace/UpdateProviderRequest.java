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
@JsonSerialize(using = UpdateProviderRequest.UpdateProviderRequestSerializer.class)
@JsonDeserialize(using = UpdateProviderRequest.UpdateProviderRequestDeserializer.class)
public class UpdateProviderRequest {
  /** */
  private String id;

  /** */
  private ProviderInfo provider;

  public UpdateProviderRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateProviderRequest setProvider(ProviderInfo provider) {
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
    UpdateProviderRequest that = (UpdateProviderRequest) o;
    return Objects.equals(id, that.id) && Objects.equals(provider, that.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, provider);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateProviderRequest.class)
        .add("id", id)
        .add("provider", provider)
        .toString();
  }

  UpdateProviderRequestPb toPb() {
    UpdateProviderRequestPb pb = new UpdateProviderRequestPb();
    pb.setId(id);
    pb.setProvider(provider);

    return pb;
  }

  static UpdateProviderRequest fromPb(UpdateProviderRequestPb pb) {
    UpdateProviderRequest model = new UpdateProviderRequest();
    model.setId(pb.getId());
    model.setProvider(pb.getProvider());

    return model;
  }

  public static class UpdateProviderRequestSerializer
      extends JsonSerializer<UpdateProviderRequest> {
    @Override
    public void serialize(
        UpdateProviderRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateProviderRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateProviderRequestDeserializer
      extends JsonDeserializer<UpdateProviderRequest> {
    @Override
    public UpdateProviderRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateProviderRequestPb pb = mapper.readValue(p, UpdateProviderRequestPb.class);
      return UpdateProviderRequest.fromPb(pb);
    }
  }
}
