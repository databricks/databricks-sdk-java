// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetServicePrincipalRequest {
  /** Required. Internal ID of the service principal in Databricks. */
  @JsonIgnore private Long internalId;

  public GetServicePrincipalRequest setInternalId(Long internalId) {
    this.internalId = internalId;
    return this;
  }

  public Long getInternalId() {
    return internalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetServicePrincipalRequest that = (GetServicePrincipalRequest) o;
    return Objects.equals(internalId, that.internalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetServicePrincipalRequest.class)
        .add("internalId", internalId)
        .toString();
  }
}
