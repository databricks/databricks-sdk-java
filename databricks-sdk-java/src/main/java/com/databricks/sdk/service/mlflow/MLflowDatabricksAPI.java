// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * These endpoints are modified versions of the MLflow API that accept
 * additional input parameters or return additional information.
 */
public class MLflowDatabricksAPI implements MLflowDatabricksService {
    private final ApiClient apiClient;

    public MLflowDatabricksAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Get model.
     * 
     * Get the details of a model. This is a Databricks Workspace version of the
     * [MLflow endpoint] that also returns the model's Databricks Workspace ID
     * and the permission level of the requesting user on the model.
     * 
     * [MLflow endpoint]: https://www.mlflow.org/docs/latest/rest-api.html#get-registeredmodel
     */
    @Override
    public GetResponse get(GetMLflowDatabrickRequest request) {
        String path = "/api/2.0/mlflow/databricks/registered-models/get";
        return apiClient.GET(path, request, GetResponse.class);
    }
    
	/**
     * Transition a stage.
     * 
     * Transition a model version's stage. This is a Databricks Workspace
     * version of the [MLflow endpoint] that also accepts a comment associated
     * with the transition to be recorded.",
     * 
     * [MLflow endpoint]: https://www.mlflow.org/docs/latest/rest-api.html#transition-modelversion-stage
     */
    @Override
    public TransitionStageResponse transitionStage(TransitionModelVersionStageDatabricks request) {
        String path = "/api/2.0/mlflow/databricks/model-versions/transition-stage";
        return apiClient.POST(path, request, TransitionStageResponse.class);
    }
    
}