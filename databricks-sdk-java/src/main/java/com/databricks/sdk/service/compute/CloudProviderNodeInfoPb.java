// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CloudProviderNodeInfoPb {
  @JsonProperty("status")
  private Collection<CloudProviderNodeStatus> status;

  public CloudProviderNodeInfoPb setStatus(Collection<CloudProviderNodeStatus> status) {
    this.status = status;
    return this;
  }

  public Collection<CloudProviderNodeStatus> getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CloudProviderNodeInfoPb that = (CloudProviderNodeInfoPb) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    return new ToStringer(CloudProviderNodeInfoPb.class).add("status", status).toString();
  }
}
