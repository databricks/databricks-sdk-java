// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.util.List;
import java.util.Map;

/**
 * These endpoints are modified versions of the MLflow API that accept
 * additional input parameters or return additional information.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
public interface MLflowDatabricksService {
	/**
     * Get model.
     * 
     * Get the details of a model. This is a Databricks Workspace version of the
     * [MLflow endpoint] that also returns the model's Databricks Workspace ID
     * and the permission level of the requesting user on the model.
     * 
     * [MLflow endpoint]: https://www.mlflow.org/docs/latest/rest-api.html#get-registeredmodel
     */
    GetResponse get(GetMLflowDatabrickRequest getMLflowDatabrickRequest);
    
	/**
     * Transition a stage.
     * 
     * Transition a model version's stage. This is a Databricks Workspace
     * version of the [MLflow endpoint] that also accepts a comment associated
     * with the transition to be recorded.",
     * 
     * [MLflow endpoint]: https://www.mlflow.org/docs/latest/rest-api.html#transition-modelversion-stage
     */
    TransitionStageResponse transitionStage(TransitionModelVersionStageDatabricks transitionModelVersionStageDatabricks);
    
}