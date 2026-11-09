// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateServicePrincipalProxyRequest {
  /**
   * The resource name of the service principal, in one of these formats: - Account APIs:
   * `accounts/{account_id}/service-principals/{service_principal_id}` - Workspace APIs:
   * `service-principals/{service_principal_id}`
   */
  @JsonIgnore private String name;

  /** The service principal to update. Its `name` identifies the service principal. */
  @JsonProperty("service_principal")
  private ServicePrincipal servicePrincipal;

  /**
   * The fields to update, separated by commas. You can update `display_name`, `account_sp_status`,
   * and `external_id`.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateServicePrincipalProxyRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateServicePrincipalProxyRequest setServicePrincipal(ServicePrincipal servicePrincipal) {
    this.servicePrincipal = servicePrincipal;
    return this;
  }

  public ServicePrincipal getServicePrincipal() {
    return servicePrincipal;
  }

  public UpdateServicePrincipalProxyRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateServicePrincipalProxyRequest that = (UpdateServicePrincipalProxyRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(servicePrincipal, that.servicePrincipal)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, servicePrincipal, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateServicePrincipalProxyRequest.class)
        .add("name", name)
        .add("servicePrincipal", servicePrincipal)
        .add("updateMask", updateMask)
        .toString();
  }
}
