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

/** Get a provider */
@Generated
@JsonSerialize(using = GetProviderRequest.GetProviderRequestSerializer.class)
@JsonDeserialize(using = GetProviderRequest.GetProviderRequestDeserializer.class)
public class GetProviderRequest {
  /** */
  private String id;

  public GetProviderRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetProviderRequest that = (GetProviderRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetProviderRequest.class).add("id", id).toString();
  }

  GetProviderRequestPb toPb() {
    GetProviderRequestPb pb = new GetProviderRequestPb();
    pb.setId(id);

    return pb;
  }

  static GetProviderRequest fromPb(GetProviderRequestPb pb) {
    GetProviderRequest model = new GetProviderRequest();
    model.setId(pb.getId());

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
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetProviderRequestPb pb = mapper.readValue(p, GetProviderRequestPb.class);
      return GetProviderRequest.fromPb(pb);
    }
  }
}
