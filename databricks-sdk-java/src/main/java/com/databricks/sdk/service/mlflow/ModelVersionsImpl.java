// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of ModelVersions */
class ModelVersionsImpl implements ModelVersionsService {
  private final ApiClient apiClient;

  public ModelVersionsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateModelVersionResponse create(CreateModelVersionRequest request) {
    String path = "/api/2.0/mlflow/model-versions/create";
    return apiClient.POST(path, request, CreateModelVersionResponse.class);
  }

  @Override
  public void delete(DeleteModelVersionRequest request) {
    String path = "/api/2.0/mlflow/model-versions/delete";
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public void deleteTag(DeleteModelVersionTagRequest request) {
    String path = "/api/2.0/mlflow/model-versions/delete-tag";
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public GetModelVersionResponse get(GetModelVersionRequest request) {
    String path = "/api/2.0/mlflow/model-versions/get";
    return apiClient.GET(path, request, GetModelVersionResponse.class);
  }

  @Override
  public GetModelVersionDownloadUriResponse getDownloadUri(
      GetModelVersionDownloadUriRequest request) {
    String path = "/api/2.0/mlflow/model-versions/get-download-uri";
    return apiClient.GET(path, request, GetModelVersionDownloadUriResponse.class);
  }

  @Override
  public SearchModelVersionsResponse search(SearchModelVersionsRequest request) {
    String path = "/api/2.0/mlflow/model-versions/search";
    return apiClient.GET(path, request, SearchModelVersionsResponse.class);
  }

  @Override
  public void setTag(SetModelVersionTagRequest request) {
    String path = "/api/2.0/mlflow/model-versions/set-tag";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public TransitionModelVersionStageResponse transitionStage(TransitionModelVersionStage request) {
    String path = "/api/2.0/mlflow/model-versions/transition-stage";
    return apiClient.POST(path, request, TransitionModelVersionStageResponse.class);
  }

  @Override
  public void update(UpdateModelVersionRequest request) {
    String path = "/api/2.0/mlflow/model-versions/update";
    apiClient.PATCH(path, request, Void.class);
  }
}
