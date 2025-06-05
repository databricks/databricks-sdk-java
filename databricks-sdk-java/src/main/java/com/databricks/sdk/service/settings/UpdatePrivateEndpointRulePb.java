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
class UpdatePrivateEndpointRulePb {
  @JsonProperty("domain_names")
  private Collection<String> domainNames;

  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("resource_names")
  private Collection<String> resourceNames;

  public UpdatePrivateEndpointRulePb setDomainNames(Collection<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public Collection<String> getDomainNames() {
    return domainNames;
  }

  public UpdatePrivateEndpointRulePb setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public UpdatePrivateEndpointRulePb setResourceNames(Collection<String> resourceNames) {
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
    UpdatePrivateEndpointRulePb that = (UpdatePrivateEndpointRulePb) o;
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
    return new ToStringer(UpdatePrivateEndpointRulePb.class)
        .add("domainNames", domainNames)
        .add("enabled", enabled)
        .add("resourceNames", resourceNames)
        .toString();
  }
}
