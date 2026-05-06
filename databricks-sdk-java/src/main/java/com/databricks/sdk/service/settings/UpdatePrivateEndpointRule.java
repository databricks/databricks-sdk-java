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
   * Update this field to activate/deactivate this private endpoint to allow egress access from
   * serverless compute resources. Only honored for first-party services on each cloud (e.g. AWS
   * S3).
   */
  @JsonProperty("enabled")
  private Boolean enabled;

  /** */
  @JsonProperty("error_message")
  private String errorMessage;

  /** */
  @JsonProperty("gcp_endpoint")
  private GcpEndpoint gcpEndpoint;

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

  public UpdatePrivateEndpointRule setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public UpdatePrivateEndpointRule setGcpEndpoint(GcpEndpoint gcpEndpoint) {
    this.gcpEndpoint = gcpEndpoint;
    return this;
  }

  public GcpEndpoint getGcpEndpoint() {
    return gcpEndpoint;
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
        && Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(gcpEndpoint, that.gcpEndpoint)
        && Objects.equals(resourceNames, that.resourceNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainNames, enabled, errorMessage, gcpEndpoint, resourceNames);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePrivateEndpointRule.class)
        .add("domainNames", domainNames)
        .add("enabled", enabled)
        .add("errorMessage", errorMessage)
        .add("gcpEndpoint", gcpEndpoint)
        .add("resourceNames", resourceNames)
        .toString();
  }
}
