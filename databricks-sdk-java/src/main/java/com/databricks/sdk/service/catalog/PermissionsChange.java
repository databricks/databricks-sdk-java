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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = PermissionsChange.PermissionsChangeSerializer.class)
@JsonDeserialize(using = PermissionsChange.PermissionsChangeDeserializer.class)
public class PermissionsChange {
  /** The set of privileges to add. */
  private Collection<Privilege> add;

  /** The principal whose privileges we are changing. */
  private String principal;

  /** The set of privileges to remove. */
  private Collection<Privilege> remove;

  public PermissionsChange setAdd(Collection<Privilege> add) {
    this.add = add;
    return this;
  }

  public Collection<Privilege> getAdd() {
    return add;
  }

  public PermissionsChange setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public PermissionsChange setRemove(Collection<Privilege> remove) {
    this.remove = remove;
    return this;
  }

  public Collection<Privilege> getRemove() {
    return remove;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionsChange that = (PermissionsChange) o;
    return Objects.equals(add, that.add)
        && Objects.equals(principal, that.principal)
        && Objects.equals(remove, that.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, principal, remove);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionsChange.class)
        .add("add", add)
        .add("principal", principal)
        .add("remove", remove)
        .toString();
  }

  PermissionsChangePb toPb() {
    PermissionsChangePb pb = new PermissionsChangePb();
    pb.setAdd(add);
    pb.setPrincipal(principal);
    pb.setRemove(remove);

    return pb;
  }

  static PermissionsChange fromPb(PermissionsChangePb pb) {
    PermissionsChange model = new PermissionsChange();
    model.setAdd(pb.getAdd());
    model.setPrincipal(pb.getPrincipal());
    model.setRemove(pb.getRemove());

    return model;
  }

  public static class PermissionsChangeSerializer extends JsonSerializer<PermissionsChange> {
    @Override
    public void serialize(PermissionsChange value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PermissionsChangePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PermissionsChangeDeserializer extends JsonDeserializer<PermissionsChange> {
    @Override
    public PermissionsChange deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PermissionsChangePb pb = mapper.readValue(p, PermissionsChangePb.class);
      return PermissionsChange.fromPb(pb);
    }
  }
}
