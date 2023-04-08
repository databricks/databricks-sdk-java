// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of TransitionRequests */
class TransitionRequestsImpl implements TransitionRequestsService {
  private final ApiClient apiClient;

  public TransitionRequestsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ApproveResponse approve(ApproveTransitionRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/approve";
    return apiClient.POST(path, request, ApproveResponse.class);
  }

  @Override
  public CreateResponse create(CreateTransitionRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/create";
    return apiClient.POST(path, request, CreateResponse.class);
  }

  @Override
  public void delete(DeleteTransitionRequestRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/delete";
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public ListResponse list(ListTransitionRequestsRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/list";
    return apiClient.GET(path, request, ListResponse.class);
  }

  @Override
  public RejectResponse reject(RejectTransitionRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/reject";
    return apiClient.POST(path, request, RejectResponse.class);
  }
}
