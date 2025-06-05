// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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

/** Get service principal details. */
@Generated
@JsonSerialize(using = GetServicePrincipalRequest.GetServicePrincipalRequestSerializer.class)
@JsonDeserialize(using = GetServicePrincipalRequest.GetServicePrincipalRequestDeserializer.class)
public class GetServicePrincipalRequest {
  /** Unique ID for a service principal in the Databricks workspace. */
  private String id;

  public GetServicePrincipalRequest setId(String id) {
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
    GetServicePrincipalRequest that = (GetServicePrincipalRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetServicePrincipalRequest.class).add("id", id).toString();
  }

  GetServicePrincipalRequestPb toPb() {
    GetServicePrincipalRequestPb pb = new GetServicePrincipalRequestPb();
    pb.setId(id);

    return pb;
  }

  static GetServicePrincipalRequest fromPb(GetServicePrincipalRequestPb pb) {
    GetServicePrincipalRequest model = new GetServicePrincipalRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class GetServicePrincipalRequestSerializer
      extends JsonSerializer<GetServicePrincipalRequest> {
    @Override
    public void serialize(
        GetServicePrincipalRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetServicePrincipalRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetServicePrincipalRequestDeserializer
      extends JsonDeserializer<GetServicePrincipalRequest> {
    @Override
    public GetServicePrincipalRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetServicePrincipalRequestPb pb = mapper.readValue(p, GetServicePrincipalRequestPb.class);
      return GetServicePrincipalRequest.fromPb(pb);
    }
  }
}
