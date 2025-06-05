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
public class UpdatePrivateEndpointRule {
  /**
   * Only used by private endpoints to customer-managed private endpoint services.
   *
   * <p>Domain names of target private link service. When updating this field, the full list of
   * target domain_names must be specified.
   */
  @JsonProperty("domain_names")
  private Collection<String> domainNames;

  /**
   * Only used by private endpoints towards an AWS S3 service.
   *
   * <p>Update this field to activate/deactivate this private endpoint to allow egress access from
   * serverless compute resources.
   */
  @JsonProperty("enabled")
  private Boolean enabled;

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

  public UpdatePrivateEndpointRule setDomainNames(Collection<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public Collection<String> getDomainNames() {
    return domainNames;
  }

  public UpdatePrivateEndpointRule setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public UpdatePrivateEndpointRule setResourceNames(Collection<String> resourceNames) {
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
    UpdatePrivateEndpointRule that = (UpdatePrivateEndpointRule) o;
    return Objects.equals(domainNames, that.domainNames)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(resourceNames, that.resourceNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainNames, enabled, resourceNames);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePrivateEndpointRule.class)
        .add("domainNames", domainNames)
        .add("enabled", enabled)
        .add("resourceNames", resourceNames)
        .toString();
  }
}
