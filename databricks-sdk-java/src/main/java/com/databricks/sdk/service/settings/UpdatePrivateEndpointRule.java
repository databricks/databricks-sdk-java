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
   * Only used by private endpoints to customer-managed resources.
   *
   * <p>Domain names of target private link service. When updating this field, the full list of
   * target domain_names must be specified.
   */
  @JsonProperty("domain_names")
  private Collection<String> domainNames;

  public UpdatePrivateEndpointRule setDomainNames(Collection<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public Collection<String> getDomainNames() {
    return domainNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePrivateEndpointRule that = (UpdatePrivateEndpointRule) o;
    return Objects.equals(domainNames, that.domainNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainNames);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePrivateEndpointRule.class)
        .add("domainNames", domainNames)
        .toString();
  }
}
