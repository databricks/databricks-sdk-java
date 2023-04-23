// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of MLflowDatabricks */
class MLflowDatabricksImpl implements MLflowDatabricksService {
  private final ApiClient apiClient;

  public MLflowDatabricksImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GetResponse get(GetMLflowDatabrickRequest request) {
    String path = "/api/2.0/mlflow/databricks/registered-models/get";
    return apiClient.GET(path, request, GetResponse.class);
  }

  @Override
  public TransitionStageResponse transitionStage(TransitionModelVersionStageDatabricks request) {
    String path = "/api/2.0/mlflow/databricks/model-versions/transition-stage";
    return apiClient.POST(path, request, TransitionStageResponse.class);
  }
}
