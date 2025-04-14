// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AuthorizationDetails {
  /**
   * Represents downscoped permission rules with specific access rights. This field is specific to
   * `workspace_rule_set` constraint.
   */
  @JsonProperty("grant_rules")
  private Collection<AuthorizationDetailsGrantRule> grantRules;

  /** The acl path of the tree store resource resource. */
  @JsonProperty("resource_legacy_acl_path")
  private String resourceLegacyAclPath;

  /**
   * The resource name to which the authorization rule applies. This field is specific to
   * `workspace_rule_set` constraint. Format: `workspaces/{workspace_id}/dashboards/{dashboard_id}`
   */
  @JsonProperty("resource_name")
  private String resourceName;

  /**
   * The type of authorization downscoping policy. Ex: `workspace_rule_set` defines access rules for
   * a specific workspace resource
   */
  @JsonProperty("type")
  private String typeValue;

  public AuthorizationDetails setGrantRules(Collection<AuthorizationDetailsGrantRule> grantRules) {
    this.grantRules = grantRules;
    return this;
  }

  public Collection<AuthorizationDetailsGrantRule> getGrantRules() {
    return grantRules;
  }

  public AuthorizationDetails setResourceLegacyAclPath(String resourceLegacyAclPath) {
    this.resourceLegacyAclPath = resourceLegacyAclPath;
    return this;
  }

  public String getResourceLegacyAclPath() {
    return resourceLegacyAclPath;
  }

  public AuthorizationDetails setResourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  public String getResourceName() {
    return resourceName;
  }

  public AuthorizationDetails setType(String typeValue) {
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
    AuthorizationDetails that = (AuthorizationDetails) o;
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
    return new ToStringer(AuthorizationDetails.class)
        .add("grantRules", grantRules)
        .add("resourceLegacyAclPath", resourceLegacyAclPath)
        .add("resourceName", resourceName)
        .add("typeValue", typeValue)
        .toString();
  }
}
