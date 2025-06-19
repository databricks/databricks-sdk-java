// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** Get permissions */
@Generated
@JsonSerialize(using = GetGrantRequest.GetGrantRequestSerializer.class)
@JsonDeserialize(using = GetGrantRequest.GetGrantRequestDeserializer.class)
public class GetGrantRequest {
  /** Full name of securable. */
  private String fullName;

  /** If provided, only the permissions for the specified principal (user or group) are returned. */
  private String principal;

  /** Type of securable. */
  private SecurableType securableType;

  public GetGrantRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetGrantRequest setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public GetGrantRequest setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public SecurableType getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetGrantRequest that = (GetGrantRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(principal, that.principal)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, principal, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetGrantRequest.class)
        .add("fullName", fullName)
        .add("principal", principal)
        .add("securableType", securableType)
        .toString();
  }

  GetGrantRequestPb toPb() {
    GetGrantRequestPb pb = new GetGrantRequestPb();
    pb.setFullName(fullName);
    pb.setPrincipal(principal);
    pb.setSecurableType(securableType);

    return pb;
  }

  static GetGrantRequest fromPb(GetGrantRequestPb pb) {
    GetGrantRequest model = new GetGrantRequest();
    model.setFullName(pb.getFullName());
    model.setPrincipal(pb.getPrincipal());
    model.setSecurableType(pb.getSecurableType());

    return model;
  }

  public static class GetGrantRequestSerializer extends JsonSerializer<GetGrantRequest> {
    @Override
    public void serialize(GetGrantRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetGrantRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetGrantRequestDeserializer extends JsonDeserializer<GetGrantRequest> {
    @Override
    public GetGrantRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetGrantRequestPb pb = mapper.readValue(p, GetGrantRequestPb.class);
      return GetGrantRequest.fromPb(pb);
    }
  }
}
