// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ServedModelState class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ServedModelState {
  /**
   * The state of the served model deployment. DEPLOYMENT_CREATING indicates that the served model
   * is not ready yet because the deployment is still being created (i.e container image is
   * building, model server is deploying for the first time, etc.). DEPLOYMENT_RECOVERING indicates
   * that the served model was previously in a ready state but no longer is and is attempting to
   * recover. DEPLOYMENT_READY indicates that the served model is ready to receive traffic.
   * DEPLOYMENT_FAILED indicates that there was an error trying to bring up the served model (e.g
   * container image build failed, the model server failed to start due to a model loading error,
   * etc.) DEPLOYMENT_ABORTED indicates that the deployment was terminated likely due to a failure
   * in bringing up another served model under the same endpoint and config version.
   */
  @JsonProperty("deployment")
  private ServedModelStateDeployment deployment;

  /** More information about the state of the served model, if available. */
  @JsonProperty("deployment_state_message")
  private String deploymentStateMessage;

  /**
   * <p>Setter for the field <code>deployment</code>.</p>
   *
   * @param deployment a {@link com.databricks.sdk.service.serving.ServedModelStateDeployment} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelState} object
   */
  public ServedModelState setDeployment(ServedModelStateDeployment deployment) {
    this.deployment = deployment;
    return this;
  }

  /**
   * <p>Getter for the field <code>deployment</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.serving.ServedModelStateDeployment} object
   */
  public ServedModelStateDeployment getDeployment() {
    return deployment;
  }

  /**
   * <p>Setter for the field <code>deploymentStateMessage</code>.</p>
   *
   * @param deploymentStateMessage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelState} object
   */
  public ServedModelState setDeploymentStateMessage(String deploymentStateMessage) {
    this.deploymentStateMessage = deploymentStateMessage;
    return this;
  }

  /**
   * <p>Getter for the field <code>deploymentStateMessage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDeploymentStateMessage() {
    return deploymentStateMessage;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServedModelState that = (ServedModelState) o;
    return Objects.equals(deployment, that.deployment)
        && Objects.equals(deploymentStateMessage, that.deploymentStateMessage);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(deployment, deploymentStateMessage);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ServedModelState.class)
        .add("deployment", deployment)
        .add("deploymentStateMessage", deploymentStateMessage)
        .toString();
  }
}
