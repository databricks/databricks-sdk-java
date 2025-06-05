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

/** Get effective permissions */
@Generated
@JsonSerialize(using = GetEffectiveRequest.GetEffectiveRequestSerializer.class)
@JsonDeserialize(using = GetEffectiveRequest.GetEffectiveRequestDeserializer.class)
public class GetEffectiveRequest {
  /** Full name of securable. */
  private String fullName;

  /**
   * If provided, only the effective permissions for the specified principal (user or group) are
   * returned.
   */
  private String principal;

  /** Type of securable. */
  private SecurableType securableType;

  public GetEffectiveRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetEffectiveRequest setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public GetEffectiveRequest setSecurableType(SecurableType securableType) {
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
    GetEffectiveRequest that = (GetEffectiveRequest) o;
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
    return new ToStringer(GetEffectiveRequest.class)
        .add("fullName", fullName)
        .add("principal", principal)
        .add("securableType", securableType)
        .toString();
  }

  GetEffectiveRequestPb toPb() {
    GetEffectiveRequestPb pb = new GetEffectiveRequestPb();
    pb.setFullName(fullName);
    pb.setPrincipal(principal);
    pb.setSecurableType(securableType);

    return pb;
  }

  static GetEffectiveRequest fromPb(GetEffectiveRequestPb pb) {
    GetEffectiveRequest model = new GetEffectiveRequest();
    model.setFullName(pb.getFullName());
    model.setPrincipal(pb.getPrincipal());
    model.setSecurableType(pb.getSecurableType());

    return model;
  }

  public static class GetEffectiveRequestSerializer extends JsonSerializer<GetEffectiveRequest> {
    @Override
    public void serialize(GetEffectiveRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetEffectiveRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetEffectiveRequestDeserializer
      extends JsonDeserializer<GetEffectiveRequest> {
    @Override
    public GetEffectiveRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetEffectiveRequestPb pb = mapper.readValue(p, GetEffectiveRequestPb.class);
      return GetEffectiveRequest.fromPb(pb);
    }
  }
}
