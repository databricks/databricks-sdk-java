// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ResolveServicePrincipalResponse {
  /** The service principal that was resolved. */
  @JsonProperty("service_principal")
  private ServicePrincipal servicePrincipal;

  public ResolveServicePrincipalResponse setServicePrincipal(ServicePrincipal servicePrincipal) {
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
    ResolveServicePrincipalResponse that = (ResolveServicePrincipalResponse) o;
    return Objects.equals(servicePrincipal, that.servicePrincipal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicePrincipal);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolveServicePrincipalResponse.class)
        .add("servicePrincipal", servicePrincipal)
        .toString();
  }
}
