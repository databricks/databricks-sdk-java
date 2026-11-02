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
   * The parent resource name of the account in which to create the service principal. Format:
   * accounts/{account_id}
   */
  @JsonIgnore private String parent;

  /** Required. Service principal to be created in Databricks */
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
