// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DeploymentStatus {
  /** description */
  @JsonProperty("deployment_id")
  private String deploymentId;

  /** State: one of DEPLOYING,SUCCESS, FAILURE, DEPLOYMENT_STATE_UNSPECIFIED */
  @JsonProperty("state")
  private DeploymentStatusState state;

  public DeploymentStatus setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  public DeploymentStatus setState(DeploymentStatusState state) {
    this.state = state;
    return this;
  }

  public DeploymentStatusState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeploymentStatus that = (DeploymentStatus) o;
    return Objects.equals(deploymentId, that.deploymentId) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentId, state);
  }

  @Override
  public String toString() {
    return new ToStringer(DeploymentStatus.class)
        .add("deploymentId", deploymentId)
        .add("state", state)
        .toString();
  }
}
