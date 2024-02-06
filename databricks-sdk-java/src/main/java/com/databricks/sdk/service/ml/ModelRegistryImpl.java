// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ModelRegistry */
@Generated
class ModelRegistryImpl implements ModelRegistryService {
  private final ApiClient apiClient;

  public ModelRegistryImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ApproveTransitionRequestResponse approveTransitionRequest(
      ApproveTransitionRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/approve";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, ApproveTransitionRequestResponse.class, headers);
  }

  @Override
  public CreateCommentResponse createComment(CreateComment request) {
    String path = "/api/2.0/mlflow/comments/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateCommentResponse.class, headers);
  }

  @Override
  public CreateModelResponse createModel(CreateModelRequest request) {
    String path = "/api/2.0/mlflow/registered-models/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateModelResponse.class, headers);
  }

  @Override
  public CreateModelVersionResponse createModelVersion(CreateModelVersionRequest request) {
    String path = "/api/2.0/mlflow/model-versions/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateModelVersionResponse.class, headers);
  }

  @Override
  public CreateTransitionRequestResponse createTransitionRequest(CreateTransitionRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateTransitionRequestResponse.class, headers);
  }

  @Override
  public CreateWebhookResponse createWebhook(CreateRegistryWebhook request) {
    String path = "/api/2.0/mlflow/registry-webhooks/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateWebhookResponse.class, headers);
  }

  @Override
  public void deleteComment(DeleteCommentRequest request) {
    String path = "/api/2.0/mlflow/comments/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, null, Void.class, headers);
  }

  @Override
  public void deleteModel(DeleteModelRequest request) {
    String path = "/api/2.0/mlflow/registered-models/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, null, Void.class, headers);
  }

  @Override
  public void deleteModelTag(DeleteModelTagRequest request) {
    String path = "/api/2.0/mlflow/registered-models/delete-tag";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, null, Void.class, headers);
  }

  @Override
  public void deleteModelVersion(DeleteModelVersionRequest request) {
    String path = "/api/2.0/mlflow/model-versions/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, null, Void.class, headers);
  }

  @Override
  public void deleteModelVersionTag(DeleteModelVersionTagRequest request) {
    String path = "/api/2.0/mlflow/model-versions/delete-tag";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, null, Void.class, headers);
  }

  @Override
  public void deleteTransitionRequest(DeleteTransitionRequestRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, null, Void.class, headers);
  }

  @Override
  public void deleteWebhook(DeleteWebhookRequest request) {
    String path = "/api/2.0/mlflow/registry-webhooks/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, null, Void.class, headers);
  }

  @Override
  public GetLatestVersionsResponse getLatestVersions(GetLatestVersionsRequest request) {
    String path = "/api/2.0/mlflow/registered-models/get-latest-versions";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, GetLatestVersionsResponse.class, headers);
  }

  @Override
  public GetModelResponse getModel(GetModelRequest request) {
    String path = "/api/2.0/mlflow/databricks/registered-models/get";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, GetModelResponse.class, headers);
  }

  @Override
  public GetModelVersionResponse getModelVersion(GetModelVersionRequest request) {
    String path = "/api/2.0/mlflow/model-versions/get";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, GetModelVersionResponse.class, headers);
  }

  @Override
  public GetModelVersionDownloadUriResponse getModelVersionDownloadUri(
      GetModelVersionDownloadUriRequest request) {
    String path = "/api/2.0/mlflow/model-versions/get-download-uri";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, GetModelVersionDownloadUriResponse.class, headers);
  }

  @Override
  public GetRegisteredModelPermissionLevelsResponse getPermissionLevels(
      GetRegisteredModelPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/registered-models/%s/permissionLevels",
            request.getRegisteredModelId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, GetRegisteredModelPermissionLevelsResponse.class, headers);
  }

  @Override
  public RegisteredModelPermissions getPermissions(GetRegisteredModelPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/registered-models/%s", request.getRegisteredModelId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, RegisteredModelPermissions.class, headers);
  }

  @Override
  public ListModelsResponse listModels(ListModelsRequest request) {
    String path = "/api/2.0/mlflow/registered-models/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, ListModelsResponse.class, headers);
  }

  @Override
  public ListTransitionRequestsResponse listTransitionRequests(
      ListTransitionRequestsRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, ListTransitionRequestsResponse.class, headers);
  }

  @Override
  public ListRegistryWebhooks listWebhooks(ListWebhooksRequest request) {
    String path = "/api/2.0/mlflow/registry-webhooks/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, ListRegistryWebhooks.class, headers);
  }

  @Override
  public RejectTransitionRequestResponse rejectTransitionRequest(RejectTransitionRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/reject";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, RejectTransitionRequestResponse.class, headers);
  }

  @Override
  public RenameModelResponse renameModel(RenameModelRequest request) {
    String path = "/api/2.0/mlflow/registered-models/rename";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, RenameModelResponse.class, headers);
  }

  @Override
  public SearchModelVersionsResponse searchModelVersions(SearchModelVersionsRequest request) {
    String path = "/api/2.0/mlflow/model-versions/search";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, SearchModelVersionsResponse.class, headers);
  }

  @Override
  public SearchModelsResponse searchModels(SearchModelsRequest request) {
    String path = "/api/2.0/mlflow/registered-models/search";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, SearchModelsResponse.class, headers);
  }

  @Override
  public void setModelTag(SetModelTagRequest request) {
    String path = "/api/2.0/mlflow/registered-models/set-tag";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void setModelVersionTag(SetModelVersionTagRequest request) {
    String path = "/api/2.0/mlflow/model-versions/set-tag";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public RegisteredModelPermissions setPermissions(RegisteredModelPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/registered-models/%s", request.getRegisteredModelId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, RegisteredModelPermissions.class, headers);
  }

  @Override
  public TestRegistryWebhookResponse testRegistryWebhook(TestRegistryWebhookRequest request) {
    String path = "/api/2.0/mlflow/registry-webhooks/test";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, TestRegistryWebhookResponse.class, headers);
  }

  @Override
  public TransitionStageResponse transitionStage(TransitionModelVersionStageDatabricks request) {
    String path = "/api/2.0/mlflow/databricks/model-versions/transition-stage";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, TransitionStageResponse.class, headers);
  }

  @Override
  public UpdateCommentResponse updateComment(UpdateComment request) {
    String path = "/api/2.0/mlflow/comments/update";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, UpdateCommentResponse.class, headers);
  }

  @Override
  public void updateModel(UpdateModelRequest request) {
    String path = "/api/2.0/mlflow/registered-models/update";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, Void.class, headers);
  }

  @Override
  public void updateModelVersion(UpdateModelVersionRequest request) {
    String path = "/api/2.0/mlflow/model-versions/update";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, Void.class, headers);
  }

  @Override
  public RegisteredModelPermissions updatePermissions(RegisteredModelPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/registered-models/%s", request.getRegisteredModelId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, RegisteredModelPermissions.class, headers);
  }

  @Override
  public void updateWebhook(UpdateRegistryWebhook request) {
    String path = "/api/2.0/mlflow/registry-webhooks/update";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, Void.class, headers);
  }
}
