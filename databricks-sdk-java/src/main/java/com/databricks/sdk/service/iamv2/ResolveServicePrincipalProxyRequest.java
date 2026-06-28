// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Request message for resolving a service principal with the given external ID from the customer's
 * IdP into Databricks. Will resolve metadata such as the service principal's displayname, status,
 * and inherited parent groups.
 */
@Generated
public class ResolveServicePrincipalProxyRequest {
  /** Required. The external ID of the service principal in the customer's IdP. */
  @JsonProperty("external_id")
  private String externalId;

  public ResolveServicePrincipalProxyRequest setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolveServicePrincipalProxyRequest that = (ResolveServicePrincipalProxyRequest) o;
    return Objects.equals(externalId, that.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolveServicePrincipalProxyRequest.class)
        .add("externalId", externalId)
        .toString();
  }
}
