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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ServicePrincipal.ServicePrincipalSerializer.class)
@JsonDeserialize(using = ServicePrincipal.ServicePrincipalDeserializer.class)
public class ServicePrincipal {
  /** If this user is active */
  private Boolean active;

  /** UUID relating to the service principal */
  private String applicationId;

  /** String that represents a concatenation of given and family names. */
  private String displayName;

  /**
   * Entitlements assigned to the service principal. See [assigning entitlements] for a full list of
   * supported values.
   *
   * <p>[assigning entitlements]:
   * https://docs.databricks.com/administration-guide/users-groups/index.html#assigning-entitlements
   */
  private Collection<ComplexValue> entitlements;

  /** */
  private String externalId;

  /** */
  private Collection<ComplexValue> groups;

  /** Databricks service principal ID. */
  private String id;

  /** Corresponds to AWS instance profile/arn role. */
  private Collection<ComplexValue> roles;

  /** The schema of the List response. */
  private Collection<ServicePrincipalSchema> schemas;

  public ServicePrincipal setActive(Boolean active) {
    this.active = active;
    return this;
  }

  public Boolean getActive() {
    return active;
  }

  public ServicePrincipal setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public ServicePrincipal setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ServicePrincipal setEntitlements(Collection<ComplexValue> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public Collection<ComplexValue> getEntitlements() {
    return entitlements;
  }

  public ServicePrincipal setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public ServicePrincipal setGroups(Collection<ComplexValue> groups) {
    this.groups = groups;
    return this;
  }

  public Collection<ComplexValue> getGroups() {
    return groups;
  }

  public ServicePrincipal setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ServicePrincipal setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  public ServicePrincipal setSchemas(Collection<ServicePrincipalSchema> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<ServicePrincipalSchema> getSchemas() {
    return schemas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServicePrincipal that = (ServicePrincipal) o;
    return Objects.equals(active, that.active)
        && Objects.equals(applicationId, that.applicationId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(entitlements, that.entitlements)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(groups, that.groups)
        && Objects.equals(id, that.id)
        && Objects.equals(roles, that.roles)
        && Objects.equals(schemas, that.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        active, applicationId, displayName, entitlements, externalId, groups, id, roles, schemas);
  }

  @Override
  public String toString() {
    return new ToStringer(ServicePrincipal.class)
        .add("active", active)
        .add("applicationId", applicationId)
        .add("displayName", displayName)
        .add("entitlements", entitlements)
        .add("externalId", externalId)
        .add("groups", groups)
        .add("id", id)
        .add("roles", roles)
        .add("schemas", schemas)
        .toString();
  }

  ServicePrincipalPb toPb() {
    ServicePrincipalPb pb = new ServicePrincipalPb();
    pb.setActive(active);
    pb.setApplicationId(applicationId);
    pb.setDisplayName(displayName);
    pb.setEntitlements(entitlements);
    pb.setExternalId(externalId);
    pb.setGroups(groups);
    pb.setId(id);
    pb.setRoles(roles);
    pb.setSchemas(schemas);

    return pb;
  }

  static ServicePrincipal fromPb(ServicePrincipalPb pb) {
    ServicePrincipal model = new ServicePrincipal();
    model.setActive(pb.getActive());
    model.setApplicationId(pb.getApplicationId());
    model.setDisplayName(pb.getDisplayName());
    model.setEntitlements(pb.getEntitlements());
    model.setExternalId(pb.getExternalId());
    model.setGroups(pb.getGroups());
    model.setId(pb.getId());
    model.setRoles(pb.getRoles());
    model.setSchemas(pb.getSchemas());

    return model;
  }

  public static class ServicePrincipalSerializer extends JsonSerializer<ServicePrincipal> {
    @Override
    public void serialize(ServicePrincipal value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServicePrincipalPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServicePrincipalDeserializer extends JsonDeserializer<ServicePrincipal> {
    @Override
    public ServicePrincipal deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServicePrincipalPb pb = mapper.readValue(p, ServicePrincipalPb.class);
      return ServicePrincipal.fromPb(pb);
    }
  }
}
