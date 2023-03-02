// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ServedModelState {
    /**
     * The state of the served model deployment. DEPLOYMENT_CREATING indicates
     * that the served model is not ready yet because the deployment is still
     * being created (i.e container image is building, model server is deploying
     * for the first time, etc.). DEPLOYMENT_RECOVERING indicates that the
     * served model was previously in a ready state but no longer is and is
     * attempting to recover. DEPLOYMENT_READY indicates that the served model
     * is ready to receive traffic. DEPLOYMENT_FAILED indicates that there was
     * an error trying to bring up the served model (e.g container image build
     * failed, the model server failed to start due to a model loading error,
     * etc.) DEPLOYMENT_ABORTED indicates that the deployment was terminated
     * likely due to a failure in bringing up another served model under the
     * same endpoint and config version.
     */
    @JsonProperty("deployment")
    private ServedModelStateDeployment deployment;
    
    /**
     * More information about the state of the served model, if available.
     */
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
    
}
