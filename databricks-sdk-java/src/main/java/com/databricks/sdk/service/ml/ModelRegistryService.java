// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

/**
 * This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface ModelRegistryService {
  /**
   * Approve transition request.
   *
   * <p>Approves a model version stage transition request.
   */
  ApproveTransitionRequestResponse approveTransitionRequest(
      ApproveTransitionRequest approveTransitionRequest);

  /**
   * Post a comment.
   *
   * <p>Posts a comment on a model version. A comment can be submitted either by a user or
   * programmatically to display relevant information about the model. For example, test results or
   * deployment errors.
   */
  CreateCommentResponse createComment(CreateComment createComment);

  /**
   * Create a model.
   *
   * <p>Creates a new registered model with the name specified in the request body.
   *
   * <p>Throws `RESOURCE_ALREADY_EXISTS` if a registered model with the given name exists.
   */
  CreateModelResponse createModel(CreateModelRequest createModelRequest);

  /**
   * Create a model version.
   *
   * <p>Creates a model version.
   */
  CreateModelVersionResponse createModelVersion(
      CreateModelVersionRequest createModelVersionRequest);

  /**
   * Make a transition request.
   *
   * <p>Creates a model version stage transition request.
   */
  CreateTransitionRequestResponse createTransitionRequest(
      CreateTransitionRequest createTransitionRequest);

  /**
   * Create a webhook.
   *
   * <p>**NOTE**: This endpoint is in Public Preview.
   *
   * <p>Creates a registry webhook.
   */
  CreateWebhookResponse createWebhook(CreateRegistryWebhook createRegistryWebhook);

  /**
   * Delete a comment.
   *
   * <p>Deletes a comment on a model version.
   */
  void deleteComment(DeleteCommentRequest deleteCommentRequest);

  /**
   * Delete a model.
   *
   * <p>Deletes a registered model.
   */
  void deleteModel(DeleteModelRequest deleteModelRequest);

  /**
   * Delete a model tag.
   *
   * <p>Deletes the tag for a registered model.
   */
  void deleteModelTag(DeleteModelTagRequest deleteModelTagRequest);

  /**
   * Delete a model version.
   *
   * <p>Deletes a model version.
   */
  void deleteModelVersion(DeleteModelVersionRequest deleteModelVersionRequest);

  /**
   * Delete a model version tag.
   *
   * <p>Deletes a model version tag.
   */
  void deleteModelVersionTag(DeleteModelVersionTagRequest deleteModelVersionTagRequest);

  /**
   * Delete a ransition request.
   *
   * <p>Cancels a model version stage transition request.
   */
  void deleteTransitionRequest(DeleteTransitionRequestRequest deleteTransitionRequestRequest);

  /**
   * Delete a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Deletes a registry webhook.
   */
  void deleteWebhook(DeleteWebhookRequest deleteWebhookRequest);

  /**
   * Get the latest version.
   *
   * <p>Gets the latest version of a registered model.
   */
  GetLatestVersionsResponse getLatestVersions(GetLatestVersionsRequest getLatestVersionsRequest);

  /**
   * Get model.
   *
   * <p>Get the details of a model. This is a Databricks Workspace version of the [MLflow endpoint]
   * that also returns the model's Databricks Workspace ID and the permission level of the
   * requesting user on the model.
   *
   * <p>[MLflow endpoint]: https://www.mlflow.org/docs/latest/rest-api.html#get-registeredmodel
   */
  GetModelResponse getModel(GetModelRequest getModelRequest);

  /**
   * Get a model version.
   *
   * <p>Get a model version.
   */
  GetModelVersionResponse getModelVersion(GetModelVersionRequest getModelVersionRequest);

  /**
   * Get a model version URI.
   *
   * <p>Gets a URI to download the model version.
   */
  GetModelVersionDownloadUriResponse getModelVersionDownloadUri(
      GetModelVersionDownloadUriRequest getModelVersionDownloadUriRequest);

  /**
   * List models.
   *
   * <p>Lists all available registered models, up to the limit specified in __max_results__.
   */
  ListModelsResponse listModels(ListModelsRequest listModelsRequest);

  /**
   * List transition requests.
   *
   * <p>Gets a list of all open stage transition requests for the model version.
   */
  ListTransitionRequestsResponse listTransitionRequests(
      ListTransitionRequestsRequest listTransitionRequestsRequest);

  /**
   * List registry webhooks.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Lists all registry webhooks.
   */
  ListRegistryWebhooks listWebhooks(ListWebhooksRequest listWebhooksRequest);

  /**
   * Reject a transition request.
   *
   * <p>Rejects a model version stage transition request.
   */
  RejectTransitionRequestResponse rejectTransitionRequest(
      RejectTransitionRequest rejectTransitionRequest);

  /**
   * Rename a model.
   *
   * <p>Renames a registered model.
   */
  RenameModelResponse renameModel(RenameModelRequest renameModelRequest);

  /**
   * Searches model versions.
   *
   * <p>Searches for specific model versions based on the supplied __filter__.
   */
  SearchModelVersionsResponse searchModelVersions(
      SearchModelVersionsRequest searchModelVersionsRequest);

  /**
   * Search models.
   *
   * <p>Search for registered models based on the specified __filter__.
   */
  SearchModelsResponse searchModels(SearchModelsRequest searchModelsRequest);

  /**
   * Set a tag.
   *
   * <p>Sets a tag on a registered model.
   */
  void setModelTag(SetModelTagRequest setModelTagRequest);

  /**
   * Set a version tag.
   *
   * <p>Sets a model version tag.
   */
  void setModelVersionTag(SetModelVersionTagRequest setModelVersionTagRequest);

  /**
   * Test a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Tests a registry webhook.
   */
  TestRegistryWebhookResponse testRegistryWebhook(
      TestRegistryWebhookRequest testRegistryWebhookRequest);

  /**
   * Transition a stage.
   *
   * <p>Transition a model version's stage. This is a Databricks Workspace version of the [MLflow
   * endpoint] that also accepts a comment associated with the transition to be recorded.",
   *
   * <p>[MLflow endpoint]:
   * https://www.mlflow.org/docs/latest/rest-api.html#transition-modelversion-stage
   */
  TransitionStageResponse transitionStage(
      TransitionModelVersionStageDatabricks transitionModelVersionStageDatabricks);

  /**
   * Update a comment.
   *
   * <p>Post an edit to a comment on a model version.
   */
  UpdateCommentResponse updateComment(UpdateComment updateComment);

  /**
   * Update model.
   *
   * <p>Updates a registered model.
   */
  void updateModel(UpdateModelRequest updateModelRequest);

  /**
   * Update model version.
   *
   * <p>Updates the model version.
   */
  void updateModelVersion(UpdateModelVersionRequest updateModelVersionRequest);

  /**
   * Update a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Updates a registry webhook.
   */
  void updateWebhook(UpdateRegistryWebhook updateRegistryWebhook);
}
