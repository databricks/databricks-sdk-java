// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundle;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDeploymentRequest {
  /** The deployment to create. */
  @JsonProperty("deployment")
  private Deployment deployment;

  /**
   * The ID to use for the deployment, which will become the final component of the deployment's
   * resource name (i.e. `deployments/{deployment_id}`).
   */
  @JsonIgnore
  @QueryParam("deployment_id")
  private String deploymentId;

  public CreateDeploymentRequest setDeployment(Deployment deployment) {
    this.deployment = deployment;
    return this;
  }

  public Deployment getDeployment() {
    return deployment;
  }

  public CreateDeploymentRequest setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDeploymentRequest that = (CreateDeploymentRequest) o;
    return Objects.equals(deployment, that.deployment)
        && Objects.equals(deploymentId, that.deploymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployment, deploymentId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDeploymentRequest.class)
        .add("deployment", deployment)
        .add("deploymentId", deploymentId)
        .toString();
  }
}
