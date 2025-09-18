// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateAccountServicePrincipalRequest {
  /** If this user is active */
  @JsonProperty("active")
  private Boolean active;

  /** UUID relating to the service principal */
  @JsonProperty("applicationId")
  private String applicationId;

  /** String that represents a concatenation of given and family names. */
  @JsonProperty("displayName")
  private String displayName;

  /** */
  @JsonProperty("externalId")
  private String externalId;

  /** Databricks service principal ID. */
  @JsonProperty("id")
  private String id;

  /** Indicates if the group has the admin role. */
  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

  public CreateAccountServicePrincipalRequest setActive(Boolean active) {
    this.active = active;
    return this;
  }

  public Boolean getActive() {
    return active;
  }

  public CreateAccountServicePrincipalRequest setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public CreateAccountServicePrincipalRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateAccountServicePrincipalRequest setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public CreateAccountServicePrincipalRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CreateAccountServicePrincipalRequest setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAccountServicePrincipalRequest that = (CreateAccountServicePrincipalRequest) o;
    return Objects.equals(active, that.active)
        && Objects.equals(applicationId, that.applicationId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(id, that.id)
        && Objects.equals(roles, that.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, applicationId, displayName, externalId, id, roles);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAccountServicePrincipalRequest.class)
        .add("active", active)
        .add("applicationId", applicationId)
        .add("displayName", displayName)
        .add("externalId", externalId)
        .add("id", id)
        .add("roles", roles)
        .toString();
  }
}
