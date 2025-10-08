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
   * Only used by private endpoints to customer-managed private endpoint services.
   *
   * <p>Domain names of target private link service. When updating this field, the full list of
   * target domain_names must be specified.
   */
  @JsonProperty("domain_names")
  private Collection<String> domainNames;

  /**
   * The full target AWS endpoint service name that connects to the destination resources of the
   * private endpoint.
   */
  @JsonProperty("endpoint_service")
  private String endpointService;

  /**
   * Not used by customer-managed private endpoint services.
   *
   * <p>The sub-resource type (group ID) of the target resource. Note that to connect to workspace
   * root storage (root DBFS), you need two endpoints, one for blob and one for dfs.
   */
  @JsonProperty("group_id")
  private String groupId;

  /** The Azure resource ID of the target resource. */
  @JsonProperty("resource_id")
  private String resourceId;

  /**
   * Only used by private endpoints towards AWS S3 service.
   *
   * <p>The globally unique S3 bucket names that will be accessed via the VPC endpoint. The bucket
   * names must be in the same region as the NCC/endpoint service. When updating this field, we
   * perform full update on this field. Please ensure a full list of desired resource_names is
   * provided.
   */
  @JsonProperty("resource_names")
  private Collection<String> resourceNames;

  public CreatePrivateEndpointRule setDomainNames(Collection<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public Collection<String> getDomainNames() {
    return domainNames;
  }

  public CreatePrivateEndpointRule setEndpointService(String endpointService) {
    this.endpointService = endpointService;
    return this;
  }

  public String getEndpointService() {
    return endpointService;
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

  public CreatePrivateEndpointRule setResourceNames(Collection<String> resourceNames) {
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
    CreatePrivateEndpointRule that = (CreatePrivateEndpointRule) o;
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
    return new ToStringer(CreatePrivateEndpointRule.class)
        .add("domainNames", domainNames)
        .add("endpointService", endpointService)
        .add("groupId", groupId)
        .add("resourceId", resourceId)
        .add("resourceNames", resourceNames)
        .toString();
  }
}
