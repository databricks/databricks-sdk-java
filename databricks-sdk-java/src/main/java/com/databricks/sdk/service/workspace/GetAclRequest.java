// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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

/** Get secret ACL details */
@Generated
@JsonSerialize(using = GetAclRequest.GetAclRequestSerializer.class)
@JsonDeserialize(using = GetAclRequest.GetAclRequestDeserializer.class)
public class GetAclRequest {
  /** The principal to fetch ACL information for. */
  private String principal;

  /** The name of the scope to fetch ACL information from. */
  private String scope;

  public GetAclRequest setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public GetAclRequest setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAclRequest that = (GetAclRequest) o;
    return Objects.equals(principal, that.principal) && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAclRequest.class)
        .add("principal", principal)
        .add("scope", scope)
        .toString();
  }

  GetAclRequestPb toPb() {
    GetAclRequestPb pb = new GetAclRequestPb();
    pb.setPrincipal(principal);
    pb.setScope(scope);

    return pb;
  }

  static GetAclRequest fromPb(GetAclRequestPb pb) {
    GetAclRequest model = new GetAclRequest();
    model.setPrincipal(pb.getPrincipal());
    model.setScope(pb.getScope());

    return model;
  }

  public static class GetAclRequestSerializer extends JsonSerializer<GetAclRequest> {
    @Override
    public void serialize(GetAclRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAclRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAclRequestDeserializer extends JsonDeserializer<GetAclRequest> {
    @Override
    public GetAclRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAclRequestPb pb = mapper.readValue(p, GetAclRequestPb.class);
      return GetAclRequest.fromPb(pb);
    }
  }
}
