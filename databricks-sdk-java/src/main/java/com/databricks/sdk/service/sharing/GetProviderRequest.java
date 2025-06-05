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

/** Get a provider */
@Generated
@JsonSerialize(using = GetProviderRequest.GetProviderRequestSerializer.class)
@JsonDeserialize(using = GetProviderRequest.GetProviderRequestDeserializer.class)
public class GetProviderRequest {
  /** Name of the provider. */
  private String name;

  public GetProviderRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetProviderRequest that = (GetProviderRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetProviderRequest.class).add("name", name).toString();
  }

  GetProviderRequestPb toPb() {
    GetProviderRequestPb pb = new GetProviderRequestPb();
    pb.setName(name);

    return pb;
  }

  static GetProviderRequest fromPb(GetProviderRequestPb pb) {
    GetProviderRequest model = new GetProviderRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class GetProviderRequestSerializer extends JsonSerializer<GetProviderRequest> {
    @Override
    public void serialize(GetProviderRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetProviderRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetProviderRequestDeserializer extends JsonDeserializer<GetProviderRequest> {
    @Override
    public GetProviderRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetProviderRequestPb pb = mapper.readValue(p, GetProviderRequestPb.class);
      return GetProviderRequest.fromPb(pb);
    }
  }
}
