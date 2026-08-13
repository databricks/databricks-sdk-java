// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetServicePrincipalProxyRequest {
  /** Required. Internal ID of the service principal in Databricks. */
  @JsonIgnore private String servicePrincipalId;

  public GetServicePrincipalProxyRequest setServicePrincipalId(String servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public String getServicePrincipalId() {
    return servicePrincipalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetServicePrincipalProxyRequest that = (GetServicePrincipalProxyRequest) o;
    return Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetServicePrincipalProxyRequest.class)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }
}
