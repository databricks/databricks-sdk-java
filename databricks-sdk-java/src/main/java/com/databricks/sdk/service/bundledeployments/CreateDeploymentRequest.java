// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDeploymentRequest {
  /**
   * The deployment to create. The caller must set `initial_parent_path`. Other fields are ignored
   * on input and populated by the service.
   */
  @JsonProperty("deployment")
  private Deployment deployment;

  public CreateDeploymentRequest setDeployment(Deployment deployment) {
    this.deployment = deployment;
    return this;
  }

  public Deployment getDeployment() {
    return deployment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDeploymentRequest that = (CreateDeploymentRequest) o;
    return Objects.equals(deployment, that.deployment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployment);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDeploymentRequest.class).add("deployment", deployment).toString();
  }
}
