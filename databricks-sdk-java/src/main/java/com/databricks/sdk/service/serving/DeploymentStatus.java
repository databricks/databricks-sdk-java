// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class DeploymentStatus {
  /** Container logs. */
  @JsonProperty("container_logs")
  private Collection<Object> containerLogs;

  /** description */
  @JsonProperty("deployment_id")
  private String deploymentId;

  /** Supplementary information about pod */
  @JsonProperty("extra_info")
  private String extraInfo;

  /** State: one of DEPLOYING,SUCCESS, FAILURE, DEPLOYMENT_STATE_UNSPECIFIED */
  @JsonProperty("state")
  private DeploymentStatusState state;

  public DeploymentStatus setContainerLogs(Collection<Object> containerLogs) {
    this.containerLogs = containerLogs;
    return this;
  }

  public Collection<Object> getContainerLogs() {
    return containerLogs;
  }

  public DeploymentStatus setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  public DeploymentStatus setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

  public String getExtraInfo() {
    return extraInfo;
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
    return Objects.equals(containerLogs, that.containerLogs)
        && Objects.equals(deploymentId, that.deploymentId)
        && Objects.equals(extraInfo, that.extraInfo)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerLogs, deploymentId, extraInfo, state);
  }

  @Override
  public String toString() {
    return new ToStringer(DeploymentStatus.class)
        .add("containerLogs", containerLogs)
        .add("deploymentId", deploymentId)
        .add("extraInfo", extraInfo)
        .add("state", state)
        .toString();
  }
}
