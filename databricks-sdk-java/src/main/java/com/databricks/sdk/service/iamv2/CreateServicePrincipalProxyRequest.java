// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateServicePrincipalProxyRequest {
  /** Required. Service principal to be created in <Databricks> */
  @JsonProperty("service_principal")
  private ServicePrincipal servicePrincipal;

  public CreateServicePrincipalProxyRequest setServicePrincipal(ServicePrincipal servicePrincipal) {
    this.servicePrincipal = servicePrincipal;
    return this;
  }

  public ServicePrincipal getServicePrincipal() {
    return servicePrincipal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateServicePrincipalProxyRequest that = (CreateServicePrincipalProxyRequest) o;
    return Objects.equals(servicePrincipal, that.servicePrincipal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicePrincipal);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateServicePrincipalProxyRequest.class)
        .add("servicePrincipal", servicePrincipal)
        .toString();
  }
}
