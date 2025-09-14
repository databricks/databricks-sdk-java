// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Request message for resolving a user with the given external ID from the customer's IdP into
 * Databricks. Will resolve metadata such as the user's displayname, status, and inherited parent
 * groups.
 */
@Generated
public class ResolveUserProxyRequest {
  /** Required. The external ID of the user in the customer's IdP. */
  @JsonProperty("external_id")
  private String externalId;

  public ResolveUserProxyRequest setExternalId(String externalId) {
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
    ResolveUserProxyRequest that = (ResolveUserProxyRequest) o;
    return Objects.equals(externalId, that.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolveUserProxyRequest.class).add("externalId", externalId).toString();
  }
}
