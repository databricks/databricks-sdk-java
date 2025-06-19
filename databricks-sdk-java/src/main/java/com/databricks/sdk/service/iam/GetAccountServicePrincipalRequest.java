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
@JsonSerialize(
    using = GetAccountServicePrincipalRequest.GetAccountServicePrincipalRequestSerializer.class)
@JsonDeserialize(
    using = GetAccountServicePrincipalRequest.GetAccountServicePrincipalRequestDeserializer.class)
public class GetAccountServicePrincipalRequest {
  /** Unique ID for a service principal in the Databricks account. */
  private String id;

  public GetAccountServicePrincipalRequest setId(String id) {
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
    GetAccountServicePrincipalRequest that = (GetAccountServicePrincipalRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountServicePrincipalRequest.class).add("id", id).toString();
  }

  GetAccountServicePrincipalRequestPb toPb() {
    GetAccountServicePrincipalRequestPb pb = new GetAccountServicePrincipalRequestPb();
    pb.setId(id);

    return pb;
  }

  static GetAccountServicePrincipalRequest fromPb(GetAccountServicePrincipalRequestPb pb) {
    GetAccountServicePrincipalRequest model = new GetAccountServicePrincipalRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class GetAccountServicePrincipalRequestSerializer
      extends JsonSerializer<GetAccountServicePrincipalRequest> {
    @Override
    public void serialize(
        GetAccountServicePrincipalRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAccountServicePrincipalRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAccountServicePrincipalRequestDeserializer
      extends JsonDeserializer<GetAccountServicePrincipalRequest> {
    @Override
    public GetAccountServicePrincipalRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAccountServicePrincipalRequestPb pb =
          mapper.readValue(p, GetAccountServicePrincipalRequestPb.class);
      return GetAccountServicePrincipalRequest.fromPb(pb);
    }
  }
}
