// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import org.apache.http.client.methods.*;

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
    return apiClient.POST(path, request, ApproveTransitionRequestResponse.class);
  }

  @Override
  public CreateCommentResponse createComment(CreateComment request) {
    String path = "/api/2.0/mlflow/comments/create";
    return apiClient.POST(path, request, CreateCommentResponse.class);
  }

  @Override
  public CreateModelResponse createModel(CreateModelRequest request) {
    String path = "/api/2.0/mlflow/registered-models/create";
    return apiClient.POST(path, request, CreateModelResponse.class);
  }

  @Override
  public CreateModelVersionResponse createModelVersion(CreateModelVersionRequest request) {
    String path = "/api/2.0/mlflow/model-versions/create";
    return apiClient.POST(path, request, CreateModelVersionResponse.class);
  }

  @Override
  public CreateTransitionRequestResponse createTransitionRequest(CreateTransitionRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/create";
    return apiClient.POST(path, request, CreateTransitionRequestResponse.class);
  }

  @Override
  public CreateWebhookResponse createWebhook(CreateRegistryWebhook request) {
    String path = "/api/2.0/mlflow/registry-webhooks/create";
    return apiClient.POST(path, request, CreateWebhookResponse.class);
  }

  @Override
  public void deleteComment(DeleteCommentRequest request) {
    String path = "/api/2.0/mlflow/comments/delete";

    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public void deleteModel(DeleteModelRequest request) {
    String path = "/api/2.0/mlflow/registered-models/delete";

    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public void deleteModelTag(DeleteModelTagRequest request) {
    String path = "/api/2.0/mlflow/registered-models/delete-tag";

    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public void deleteModelVersion(DeleteModelVersionRequest request) {
    String path = "/api/2.0/mlflow/model-versions/delete";

    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public void deleteModelVersionTag(DeleteModelVersionTagRequest request) {
    String path = "/api/2.0/mlflow/model-versions/delete-tag";

    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public void deleteTransitionRequest(DeleteTransitionRequestRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/delete";

    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public void deleteWebhook(DeleteWebhookRequest request) {
    String path = "/api/2.0/mlflow/registry-webhooks/delete";

    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public GetLatestVersionsResponse getLatestVersions(GetLatestVersionsRequest request) {
    String path = "/api/2.0/mlflow/registered-models/get-latest-versions";
    return apiClient.POST(path, request, GetLatestVersionsResponse.class);
  }

  @Override
  public GetModelResponse getModel(GetModelRequest request) {
    String path = "/api/2.0/mlflow/databricks/registered-models/get";
    return apiClient.GET(path, request, GetModelResponse.class);
  }

  @Override
  public GetModelVersionResponse getModelVersion(GetModelVersionRequest request) {
    String path = "/api/2.0/mlflow/model-versions/get";
    return apiClient.GET(path, request, GetModelVersionResponse.class);
  }

  @Override
  public GetModelVersionDownloadUriResponse getModelVersionDownloadUri(
      GetModelVersionDownloadUriRequest request) {
    String path = "/api/2.0/mlflow/model-versions/get-download-uri";
    return apiClient.GET(path, request, GetModelVersionDownloadUriResponse.class);
  }

  @Override
  public ListModelsResponse listModels(ListModelsRequest request) {
    String path = "/api/2.0/mlflow/registered-models/list";
    return apiClient.GET(path, request, ListModelsResponse.class);
  }

  @Override
  public ListTransitionRequestsResponse listTransitionRequests(
      ListTransitionRequestsRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/list";
    return apiClient.GET(path, request, ListTransitionRequestsResponse.class);
  }

  @Override
  public ListRegistryWebhooks listWebhooks(ListWebhooksRequest request) {
    String path = "/api/2.0/mlflow/registry-webhooks/list";
    return apiClient.GET(path, request, ListRegistryWebhooks.class);
  }

  @Override
  public RejectTransitionRequestResponse rejectTransitionRequest(RejectTransitionRequest request) {
    String path = "/api/2.0/mlflow/transition-requests/reject";
    return apiClient.POST(path, request, RejectTransitionRequestResponse.class);
  }

  @Override
  public RenameModelResponse renameModel(RenameModelRequest request) {
    String path = "/api/2.0/mlflow/registered-models/rename";
    return apiClient.POST(path, request, RenameModelResponse.class);
  }

  @Override
  public SearchModelVersionsResponse searchModelVersions(SearchModelVersionsRequest request) {
    String path = "/api/2.0/mlflow/model-versions/search";
    return apiClient.GET(path, request, SearchModelVersionsResponse.class);
  }

  @Override
  public SearchModelsResponse searchModels(SearchModelsRequest request) {
    String path = "/api/2.0/mlflow/registered-models/search";
    return apiClient.GET(path, request, SearchModelsResponse.class);
  }

  @Override
  public void setModelTag(SetModelTagRequest request) {
    String path = "/api/2.0/mlflow/registered-models/set-tag";

    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void setModelVersionTag(SetModelVersionTagRequest request) {
    String path = "/api/2.0/mlflow/model-versions/set-tag";

    apiClient.POST(path, request, Void.class);
  }

  @Override
  public TestRegistryWebhookResponse testRegistryWebhook(TestRegistryWebhookRequest request) {
    String path = "/api/2.0/mlflow/registry-webhooks/test";
    return apiClient.POST(path, request, TestRegistryWebhookResponse.class);
  }

  @Override
  public TransitionStageResponse transitionStage(TransitionModelVersionStageDatabricks request) {
    String path = "/api/2.0/mlflow/databricks/model-versions/transition-stage";
    return apiClient.POST(path, request, TransitionStageResponse.class);
  }

  @Override
  public UpdateCommentResponse updateComment(UpdateComment request) {
    String path = "/api/2.0/mlflow/comments/update";
    return apiClient.PATCH(path, request, UpdateCommentResponse.class);
  }

  @Override
  public void updateModel(UpdateModelRequest request) {
    String path = "/api/2.0/mlflow/registered-models/update";

    apiClient.PATCH(path, request, Void.class);
  }

  @Override
  public void updateModelVersion(UpdateModelVersionRequest request) {
    String path = "/api/2.0/mlflow/model-versions/update";

    apiClient.PATCH(path, request, Void.class);
  }

  @Override
  public void updateWebhook(UpdateRegistryWebhook request) {
    String path = "/api/2.0/mlflow/registry-webhooks/update";

    apiClient.PATCH(path, request, Void.class);
  }
}
