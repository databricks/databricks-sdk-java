// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * Note: This API reference documents APIs for the Workspace Model Registry. Databricks recommends
 * using [Models in Unity Catalog](/api/workspace/registeredmodels) instead. Models in Unity Catalog
 * provides centralized model governance, cross-workspace access, lineage, and deployment. Workspace
 * Model Registry will be deprecated in the future.
 *
 * <p>The Workspace Model Registry is a centralized model repository and a UI and set of APIs that
 * enable you to manage the full lifecycle of MLflow Models.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ModelRegistryService {
  /** Approves a model version stage transition request. */
  ApproveTransitionRequestResponse approveTransitionRequest(
      ApproveTransitionRequest approveTransitionRequest);

  /**
   * Posts a comment on a model version. A comment can be submitted either by a user or
   * programmatically to display relevant information about the model. For example, test results or
   * deployment errors.
   */
  CreateCommentResponse createComment(CreateComment createComment);

  /**
   * Creates a new registered model with the name specified in the request body.
   *
   * <p>Throws `RESOURCE_ALREADY_EXISTS` if a registered model with the given name exists.
   */
  CreateModelResponse createModel(CreateModelRequest createModelRequest);

  /** Creates a model version. */
  CreateModelVersionResponse createModelVersion(
      CreateModelVersionRequest createModelVersionRequest);

  /** Creates a model version stage transition request. */
  CreateTransitionRequestResponse createTransitionRequest(
      CreateTransitionRequest createTransitionRequest);

  /**
   * **NOTE**: This endpoint is in Public Preview.
   *
   * <p>Creates a registry webhook.
   */
  CreateWebhookResponse createWebhook(CreateRegistryWebhook createRegistryWebhook);

  /** Deletes a comment on a model version. */
  void deleteComment(DeleteCommentRequest deleteCommentRequest);

  /** Deletes a registered model. */
  void deleteModel(DeleteModelRequest deleteModelRequest);

  /** Deletes the tag for a registered model. */
  void deleteModelTag(DeleteModelTagRequest deleteModelTagRequest);

  /** Deletes a model version. */
  void deleteModelVersion(DeleteModelVersionRequest deleteModelVersionRequest);

  /** Deletes a model version tag. */
  void deleteModelVersionTag(DeleteModelVersionTagRequest deleteModelVersionTagRequest);

  /** Cancels a model version stage transition request. */
  void deleteTransitionRequest(DeleteTransitionRequestRequest deleteTransitionRequestRequest);

  /**
   * **NOTE:** This endpoint is in Public Preview.
   *
   * <p>Deletes a registry webhook.
   */
  void deleteWebhook(DeleteWebhookRequest deleteWebhookRequest);

  /** Gets the latest version of a registered model. */
  GetLatestVersionsResponse getLatestVersions(GetLatestVersionsRequest getLatestVersionsRequest);

  /**
   * Get the details of a model. This is a Databricks workspace version of the [MLflow endpoint]
   * that also returns the model's Databricks workspace ID and the permission level of the
   * requesting user on the model.
   *
   * <p>[MLflow endpoint]: https://www.mlflow.org/docs/latest/rest-api.html#get-registeredmodel
   */
  GetModelResponse getModel(GetModelRequest getModelRequest);

  /** Get a model version. */
  GetModelVersionResponse getModelVersion(GetModelVersionRequest getModelVersionRequest);

  /** Gets a URI to download the model version. */
  GetModelVersionDownloadUriResponse getModelVersionDownloadUri(
      GetModelVersionDownloadUriRequest getModelVersionDownloadUriRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetRegisteredModelPermissionLevelsResponse getPermissionLevels(
      GetRegisteredModelPermissionLevelsRequest getRegisteredModelPermissionLevelsRequest);

  /**
   * Gets the permissions of a registered model. Registered models can inherit permissions from
   * their root object.
   */
  RegisteredModelPermissions getPermissions(
      GetRegisteredModelPermissionsRequest getRegisteredModelPermissionsRequest);

  /** Lists all available registered models, up to the limit specified in __max_results__. */
  ListModelsResponse listModels(ListModelsRequest listModelsRequest);

  /** Gets a list of all open stage transition requests for the model version. */
  ListTransitionRequestsResponse listTransitionRequests(
      ListTransitionRequestsRequest listTransitionRequestsRequest);

  /**
   * **NOTE:** This endpoint is in Public Preview.
   *
   * <p>Lists all registry webhooks.
   */
  ListRegistryWebhooks listWebhooks(ListWebhooksRequest listWebhooksRequest);

  /** Rejects a model version stage transition request. */
  RejectTransitionRequestResponse rejectTransitionRequest(
      RejectTransitionRequest rejectTransitionRequest);

  /** Renames a registered model. */
  RenameModelResponse renameModel(RenameModelRequest renameModelRequest);

  /** Searches for specific model versions based on the supplied __filter__. */
  SearchModelVersionsResponse searchModelVersions(
      SearchModelVersionsRequest searchModelVersionsRequest);

  /** Search for registered models based on the specified __filter__. */
  SearchModelsResponse searchModels(SearchModelsRequest searchModelsRequest);

  /** Sets a tag on a registered model. */
  void setModelTag(SetModelTagRequest setModelTagRequest);

  /** Sets a model version tag. */
  void setModelVersionTag(SetModelVersionTagRequest setModelVersionTagRequest);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  RegisteredModelPermissions setPermissions(
      RegisteredModelPermissionsRequest registeredModelPermissionsRequest);

  /**
   * **NOTE:** This endpoint is in Public Preview.
   *
   * <p>Tests a registry webhook.
   */
  TestRegistryWebhookResponse testRegistryWebhook(
      TestRegistryWebhookRequest testRegistryWebhookRequest);

  /**
   * Transition a model version's stage. This is a Databricks workspace version of the [MLflow
   * endpoint] that also accepts a comment associated with the transition to be recorded.",
   *
   * <p>[MLflow endpoint]:
   * https://www.mlflow.org/docs/latest/rest-api.html#transition-modelversion-stage
   */
  TransitionStageResponse transitionStage(
      TransitionModelVersionStageDatabricks transitionModelVersionStageDatabricks);

  /** Post an edit to a comment on a model version. */
  UpdateCommentResponse updateComment(UpdateComment updateComment);

  /** Updates a registered model. */
  void updateModel(UpdateModelRequest updateModelRequest);

  /** Updates the model version. */
  void updateModelVersion(UpdateModelVersionRequest updateModelVersionRequest);

  /**
   * Updates the permissions on a registered model. Registered models can inherit permissions from
   * their root object.
   */
  RegisteredModelPermissions updatePermissions(
      RegisteredModelPermissionsRequest registeredModelPermissionsRequest);

  /**
   * **NOTE:** This endpoint is in Public Preview.
   *
   * <p>Updates a registry webhook.
   */
  void updateWebhook(UpdateRegistryWebhook updateRegistryWebhook);
}
