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
class CreatePrivateEndpointRulePb {
  @JsonProperty("domain_names")
  private Collection<String> domainNames;

  @JsonProperty("endpoint_service")
  private String endpointService;

  @JsonProperty("group_id")
  private String groupId;

  @JsonProperty("resource_id")
  private String resourceId;

  @JsonProperty("resource_names")
  private Collection<String> resourceNames;

  public CreatePrivateEndpointRulePb setDomainNames(Collection<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public Collection<String> getDomainNames() {
    return domainNames;
  }

  public CreatePrivateEndpointRulePb setEndpointService(String endpointService) {
    this.endpointService = endpointService;
    return this;
  }

  public String getEndpointService() {
    return endpointService;
  }

  public CreatePrivateEndpointRulePb setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getGroupId() {
    return groupId;
  }

  public CreatePrivateEndpointRulePb setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  public CreatePrivateEndpointRulePb setResourceNames(Collection<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  public Collection<String> getResourceNames() {
    return resourceNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePrivateEndpointRulePb that = (CreatePrivateEndpointRulePb) o;
    return Objects.equals(domainNames, that.domainNames)
        && Objects.equals(endpointService, that.endpointService)
        && Objects.equals(groupId, that.groupId)
        && Objects.equals(resourceId, that.resourceId)
        && Objects.equals(resourceNames, that.resourceNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainNames, endpointService, groupId, resourceId, resourceNames);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePrivateEndpointRulePb.class)
        .add("domainNames", domainNames)
        .add("endpointService", endpointService)
        .add("groupId", groupId)
        .add("resourceId", resourceId)
        .add("resourceNames", resourceNames)
        .toString();
  }
}
