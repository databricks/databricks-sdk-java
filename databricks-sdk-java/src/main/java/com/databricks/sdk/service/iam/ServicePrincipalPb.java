// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ServicePrincipalPb {
  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("applicationId")
  private String applicationId;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("entitlements")
  private Collection<ComplexValue> entitlements;

  @JsonProperty("externalId")
  private String externalId;

  @JsonProperty("groups")
  private Collection<ComplexValue> groups;

  @JsonProperty("id")
  private String id;

  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

  @JsonProperty("schemas")
  private Collection<ServicePrincipalSchema> schemas;

  public ServicePrincipalPb setActive(Boolean active) {
    this.active = active;
    return this;
  }

  public Boolean getActive() {
    return active;
  }

  public ServicePrincipalPb setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public ServicePrincipalPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ServicePrincipalPb setEntitlements(Collection<ComplexValue> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public Collection<ComplexValue> getEntitlements() {
    return entitlements;
  }

  public ServicePrincipalPb setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public ServicePrincipalPb setGroups(Collection<ComplexValue> groups) {
    this.groups = groups;
    return this;
  }

  public Collection<ComplexValue> getGroups() {
    return groups;
  }

  public ServicePrincipalPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ServicePrincipalPb setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  public ServicePrincipalPb setSchemas(Collection<ServicePrincipalSchema> schemas) {
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
    ServicePrincipalPb that = (ServicePrincipalPb) o;
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
    return new ToStringer(ServicePrincipalPb.class)
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
}
