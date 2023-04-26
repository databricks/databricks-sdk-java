// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Experiments */
class ExperimentsImpl implements ExperimentsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for ExperimentsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public ExperimentsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public CreateExperimentResponse createExperiment(CreateExperiment request) {
    String path = "/api/2.0/mlflow/experiments/create";
    return apiClient.POST(path, request, CreateExperimentResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public CreateRunResponse createRun(CreateRun request) {
    String path = "/api/2.0/mlflow/runs/create";
    return apiClient.POST(path, request, CreateRunResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void deleteExperiment(DeleteExperiment request) {
    String path = "/api/2.0/mlflow/experiments/delete";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void deleteRun(DeleteRun request) {
    String path = "/api/2.0/mlflow/runs/delete";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void deleteTag(DeleteTag request) {
    String path = "/api/2.0/mlflow/runs/delete-tag";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetExperimentByNameResponse getByName(GetByNameRequest request) {
    String path = "/api/2.0/mlflow/experiments/get-by-name";
    return apiClient.GET(path, request, GetExperimentByNameResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public Experiment getExperiment(GetExperimentRequest request) {
    String path = "/api/2.0/mlflow/experiments/get";
    return apiClient.GET(path, request, Experiment.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetMetricHistoryResponse getHistory(GetHistoryRequest request) {
    String path = "/api/2.0/mlflow/metrics/get-history";
    return apiClient.GET(path, request, GetMetricHistoryResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetRunResponse getRun(GetRunRequest request) {
    String path = "/api/2.0/mlflow/runs/get";
    return apiClient.GET(path, request, GetRunResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListArtifactsResponse listArtifacts(ListArtifactsRequest request) {
    String path = "/api/2.0/mlflow/artifacts/list";
    return apiClient.GET(path, request, ListArtifactsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListExperimentsResponse listExperiments(ListExperimentsRequest request) {
    String path = "/api/2.0/mlflow/experiments/list";
    return apiClient.GET(path, request, ListExperimentsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void logBatch(LogBatch request) {
    String path = "/api/2.0/mlflow/runs/log-batch";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void logMetric(LogMetric request) {
    String path = "/api/2.0/mlflow/runs/log-metric";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void logModel(LogModel request) {
    String path = "/api/2.0/mlflow/runs/log-model";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void logParam(LogParam request) {
    String path = "/api/2.0/mlflow/runs/log-parameter";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void restoreExperiment(RestoreExperiment request) {
    String path = "/api/2.0/mlflow/experiments/restore";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void restoreRun(RestoreRun request) {
    String path = "/api/2.0/mlflow/runs/restore";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public SearchExperimentsResponse searchExperiments(SearchExperiments request) {
    String path = "/api/2.0/mlflow/experiments/search";
    return apiClient.POST(path, request, SearchExperimentsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public SearchRunsResponse searchRuns(SearchRuns request) {
    String path = "/api/2.0/mlflow/runs/search";
    return apiClient.POST(path, request, SearchRunsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void setExperimentTag(SetExperimentTag request) {
    String path = "/api/2.0/mlflow/experiments/set-experiment-tag";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void setTag(SetTag request) {
    String path = "/api/2.0/mlflow/runs/set-tag";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void updateExperiment(UpdateExperiment request) {
    String path = "/api/2.0/mlflow/experiments/update";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public UpdateRunResponse updateRun(UpdateRun request) {
    String path = "/api/2.0/mlflow/runs/update";
    return apiClient.POST(path, request, UpdateRunResponse.class);
  }
}
