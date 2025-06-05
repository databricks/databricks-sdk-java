// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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

/** A DatabaseInstanceRole represents a Postgres role in a database instance. */
@Generated
@JsonSerialize(using = DatabaseInstanceRole.DatabaseInstanceRoleSerializer.class)
@JsonDeserialize(using = DatabaseInstanceRole.DatabaseInstanceRoleDeserializer.class)
public class DatabaseInstanceRole {
  /** API-exposed Postgres role attributes */
  private DatabaseInstanceRoleAttributes attributes;

  /** The type of the role. */
  private DatabaseInstanceRoleIdentityType identityType;

  /** An enum value for a standard role that this role is a member of. */
  private DatabaseInstanceRoleMembershipRole membershipRole;

  /** The name of the role. This is the unique identifier for the role in an instance. */
  private String name;

  public DatabaseInstanceRole setAttributes(DatabaseInstanceRoleAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  public DatabaseInstanceRoleAttributes getAttributes() {
    return attributes;
  }

  public DatabaseInstanceRole setIdentityType(DatabaseInstanceRoleIdentityType identityType) {
    this.identityType = identityType;
    return this;
  }

  public DatabaseInstanceRoleIdentityType getIdentityType() {
    return identityType;
  }

  public DatabaseInstanceRole setMembershipRole(DatabaseInstanceRoleMembershipRole membershipRole) {
    this.membershipRole = membershipRole;
    return this;
  }

  public DatabaseInstanceRoleMembershipRole getMembershipRole() {
    return membershipRole;
  }

  public DatabaseInstanceRole setName(String name) {
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
    DatabaseInstanceRole that = (DatabaseInstanceRole) o;
    return Objects.equals(attributes, that.attributes)
        && Objects.equals(identityType, that.identityType)
        && Objects.equals(membershipRole, that.membershipRole)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, identityType, membershipRole, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseInstanceRole.class)
        .add("attributes", attributes)
        .add("identityType", identityType)
        .add("membershipRole", membershipRole)
        .add("name", name)
        .toString();
  }

  DatabaseInstanceRolePb toPb() {
    DatabaseInstanceRolePb pb = new DatabaseInstanceRolePb();
    pb.setAttributes(attributes);
    pb.setIdentityType(identityType);
    pb.setMembershipRole(membershipRole);
    pb.setName(name);

    return pb;
  }

  static DatabaseInstanceRole fromPb(DatabaseInstanceRolePb pb) {
    DatabaseInstanceRole model = new DatabaseInstanceRole();
    model.setAttributes(pb.getAttributes());
    model.setIdentityType(pb.getIdentityType());
    model.setMembershipRole(pb.getMembershipRole());
    model.setName(pb.getName());

    return model;
  }

  public static class DatabaseInstanceRoleSerializer extends JsonSerializer<DatabaseInstanceRole> {
    @Override
    public void serialize(
        DatabaseInstanceRole value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DatabaseInstanceRolePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DatabaseInstanceRoleDeserializer
      extends JsonDeserializer<DatabaseInstanceRole> {
    @Override
    public DatabaseInstanceRole deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DatabaseInstanceRolePb pb = mapper.readValue(p, DatabaseInstanceRolePb.class);
      return DatabaseInstanceRole.fromPb(pb);
    }
  }
}
