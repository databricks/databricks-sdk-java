// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Experiments */
class ExperimentsImpl implements ExperimentsService {
  private final ApiClient apiClient;

  public ExperimentsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateExperimentResponse create(CreateExperiment request) {
    String path = "/api/2.0/mlflow/experiments/create";
    return apiClient.POST(path, request, CreateExperimentResponse.class);
  }

  @Override
  public void delete(DeleteExperiment request) {
    String path = "/api/2.0/mlflow/experiments/delete";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public Experiment get(GetExperimentRequest request) {
    String path = "/api/2.0/mlflow/experiments/get";
    return apiClient.GET(path, request, Experiment.class);
  }

  @Override
  public GetExperimentByNameResponse getByName(GetByNameRequest request) {
    String path = "/api/2.0/mlflow/experiments/get-by-name";
    return apiClient.GET(path, request, GetExperimentByNameResponse.class);
  }

  @Override
  public ListExperimentsResponse list(ListExperimentsRequest request) {
    String path = "/api/2.0/mlflow/experiments/list";
    return apiClient.GET(path, request, ListExperimentsResponse.class);
  }

  @Override
  public void restore(RestoreExperiment request) {
    String path = "/api/2.0/mlflow/experiments/restore";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public SearchExperimentsResponse search(SearchExperiments request) {
    String path = "/api/2.0/mlflow/experiments/search";
    return apiClient.POST(path, request, SearchExperimentsResponse.class);
  }

  @Override
  public void setExperimentTag(SetExperimentTag request) {
    String path = "/api/2.0/mlflow/experiments/set-experiment-tag";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void update(UpdateExperiment request) {
    String path = "/api/2.0/mlflow/experiments/update";
    apiClient.POST(path, request, Void.class);
  }
}
