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
public class MLflowDatabricksAPI {
    private final MLflowDatabricksService impl;

    /** Regular-use constructor */
    public MLflowDatabricksAPI(ApiClient apiClient) {
        impl = new MLflowDatabricksImpl(apiClient);
    }

    /** Constructor for mocks */
    public MLflowDatabricksAPI(MLflowDatabricksService mock) {
        impl = mock;
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
    public GetResponse get(GetMLflowDatabrickRequest request) {
        return impl.get(request);
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
    public TransitionStageResponse transitionStage(TransitionModelVersionStageDatabricks request) {
        return impl.transitionStage(request);
    }
    
    public MLflowDatabricksService impl() {
        return impl;
    }
}