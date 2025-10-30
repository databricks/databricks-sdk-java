// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of Forecasting */
@Generated
class ForecastingImpl implements ForecastingService {
  private final ApiClient apiClient;

  public ForecastingImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateForecastingExperimentResponse createExperiment(
      CreateForecastingExperimentRequest request) {
    String path = "/api/2.0/automl/create-forecasting-experiment";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateForecastingExperimentResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ForecastingExperiment getExperiment(GetForecastingExperimentRequest request) {
    String path =
        String.format("/api/2.0/automl/get-forecasting-experiment/%s", request.getExperimentId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ForecastingExperiment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
