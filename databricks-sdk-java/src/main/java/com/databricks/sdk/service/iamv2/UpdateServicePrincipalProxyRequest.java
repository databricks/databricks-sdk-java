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
  /** Required. Internal ID of the service principal in Databricks. */
  @JsonIgnore private Long internalId;

  /** Required. Service principal to be updated in <Databricks> */
  @JsonProperty("service_principal")
  private ServicePrincipal servicePrincipal;

  /** Optional. The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateServicePrincipalProxyRequest setInternalId(Long internalId) {
    this.internalId = internalId;
    return this;
  }

  public Long getInternalId() {
    return internalId;
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
    return Objects.equals(internalId, that.internalId)
        && Objects.equals(servicePrincipal, that.servicePrincipal)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalId, servicePrincipal, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateServicePrincipalProxyRequest.class)
        .add("internalId", internalId)
        .add("servicePrincipal", servicePrincipal)
        .add("updateMask", updateMask)
        .toString();
  }
}
