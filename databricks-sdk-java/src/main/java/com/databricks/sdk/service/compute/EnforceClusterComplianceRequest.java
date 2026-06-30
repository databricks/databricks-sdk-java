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
   * Determines how changes should be made to clusters that are not in `TERMINATED` state.
   *
   * <p>- `ENFORCE_IMMEDIATELY`: If the cluster is in a `RUNNING` state, it will be restarted so
   * that the new attributes can take effect. For other states aside from `TERMINATED` state, the
   * request will be rejected. - `WAIT_FOR_TERMINATION`: The cluster is not immediately edited.
   * Instead, a pending enforcement is scheduled to update the cluster when it terminates or
   * restarts. When this occurs, `enforce_result` will contain `DEFERRED`. Only workspace admins can
   * use this mode.
   *
   * <p>Regardless of the enforce mode, clusters in `TERMINATED` state are immediately edited.
   */
  @JsonProperty("enforce_mode")
  private EnforcePolicyComplianceForClusterEnforceMode enforceMode;

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

  public EnforceClusterComplianceRequest setEnforceMode(
      EnforcePolicyComplianceForClusterEnforceMode enforceMode) {
    this.enforceMode = enforceMode;
    return this;
  }

  public EnforcePolicyComplianceForClusterEnforceMode getEnforceMode() {
    return enforceMode;
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
        && Objects.equals(enforceMode, that.enforceMode)
        && Objects.equals(validateOnly, that.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, enforceMode, validateOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(EnforceClusterComplianceRequest.class)
        .add("clusterId", clusterId)
        .add("enforceMode", enforceMode)
        .add("validateOnly", validateOnly)
        .toString();
  }
}
