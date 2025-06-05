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
@JsonSerialize(using = AclItem.AclItemSerializer.class)
@JsonDeserialize(using = AclItem.AclItemDeserializer.class)
public class AclItem {
  /** The permission level applied to the principal. */
  private AclPermission permission;

  /** The principal in which the permission is applied. */
  private String principal;

  public AclItem setPermission(AclPermission permission) {
    this.permission = permission;
    return this;
  }

  public AclPermission getPermission() {
    return permission;
  }

  public AclItem setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AclItem that = (AclItem) o;
    return Objects.equals(permission, that.permission) && Objects.equals(principal, that.principal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, principal);
  }

  @Override
  public String toString() {
    return new ToStringer(AclItem.class)
        .add("permission", permission)
        .add("principal", principal)
        .toString();
  }

  AclItemPb toPb() {
    AclItemPb pb = new AclItemPb();
    pb.setPermission(permission);
    pb.setPrincipal(principal);

    return pb;
  }

  static AclItem fromPb(AclItemPb pb) {
    AclItem model = new AclItem();
    model.setPermission(pb.getPermission());
    model.setPrincipal(pb.getPrincipal());

    return model;
  }

  public static class AclItemSerializer extends JsonSerializer<AclItem> {
    @Override
    public void serialize(AclItem value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AclItemPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AclItemDeserializer extends JsonDeserializer<AclItem> {
    @Override
    public AclItem deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AclItemPb pb = mapper.readValue(p, AclItemPb.class);
      return AclItem.fromPb(pb);
    }
  }
}
