// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class AuthorizationDetailsPb {
  @JsonProperty("grant_rules")
  private Collection<AuthorizationDetailsGrantRule> grantRules;

  @JsonProperty("resource_legacy_acl_path")
  private String resourceLegacyAclPath;

  @JsonProperty("resource_name")
  private String resourceName;

  @JsonProperty("type")
  private String typeValue;

  public AuthorizationDetailsPb setGrantRules(
      Collection<AuthorizationDetailsGrantRule> grantRules) {
    this.grantRules = grantRules;
    return this;
  }

  public Collection<AuthorizationDetailsGrantRule> getGrantRules() {
    return grantRules;
  }

  public AuthorizationDetailsPb setResourceLegacyAclPath(String resourceLegacyAclPath) {
    this.resourceLegacyAclPath = resourceLegacyAclPath;
    return this;
  }

  public String getResourceLegacyAclPath() {
    return resourceLegacyAclPath;
  }

  public AuthorizationDetailsPb setResourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  public String getResourceName() {
    return resourceName;
  }

  public AuthorizationDetailsPb setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AuthorizationDetailsPb that = (AuthorizationDetailsPb) o;
    return Objects.equals(grantRules, that.grantRules)
        && Objects.equals(resourceLegacyAclPath, that.resourceLegacyAclPath)
        && Objects.equals(resourceName, that.resourceName)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantRules, resourceLegacyAclPath, resourceName, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(AuthorizationDetailsPb.class)
        .add("grantRules", grantRules)
        .add("resourceLegacyAclPath", resourceLegacyAclPath)
        .add("resourceName", resourceName)
        .add("typeValue", typeValue)
        .toString();
  }
}
