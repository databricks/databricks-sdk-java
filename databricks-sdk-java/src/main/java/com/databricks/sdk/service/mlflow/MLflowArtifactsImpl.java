// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of MLflowArtifacts */
class MLflowArtifactsImpl implements MLflowArtifactsService {
  private final ApiClient apiClient;

  public MLflowArtifactsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ListArtifactsResponse list(ListArtifactsRequest request) {
    String path = "/api/2.0/mlflow/artifacts/list";
    return apiClient.GET(path, request, ListArtifactsResponse.class);
  }
}
