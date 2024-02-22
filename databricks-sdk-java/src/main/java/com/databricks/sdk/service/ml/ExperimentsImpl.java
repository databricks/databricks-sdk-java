// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Experiments */
@Generated
class ExperimentsImpl implements ExperimentsService {
  private final ApiClient apiClient;

  public ExperimentsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateExperimentResponse createExperiment(CreateExperiment request) {
    String path = "/api/2.0/mlflow/experiments/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateExperimentResponse.class, headers);
  }

  @Override
  public CreateRunResponse createRun(CreateRun request) {
    String path = "/api/2.0/mlflow/runs/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateRunResponse.class, headers);
  }

  @Override
  public DeleteExperimentResponse deleteExperiment(DeleteExperiment request) {
    String path = "/api/2.0/mlflow/experiments/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, DeleteExperimentResponse.class, headers);
  }

  @Override
  public DeleteRunResponse deleteRun(DeleteRun request) {
    String path = "/api/2.0/mlflow/runs/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, DeleteRunResponse.class, headers);
  }

  @Override
  public DeleteRunsResponse deleteRuns(DeleteRuns request) {
    String path = "/api/2.0/mlflow/databricks/runs/delete-runs";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, DeleteRunsResponse.class, headers);
  }

  @Override
  public DeleteTagResponse deleteTag(DeleteTag request) {
    String path = "/api/2.0/mlflow/runs/delete-tag";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, DeleteTagResponse.class, headers);
  }

  @Override
  public GetExperimentResponse getByName(GetByNameRequest request) {
    String path = "/api/2.0/mlflow/experiments/get-by-name";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetExperimentResponse.class, headers);
  }

  @Override
  public GetExperimentResponse getExperiment(GetExperimentRequest request) {
    String path = "/api/2.0/mlflow/experiments/get";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetExperimentResponse.class, headers);
  }

  @Override
  public GetMetricHistoryResponse getHistory(GetHistoryRequest request) {
    String path = "/api/2.0/mlflow/metrics/get-history";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetMetricHistoryResponse.class, headers);
  }

  @Override
  public GetExperimentPermissionLevelsResponse getPermissionLevels(
      GetExperimentPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/experiments/%s/permissionLevels", request.getExperimentId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetExperimentPermissionLevelsResponse.class, headers);
  }

  @Override
  public ExperimentPermissions getPermissions(GetExperimentPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/experiments/%s", request.getExperimentId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ExperimentPermissions.class, headers);
  }

  @Override
  public GetRunResponse getRun(GetRunRequest request) {
    String path = "/api/2.0/mlflow/runs/get";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetRunResponse.class, headers);
  }

  @Override
  public ListArtifactsResponse listArtifacts(ListArtifactsRequest request) {
    String path = "/api/2.0/mlflow/artifacts/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListArtifactsResponse.class, headers);
  }

  @Override
  public ListExperimentsResponse listExperiments(ListExperimentsRequest request) {
    String path = "/api/2.0/mlflow/experiments/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListExperimentsResponse.class, headers);
  }

  @Override
  public LogBatchResponse logBatch(LogBatch request) {
    String path = "/api/2.0/mlflow/runs/log-batch";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, LogBatchResponse.class, headers);
  }

  @Override
  public LogInputsResponse logInputs(LogInputs request) {
    String path = "/api/2.0/mlflow/runs/log-inputs";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, LogInputsResponse.class, headers);
  }

  @Override
  public LogMetricResponse logMetric(LogMetric request) {
    String path = "/api/2.0/mlflow/runs/log-metric";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, LogMetricResponse.class, headers);
  }

  @Override
  public LogModelResponse logModel(LogModel request) {
    String path = "/api/2.0/mlflow/runs/log-model";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, LogModelResponse.class, headers);
  }

  @Override
  public LogParamResponse logParam(LogParam request) {
    String path = "/api/2.0/mlflow/runs/log-parameter";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, LogParamResponse.class, headers);
  }

  @Override
  public RestoreExperimentResponse restoreExperiment(RestoreExperiment request) {
    String path = "/api/2.0/mlflow/experiments/restore";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, RestoreExperimentResponse.class, headers);
  }

  @Override
  public RestoreRunResponse restoreRun(RestoreRun request) {
    String path = "/api/2.0/mlflow/runs/restore";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, RestoreRunResponse.class, headers);
  }

  @Override
  public RestoreRunsResponse restoreRuns(RestoreRuns request) {
    String path = "/api/2.0/mlflow/databricks/runs/restore-runs";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, RestoreRunsResponse.class, headers);
  }

  @Override
  public SearchExperimentsResponse searchExperiments(SearchExperiments request) {
    String path = "/api/2.0/mlflow/experiments/search";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, SearchExperimentsResponse.class, headers);
  }

  @Override
  public SearchRunsResponse searchRuns(SearchRuns request) {
    String path = "/api/2.0/mlflow/runs/search";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, SearchRunsResponse.class, headers);
  }

  @Override
  public SetExperimentTagResponse setExperimentTag(SetExperimentTag request) {
    String path = "/api/2.0/mlflow/experiments/set-experiment-tag";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, SetExperimentTagResponse.class, headers);
  }

  @Override
  public ExperimentPermissions setPermissions(ExperimentPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/experiments/%s", request.getExperimentId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, ExperimentPermissions.class, headers);
  }

  @Override
  public SetTagResponse setTag(SetTag request) {
    String path = "/api/2.0/mlflow/runs/set-tag";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, SetTagResponse.class, headers);
  }

  @Override
  public UpdateExperimentResponse updateExperiment(UpdateExperiment request) {
    String path = "/api/2.0/mlflow/experiments/update";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, UpdateExperimentResponse.class, headers);
  }

  @Override
  public ExperimentPermissions updatePermissions(ExperimentPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/experiments/%s", request.getExperimentId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, ExperimentPermissions.class, headers);
  }

  @Override
  public UpdateRunResponse updateRun(UpdateRun request) {
    String path = "/api/2.0/mlflow/runs/update";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, UpdateRunResponse.class, headers);
  }
}
