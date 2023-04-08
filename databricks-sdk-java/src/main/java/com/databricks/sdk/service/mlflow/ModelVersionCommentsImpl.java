// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of ModelVersionComments */
class ModelVersionCommentsImpl implements ModelVersionCommentsService {
  private final ApiClient apiClient;

  public ModelVersionCommentsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateResponse create(CreateComment request) {
    String path = "/api/2.0/mlflow/comments/create";
    return apiClient.POST(path, request, CreateResponse.class);
  }

  @Override
  public void delete(DeleteModelVersionCommentRequest request) {
    String path = "/api/2.0/mlflow/comments/delete";
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public UpdateResponse update(UpdateComment request) {
    String path = "/api/2.0/mlflow/comments/update";
    return apiClient.POST(path, request, UpdateResponse.class);
  }
}
