// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateDeploymentRequest {
  /**
   * The deployment to update. Its `name` selects the deployment; the fields named in `update_mask`
   * carry the new values. All other fields are ignored.
   */
  @JsonProperty("deployment")
  private Deployment deployment;

  /** Resource name of the deployment. Format: deployments/{deployment_id} */
  @JsonIgnore private String name;

  /**
   * The fields to update; supported paths are `display_name`, `deployment_mode`, `target_name`, and
   * `workspace_info`. An empty mask or any other path returns INVALID_PARAMETER_VALUE.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateDeploymentRequest setDeployment(Deployment deployment) {
    this.deployment = deployment;
    return this;
  }

  public Deployment getDeployment() {
    return deployment;
  }

  public UpdateDeploymentRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateDeploymentRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateDeploymentRequest that = (UpdateDeploymentRequest) o;
    return Objects.equals(deployment, that.deployment)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployment, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDeploymentRequest.class)
        .add("deployment", deployment)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
