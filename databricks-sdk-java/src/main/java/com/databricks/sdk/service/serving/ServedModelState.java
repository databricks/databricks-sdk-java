// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ServedModelState {
  /** */
  @JsonProperty("deployment")
  private ServedModelStateDeployment deployment;

  /** */
  @JsonProperty("deployment_state_message")
  private String deploymentStateMessage;

  public ServedModelState setDeployment(ServedModelStateDeployment deployment) {
    this.deployment = deployment;
    return this;
  }

  public ServedModelStateDeployment getDeployment() {
    return deployment;
  }

  public ServedModelState setDeploymentStateMessage(String deploymentStateMessage) {
    this.deploymentStateMessage = deploymentStateMessage;
    return this;
  }

  public String getDeploymentStateMessage() {
    return deploymentStateMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServedModelState that = (ServedModelState) o;
    return Objects.equals(deployment, that.deployment)
        && Objects.equals(deploymentStateMessage, that.deploymentStateMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployment, deploymentStateMessage);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedModelState.class)
        .add("deployment", deployment)
        .add("deploymentStateMessage", deploymentStateMessage)
        .toString();
  }
}
