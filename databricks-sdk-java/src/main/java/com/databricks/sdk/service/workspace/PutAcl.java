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

@Generated
@JsonSerialize(using = PutAcl.PutAclSerializer.class)
@JsonDeserialize(using = PutAcl.PutAclDeserializer.class)
public class PutAcl {
  /** The permission level applied to the principal. */
  private AclPermission permission;

  /** The principal in which the permission is applied. */
  private String principal;

  /** The name of the scope to apply permissions to. */
  private String scope;

  public PutAcl setPermission(AclPermission permission) {
    this.permission = permission;
    return this;
  }

  public AclPermission getPermission() {
    return permission;
  }

  public PutAcl setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public PutAcl setScope(String scope) {
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
    PutAcl that = (PutAcl) o;
    return Objects.equals(permission, that.permission)
        && Objects.equals(principal, that.principal)
        && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, principal, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(PutAcl.class)
        .add("permission", permission)
        .add("principal", principal)
        .add("scope", scope)
        .toString();
  }

  PutAclPb toPb() {
    PutAclPb pb = new PutAclPb();
    pb.setPermission(permission);
    pb.setPrincipal(principal);
    pb.setScope(scope);

    return pb;
  }

  static PutAcl fromPb(PutAclPb pb) {
    PutAcl model = new PutAcl();
    model.setPermission(pb.getPermission());
    model.setPrincipal(pb.getPrincipal());
    model.setScope(pb.getScope());

    return model;
  }

  public static class PutAclSerializer extends JsonSerializer<PutAcl> {
    @Override
    public void serialize(PutAcl value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PutAclPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PutAclDeserializer extends JsonDeserializer<PutAcl> {
    @Override
    public PutAcl deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PutAclPb pb = mapper.readValue(p, PutAclPb.class);
      return PutAcl.fromPb(pb);
    }
  }
}
