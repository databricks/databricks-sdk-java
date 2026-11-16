// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateAppDeploymentScanFindingRequest {
  /** The finding to update. `name` identifies the finding and `status` is the new triage status. */
  @JsonProperty("app_deployment_scan_finding")
  private AppDeploymentScanFinding appDeploymentScanFinding;

  /**
   * The resource name of the finding, in the form
   * `apps/{app}/deployments/{deployment}/scanFindings/{finding_id}`.
   */
  @JsonIgnore private String name;

  /** The fields to update. Must be exactly `status`, the only updatable field on a scan finding. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateAppDeploymentScanFindingRequest setAppDeploymentScanFinding(
      AppDeploymentScanFinding appDeploymentScanFinding) {
    this.appDeploymentScanFinding = appDeploymentScanFinding;
    return this;
  }

  public AppDeploymentScanFinding getAppDeploymentScanFinding() {
    return appDeploymentScanFinding;
  }

  public UpdateAppDeploymentScanFindingRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateAppDeploymentScanFindingRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateAppDeploymentScanFindingRequest that = (UpdateAppDeploymentScanFindingRequest) o;
    return Objects.equals(appDeploymentScanFinding, that.appDeploymentScanFinding)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDeploymentScanFinding, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAppDeploymentScanFindingRequest.class)
        .add("appDeploymentScanFinding", appDeploymentScanFinding)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
