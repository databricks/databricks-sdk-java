// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetGroupRequest {
  /** Required. Internal ID of the group in Databricks. */
  @JsonIgnore private Long internalId;

  public GetGroupRequest setInternalId(Long internalId) {
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
    GetGroupRequest that = (GetGroupRequest) o;
    return Objects.equals(internalId, that.internalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetGroupRequest.class).add("internalId", internalId).toString();
  }
}
