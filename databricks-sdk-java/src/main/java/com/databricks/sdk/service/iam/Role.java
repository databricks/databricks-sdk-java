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

@Generated
@JsonSerialize(using = Role.RoleSerializer.class)
@JsonDeserialize(using = Role.RoleDeserializer.class)
public class Role {
  /** Role to assign to a principal or a list of principals on a resource. */
  private String name;

  public Role setName(String name) {
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
    Role that = (Role) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(Role.class).add("name", name).toString();
  }

  RolePb toPb() {
    RolePb pb = new RolePb();
    pb.setName(name);

    return pb;
  }

  static Role fromPb(RolePb pb) {
    Role model = new Role();
    model.setName(pb.getName());

    return model;
  }

  public static class RoleSerializer extends JsonSerializer<Role> {
    @Override
    public void serialize(Role value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RolePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RoleDeserializer extends JsonDeserializer<Role> {
    @Override
    public Role deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RolePb pb = mapper.readValue(p, RolePb.class);
      return Role.fromPb(pb);
    }
  }
}
