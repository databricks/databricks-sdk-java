// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateServicePrincipalRequest {
  /**
   * The resource name of the account to create the service principal in, in the format
   * `accounts/{account_id}`.
   */
  @JsonIgnore private String parent;

  /** The service principal to create. */
  @JsonProperty("service_principal")
  private ServicePrincipal servicePrincipal;

  public CreateServicePrincipalRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateServicePrincipalRequest setServicePrincipal(ServicePrincipal servicePrincipal) {
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
    CreateServicePrincipalRequest that = (CreateServicePrincipalRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(servicePrincipal, that.servicePrincipal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, servicePrincipal);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateServicePrincipalRequest.class)
        .add("parent", parent)
        .add("servicePrincipal", servicePrincipal)
        .toString();
  }
}
