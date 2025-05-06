// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Properties of the new private endpoint rule. Note that you must approve the endpoint in Azure
 * portal after initialization.
 */
@Generated
public class CreatePrivateEndpointRule {
  /**
   * Only used by private endpoints to customer-managed resources.
   *
   * <p>Domain names of target private link service. When updating this field, the full list of
   * target domain_names must be specified.
   */
  @JsonProperty("domain_names")
  private Collection<String> domainNames;

  /**
   * Only used by private endpoints to Azure first-party services. Enum: blob | dfs | sqlServer |
   * mysqlServer
   *
   * <p>The sub-resource type (group ID) of the target resource. Note that to connect to workspace
   * root storage (root DBFS), you need two endpoints, one for blob and one for dfs.
   */
  @JsonProperty("group_id")
  private String groupId;

  /** The Azure resource ID of the target resource. */
  @JsonProperty("resource_id")
  private String resourceId;

  public CreatePrivateEndpointRule setDomainNames(Collection<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public Collection<String> getDomainNames() {
    return domainNames;
  }

  public CreatePrivateEndpointRule setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getGroupId() {
    return groupId;
  }

  public CreatePrivateEndpointRule setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePrivateEndpointRule that = (CreatePrivateEndpointRule) o;
    return Objects.equals(domainNames, that.domainNames)
        && Objects.equals(groupId, that.groupId)
        && Objects.equals(resourceId, that.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainNames, groupId, resourceId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePrivateEndpointRule.class)
        .add("domainNames", domainNames)
        .add("groupId", groupId)
        .add("resourceId", resourceId)
        .toString();
  }
}
