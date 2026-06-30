// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EnforceClusterComplianceRequest {
  /** The ID of the cluster you want to enforce policy compliance on. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /**
   * If set, previews the changes that would be made to a cluster to enforce compliance but does not
   * update the cluster.
   */
  @JsonProperty("validate_only")
  private Boolean validateOnly;

  public EnforceClusterComplianceRequest setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public EnforceClusterComplianceRequest setValidateOnly(Boolean validateOnly) {
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
    EnforceClusterComplianceRequest that = (EnforceClusterComplianceRequest) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(validateOnly, that.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, validateOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(EnforceClusterComplianceRequest.class)
        .add("clusterId", clusterId)
        .add("validateOnly", validateOnly)
        .toString();
  }
}
