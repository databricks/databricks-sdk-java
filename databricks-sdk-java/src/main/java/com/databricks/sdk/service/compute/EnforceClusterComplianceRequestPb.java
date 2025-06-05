// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EnforceClusterComplianceRequestPb {
  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("validate_only")
  private Boolean validateOnly;

  public EnforceClusterComplianceRequestPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public EnforceClusterComplianceRequestPb setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  public Boolean getValidateOnly() {
    return validateOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnforceClusterComplianceRequestPb that = (EnforceClusterComplianceRequestPb) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(validateOnly, that.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, validateOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(EnforceClusterComplianceRequestPb.class)
        .add("clusterId", clusterId)
        .add("validateOnly", validateOnly)
        .toString();
  }
}
