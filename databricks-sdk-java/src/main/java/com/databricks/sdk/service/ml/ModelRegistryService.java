// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

/**
 * This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface ModelRegistryService {
  /**
   * Approve transition request.
   *
   * <p>Approves a model version stage transition request.
   *
   * @param approveTransitionRequest a {@link com.databricks.sdk.service.ml.ApproveTransitionRequest} object
   * @return a {@link com.databricks.sdk.service.ml.ApproveTransitionRequestResponse} object
   */
  ApproveTransitionRequestResponse approveTransitionRequest(
      ApproveTransitionRequest approveTransitionRequest);

  /**
   * Post a comment.
   *
   * <p>Posts a comment on a model version. A comment can be submitted either by a user or
   * programmatically to display relevant information about the model. For example, test results or
   * deployment errors.
   *
   * @param createComment a {@link com.databricks.sdk.service.ml.CreateComment} object
   * @return a {@link com.databricks.sdk.service.ml.CreateCommentResponse} object
   */
  CreateCommentResponse createComment(CreateComment createComment);

  /**
   * Create a model.
   *
   * <p>Creates a new registered model with the name specified in the request body.
   *
   * <p>Throws `RESOURCE_ALREADY_EXISTS` if a registered model with the given name exists.
   *
   * @param createModelRequest a {@link com.databricks.sdk.service.ml.CreateModelRequest} object
   * @return a {@link com.databricks.sdk.service.ml.CreateModelResponse} object
   */
  CreateModelResponse createModel(CreateModelRequest createModelRequest);

  /**
   * Create a model version.
   *
   * <p>Creates a model version.
   *
   * @param createModelVersionRequest a {@link com.databricks.sdk.service.ml.CreateModelVersionRequest} object
   * @return a {@link com.databricks.sdk.service.ml.CreateModelVersionResponse} object
   */
  CreateModelVersionResponse createModelVersion(
      CreateModelVersionRequest createModelVersionRequest);

  /**
   * Make a transition request.
   *
   * <p>Creates a model version stage transition request.
   *
   * @param createTransitionRequest a {@link com.databricks.sdk.service.ml.CreateTransitionRequest} object
   * @return a {@link com.databricks.sdk.service.ml.CreateTransitionRequestResponse} object
   */
  CreateTransitionRequestResponse createTransitionRequest(
      CreateTransitionRequest createTransitionRequest);

  /**
   * Create a webhook.
   *
   * <p>**NOTE**: This endpoint is in Public Preview.
   *
   * <p>Creates a registry webhook.
   *
   * @param createRegistryWebhook a {@link com.databricks.sdk.service.ml.CreateRegistryWebhook} object
   * @return a {@link com.databricks.sdk.service.ml.CreateWebhookResponse} object
   */
  CreateWebhookResponse createWebhook(CreateRegistryWebhook createRegistryWebhook);

  /**
   * Delete a comment.
   *
   * <p>Deletes a comment on a model version.
   *
   * @param deleteCommentRequest a {@link com.databricks.sdk.service.ml.DeleteCommentRequest} object
   */
  void deleteComment(DeleteCommentRequest deleteCommentRequest);

  /**
   * Delete a model.
   *
   * <p>Deletes a registered model.
   *
   * @param deleteModelRequest a {@link com.databricks.sdk.service.ml.DeleteModelRequest} object
   */
  void deleteModel(DeleteModelRequest deleteModelRequest);

  /**
   * Delete a model tag.
   *
   * <p>Deletes the tag for a registered model.
   *
   * @param deleteModelTagRequest a {@link com.databricks.sdk.service.ml.DeleteModelTagRequest} object
   */
  void deleteModelTag(DeleteModelTagRequest deleteModelTagRequest);

  /**
   * Delete a model version.
   *
   * <p>Deletes a model version.
   *
   * @param deleteModelVersionRequest a {@link com.databricks.sdk.service.ml.DeleteModelVersionRequest} object
   */
  void deleteModelVersion(DeleteModelVersionRequest deleteModelVersionRequest);

  /**
   * Delete a model version tag.
   *
   * <p>Deletes a model version tag.
   *
   * @param deleteModelVersionTagRequest a {@link com.databricks.sdk.service.ml.DeleteModelVersionTagRequest} object
   */
  void deleteModelVersionTag(DeleteModelVersionTagRequest deleteModelVersionTagRequest);

  /**
   * Delete a ransition request.
   *
   * <p>Cancels a model version stage transition request.
   *
   * @param deleteTransitionRequestRequest a {@link com.databricks.sdk.service.ml.DeleteTransitionRequestRequest} object
   */
  void deleteTransitionRequest(DeleteTransitionRequestRequest deleteTransitionRequestRequest);

  /**
   * Delete a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Deletes a registry webhook.
   *
   * @param deleteWebhookRequest a {@link com.databricks.sdk.service.ml.DeleteWebhookRequest} object
   */
  void deleteWebhook(DeleteWebhookRequest deleteWebhookRequest);

  /**
   * Get the latest version.
   *
   * <p>Gets the latest version of a registered model.
   *
   * @param getLatestVersionsRequest a {@link com.databricks.sdk.service.ml.GetLatestVersionsRequest} object
   * @return a {@link com.databricks.sdk.service.ml.GetLatestVersionsResponse} object
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
   *
   * @param getModelRequest a {@link com.databricks.sdk.service.ml.GetModelRequest} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelResponse} object
   */
  GetModelResponse getModel(GetModelRequest getModelRequest);

  /**
   * Get a model version.
   *
   * <p>Get a model version.
   *
   * @param getModelVersionRequest a {@link com.databricks.sdk.service.ml.GetModelVersionRequest} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelVersionResponse} object
   */
  GetModelVersionResponse getModelVersion(GetModelVersionRequest getModelVersionRequest);

  /**
   * Get a model version URI.
   *
   * <p>Gets a URI to download the model version.
   *
   * @param getModelVersionDownloadUriRequest a {@link com.databricks.sdk.service.ml.GetModelVersionDownloadUriRequest} object
   * @return a {@link com.databricks.sdk.service.ml.GetModelVersionDownloadUriResponse} object
   */
  GetModelVersionDownloadUriResponse getModelVersionDownloadUri(
      GetModelVersionDownloadUriRequest getModelVersionDownloadUriRequest);

  /**
   * List models.
   *
   * <p>Lists all available registered models, up to the limit specified in __max_results__.
   *
   * @param listModelsRequest a {@link com.databricks.sdk.service.ml.ListModelsRequest} object
   * @return a {@link com.databricks.sdk.service.ml.ListModelsResponse} object
   */
  ListModelsResponse listModels(ListModelsRequest listModelsRequest);

  /**
   * List transition requests.
   *
   * <p>Gets a list of all open stage transition requests for the model version.
   *
   * @param listTransitionRequestsRequest a {@link com.databricks.sdk.service.ml.ListTransitionRequestsRequest} object
   * @return a {@link com.databricks.sdk.service.ml.ListTransitionRequestsResponse} object
   */
  ListTransitionRequestsResponse listTransitionRequests(
      ListTransitionRequestsRequest listTransitionRequestsRequest);

  /**
   * List registry webhooks.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Lists all registry webhooks.
   *
   * @param listWebhooksRequest a {@link com.databricks.sdk.service.ml.ListWebhooksRequest} object
   * @return a {@link com.databricks.sdk.service.ml.ListRegistryWebhooks} object
   */
  ListRegistryWebhooks listWebhooks(ListWebhooksRequest listWebhooksRequest);

  /**
   * Reject a transition request.
   *
   * <p>Rejects a model version stage transition request.
   *
   * @param rejectTransitionRequest a {@link com.databricks.sdk.service.ml.RejectTransitionRequest} object
   * @return a {@link com.databricks.sdk.service.ml.RejectTransitionRequestResponse} object
   */
  RejectTransitionRequestResponse rejectTransitionRequest(
      RejectTransitionRequest rejectTransitionRequest);

  /**
   * Rename a model.
   *
   * <p>Renames a registered model.
   *
   * @param renameModelRequest a {@link com.databricks.sdk.service.ml.RenameModelRequest} object
   * @return a {@link com.databricks.sdk.service.ml.RenameModelResponse} object
   */
  RenameModelResponse renameModel(RenameModelRequest renameModelRequest);

  /**
   * Searches model versions.
   *
   * <p>Searches for specific model versions based on the supplied __filter__.
   *
   * @param searchModelVersionsRequest a {@link com.databricks.sdk.service.ml.SearchModelVersionsRequest} object
   * @return a {@link com.databricks.sdk.service.ml.SearchModelVersionsResponse} object
   */
  SearchModelVersionsResponse searchModelVersions(
      SearchModelVersionsRequest searchModelVersionsRequest);

  /**
   * Search models.
   *
   * <p>Search for registered models based on the specified __filter__.
   *
   * @param searchModelsRequest a {@link com.databricks.sdk.service.ml.SearchModelsRequest} object
   * @return a {@link com.databricks.sdk.service.ml.SearchModelsResponse} object
   */
  SearchModelsResponse searchModels(SearchModelsRequest searchModelsRequest);

  /**
   * Set a tag.
   *
   * <p>Sets a tag on a registered model.
   *
   * @param setModelTagRequest a {@link com.databricks.sdk.service.ml.SetModelTagRequest} object
   */
  void setModelTag(SetModelTagRequest setModelTagRequest);

  /**
   * Set a version tag.
   *
   * <p>Sets a model version tag.
   *
   * @param setModelVersionTagRequest a {@link com.databricks.sdk.service.ml.SetModelVersionTagRequest} object
   */
  void setModelVersionTag(SetModelVersionTagRequest setModelVersionTagRequest);

  /**
   * Test a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Tests a registry webhook.
   *
   * @param testRegistryWebhookRequest a {@link com.databricks.sdk.service.ml.TestRegistryWebhookRequest} object
   * @return a {@link com.databricks.sdk.service.ml.TestRegistryWebhookResponse} object
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
   *
   * @param transitionModelVersionStageDatabricks a {@link com.databricks.sdk.service.ml.TransitionModelVersionStageDatabricks} object
   * @return a {@link com.databricks.sdk.service.ml.TransitionStageResponse} object
   */
  TransitionStageResponse transitionStage(
      TransitionModelVersionStageDatabricks transitionModelVersionStageDatabricks);

  /**
   * Update a comment.
   *
   * <p>Post an edit to a comment on a model version.
   *
   * @param updateComment a {@link com.databricks.sdk.service.ml.UpdateComment} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateCommentResponse} object
   */
  UpdateCommentResponse updateComment(UpdateComment updateComment);

  /**
   * Update model.
   *
   * <p>Updates a registered model.
   *
   * @param updateModelRequest a {@link com.databricks.sdk.service.ml.UpdateModelRequest} object
   */
  void updateModel(UpdateModelRequest updateModelRequest);

  /**
   * Update model version.
   *
   * <p>Updates the model version.
   *
   * @param updateModelVersionRequest a {@link com.databricks.sdk.service.ml.UpdateModelVersionRequest} object
   */
  void updateModelVersion(UpdateModelVersionRequest updateModelVersionRequest);

  /**
   * Update a webhook.
   *
   * <p>**NOTE:** This endpoint is in Public Preview.
   *
   * <p>Updates a registry webhook.
   *
   * @param updateRegistryWebhook a {@link com.databricks.sdk.service.ml.UpdateRegistryWebhook} object
   */
  void updateWebhook(UpdateRegistryWebhook updateRegistryWebhook);
}
