// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of MLflowMetrics */
class MLflowMetricsImpl implements MLflowMetricsService {
  private final ApiClient apiClient;

  public MLflowMetricsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GetMetricHistoryResponse getHistory(GetHistoryRequest request) {
    String path = "/api/2.0/mlflow/metrics/get-history";
    return apiClient.GET(path, request, GetMetricHistoryResponse.class);
  }
}
