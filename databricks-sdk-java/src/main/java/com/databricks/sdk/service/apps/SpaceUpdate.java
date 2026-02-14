// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Tracks app space update information. */
@Generated
public class SpaceUpdate {
  /** */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("resources")
  private Collection<AppResource> resources;

  /** */
  @JsonProperty("status")
  private SpaceUpdateStatus status;

  /** */
  @JsonProperty("usage_policy_id")
  private String usagePolicyId;

  /** */
  @JsonProperty("user_api_scopes")
  private Collection<String> userApiScopes;

  public SpaceUpdate setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public SpaceUpdate setResources(Collection<AppResource> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<AppResource> getResources() {
    return resources;
  }

  public SpaceUpdate setStatus(SpaceUpdateStatus status) {
    this.status = status;
    return this;
  }

  public SpaceUpdateStatus getStatus() {
    return status;
  }

  public SpaceUpdate setUsagePolicyId(String usagePolicyId) {
    this.usagePolicyId = usagePolicyId;
    return this;
  }

  public String getUsagePolicyId() {
    return usagePolicyId;
  }

  public SpaceUpdate setUserApiScopes(Collection<String> userApiScopes) {
    this.userApiScopes = userApiScopes;
    return this;
  }

  public Collection<String> getUserApiScopes() {
    return userApiScopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SpaceUpdate that = (SpaceUpdate) o;
    return Objects.equals(description, that.description)
        && Objects.equals(resources, that.resources)
        && Objects.equals(status, that.status)
        && Objects.equals(usagePolicyId, that.usagePolicyId)
        && Objects.equals(userApiScopes, that.userApiScopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, resources, status, usagePolicyId, userApiScopes);
  }

  @Override
  public String toString() {
    return new ToStringer(SpaceUpdate.class)
        .add("description", description)
        .add("resources", resources)
        .add("status", status)
        .add("usagePolicyId", usagePolicyId)
        .add("userApiScopes", userApiScopes)
        .toString();
  }
}
