// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request to resolve a service principal by its ID in your identity provider (IdP). */
@Generated
public class ResolveServicePrincipalProxyRequest {
  /** The ID of the service principal in your IdP. */
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
